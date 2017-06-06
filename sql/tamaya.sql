drop database if exists tamaya;
create database tamaya;

use tamaya;

create table items(
item_id int not null primary key auto_increment,
item_name varchar(100) not null,
price double not null,
stocks int not null,
sales int not null default 0,
item_detail text not null,
category enum('utiage','temoti','hunsyutu','sonota') not null,
img_path varchar(255) not null,
registration_date datetime not null default CURRENT_timestamp,
updated_date datetime not null default CURRENT_timestamp on update current_timestamp
);

create table cart(
user_id int not null,
item_id int not null,
item_name varchar(100) not null,
price decimal not null,
quantity int not null default 1,
is_delete boolean default false,
foreign key (user_id)references openconnect.users(user_id) on delete cascade,
foreign key (item_id)references items(item_id)
);

create table purchase_history(
history_id int primary key not null auto_increment,
user_id int not null,
item_id int not null,
price decimal not null,
quantity int not null default 1,
purchase_date datetime not null,
foreign key (user_id)references openconnect.users(user_id) on delete cascade,
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

insert into items(item_name,price,stocks,item_detail,category,img_path)
values("ビッグ線香花火",98,10,"日本製の線香花火です。線香花火シリーズの中で最大サイズになります。長い時間楽しみたい方、面白い花火が好きな方にお勧めの花火となっております。",2,"./img/test01_.jpg"),
("ロケット花火",78,5,"北朝鮮製のロケット花火です。ロケット花火シリーズの中で最小サイズになります。長い時間楽しみたい方、面白い花火が好きな方にお勧めの花火となっております。",3,"./img/test02_.jpg"),
("打上げ花火",586,7,"日本製の打上げ花火です。打上げ花火シリーズの中でも珍しい家庭用になります。家で花火を楽しみたい方、雨の日でも花火を楽しみたい方にお勧めとなっております。",1,"./img/test03_.jpg");