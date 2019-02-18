/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : myself_db

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2019-02-18 15:00:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for rota
-- ----------------------------
DROP TABLE IF EXISTS `rota`;
CREATE TABLE `rota` (
  `id` varchar(50) NOT NULL,
  `duty_date` date DEFAULT NULL,
  `user_name` varchar(10) NOT NULL,
  `telephone` varchar(11) DEFAULT NULL,
  `remarks` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rota
-- ----------------------------
INSERT INTO `rota` VALUES ('1', '2019-02-14', '覃文林', '123', '值班');
INSERT INTO `rota` VALUES ('2', '2019-02-15', '陈婷', '456', '值班');
INSERT INTO `rota` VALUES ('3', '2019-02-16', '李秋', '789', '值班');
INSERT INTO `rota` VALUES ('4', '2019-02-17', '赖剑', '234', '值班');
INSERT INTO `rota` VALUES ('5', '2019-02-18', '潘轩', '345', '值班');
INSERT INTO `rota` VALUES ('6', '2019-02-19', '外星人', '456', '值班');
INSERT INTO `rota` VALUES ('7', '2019-02-20', '李蓉', '567', '值班');
