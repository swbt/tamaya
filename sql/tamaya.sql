set names utf8;
set foreign_key_checks=0;
drop database if exists tamaya;
create database tamaya;

use tamaya;

create table items(
item_id int not null primary key auto_increment,
item_name varchar(100) not null,
price decimal not null,
stocks int default 0 not null,
sales int default 0 not null,
item_detail text,
category enum('utiage','temoti','hunsyutu','sonota') not null,
img_path varchar(255) not null,
registration_date datetime default CURRENT_timestamp,
updated_date datetime default CURRENT_timestamp on update current_timestamp
);

create table carts(
user_id int not null,
item_id int not null,
item_name varchar(100),
price decimal,
quantity int not null default 1,
is_delete boolean default false,
primary key (user_id, item_id),
foreign key (user_id)references openconnect.users(user_id) on delete cascade,
foreign key (item_id)references items(item_id)
);

create table purchase_history(
history_id int primary key not null auto_increment,
user_id int not null,
purchase_date datetime not null,
foreign key (user_id)references openconnect.users(user_id) on delete cascade
);

create table purchase_history_contents(
history_id int primary key not null,
item_id int not null,
price decimal(10, 5) not null,
quantity int not null default 1,
foreign key (history_id)references purchase_history(history_id),
foreign key (item_id)references items(item_id)
);

create table credit(
user_id int not null,
credit_id int primary key auto_increment,
credit_number varchar(16) not null,
name_e varchar(50) not null,
security_code varchar(4) not null,
expiration_month varchar(2) not null,
expiration_year varchar(2) not null,
registration_date datetime not null default CURRENT_timestamp,
updated_date datetime not null default CURRENT_timestamp  on update current_timestamp,
foreign key (user_id)references openconnect.users(user_id) on delete cascade
);

create table taxs(
tax_rate_id int primary key auto_increment,
tax_rate decimal(10, 5) not null,
begin_on datetime not null,
end_on datetime not null
);

insert into items(item_name,price,stocks,item_detail,category,img_path)
values('ビッグ線香花火',98,9,'日本製の線香花火です。線香花火シリーズの中で最大サイズになります。長い時間楽しみたい方、面白い花火が好きな方にお勧めの花火となっております。','temoti','./img/test01_.jpg')
,('ロケット花火',78,5,'北朝鮮製のロケット花火です。ロケット花火シリーズの中で最小サイズになります。長い時間楽しみたい方、面白い花火が好きな方にお勧めの花火となっております。','utiage','./img/test02_.jpg')
,('打上げ花火',586,7,'日本製の打上げ花火です。打上げ花火シリーズの中でも珍しい家庭用になります。家で花火を楽しみたい方、雨の日でも花火を楽しみたい方にお勧めとなっております。','utiage','./img/test03_.jpg')
,('打ち上げフラッシュモブ花火',2560,25,'タイ製の打上げ花火です。タイでは国内売上生産第一位の人気製品となります','utiage','./img/flashmob.jpg')
,('サッカー花火',4444,10,'イタリア製の打上げ花火です。サッカー観戦をしながら楽しめる花火となっております','temoti','./img/soccer.jpg')
,('するめ花火',450,5,'食べれる花火です。お酒のつまみにも。','sonota','./img/surume.jpg')
,('岡本太郎花火',1700,7,'岡本太郎の花火です。芸術は爆発だーーーーーーーーーーーーーーーーーーーーーー！！！','hunsyutu','./img/tarou.jpg')
,('マシュマロ花火',3500,7,'マシュマロ花火です。可愛くて、美味しい。','sonota','./img/marshmallow.jpg')
,('キラキラ花束',140,10,'多数の星が打ち上がり、上空で弾けます。何色もの星が弧を描いて舞い上がる様子はまるで花束のようです。','utiage','./img/kirakira_hanataba.jpg')
,('大和魂',1600,5,'赤・青・黄色の大きな丸玉が空高く打ち上がります。太鼓のような音を上げ、舞い上がる様子は大和魂そのものです。','utiage','./img/yamato_damashi.jpg')
,('魔法のほうき星',300,4,'七色の星が夜空を舞います。魔女が空を舞っているかのような美しい様子が堪能できます。','hunsyutu','./img/maho_no_houkiboshi.jpg')
,('煌（きらめき）牡丹花（３０本入）',150,9,'日本伝統の線香花火です。儚くも切ない灯火は最後の締めにヒッタリです。','temoti','./img/kirameki_botanbana.jpg')
,('パワフル三変化（５本入）',150,7,'赤・青・黄色の火花が力強く噴き出します。持ちも良く、長時間花火を楽しめます。','temoti','./img/powerful_sanhenge.jpg')
,('メガトンバッグ',13000,7,'５１Lの最大級花火をご用意いたしました。厳選した１４４本の花火をお楽しみください。','sonota','./img/mmegaton_bag.jpg')
,('花花　はなはな',11000,10,'職人が腕によりをかけた高級線香花火です。力強く燃えた後儚く散っていく様子は一見の価値ありです。','temoti','./img/hanahana.png')
,('３０秒のさざ波',200,8,'ぱちぱちと癒しの炎が３０秒間燃え上がります。長時間の燃焼時間と１．５ｍの高さ、両方を兼ね備えた花火です。','hunsyutu','./img/saza_nami.jpg')
,('スノーフラワー',200,5,'赤とオレンジの星が交互に出た後、白い光が雪のように降り注ぎます。音が小さいため、扱いやすい商品です。','hunsyutu','./img/snow_flower.jpg')
,('がんばろう日本',200,6,'青・赤・黄色・白・銀の５色の光が交互に噴出します。徐々に大きくなっていく復興祈願の花火です。','hunsyutu','./img/ganbaro_noppon.jpg')
,('星光',200,7,'何百もの光が流れ星のように、直径約３mの範囲に降り注ぎます。２０秒もの間、激しく燃え上がります。','hunsyutu','./img/hoshi_hikari.jpg')
,('黄金極太スパーク（３P）',500,12,'金色の光が力強く降り注ぎ、いくつもの火花が舞い散ります。持続時間も３０秒と長く、満足して頂ける一品です。','temoti','./img/marshmallow.jpg')
,('メタリックカラースパーク',700,7,'黄・赤・緑色の三色の花火をご用意いたしました。激しい火花がスパークします。','temoti','./img/gold_spark.jpg')
,('袋入りおみくじ花火（４本入）',100,5,'花火の色で運勢が占えるおみくじ式花火です。大吉がオレンジ、中吉が白、小吉が緑、吉が赤になります。','temoti','./img/omikuzi.jpg')
,('バリバリ３変色すすき（５本入）',100,9,'パチパチと音を立てながら緑・赤・黄色に三変化をします。簡単に点火することができる手持ち花火です。','temoti','./img/baribar_3susuki.jpg')
;

insert into carts(user_id,item_id,quantity)
values(1,4,7)
;

insert into taxs(tax_rate, begin_on, end_on) values
(0.08, '2014-04-01', '9999-12-31');
