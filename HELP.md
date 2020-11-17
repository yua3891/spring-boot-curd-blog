# Getting Started
ken,一位老php程序员转行做php的学习之路。2020-11-17

我会不断升级此版本的。博客地址为：www.jzu.cc（域名已经申请好了，后面正式v1.0.0的博客会上线在此的）

###v0.0.1版本的数据表结构如下：
CREATE DATABASE IF NOT EXISTS `springboot`  DEFAULT CHARACTER SET utf8mb4;

USE `springboot`;

/*Table structure for table `blog` */

DROP TABLE IF EXISTS `blog`;

CREATE TABLE `blog` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(200) NOT NULL,
  `content` TEXT NOT NULL,
  `time_add` INT(10) NOT NULL,
  `time_show` INT(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MYISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;

/*Data for the table `blog` */

INSERT  INTO `blog`(`id`,`title`,`content`,`time_add`,`time_show`) VALUES 
(5,'134需求555','返回博客列表 标题	5566',1568955565,1568955565),
(6,'134需求6','3223开人和',1568955565,1568955565),
(7,'134需求','3223开人和',1568955565,1568955565),
(8,'134需求','3223开人和',1568955565,1568955565);

##版本记录
###2020-11-17，v0.0.1
此版本为spring boot2.4，使用了mysql、mybatis、thymeleaf、devtools。制作了一个博客的基础操作原型。
我会定期更新，把他制作完成一个完整的在线开源的博客系统v1.0.0的。。
