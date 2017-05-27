/*
Navicat MySQL Data Transfer

Source Server         : student
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : messagebo

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2017-05-27 09:18:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_message`
-- ----------------------------
DROP TABLE IF EXISTS `tb_message`;
CREATE TABLE `tb_message` (
  `messageId` int(255) NOT NULL AUTO_INCREMENT,
  `author` varchar(255) NOT NULL,
  `context` varchar(255) NOT NULL,
  `msgdate` datetime NOT NULL,
  PRIMARY KEY (`messageId`)
) ENGINE=MyISAM AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_message
-- ----------------------------
INSERT INTO `tb_message` VALUES ('1', 'miao', 'erfefdsf', '2017-05-10 21:23:52');
INSERT INTO `tb_message` VALUES ('2', 'admin', 'ææ¯ç®¡çå', '2017-05-10 22:26:59');
INSERT INTO `tb_message` VALUES ('3', 'miu', 'æ è¦ åå¸', '2017-05-10 22:55:13');
INSERT INTO `tb_message` VALUES ('4', 'miu', '我要发帖', '2017-05-11 10:31:28');
INSERT INTO `tb_message` VALUES ('10', 'miao', '签到', '2017-05-15 22:10:47');
INSERT INTO `tb_message` VALUES ('11', 'miao', '今天签到\n', '2017-05-16 22:22:58');
INSERT INTO `tb_message` VALUES ('8', 'wangwu', '我是王五', '2017-05-11 12:13:05');
INSERT INTO `tb_message` VALUES ('12', 'miao', '还要签到', '2017-05-16 22:23:12');
INSERT INTO `tb_message` VALUES ('13', 'miao', '签到', '2017-05-17 10:21:52');
INSERT INTO `tb_message` VALUES ('14', 'miao', '还要签到', '2017-05-17 10:22:06');

-- ----------------------------
-- Table structure for `tb_relation`
-- ----------------------------
DROP TABLE IF EXISTS `tb_relation`;
CREATE TABLE `tb_relation` (
  `relationId` int(12) NOT NULL AUTO_INCREMENT,
  `userId` int(12) NOT NULL,
  `friendId` int(12) NOT NULL,
  `setTime` datetime NOT NULL,
  PRIMARY KEY (`relationId`),
  KEY `FK_relation_users` (`userId`),
  KEY `FK_tb_relation_users` (`friendId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_relation
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_shenqing`
-- ----------------------------
DROP TABLE IF EXISTS `tb_shenqing`;
CREATE TABLE `tb_shenqing` (
  `requestId` int(12) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `userId` int(12) NOT NULL,
  `friendId` int(12) NOT NULL,
  `text` varchar(255) NOT NULL,
  PRIMARY KEY (`requestId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_shenqing
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_users`
-- ----------------------------
DROP TABLE IF EXISTS `tb_users`;
CREATE TABLE `tb_users` (
  `userId` int(25) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `tag` int(5) NOT NULL,
  `role` int(255) NOT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=MyISAM AUTO_INCREMENT=72 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_users
-- ----------------------------
INSERT INTO `tb_users` VALUES ('1', 'admin', 'admin', '0', '1');
INSERT INTO `tb_users` VALUES ('2', 'miao', 'miu', '0', '0');
INSERT INTO `tb_users` VALUES ('3', 'miu', 'miu', '0', '0');
INSERT INTO `tb_users` VALUES ('4', 'mao', 'mao', '1', '0');
INSERT INTO `tb_users` VALUES ('5', 'zhangsan', '123', '1', '0');
INSERT INTO `tb_users` VALUES ('6', 'lisi', 'lisi', '0', '0');
INSERT INTO `tb_users` VALUES ('7', 'wangwu', 'wangwu', '0', '0');
INSERT INTO `tb_users` VALUES ('8', 'lisi', 'lisi', '0', '0');
INSERT INTO `tb_users` VALUES ('62', '432', '432', '0', '0');
INSERT INTO `tb_users` VALUES ('63', '', '', '0', '0');
INSERT INTO `tb_users` VALUES ('64', '321', '321', '0', '0');
INSERT INTO `tb_users` VALUES ('65', '222', '22', '0', '0');
INSERT INTO `tb_users` VALUES ('66', '333', '333', '0', '0');
INSERT INTO `tb_users` VALUES ('67', '4444', '44', '0', '0');
INSERT INTO `tb_users` VALUES ('68', '555', '555', '0', '0');
INSERT INTO `tb_users` VALUES ('69', '666', '66', '0', '0');
INSERT INTO `tb_users` VALUES ('70', '777', '777', '0', '0');
INSERT INTO `tb_users` VALUES ('71', '888', '888', '0', '0');
