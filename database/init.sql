CREATE DATABASE personalblog;
USE personalblog;

DROP TABLE IF EXISTS `articles`;

CREATE TABLE `articles` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `shortDescription` varchar(100) DEFAULT NULL,
  `text` varchar(2000) DEFAULT NULL,
  `date` date DEFAULT (curdate()),
  PRIMARY KEY (`id`),
  UNIQUE KEY `title` (`title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `articles` WRITE;
UNLOCK TABLES;