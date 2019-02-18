/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : myself_db

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2019-02-18 15:00:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for communication
-- ----------------------------
DROP TABLE IF EXISTS `communication`;
CREATE TABLE `communication` (
  `u_id` varchar(50) NOT NULL,
  `user_name` varchar(12) DEFAULT NULL COMMENT '姓名',
  `account` varchar(20) DEFAULT NULL COMMENT '账户',
  `alias_name` varchar(20) DEFAULT NULL COMMENT '别名',
  `post` varchar(10) DEFAULT NULL COMMENT '职务',
  `department` varchar(10) DEFAULT NULL COMMENT '部门',
  `sex` varchar(2) DEFAULT NULL COMMENT '性别',
  `phone_number` varchar(11) DEFAULT NULL COMMENT '手机号码',
  `telephone_number` varchar(20) DEFAULT NULL COMMENT '座机号码',
  `email` varchar(20) DEFAULT NULL COMMENT '电子邮箱',
  `address` varchar(50) DEFAULT NULL COMMENT '地址',
  `company` varchar(50) DEFAULT NULL COMMENT '企业简称',
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
