使用spring boot2.4+mysql+mybatis+thymeleaf新手上路的一套curd博客操作

ken,一位老php程序员转行做java的学习之路。2020-11-17

> 我会不断升级此版本的。博客地址为：www.jzu.cc （域名已经申请好了，后面正式v1.0.0的博客会上线在此的）
---

## 版本记录
### 2020-11-24,v0.0.3
> 增加spring security，增加后台登录框，进行登录授权和验证角色权限

### 2020-11-20,v0.0.2 
> 增加了logger和aspect来主动记录日志
> 1、yml增加logger配置项
> 2、增加插件aspect
> 3、增加aspect.LogAspect.java 进行After、Before、Around等切面记录日志

*** 

### 2020-11-17，v0.0.1
> 基础框架
> 此版本为spring boot2.4，使用了mysql、mybatis、thymeleaf、devtools。制作了一个博客的基础操作原型。
我会定期更新，把他制作完成一个完整的在线开源的博客系统v1.0.0的。。

> v0.0.1版本的数据表结构如下：
```sql
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
```
