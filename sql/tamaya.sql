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
;

insert into carts(user_id,item_id,quantity)
values(1,4,7)
;

insert into taxs(tax_rate, begin_on, end_on) values
(0.08, '2014-04-01', '9999-12-31');
