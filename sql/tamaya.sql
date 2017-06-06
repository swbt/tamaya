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