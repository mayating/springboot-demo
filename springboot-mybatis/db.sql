# 创建数据库
create database `test` default character set utf8;
# 创建数据表 book
create table `book`
(
    `id`     int(11) not null auto_increment,
    `name`   varchar(128) default null,
    `author` varchar(64)  default null,
    primary key (`id`)
) engine = InnoDB
  default charset = utf8;
# 构造数据 book
insert into `book`(`id`, `name`, `author`)
values (1, '三国演义', '罗贯中'),
       (2, '水浒传', '施耐庵');