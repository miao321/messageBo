/*
Navicat MySQL Data Transfer

Source Server         : student
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : messagebo

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2017-05-16 11:11:38
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
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_message
-- ----------------------------
INSERT INTO `tb_message` VALUES ('1', 'miao', 'erfefdsf', '2017-05-10 21:23:52');
INSERT INTO `tb_message` VALUES ('2', 'admin', 'ææ¯ç®¡çå', '2017-05-10 22:26:59');
INSERT INTO `tb_message` VALUES ('3', 'miu', 'æ è¦ åå¸', '2017-05-10 22:55:13');
INSERT INTO `tb_message` VALUES ('4', 'miu', '我要发帖', '2017-05-11 10:31:28');
INSERT INTO `tb_message` VALUES ('10', 'miao', '签到', '2017-05-15 22:10:47');
INSERT INTO `tb_message` VALUES ('8', 'wangwu', '我是王五', '2017-05-11 12:13:05');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `userId` int(25) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `tag` int(5) NOT NULL,
  `role` int(255) NOT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'admin', 'admin', '0', '1');
INSERT INTO `users` VALUES ('2', 'miao', 'miu', '0', '0');
INSERT INTO `users` VALUES ('3', 'miu', 'miu', '0', '0');
INSERT INTO `users` VALUES ('4', 'mao', 'mao', '1', '0');
INSERT INTO `users` VALUES ('5', 'zhangsan', '123', '1', '0');
INSERT INTO `users` VALUES ('6', 'lisi', 'lisi', '0', '0');
INSERT INTO `users` VALUES ('7', 'wangwu', 'wangwu', '0', '0');
INSERT INTO `users` VALUES ('8', 'lisi', 'lisi', '0', '0');
