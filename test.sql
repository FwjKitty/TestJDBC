create database test if not exits;

use test;

create table user(
`id` int(11) PRIMARY KEY AUTO_INCREMENT,
`un` varchar(10) not null,
`pw` varchar(10) not null
)ENGINE=MyISAM DEFAULT CHARSET=utf8;
