-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: soccermanager
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `club`
--

DROP TABLE IF EXISTS `club`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `club` (
  `IDCLB` int NOT NULL AUTO_INCREMENT,
  `CLBNAME` varchar(50) DEFAULT NULL,
  `SLTV` tinyint DEFAULT NULL,
  `IDTNM` int DEFAULT NULL,
  `SCORE` int DEFAULT '0',
  `HS` int DEFAULT '0',
  `WIN` int DEFAULT '0',
  `LOSE` int DEFAULT '0',
  `DRAW` int DEFAULT '0',
  `BT` int DEFAULT '0',
  `SBT` int DEFAULT '0',
  `ST` int DEFAULT '0',
  `LOGO` longblob,
  PRIMARY KEY (`IDCLB`),
  KEY `fk_tourID` (`IDTNM`),
  CONSTRAINT `fk_tourID` FOREIGN KEY (`IDTNM`) REFERENCES `tournament` (`IDTNM`)
) ENGINE=InnoDB AUTO_INCREMENT=399 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `club`
--

LOCK TABLES `club` WRITE;
/*!40000 ALTER TABLE `club` DISABLE KEYS */;
INSERT INTO `club` VALUES (338,'Man United',8,95,4,1,1,0,1,2,1,2,_binary 'C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Soccer-Management\\imagestore\\mu.png'),(339,'Man City',8,95,1,-2,0,1,1,1,3,2,_binary 'C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Soccer-Management\\imagestore\\mc.png'),(340,'Liver Pool',8,95,4,1,1,0,1,4,3,2,_binary 'C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Soccer-Management\\imagestore\\liver.png'),(341,'Crystal Palace',8,95,1,-1,0,1,1,4,5,2,_binary 'C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Soccer-Management\\imagestore\\crystal.png'),(342,'Everton',8,95,2,0,0,0,2,1,1,2,_binary 'C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Soccer-Management\\imagestore\\everton.png'),(343,'Chelsea',8,95,1,-1,0,1,1,2,3,2,_binary 'C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Soccer-Management\\imagestore\\chelsea.png'),(344,'Arsenal',8,95,4,2,1,0,1,3,1,2,_binary 'C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Soccer-Management\\imagestore\\arsenal.png'),(345,'Tottenham Hotspur',8,95,3,0,1,1,0,4,4,2,_binary 'C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Soccer-Management\\imagestore\\tot.png'),(391,'MU',4,96,3,1,1,0,0,1,0,1,_binary 'C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Soccer-Management\\imagestore\\mu.png'),(392,'Arsenal',3,96,0,0,0,0,0,0,0,0,_binary 'C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Soccer-Management\\imagestore\\arsenal.png'),(393,'Crystal',3,96,0,0,0,0,0,0,0,0,_binary 'C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Soccer-Management\\imagestore\\crystal.png'),(394,'Chelsea',3,96,0,-1,0,1,0,0,1,1,_binary 'C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Soccer-Management\\imagestore\\chelsea.png'),(395,NULL,NULL,97,0,0,0,0,0,0,0,0,NULL),(396,NULL,NULL,97,0,0,0,0,0,0,0,0,NULL),(397,NULL,NULL,97,0,0,0,0,0,0,0,0,NULL),(398,NULL,NULL,97,0,0,0,0,0,0,0,0,NULL);
/*!40000 ALTER TABLE `club` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-11 10:33:44
