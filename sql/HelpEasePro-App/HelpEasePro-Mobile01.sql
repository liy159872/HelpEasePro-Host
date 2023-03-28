drop database if exists HelpEaseProMobile;
drop user if exists 'HelpEaseProMobile'@'%';
-- 支持emoji：需要mysql数据库参数： character_set_server=utf8mb4
create database HelpEaseProMobile default character set utf8mb4 collate utf8mb4_unicode_ci;
use HelpEaseProMobile;
create user 'HelpEaseProMobile'@'%' identified by 'HelpEaseProMobile123456';
grant all privileges on HelpEaseProMobile.* to 'HelpEaseProMobile'@'%';
flush privileges;