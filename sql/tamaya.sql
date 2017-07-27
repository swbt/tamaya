SET names utf8;
SET foreign_key_checks = 0;
DROP DATABASE IF EXISTS tamaya;
SET foreign_key_checks = 1;
CREATE DATABASE tamaya;

USE tamaya;

CREATE TABLE tax_types( -- 課税区分
  tax_type_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT -- 課税区分ID
  ,tax_type VARCHAR(50) NOT NULL -- 課税区分(非課税、軽減税率（○○円以下）等)
);

CREATE TABLE taxs( -- 商品にかかる税
  tax_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT
  ,tax_type_id INT NOT NULL -- 課税区分ID
  ,tax_rate DECIMAL(10,5) NOT NULL -- 税率
  ,begin_on DATE NOT NULL -- 適用開始日
  ,end_on DATE NOT NULL DEFAULT '9999-12-31' -- 適用終了日
  ,FOREIGN KEY(tax_type_id) REFERENCES tax_types(tax_type_id)
  ,INDEX(tax_type_id)
);

create table items(
  item_id int not null primary key auto_increment
  ,item_name varchar(100) not null
  ,base_price decimal(15,5) not null
  ,tax_type_id int not null
  ,stocks int default 0 not null
  ,sales int default 0 not null
  ,item_detail text
  ,category enum('utiage', 'temoti', 'hunsyutu', 'sonota') not null
  ,img_path varchar(255) not null
  ,registration_date datetime default CURRENT_timestamp
  ,is_deleted BOOLEAN NOT NULL DEFAULT FALSE
  ,FOREIGN KEY(tax_type_id) REFERENCES tax_types(tax_type_id)
);

CREATE TABLE carts(
  user_id INT
  ,item_id INT
  ,quantity INT NOT NULL
  ,PRIMARY KEY(user_id, item_id)
  ,FOREIGN KEY(user_id) REFERENCES openconnect.users(user_id) ON DELETE CASCADE
  ,FOREIGN KEY(item_id) REFERENCES items(item_id)
);

CREATE TABLE shipping_costs( -- 送料
  shipping_cost DECIMAL(15,5) NOT NULL
  ,min_subtotal DECIMAL(15,5) NOT NULL -- その送料になる最低額
);

CREATE TABLE orders(
  order_id INT PRIMARY KEY AUTO_INCREMENT
  ,user_id INT NOT NULL
  ,shipping_cost DECIMAL(15,5) NOT NULL -- 送料
  ,grand_total DECIMAL(15,5) NOT NULL -- 総額
  ,is_canceled BOOLEAN NOT NULL DEFAULT FALSE -- キャンセルされたか
  ,order_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP -- 注文日時
  ,FOREIGN KEY(user_id) REFERENCES openconnect.users(user_id) ON DELETE CASCADE
  ,INDEX(user_id)
);

CREATE TABLE order_details(
  order_id INT NOT NULL
  ,item_id INT NOT NULL
  ,price DECIMAL(15,5) NOT NULL
  ,quantity INT NOT NULL
  ,FOREIGN KEY(order_id) REFERENCES orders(order_id)
  ,FOREIGN KEY(item_id) REFERENCES items(item_id)
  ,INDEX(order_id)
);

CREATE TABLE credit_cards(
  user_id INT PRIMARY KEY
  ,credit_brand INT NOT NULL -- クレジットの種類(1:visa, 2:mastercard, 3:americanexpress)
  ,credit_number VARCHAR(16) NOT NULL -- クレジット番号
  ,name_e VARCHAR(50) NOT NULL -- クレジット名義
  ,security_code VARCHAR(4) NOT NULL -- セキュリティコード
  ,expiration_year INT(4) NOT NULL -- 有効期限（年）
  ,expiration_month INT(2) NOT NULL -- 有効期限（月）
  ,FOREIGN KEY(user_id) REFERENCES openconnect.users(user_id) ON DELETE CASCADE
);

CREATE TABLE exchanges (
  currency_code CHAR(3) PRIMARY KEY
  ,rate DECIMAL(15,5) NOT NULL
  ,modified_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

INSERT INTO tax_types VALUES
(1, '非課税')
,(2, '通常税率');

INSERT INTO taxs(tax_type_id, tax_rate, begin_on, end_on) VALUES
(1, 0, '2000-01-01', DEFAULT(end_on))
,(2, 0.08, '2014-04-01', DEFAULT(end_on));

INSERT INTO shipping_costs(shipping_cost, min_subtotal) VALUE
(700, 0)
,(0, 3000); -- 3000円以上は送料無料


insert into items(item_name,base_price,tax_type_id,stocks,item_detail,category,img_path) values
('純国産線香花火',98,2,9,'100％日本製の線香花火です。線香花火シリーズの中でも大き目のサイズになります。長い時間楽しみたい方、日本の職人が作った花火を楽しみたいお客様にお勧めの花火となっております。','temoti','./img/big_senkou.jpg')
,('ロケット花火',78,2,5,'日本製のロケット花火です。ロケット花火シリーズの中で最小サイズになります。大きい花火が苦手な方、面白い花火が好きな方にお勧めの花火となっております。','utiage','./img/rocket.jpg')
,('家庭用打上げ花火',586,2,7,'日本製の打上げ花火です。打上げ花火シリーズの中でも珍しい家庭用になります。家で花火を楽しみたい方、雨の日でも花火を楽しみたい方にお勧めとなっております。','utiage','./img/katei_uchiage.jpg')
,('キラキラ花束',140,2,10,'多数の星が打ち上がり、上空で弾けます。何色もの星が弧を描いて舞い上がる様子はまるで花束のようです。','utiage','./img/kirakira_hanataba.jpg')
,('大和魂',1600,2,5,'赤・青・黄色の大きな丸玉が空高く打ち上がります。太鼓のような音を上げ、舞い上がる様子は大和魂そのものです。','utiage','./img/yamato_damashi.jpg')
,('魔法のほうき星',300,2,4,'七色の星が夜空を舞います。魔女が空を舞っているかのような美しい様子が堪能できます。','hunsyutu','./img/maho_no_houkiboshi.jpg')
,('煌（きらめき）牡丹花（３０本入）',150,2,9,'日本伝統の線香花火です。儚くも切ない灯火は最後の締めにヒッタリです。','temoti','./img/kirameki_botanbana.jpg')
,('パワフル三変化（５本入）',150,2,7,'赤・青・黄色の火花が力強く噴き出します。持ちも良く、長時間花火を楽しめます。','temoti','./img/powerful_sanhenge.jpg')
,('メガトンバッグ',13000,2,7,'５１Lの最大級花火をご用意いたしました。厳選した１４４本の花火をお楽しみください。','sonota','./img/megaton_bag.jpg')
,('花花 はなはな',11000,2,10,'職人が腕によりをかけた高級線香花火です。力強く燃えた後儚く散っていく様子は一見の価値ありです。','temoti','./img/hanahana.png')
,('３０秒のさざ波',200,2,8,'ぱちぱちと癒しの炎が３０秒間燃え上がります。長時間の燃焼時間と１．５ｍの高さ、両方を兼ね備えた花火です。','hunsyutu','./img/saza_nami.jpg')
,('スノーフラワー',200,2,5,'赤とオレンジの星が交互に出た後、白い光が雪のように降り注ぎます。音が小さいため、扱いやすい商品です。','hunsyutu','./img/snow_flower.jpg')
,('がんばろう日本',200,2,6,'青・赤・黄色・白・銀の５色の光が交互に噴出します。徐々に大きくなっていく復興祈願の花火です。','hunsyutu','./img/ganbaro_noppon.jpg')
,('星光',200,2,7,'何百もの光が流れ星のように、直径約３mの範囲に降り注ぎます。２０秒もの間、激しく燃え上がります。','hunsyutu','./img/hoshi_hikari.jpg')
,('黄金極太スパーク（３P）',500,2,12,'金色の光が力強く降り注ぎ、いくつもの火花が舞い散ります。持続時間も３０秒と長く、満足して頂ける一品です。','temoti','./img/gold_spark.jpg')
,('メタリックカラースパーク',700,2,7,'黄・赤・緑色の三色の花火をご用意いたしました。激しい火花がスパークします。','temoti','./img/color_spark.jpg')
,('袋入りおみくじ花火（４本入）',100,2,5,'花火の色で運勢が占えるおみくじ式花火です。大吉がオレンジ、中吉が白、小吉が緑、吉が赤になります。','temoti','./img/omikuzi.jpg')
,('バリバリ３変色すすき（５本入）',100,2,9,'パチパチと音を立てながら緑・赤・黄色に三変化をします。簡単に点火することができる手持ち花火です。','temoti','./img/baribar_3susuki.jpg')
;
