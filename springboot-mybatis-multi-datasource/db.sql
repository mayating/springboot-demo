create database test1 default character set utf8;
use `test1`;
create table `book`
(
    `id`     int(11) not null auto_increment,
    `name`   varchar(128) default null,
    `author` varchar(64)  default null,
    primary key (`id`)
) engine = InnoDB
  AUTO_INCREMENT = 2
  default charset = utf8;
insert into `book`(`id`, `name`, `author`)
values (1, '水浒传', '施耐庵');

create database `test2` default character set utf8;
use `test2`;
create table `book`
(
    `id`     int(11) not null auto_increment,
    `name`   varchar(128) default null,
    `author` varchar(64)  default null,
    primary key (`id`)
) engine = InnoDB
  AUTO_INCREMENT = 2
  default charset = utf8;
insert into `book`(`id`, `name`, `author`)
values (1, '三国演义', '罗贯中');
