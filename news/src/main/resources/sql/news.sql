/*
 Navicat Premium Data Transfer

 Source Server         : MySqlT18
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : news

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 07/06/2023 14:21:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `hot_news_id` int(0) NOT NULL,
  `created_at` datetime(0) NULL DEFAULT NULL,
  `updated_at` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `hot_news_id`(`hot_news_id`) USING BTREE,
  CONSTRAINT `comment_ibfk_1` FOREIGN KEY (`hot_news_id`) REFERENCES `hot_news` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES (1, '支持666', 1, '2023-06-06 16:54:55', '2023-06-06 16:54:55');
INSERT INTO `comment` VALUES (2, 'dsjakdkskld', 1, '2023-06-06 16:54:55', '2023-06-06 16:54:55');
INSERT INTO `comment` VALUES (3, '第一条评论', 2, '2023-06-06 16:54:55', '2023-06-06 16:54:55');
INSERT INTO `comment` VALUES (4, '第二条评论', 2, '2023-06-06 16:54:55', '2023-06-06 16:54:55');
INSERT INTO `comment` VALUES (5, '不买彩票', 3, '2023-06-06 16:54:55', '2023-06-06 16:54:55');
INSERT INTO `comment` VALUES (6, '66666', 3, '2023-06-06 16:54:55', '2023-06-06 16:54:55');

-- ----------------------------
-- Table structure for hot_news
-- ----------------------------
DROP TABLE IF EXISTS `hot_news`;
CREATE TABLE `hot_news`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `article` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `numberOfSearches` int(0) NOT NULL,
  `created_at` datetime(0) NULL DEFAULT NULL,
  `updated_at` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hot_news
-- ----------------------------
INSERT INTO `hot_news` VALUES (1, '比特币大跌迎新年', '倒萨倒萨大2', 42311, '2023-06-06 16:54:51', '2023-06-06 16:54:51');
INSERT INTO `hot_news` VALUES (2, '公司称发错年终奖', '啊是咋撒驱蚊器饿饿我去', 12333, '2023-06-06 16:54:51', '2023-06-06 16:54:51');
INSERT INTO `hot_news` VALUES (3, '美国彩民中奖3亿美金', '的撒大大大苏打的', 2333, '2023-06-06 16:54:51', '2023-06-06 16:54:51');

SET FOREIGN_KEY_CHECKS = 1;
