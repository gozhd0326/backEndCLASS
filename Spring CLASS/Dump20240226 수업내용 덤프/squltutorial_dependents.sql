-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: squltutorial
-- ------------------------------------------------------
-- Server version	8.2.0

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
-- Table structure for table `dependents`
--

DROP TABLE IF EXISTS `dependents`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dependents` (
  `dependent_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `last_name` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `relationship` varchar(25) COLLATE utf8mb4_general_ci NOT NULL,
  `employee_id` int NOT NULL,
  PRIMARY KEY (`dependent_id`),
  KEY `employee_id` (`employee_id`),
  CONSTRAINT `dependents_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`employee_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dependents`
--

LOCK TABLES `dependents` WRITE;
/*!40000 ALTER TABLE `dependents` DISABLE KEYS */;
INSERT INTO `dependents` VALUES (1,'Penelope','Gietz','Child',206),(2,'Nick','Higgins','Child',205),(3,'Ed','Whalen','Child',200),(4,'Jennifer','King','Child',100),(5,'Johnny','Kochhar','Child',101),(6,'Bette','De Haan','Child',102),(7,'Grace','Faviet','Child',109),(8,'Matthew','Chen','Child',110),(9,'Joe','Sciarra','Child',111),(10,'Christian','Urman','Child',112),(11,'Zero','Popp','Child',113),(12,'Karl','Greenberg','Child',108),(13,'Uma','Mavris','Child',203),(14,'Vivien','Hunold','Child',103),(15,'Cuba','Ernst','Child',104),(16,'Fred','Austin','Child',105),(17,'Helen','Pataballa','Child',106),(18,'Dan','Lorentz','Child',107),(19,'Bob','Hartstein','Child',201),(20,'Lucille','Fay','Child',202),(21,'Kirsten','Baer','Child',204),(22,'Elvis','Khoo','Child',115),(23,'Sandra','Baida','Child',116),(24,'Cameron','Tobias','Child',117),(25,'Kevin','Himuro','Child',118),(26,'Rip','Colmenares','Child',119),(27,'Julia','Raphaely','Child',114),(28,'Woody','Russell','Child',145),(29,'Alec','Partners','Child',146),(30,'Sandra','Taylor','Child',176);
/*!40000 ALTER TABLE `dependents` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-26  8:12:41
