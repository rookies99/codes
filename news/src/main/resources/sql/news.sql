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

 Date: 09/06/2023 14:38:42
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
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES (1, '支持666', 1, '2023-06-06 16:54:55', '2023-06-06 16:54:55');
INSERT INTO `comment` VALUES (2, 'dsjakdkskld', 1, '2023-06-06 16:54:55', '2023-06-06 16:54:55');
INSERT INTO `comment` VALUES (3, '第一条评论', 2, '2023-06-06 16:54:55', '2023-06-06 16:54:55');
INSERT INTO `comment` VALUES (4, '第二条评论', 2, '2023-06-06 16:54:55', '2023-06-06 16:54:55');
INSERT INTO `comment` VALUES (5, '不买彩票', 3, '2023-06-06 16:54:55', '2023-06-06 16:54:55');
INSERT INTO `comment` VALUES (6, '66666', 3, '2023-06-06 16:54:55', '2023-06-06 16:54:55');
INSERT INTO `comment` VALUES (7, '这是一条评论', 1, '2023-06-08 13:57:35', '2023-06-08 13:57:35');
INSERT INTO `comment` VALUES (10, '这是第二条评论', 1, '2023-06-08 14:18:25', '2023-06-08 14:18:25');
INSERT INTO `comment` VALUES (11, '1231321233223', 3, '2023-06-08 14:19:35', '2023-06-08 14:19:35');
INSERT INTO `comment` VALUES (12, '312132132', 1, '2023-06-08 14:21:25', '2023-06-08 14:21:25');
INSERT INTO `comment` VALUES (13, '121233211233121322', 3, '2023-06-08 14:26:21', '2023-06-08 14:26:21');
INSERT INTO `comment` VALUES (14, '123333', 3, '2023-06-08 14:26:50', '2023-06-08 14:26:50');
INSERT INTO `comment` VALUES (15, '1232123132333312', 3, '2023-06-08 14:26:54', '2023-06-08 14:26:54');
INSERT INTO `comment` VALUES (16, '你好好好', 3, '2023-06-08 14:36:14', '2023-06-08 14:36:14');
INSERT INTO `comment` VALUES (17, '这是第二条评论', 1, '2023-06-08 14:52:44', '2023-06-08 14:52:44');
INSERT INTO `comment` VALUES (18, '1233213321', 3, '2023-06-08 14:55:22', '2023-06-08 14:55:22');
INSERT INTO `comment` VALUES (19, '12321321', 1, '2023-06-08 15:01:19', '2023-06-08 15:01:19');
INSERT INTO `comment` VALUES (20, '4141421414412', 1, '2023-06-08 15:01:26', '2023-06-08 15:01:26');
INSERT INTO `comment` VALUES (21, 'djaskll', 1, '2023-06-08 17:03:15', '2023-06-08 17:03:15');

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
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hot_news
-- ----------------------------
INSERT INTO `hot_news` VALUES (1, '比特币大跌迎新年', '倒萨倒萨大2', 42311, '2023-06-06 16:54:51', '2023-06-06 16:54:51');
INSERT INTO `hot_news` VALUES (2, '公司称发错年终奖', '啊是咋撒驱蚊器饿饿我去', 12333, '2023-06-06 16:54:51', '2023-06-06 16:54:51');
INSERT INTO `hot_news` VALUES (3, '美国彩民中奖3亿美金', '的撒大大大苏打的', 2333, '2023-06-06 16:54:51', '2023-06-06 16:54:51');
INSERT INTO `hot_news` VALUES (4, '协鑫集团与苏州相城区联合启动', '近日，苏州市相城区人民政府与协鑫集团签署战略合作框架协议，联合启动国内首个能源算力中心。双方就进一步拥抱数字经济浪潮达成深度合作共识，致力于打造首个应用于能源领域的人工智能计算平台。根据协议，协鑫能源算力中心全球总部、超级充换电数字能源港长三角总部将落户相城区，并计划于2024年前在全球设立15个能源算力中心，打造具有国际竞争力的数字产业集群。', 53, '2023-06-08 16:17:56', '2023-06-08 16:17:56');
INSERT INTO `hot_news` VALUES (5, '安徽证监局：成功举办投教“皖”美行活动 助力安徽资本市场高质量发展', '为做好全面实行股票发行注册制投资者教育工作，进一步深化安徽辖区投资者保护工作，助力安徽资本市场高质量发展，6月2日，安徽证监局、中国金融期货交易所（以下简称“中金所”）、合肥市包河区人民政府、安徽省证券期货业协会以及辖区证券期货经营机构、投资者教育基地共同举办的“5·15全国投资者保护宣传日”专场活动——“全面注册制，投教‘皖’美行”暨中金所288号投服驿站“快闪空间”安徽站活动在合肥拉开序幕。 ', 28, '2023-06-08 16:17:56', '2023-06-08 16:17:56');
INSERT INTO `hot_news` VALUES (6, '苹果史上首款MR产品发布 机构：万亿元市场迎来新玩家', '北京时间6月6日，苹果公司召开一年一度的苹果全球开发者大会。在本次开发者大会上，苹果发布了iOS 17、搭载M2芯片的全新15英寸MacBook Air等新品。与市场预期一致，苹果还推出公司首款MR混合现实产品Apple Vision Pro，美国市场售价3499美元，将于明年初开售，可用于办公、游戏等场景。 ', 1111, '2023-06-08 16:17:56', '2023-06-08 16:17:56');
INSERT INTO `hot_news` VALUES (7, '河南一考生因迟到未能进入考场', '6月7日，河南一考生因迟到没能进考场，老师在考场外安慰考生。网友：“人生哪能没有遗憾，来年再战”', 123332, '2023-06-08 16:17:56', '2023-06-08 16:17:56');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `mobile` char(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `location` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `created_at` datetime(0) NULL DEFAULT NULL,
  `updated_at` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'Alice', 'alice123', 'password123', 'alice@gmail.com', '12345678901', '北京', '2023-06-09 14:35:00', '2023-06-09 14:35:00');
INSERT INTO `user` VALUES (2, 'Bob', 'bob123', 'password123', 'bob@gmail.com', '13272738271', '广州', '2023-06-09 14:35:00', '2023-06-09 14:35:00');
INSERT INTO `user` VALUES (3, 'Cathy', 'cathy123', 'password123', 'cathy@gmail.com', '17372837858', '上海', '2023-06-09 14:35:00', '2023-06-09 14:35:00');
INSERT INTO `user` VALUES (4, 'Frank', 'frank123', 'password123', 'frank@gmail.com', '16592837283', '西安', '2023-06-09 14:35:00', '2023-06-09 14:35:00');
INSERT INTO `user` VALUES (5, 'David', 'david123', 'password123', 'david@gmail.com', '19848293751', '天津', '2023-06-09 14:35:00', '2023-06-09 14:35:00');
INSERT INTO `user` VALUES (6, 'Grace', 'grace123', 'password123', 'grace@gmail.com', '13582739506', '长沙', '2023-06-09 14:35:00', '2023-06-09 14:35:00');
INSERT INTO `user` VALUES (7, 'Henry', 'henry123', 'password123', 'henry@gmail.com', '12647582948', '重庆', '2023-06-09 14:35:00', '2023-06-09 14:35:00');

SET FOREIGN_KEY_CHECKS = 1;
