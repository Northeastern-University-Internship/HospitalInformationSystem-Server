-- MySQL dump 10.13  Distrib 8.1.0, for macos13.3 (arm64)
--
-- Host: 127.0.0.1    Database: neusoft_his
-- ------------------------------------------------------
-- Server version	8.1.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `checkapply`
--

DROP TABLE IF EXISTS `checkapply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `checkapply` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `MedicalID` int NOT NULL COMMENT 'medical_record_ID',
  `RegistID` int NOT NULL COMMENT 'registered_ID',
  `ItemID` int NOT NULL COMMENT 'Item ID',
  `Name` varchar(64) NOT NULL COMMENT 'Project name',
  `Objective` varchar(512) DEFAULT NULL COMMENT 'Objective requirement',
  `Position` varchar(64) DEFAULT NULL COMMENT 'Check position',
  `IsUrgent` int DEFAULT '0' COMMENT 'Whether it is urgent, 1 means urgent, 0 means not urgent',
  `Num` int DEFAULT NULL COMMENT 'Quantity',
  `CreationTime` datetime NOT NULL COMMENT 'Creation time',
  `DoctorID` int DEFAULT NULL COMMENT 'Doctor ID',
  `CheckOperID` int NOT NULL COMMENT 'CheckOperID',
  `ResultOperID` int NOT NULL COMMENT 'Result entry personnel ID',
  `CheckTime` datetime DEFAULT NULL COMMENT 'Check time',
  `Result` varchar(512) DEFAULT NULL COMMENT 'Check result',
  `ResultTime` datetime DEFAULT NULL COMMENT 'result time',
  `State` int DEFAULT NULL COMMENT 'state',
  `RecordType` int NOT NULL COMMENT 'Record type 1-check 2-test 3-dispose',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `checkapply`
--

LOCK TABLES `checkapply` WRITE;
/*!40000 ALTER TABLE `checkapply` DISABLE KEYS */;
INSERT INTO `checkapply` VALUES (1,5,9,25,'Abdominal pain','Cause','Abdomen',1,1,'2024-02-25 08:39:40',1,2,2,NULL,NULL,NULL,3,1),(6,6,35,10,'poisoned',NULL,NULL,0,1,'2024-02-25 14:24:23',1,2,2,NULL,NULL,NULL,6,1),(7,6,35,12,'Poisoned',NULL,NULL,0,1,'2024-02-25 14:24:23',1,2,2,NULL,NULL,NULL,6,1),(12,6,25,7,'Template: Frozen Shoulder',NULL,NULL,0,1,'2024-02-25 16:51:38',1,2,2,NULL,NULL,NULL,2,1),(24,6,25,10,'Template: Bone Trauma',NULL,'Stomach',0,1,'2024-02-26 09:02:05',1,2,2,NULL,NULL,NULL,2,1),(25,6,25,1,'Template: Bone Trauma',NULL,'Whole Body',0,1,'2024-02-26 09:02:05',1,2,2,NULL,NULL,NULL,3,1),(30,7,26,36,'Template: Childrens cold',NULL,NULL,0,1,'2024-02-26 09:43:02',1,2,2,NULL,NULL,NULL,2,1),(31,7,26,44,'Template: Tenosynovitis',NULL,NULL,0,1,'2024-02-26 09:43:44',1,2,2,NULL,NULL,NULL,2,1),(32,7,26,41,'Template: Tenosynovitis',NULL,NULL,0,1,'2024-02-26 09:43:44',1,2,2,NULL,NULL,NULL,2,1),(33,7,26,36,'Template: Childrens cold',NULL,NULL,0,1,'2024-02-26 09:55:12',1,2,2,NULL,NULL,NULL,2,1),(34,7,26,55,'Template: Childrens cold',NULL,NULL,0,1,'2024-02-26 09:55:12',1,2,2,NULL,NULL,NULL,2,1),(37,8,27,1,'Template: Bone Trauma',NULL,'Whole Body',0,1,'2024-02-28 10:59:30',1,2,2,NULL,NULL,NULL,3,1),(38,8,27,10,'Template: Bone Trauma',NULL,'Stomach',0,1,'2024-02-28 10:59:30',1,2,2,NULL,NULL,NULL,2,1),(39,9,29,20,'q','q','q',0,1,'2024-02-28 13:47:54',1,2,2,NULL,NULL,NULL,2,1),(40,9,29,29,'d','d','d',0,1,'2024-02-28 13:48:02',1,2,2,NULL,NULL,NULL,3,1),(41,10,30,20,'3','3','3',0,1,'2024-02-28 15:26:19',1,2,2,NULL,NULL,NULL,2,1),(42,10,30,27,'e','e','e',0,1,'2024-02-28 15:26:29',1,2,2,NULL,NULL,NULL,2,1),(43,10,30,29,'r','r','r',0,1,'2024-02-28 15:26:39',1,2,2,NULL,NULL,NULL,3,1),(44,15,32,20,'d','d','d',0,1,'2024-02-29 09:26:36',1,2,2,NULL,NULL,NULL,2,1),(45,15,32,25,'f','f','f',0,1,'2024-02-29 09:26:42',1,2,2,NULL,NULL,NULL,3,1),(46,15,32,28,'g','g','g',0,1,'2024-02-29 09:26:51',1,2,2,NULL,NULL,NULL,3,1),(47,15,32,44,'Template: Tenosynovitis',NULL,NULL,0,1,'2024-02-29 13:05:35',1,2,2,NULL,NULL,NULL,2,1),(48,15,32,41,'Template: Tenosynovitis',NULL,NULL,0,1,'2024-02-29 13:05:35',1,2,2,NULL,NULL,NULL,2,1),(49,18,33,55,'Template: Childrens cold',NULL,NULL,0,1,'2024-02-29 14:47:28',1,2,2,NULL,NULL,NULL,2,1),(50,18,33,36,'Template: Childrens cold',NULL,NULL,0,1,'2024-02-29 14:47:28',1,2,2,NULL,NULL,NULL,2,1),(51,19,34,55,'Template: Childrens cold',NULL,NULL,0,1,'2024-02-29 15:20:02',1,2,2,NULL,NULL,NULL,2,1),(52,19,34,36,'Template: Childrens cold',NULL,NULL,0,1,'2024-02-29 15:20:03',1,2,2,NULL,NULL,NULL,2,1),(53,20,37,29,'w','w','w',0,1,'2024-03-01 13:26:55',1,2,2,NULL,NULL,NULL,3,1),(54,20,37,28,'e','e','e',0,1,'2024-03-01 13:27:04',1,2,2,NULL,NULL,NULL,3,1),(55,20,37,25,'g','g','g',0,1,'2024-03-01 13:27:12',1,2,2,NULL,NULL,NULL,3,1),(58,4,6,41,'Template: Tenosynovitis',NULL,NULL,0,1,'2024-03-01 16:23:35',1,2,2,NULL,NULL,NULL,2,1),(59,4,6,44,'Template: Tenosynovitis',NULL,NULL,0,1,'2024-03-01 16:23:35',1,2,2,NULL,NULL,NULL,2,1),(60,21,35,1,'Big Rescue','1','1',1,1,'2024-03-27 14:45:49',1,1,1,NULL,'',NULL,3,1),(61,22,36,1,'Big Rescue','1','1',1,1,'2024-04-27 16:05:40',1,1,1,NULL,'',NULL,3,1),(62,22,36,1,'Big Rescue','1','1',1,1,'2024-04-27 16:06:22',1,1,1,NULL,'',NULL,4,3);
/*!40000 ALTER TABLE `checkapply` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `checkrelation`
--

DROP TABLE IF EXISTS `checkrelation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `checkrelation` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `CheckProjID` int NOT NULL COMMENT 'Project ID',
  `CheckTempID` int NOT NULL COMMENT 'Application template ID',
  `Position` varchar(64) DEFAULT NULL COMMENT 'Check position',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `checkrelation`
--

LOCK TABLES `checkrelation` WRITE;
/*!40000 ALTER TABLE `checkrelation` DISABLE KEYS */;
INSERT INTO `checkrelation` VALUES (1,41,2,NULL),(2,44,2,NULL),(3,1,4,'whole body'),(4,10,4,'Stomach'),(5,55,1,NULL),(6,36,1,NULL),(7,29,3,NULL),(8,5,3,NULL);
/*!40000 ALTER TABLE `checkrelation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `checktemplate`
--

DROP TABLE IF EXISTS `checktemplate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `checktemplate` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `Name` varchar(64) NOT NULL COMMENT 'name',
  `UserID` int NOT NULL COMMENT 'Doctor ID',
  `CreationTime` datetime NOT NULL COMMENT 'Creation time',
  `Scope` char(2) DEFAULT NULL COMMENT 'Scope of use: whole hospital/department/individual',
  `RecordType` int NOT NULL COMMENT 'Record type 1-check 2-test 3-dispose',
  `DelMark` int NOT NULL DEFAULT '1' COMMENT 'Delete mark',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `checktemplate`
--

LOCK TABLES `checktemplate` WRITE;
/*!40000 ALTER TABLE `checktemplate` DISABLE KEYS */;
INSERT INTO `checktemplate` VALUES (1,'Childrens cold',1,'2024-02-22 16:46:37','1',1,1),(2,'Tenosynovitis',1,'2024-02-22 16:47:58','1',1,1),(3,'Frozen shoulder',1,'2024-02-22 16:48:37','1',1,1),(4,'Osteopathic trauma',1,'2024-02-22 17:09:05','3',1,1),(5,'Test',5,'2024-03-26 18:28:51','1',2,0);
/*!40000 ALTER TABLE `checktemplate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `constantitem`
--

DROP TABLE IF EXISTS `constantitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `constantitem` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `ConstantTypeID` int NOT NULL COMMENT 'Constant category ID',
  `ConstantCode` varchar(64) NOT NULL COMMENT 'Constant item code',
  `ConstantName` varchar(64) NOT NULL COMMENT 'Constant item name',
  `DelMark` int NOT NULL DEFAULT '1' COMMENT 'Delete mark',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=165 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `constantitem`
--

LOCK TABLES `constantitem` WRITE;
/*!40000 ALTER TABLE `constantitem` DISABLE KEYS */;
INSERT INTO `constantitem` VALUES (11,1,'NK','Internal Medicine',1),(12,1,'WK','Surgery',1),(14,1,'EK','Pediatrics',1),(15,1,'CRBK','Infectious Diseases Department',1),(16,1,'FCK','Obstetrics and Gynecology',1),(17,1,'NK','Andrology',1),(18,1,'JSXLK','Psychiatric Department',1),(19,1,'PFXBK','Dermatology and Venereology Department',1),(20,1,'ZYK','Traditional Chinese Medicine Department',1),(21,1,'ZLK','Oncology',1),(22,1,'GK','Orthopedics',1),(23,1,'WGK','Otology',1),(24,1,'KFYXK','Department of Rehabilitation Medicine',1),(25,1,'MZYXK','Department of Anesthesia Medicine',1),(26,1,'YYK','Nutrition Department',1),(27,1,'YJK','Medical Technology Department',1),(28,1,'YXYXX','Medical Imaging',1),(29,1,'QTKS','Other Departments',1),(51,5,'XJ','Cash',1),(52,5,'YBK','Medical Insurance Card',1),(53,5,'YHK','Bank Card',1),(54,5,'XYK','Credit Card',1),(55,5,'WX','WeChat',1),(56,5,'ZFB','Alipay',1),(57,5,'YSF','Cloud QuickPass',1),(58,5,'QT','Others',1),(71,7,'NAN','Male',1),(72,7,'NV','Female',1),(81,8,'ZRYS','Chief Physician',1),(82,8,'FZRYS','Deputy Chief Physician',1),(83,8,'ZZYS','Attending Physician',1),(84,8,'ZYYS','Resident Physician',1),(101,10,'XY','Western Medicine',1),(102,10,'ZCY','Chinese patent medicine',1),(103,10,'ZCY','Chinese herbal medicine',1),(110,11,'ZJ','Injection',1),(111,11,'PJ','Tablet',1),(112,11,'ZYYP','Chinese medicine pieces',1),(113,11,'SJ','Powder',1),(114,11,'JN','capsule',1),(115,11,'KLJ','granule',1),(116,11,'FJ','Powder',1),(117,11,'BMP','Diaphragm',1),(118,11,'RJ','emulsion',1),(119,11,'YJ','liquid',1),(120,11,'NJ','gel',1),(121,11,'RGJ','ointment',1),(122,11,'QWJ','Aerosol',1),(123,11,'FSP','Dispersible Tablet',1),(124,11,'YPQX','Drug and Device',1),(125,11,'SJ','Suppository',1),(126,11,'NFSJ','Internal liquid',1),(127,11,'PJ','Spray',1),(128,11,'JJ','Glue',1),(129,11,'TJ','Tincture',1),(130,11,'DJ','Drops',1),(131,11,'HSP','Sustained-release tablets',1),(132,11,'YGZJ','Eye ointment preparation',1),(133,11,'CRP','Enteric-coated tablets',1),(134,11,'SJ','Cream',1),(135,11,'DEJ','Ear Drops',1),(136,11,'HXJ','suspension',1),(137,11,'HSJN','sustained-release capsule',1),(138,11,'NJJN','Gel Capsule',1),(139,11,'CJ','Liniment',1),(140,11,'HP','lozenge',1),(141,11,'GHJ','dry mix',1),(142,11,'XJ','Lotion',1),(143,11,'BPJ','Nasal Spray',1),(144,11,'MJ','membrane',1),(145,11,'TG','patch',1),(146,11,'TJ','Patch',1),(147,11,'HJ','Mixture',1),(148,11,'SJ','wet wipes',1),(149,11,'KPJ','oral spray',1),(150,11,'DSY','Large infusion',1),(151,11,'YPCL','Pharmaceutical materials',1),(152,11,'KSP','Controlled-release tablets',1),(153,11,'DBJ','Nasal drops',1),(154,11,'DW','Dropping Pill',1),(155,11,'GTJJ','Dry Syrup',1),(156,11,'WHXRJ','Aerosol inhalation agent',1),(157,11,'YLY','API',1),(158,11,'TJJ','Syrup',1),(159,11,'RJN','Soft Capsule',1),(160,11,'DYJ','Eye Drops',1),(161,11,'DGFZ','lyophilized powder',1),(162,11,'CJ','powder',1),(163,11,'WJ','pill',1),(164,11,'KFYL','oral liquid',1);
/*!40000 ALTER TABLE `constantitem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `constanttype`
--

DROP TABLE IF EXISTS `constanttype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `constanttype` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `ConstantTypeCode` varchar(64) NOT NULL COMMENT 'Constant type code',
  `ConstantTypeName` varchar(64) NOT NULL COMMENT 'Constant category name',
  `DelMark` int NOT NULL DEFAULT '1' COMMENT 'Delete mark',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `constanttype`
--

LOCK TABLES `constanttype` WRITE;
/*!40000 ALTER TABLE `constanttype` DISABLE KEYS */;
INSERT INTO `constanttype` VALUES (1,'DeptCategory','Department Category',1),(5,'FeeType','Charging method',1),(7,'Gender','Gender type',1),(8,'DocTitle','Doctor Title',1),(10,'Drugs_Type','Drug Type',1),(11,'Drugs_Dosage','Drug dosage form',1);
/*!40000 ALTER TABLE `constanttype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `DeptCode` varchar(64) NOT NULL COMMENT 'Department code',
  `DeptName` varchar(255) NOT NULL COMMENT 'Department name',
  `DeptCategoryID` int NOT NULL COMMENT 'Department Category',
  `DeptType` int DEFAULT NULL COMMENT 'Department type',
  `DelMark` int NOT NULL DEFAULT '1' COMMENT 'Delete mark',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=139 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (1,'XXGNK','Cardiovascular Medicine',11,1,1),(2,'SJNK','Neurology',11,1,1),(3,'PTNK','General Internal Medicine',11,1,1),(4,'XHNK','Gastroenterology',11,1,1),(5,'HXNK','Respiratory Medicine',11,1,1),(6,'NFMK','Endocrinology',11,1,1),(7,'SBNK','Nephrology',11,1,1),(8,'XYNK','Hematology',11,1,1),(9,'GRNK','Infectious Disease',11,1,1),(10,'LNBNK','Geriatric Medicine',11,1,1),(11,'FSMYNK','Rheumatology and Immunology',11,1,1),(12,'TXK','Dialysis Department',11,1,1),(13,'BTFYK','Allergy Department',11,1,1),(14,'PTWK','General Surgery',12,1,1),(15,'MNWK','Urology',12,1,1),(16,'SJWK','Neurosurgery',12,1,1),(17,'XWK','Thoracic Surgery',12,1,1),(18,'ZXWK','Plastic Surgery',12,1,1),(19,'GCWK','Anorectal Surgery',12,1,1),(20,'GDWK','Hepatobiliary Surgery',12,1,1),(21,'RXWK','Breast Surgery',12,1,1),(22,'XXGWK','Cardiovascular Surgery',12,1,1),(23,'XZWK','Cardiovascular Surgery',12,1,1),(24,'QGYZ','Organ Transplantation',12,1,1),(25,'WCWK','Minimally Invasive Surgery',12,1,1),(26,'GNSJWK','Functional Neurosurgery',12,1,1),(27,'XTWK','Glandular Surgery',12,1,1),(28,'EKZH','Pediatric General',14,1,1),(29,'XEWK','Pediatric Surgery',14,1,1),(30,'ETBJK','Child Health Department',14,1,1),(31,'XSEK','Neonatology Department',14,1,1),(32,'XEGK','Pediatric Orthopedics',14,1,1),(33,'XESJNK','Pediatric Neurology',14,1,1),(34,'XEHXK','Pediatric Respiratory Department',14,1,1),(35,'XEXYK','Pediatric Hematology Department',14,1,1),(36,'XEEBHK','Pediatric Otolaryngology',14,1,1),(37,'XEXNK','Pediatric Cardiology',14,1,1),(38,'XEKFK','Pediatric Rehabilitation Department',14,1,1),(39,'XEJSK','Pediatric Psychiatry',14,1,1),(40,'XESNK','Pediatric Nephrology',14,1,1),(41,'XEXHK','Pediatric Gastroenterology',14,1,1),(42,'XEPFK','Pediatric Dermatology',14,1,1),(43,'XEJZK','Pediatric Emergency Department',14,1,1),(44,'XENFMK','Pediatric Endocrinology',14,1,1),(45,'XEMNWK','Pediatric Urology',14,1,1),(46,'XEGRK','Pediatric Infectious Disease Department',14,1,1),(47,'XEXWK01','Pediatric Cardiac Surgery',14,1,1),(48,'XEXWK02','Pediatric Thoracic Surgery',14,1,1),(49,'XESJWK','Pediatric Neurosurgery',14,1,1),(50,'XEZXK','Pediatric Plastic Surgery',14,1,1),(51,'XEFSMYK','Pediatric Rheumatology and Immunology',14,1,1),(52,'XEFK','Pediatric Gynecology',14,1,1),(53,'CRK','Infectious Disease Department',15,1,1),(54,'GBK','Hepatology Department',15,1,1),(55,'AZBK','AIDS Department',15,1,1),(56,'CRWZS','Infectious Disease Critical Care Unit',15,1,1),(57,'FCKZH','Obstetrics and Gynecology Department Comprehensive',16,1,1),(58,'FK','Gynecology',16,1,1),(59,'CK','Obstetrics',16,1,1),(60,'JHSYK','Family Planning',16,1,1),(61,'FKNFM','Gynecological Endocrinology',16,1,1),(62,'YCZYK','Genetic Counseling Department',16,1,1),(63,'CQJCK','Prenatal examination Branch',16,1,1),(64,'FMNK','Urology',16,1,1),(65,'QLX','Prostate',17,1,1),(66,'XGNZA','Sexual dysfunction',17,1,1),(67,'SZQGR','Genital infection',17,1,1),(68,'NXBY','Male Infertility',17,1,1),(69,'SZZX','Reproductive Plastic Surgery',17,1,1),(70,'JSK','Psychiatric Department',18,1,1),(71,'SFJDK','Forensic Identification Department',18,1,1),(72,'YWYLK','Drug Dependence Department',18,1,1),(73,'ZYJSK','Traditional Chinese Medicine Psychiatry Department',18,1,1),(74,'SXZAK','Bipolar Disorder Department',18,1,1),(75,'PFK','Dermatology Department',19,1,1),(76,'XBK','Department of Sexually Transmitted Diseases',19,1,1),(77,'ZYZHK','Department of Comprehensive Traditional Chinese Medicine',20,1,1),(78,'ZJK','Acupuncture',20,1,1),(79,'ZYGK','Traditional Chinese Medicine Orthopedics',20,1,1),(80,'ZYFCK','Obstetrics and Gynecology of Traditional Chinese Medicine',20,1,1),(81,'ZYWK','Surgery of Traditional Chinese Medicine',20,1,1),(82,'ZYEK','Traditional Chinese Medicine Pediatrics',20,1,1),(83,'ZYGCK','Traditional Chinese Medicine Anorectal Department',20,1,1),(84,'ZYPFK','Traditional Chinese Medicine Dermatology',20,1,1),(85,'ZYWGK','Traditional Chinese Medicine Dermatology',20,1,1),(86,'ZYAMK','Traditional Chinese Medicine Massage',20,1,1),(87,'ZYXHK','Traditional Chinese Medicine Gastroenterology',20,1,1),(88,'ZYZLK','Traditional Chinese Medicine Oncology',20,1,1),(89,'ZYXNK','Traditional Chinese Medicine Cardiology',20,1,1),(90,'ZYSJNK','Department of Neurology of Traditional Chinese Medicine',20,1,1),(91,'ZYSBNK','Department of Nephrology of Traditional Chinese Medicine',20,1,1),(92,'ZYNFM','Traditional Chinese Medicine Endocrinology',20,1,1),(93,'ZYHXK','Traditional Chinese Medicine Respiratory Medicine',20,1,1),(94,'ZYGBK','Hepatology Department of Traditional Chinese Medicine',20,1,1),(95,'ZYNK','Andrology Department of Traditional Chinese Medicine',20,1,1),(96,'ZYFSMYNK','Department of Rheumatology and Immunology of Traditional Chinese Medicine',20,1,1),(97,'ZYXYK','Department of Hematology of Traditional Chinese Medicine',20,1,1),(98,'ZYRXWK','Breast Surgery of Traditional Chinese Medicine',20,1,1),(99,'ZYLNBK','Geriatric Surgery of Traditional Chinese Medicine',20,1,1),(100,'ZLZHK','Comprehensive Oncology',21,1,1),(101,'ZLNK','Medical Oncology',21,1,1),(102,'FLK','Radiotherapy Department',21,1,1),(103,'ZLWK','Surgery Oncology',21,1,1),(104,'ZLFK','Gynecology Oncology',21,1,1),(105,'GZLK','Osteology Oncology',21,1,1),(106,'ZLKFK','Rehabilitation Oncology Department',21,1,1),(107,'GWK','Orthopedic Surgery',22,1,1),(108,'SWK','Hand Surgery',22,1,1),(109,'CSGK','Orthopedics of Trauma',22,1,1),(110,'JZWK','Spine Surgery',22,1,1),(111,'GGJK','Osteoporosis Department',22,1,1),(112,'GZSSK','Osteoporosis Department',22,1,1),(113,'JXGK','Orthopedics',22,1,1),(114,'EBYHTJK','Otolaryngology-Head and Neck Surgery',23,1,1),(115,'KQK','Stomatology',23,1,1),(116,'YK','Ophthalmology',23,1,1),(117,'KFK','Rehabilitation Department',24,2,1),(118,'LLK','Physiotherapy Department',24,2,1),(119,'MZK','Aesthesiology Department',25,2,1),(120,'TTK','Pain Department',25,2,1),(121,'YYK','Nutrition Department',26,2,1),(122,'GYYK','Hyperbaric Oxygen Department',27,2,1),(123,'GNJCK','Functional Test Department',27,2,1),(124,'BLK','Pathology Department',27,2,1),(125,'JYK','Laboratory Department',27,2,1),(126,'SYZX','Experimental Center',27,2,1),(127,'XDTK','Electrocardiography Department',27,2,1),(128,'FSK','Radiology Department',28,2,1),(129,'CSZDK','Diagnostic Ultrasound Department',28,2,1),(130,'YXYXK','Medical Imaging Department',28,2,1),(131,'HYK','Department of Nuclear Medicine',28,2,1),(132,'YJK','Department of Pharmacy',29,2,1),(133,'HLK','Nursing Department',29,2,1),(134,'TJK','Physical Examination Department',29,2,1),(135,'JZK','Emergency Department',29,2,1),(136,'GGWSYYFK','Public Health and Prevention Department',29,2,1),(137,'SBK','Equipment Department',29,4,1),(138,'CWK','Finance Department',29,3,1);
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diagnosistemplate`
--

DROP TABLE IF EXISTS `diagnosistemplate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diagnosistemplate` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `DeptID` int NOT NULL COMMENT 'Department ID',
  `UserID` int NOT NULL COMMENT 'Doctor ID',
  `Diagnosis` varchar(512) DEFAULT NULL COMMENT 'Diagnosis result',
  `Handling` varchar(512) DEFAULT NULL COMMENT 'Handling opinions',
  `Scope` char(255) DEFAULT NULL COMMENT 'Scope of use: whole hospital/department/individual',
  `DelMark` int NOT NULL DEFAULT '1' COMMENT 'Delete mark',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diagnosistemplate`
--

LOCK TABLES `diagnosistemplate` WRITE;
/*!40000 ALTER TABLE `diagnosistemplate` DISABLE KEYS */;
INSERT INTO `diagnosistemplate` VALUES (1,1,1,'pneumonia','pay attention to rest','whole hospital',1),(2,1,1,'cold','drink more hot water','department',1),(3,1,1,'Fever','Keep warm','Personal',1),(21,1,1,'Shiga-Kreuse dysentery [Subgroup A shigellosis]','1','Individual',1),(22,1,1,'Porcine abdominal disease','1','Individual',1);
/*!40000 ALTER TABLE `diagnosistemplate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `disease`
--

DROP TABLE IF EXISTS `disease`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `disease` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `DiseaseCode` varchar(64) NOT NULL COMMENT 'Disease mnemonic code',
  `DiseaseName` varchar(255) NOT NULL COMMENT 'Disease name',
  `DiseaseICD` varchar(64) NOT NULL COMMENT 'International ICD code',
  `DiseCategoryID` int NOT NULL COMMENT 'Disease category',
  `DelMark` int NOT NULL DEFAULT '1' COMMENT 'Delete mark',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=29396 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disease`
--

LOCK TABLES `disease` WRITE;
/*!40000 ALTER TABLE `disease` DISABLE KEYS */;
INSERT INTO `disease` VALUES (1,'GDXHL','Classical cholera','A00.051',140,1),(2,'ZXDXHL','Medium [Typical] Cholera','A00.052',140,1),(3,'ZXBFXHGXHL','Severe [fulminant or dry] cholera','A00.053',140,1),(4,'QXFDXHL','Mild [atypical] cholera','A00.151',140,1),(5,'AETHL','Elto Cholera','A00.152',140,1),(6,'AETXCY','Eltor Enteritis','A00.153',33,1),(7,'HL','Cholera NOS','A00.901',140,1),(8,'SH','Typhoid','A01.001',306,1),(9,'SHGJXBXZ','Typhi sepsis','A01.002',306,1),(10,'SHXNMY','Typhoid meningitis','A01.003+',232,1),(11,'SHFY','Typhoid pneumonia','A01.051+',81,1),(12,'SHFMY','Typhoid peritonitis','A01.052',306,1),(13,'ABTSBSH','Eberth`s disease (typhoid fever)','A01.053',306,1),(14,'CCXXSH','Enterohemorrhagic typhoid fever','A01.054',306,1),(15,'SHXCCK','Typhoid intestinal perforation','A01.055',306,1),(16,'CSH','Entertyphoid','A01.056',306,1),(17,'SHYXCY','Typhoid-like enteritis','A01.057',33,1),(18,'JXFSH','Paratyphoid A','A01.101',306,1),(19,'YXFSH','Paratyphoid B','A01.201',306,1),(20,'BXFSH','Paratyphoid C','A01.301',306,1),(21,'FSH','Paratyphoid','A01.401',306,1),(22,'QSMSJCY','Salmonella group B enteritis','A02.001',33,1),(23,'QSMSJCY','Salmonella group C enteritis','A02.002',33,1),(24,'AGLSMSJCY','Salmonella Agora Enteritis','A02.003',33,1),(25,'SMSJXCY','Salmonella enteritis','A02.004',33,1),(26,'SMSJLDXQXCY','Salmonella London serovar Enteritis','A02.005',33,1),(27,'SMSJWCY','Salmonella Gastroenteritis','A02.006',33,1),(28,'SSHSMSJXCY','Salmonella Typhimurium Enteritis','A02.007',33,1),(29,'YESMSJCY','Salmonella enteritis infantis','A02.008',33,1),(30,'SMSJCDGR','Salmonella enteric infection','A02.051',31,1),(31,'SMSJYLSNXCY','Salmonella (Arizona) Enteritis','A02.052',33,1),(32,'SMSJBXZ','Salmonella sepsis','A02.101',9,1),(33,'SMSJSSHBYBXZ','Salmonella typhimurium with sepsis','A02.102',306,1),(34,'SMSJXFY','Salmonella pneumonia','A02.201+',81,1),(35,'SMSJXGJY','Salmonella arthritis','A02.202+',123,1),(36,'SMSJXNMY','Salmonella meningitis','A02.203+',232,1),(37,'SMSJXGSY','Salmonella osteomyelitis','A02.251+',114,1),(38,'SMSJXSXGJZB','Salmonella tubulo-interstitial disease','A02.252+',161,1),(39,'QTTZDSMSJGR','Other specified Salmonella infections','A02.851',95,1),(40,'SMSJGR','Salmonella infection NOS','A02.901',95,1),(41,'SSHSMSJGR','Salmonella typhimurium infection','A02.902',306,1),(42,'SMSJSSWZD','Salmonella food poisoning','A02.903',324,1),(43,'SMSZHJLJ','Shigella dysentery','A03.001',200,1),(44,'ZHKLZLJYQZHJB','Shiga-Kreuse dysentery [Subgroup A shigellosis]','A03.051',200,1),(45,'SMCSDCLJ','Schmitz (-Stitzer) dysentery','A03.052',200,1),(46,'FSZHJLJ','Shigella freundii dysentery','A03.101',200,1),(47,'XSLSXJXLJ','His-Russell dysentery','A03.151',380,1),(48,'BSZHJLJ','Shigella baumannii','A03.201',200,1),(49,'BYDXJXLJ','Boyds dysentery','A03.251',380,1);
/*!40000 ALTER TABLE `disease` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `disecategory`
--

DROP TABLE IF EXISTS `disecategory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `disecategory` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `DicaCode` varchar(64) NOT NULL COMMENT 'Category code',
  `DicaName` varchar(64) NOT NULL COMMENT 'Category name',
  `SequenceNo` int DEFAULT NULL COMMENT 'Display sequence number',
  `DicaType` int NOT NULL COMMENT 'Disease type',
  `DelMark` int NOT NULL DEFAULT '1' COMMENT 'Delete mark',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=483 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disecategory`
--

LOCK TABLES `disecategory` WRITE;
/*!40000 ALTER TABLE `disecategory` DISABLE KEYS */;
INSERT INTO `disecategory` VALUES (1,'AMBB','amoebiasis',1,1,1),(2,'AZ','Cancer',2,1,1),(3,'','Vitiligo',3,1,1),(4,'','cataract',4,1,1),(5,'','leukemia',5,1,1),(6,'','Leukemia',6,1,1),(7,'','Pertussis',7,1,1),(8,'','sepsis',8,1,1),(9,'','sepsis',9,1,1),(10,'','Spotted fever',10,1,1),(11,'','Scar',11,1,1),(12,'','Meniscal disease',12,1,1),(13,'','Foreskin disease',13,1,1),(14,'','sporomycosis',14,1,1),(15,'','cardia disease',15,1,1),(16,'','nasal disease',16,1,1),(17,'','tonsil disease',17,1,1),(18,'','Tonsillitis',18,1,1),(19,'','Patellar disease',19,1,1),(20,'','Viral disease',20,1,1),(21,'','Vitreous disease',21,1,1),(22,'','Vitritis',22,1,1),(23,'','Bad sexual behavior',23,1,1),(24,'','Infertility',24,1,1),(25,'','Postpartum disease',25,1,1),(26,'','Obstetric diseases',26,1,1),(27,'','Prenatal check-up',27,1,1),(28,'','Birth trauma',28,1,1),(29,'','Diseases caused by birth trauma',29,1,1),(30,'','Intestinal infectious diseases',30,1,1),(31,'','Intestinal diseases',31,1,1),(32,'','intestinal obstruction',32,1,1),(33,'','enteritis',33,1,1),(34,'','dementia',34,1,1),(35,'','Alveolar disease',35,1,1),(36,'','Insect disease',36,1,1),(37,'','Tics',37,1,1),(38,'','Hemorrhagic fever',38,1,1),(39,'','Hemorrhagic fever',39,1,1),(40,'','Removal of foreign bodies',40,1,1),(41,'','Tetus',41,1,1),(42,'','Tetus',42,1,1),(43,'','sore',43,1,1),(44,'','Trauma disease',44,1,1),(45,'','Pituitary disease',45,1,1),(46,'','Cleft lip',46,1,1),(47,'','gonadotropin deficiency',47,1,1),(48,'','acne',48,1,1),(49,'','bruise',49,1,1);
/*!40000 ALTER TABLE `disecategory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drugs`
--

DROP TABLE IF EXISTS `drugs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `drugs` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `DrugsCode` char(255) NOT NULL COMMENT 'drug code',
  `DrugsName` varchar(512) NOT NULL COMMENT 'drug name',
  `DrugsFormat` varchar(512) DEFAULT NULL COMMENT 'Drug specifications',
  `DrugsUnit` varchar(64) DEFAULT NULL COMMENT 'Packaging unit',
  `Manufacturer` varchar(512) DEFAULT NULL COMMENT 'Manufacturer',
  `DrugsDosageID` int DEFAULT NULL COMMENT 'Drug dosage form',
  `DrugsTypeID` int DEFAULT NULL COMMENT 'drug type',
  `DrugsPrice` decimal(8,2) NOT NULL COMMENT 'drug unit price',
  `MnemonicCode` varchar(64) DEFAULT NULL COMMENT 'Pinyin mnemonic code',
  `CreationDate` datetime NOT NULL COMMENT 'Creation time',
  `LastUpdateDate` datetime DEFAULT NULL COMMENT 'Last modified time',
  `DelMark` int NOT NULL DEFAULT '1' COMMENT 'Delete mark',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2967 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drugs`
--

LOCK TABLES `drugs` WRITE;
/*!40000 ALTER TABLE `drugs` DISABLE KEYS */;
INSERT INTO `drugs` VALUES (1,'86979474000208','Methotrexate for injection','1g×1 tube','branch','Jiangsu Hengrui Pharmaceutical Co., Ltd.',110,101,15.73,'ZSYJAZZ','2024-01-01 00:00:00',NULL,1),(2,'86979474000209','Fluconazole Sodium Chloride Injection (Diflucan)','200mg×100ml/bottle','Bottle','Pfizer Pharmaceutical Co., Ltd.',110,101,7.01,'FKZLHNZSY(DFK)','2024-01-01 00:00:00',NULL,1),(3,'86979474000208','50% Glucose injection (plastic bottle)','10:20ml×1 tube','branch','China Otsuka Pharmaceutical Co., Ltd.',110,101,25.16,'PTTZSY(SP)','2024-01-01 00:00:00',NULL,1),(4,'86979474000209','Terbinafine Hydrochloride Effervescent Tablets (DINK)','50mg×7 tablets/box','box','Qilu Pharmaceutical Co., Ltd.',111,101,40.62,'YSTBZFYDPTP (DK)','2024-01-01 00:00:00',NULL,1),(5,'86979474000208','Hongqi Granule','10g/bag',' Bag','Nanjing Pharmaceutical Co., Ltd. Medicinal Materials Branch',112,103,30.79,'HZ','2024-01-01 00:00:00','2019-03-28 16:07:32',1),(6,'86979474000208','Aminolevulinic acid hydrochloride powder (external use)','118mg×1 bottle','bottle','Shanghai Fudan Zhangjiang Biopharmaceutical Co., Ltd.',113,101,19.51,'YSATWSS（ WY)','2024-01-01 00:00:00',NULL,1),(7,'86979474000209','Memantine Hydrochloride Tablets (Ibeson)','10mg×28 tablets/box','Box','Danish Lundbeck Pharmaceutical Factory',111,101,22.05,'YSMJGP(YBS)','2024-01-01 00:00:00',NULL,1),(8,'86979474000208','Phosphoric acid Oseltamivir capsules (Tamiflu)','75mg×10 capsules/box','box','Shanghai Roche Pharmaceutical Co., Ltd. S',114,101,60.96,'LSASTWJN(DF)','2024-01-01 00:00:00',NULL,1),(9,'86979474000209','Alismatis granules','1g/10g/bag','bag','Jiangyin Tianjiang Pharmaceutical Co., Ltd.',115,102,0.09,'ZXKL','2024-01-01 00:00:00',NULL,1),(10,'86979474000208','Yam granules','0.5g/10g/bag','bag','',115,102,6.79,'SYKL','2024-01-01 00:00:00',NULL,1),(11,'86979474000208','Cooked rhubarb granules','1g/6g/bag','bag ','Jiangyin Tianjiang Pharmaceutical Co., Ltd.',115,102,23.51,'SDHKL','2024-01-01 00:00:00',NULL,1),(12,'86979474000209','Coptis Granules','0.5g/3g bag','bag','Jiangyin Tianjiang Pharmaceutical Co., Ltd.',115,102,1.07,'HLKL','2024-01-01 00:00:00',NULL,1),(13,'86979474000208','Scutellaria baicalensis granules (wine)','2g/10g/bag','bag','Jiangyin Tianjiang Pharmaceutical Co., Ltd.',115,102,81.74,'HZKL(J)','2024-01-01 00:00:00',NULL,1),(14,'86979474000209','Fried white peony granules','1g/10g/bag','bag','Jiangyin Tianjiang Pharmaceutical Co., Ltd.',115,102,31.86,'CBSKL','2024-01-01 00:00:00',NULL,1),(15,'86979474000208','Fried Atractylodes Granules','3g/10g/bag','bag','',115,102,41.50,'CBSKL','2024-01-01 00:00:00',NULL,1),(16,'86979474000208','Angelica Angelica granules','1g/6g/bag','Bag','Jiangyin Tianjiang Pharmaceutical Co., Ltd.',115,102,67.72,'BZKL','2024-01-01 00:00:00',NULL,1),(17,'86979474000209','Xiebai Granules ','2.5g/10g bag','bag','Jiangyin Tianjiang Pharmaceutical Co., Ltd.',115,102,17.95,'ZBKL','2024-01-01 00:00:00',NULL,1),(18,'86979474000208','Chuanxiong granules','2g/6g/bag','bag','',115,102,0.70,'CZKL','2024-01-01 00:00:00',NULL,1),(19,'86979474000209','Vitamin K1 Injection','1ml:10mg×10 pieces/box','box','Wuhu Kangqi Pharmaceutical',110,101,10.39,'WSSK1ZSY','2024-01-01 00:00:00',NULL,1),(20,'86979474000208','Risperdal Tablets (Risperdal)','1mg×20 tablets/box','box','Xian Janssen Pharmaceutical Co., Ltd.',111,101,5.52,'LPTP (WST)','2024-01-01 00:00:00',NULL,1),(21,'86979474000208','0.9% Sodium Chloride Injection( Plastic bottle)','2.25g:250ml×1 bottle','Bottle','China Otsuka Pharmaceutical Co., Ltd.',110,101,14.34,'0.9%LHNZSY(SP)','2024-01-01 00:00:00',NULL,1),(22,'86979474000209','0.9 sodium chloride injection (Baxter)','500ml×1 bag','bottle','Shanghai Baxter Medical Products Co., Ltd.',110,101,46.91,'0.9%LHNZSY (BT)','2024-01-01 00:00:00',NULL,1),(23,'86979474000208','0.9% Sodium Chloride Injection (Plastic Bottle )','0.9g:100ml×1bottle','bottle','China Otsuka Pharmaceutical Co., Ltd.',110,101,6.34,'0.9%LHNZSY(SP)','2024-01-01 00:00:00',NULL,1),(24,'86979474000209','10% glucose injection (plastic bottle)','50g:500ml×1 bottle','bottle','China Otsuka Pharmaceutical Co., Ltd.',110,101,5.04,'10%PTTZSY(SP)','2024-01-01 00:00:00',NULL,1),(25,'86979474000208','10% glucose injection (plastic bottle)','25g :250ml×1bottle','bag','China Otsuka Pharmaceutical Co., Ltd.',110,101,16.02,'10%PTTZSY(SP)','2024-01-01 00:00:00',NULL,1),(26,'86979474000208','5% glucose injection (plastic bottle)','25g:500ml×1 bottle','bottle','China Otsuka Pharmaceutical Co., Ltd.',110,101,47.78,'5%PTTZSY (SP)','2024-01-01 00:00:00',NULL,1),(27,'86979474000209','5% glucose injection (plastic bottle)','12.5g:250ml×1 bottle ','Bottle','China Otsuka Pharmaceutical Co., Ltd.',110,101,45.62,'5%PTTZSY(SP)','2024-01-01 00:00:00',NULL,1),(28,' 86979474000208','5% glucose injection (plastic bottle)','5g:100ml×1 bottle','bottle','China Otsuka Pharmaceutical Co., Ltd.',110,101,17.53,'5%PTTZSY(SP)','2024-01-01 00:00:00',NULL,1),(29,'86979474000209','Weisu granules','5g*9 bags/box','box','Yangzijiang Pharmaceutical Group Co., Ltd. Company',115,102,1.73,'WSKL','2024-01-01 00:00:00',NULL,1);
/*!40000 ALTER TABLE `drugs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drugsdetailed`
--

DROP TABLE IF EXISTS `drugsdetailed`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `drugsdetailed` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `DrugsTempID` int NOT NULL COMMENT 'Pharmaceutical template ID',
  `DrugsID` int NOT NULL COMMENT 'drug ID',
  `DrugsUsage` varchar(64) DEFAULT NULL COMMENT 'usage',
  `Dosage` varchar(64) DEFAULT NULL COMMENT 'Dosage',
  `Frequency` varchar(64) DEFAULT NULL COMMENT 'Frequency',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drugsdetailed`
--

LOCK TABLES `drugsdetailed` WRITE;
/*!40000 ALTER TABLE `drugsdetailed` DISABLE KEYS */;
INSERT INTO `drugsdetailed` VALUES (2,2,23,'Intravenous injection','100ml','Once a day'),(3,2,30,'Intravenous injection','200ml','Once a day'),(4,5,86,'','',''),(6,3,5,'11','11','11'),(7,3,57,'22','22','22'),(8,7,9,'1','1','1'),(9,4,36,'1','1','1'),(10,4,39,'1','1','1'),(11,4,2,'','',''),(12,8,9,'oral','1g','Three times a day'),(13,8,33,'Oral','2g','Three times a day'),(14,8,47,'Oral','Appropriate amount','Multiple times'),(15,9,44,'11','11','11'),(18,9,68,'22','22','22'),(19,10,1659,'1 ','3','1'),(20,10,2912,'1','3','1');
/*!40000 ALTER TABLE `drugsdetailed` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drugstemplate`
--

DROP TABLE IF EXISTS `drugstemplate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `drugstemplate` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `Name` varchar(64) NOT NULL COMMENT 'name',
  `UserID` int NOT NULL COMMENT 'Doctor ID',
  `CreationTime` datetime NOT NULL COMMENT 'Creation time',
  `Scope` char(255) DEFAULT NULL COMMENT 'Scope of use: whole hospital/department/individual',
  `DelMark` int NOT NULL DEFAULT '1' COMMENT 'Delete mark',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drugstemplate`
--

LOCK TABLES `drugstemplate` WRITE;
/*!40000 ALTER TABLE `drugstemplate` DISABLE KEYS */;
INSERT INTO `drugstemplate` VALUES (2,'Candida dermatitis',1,'2024-02-21 13:25:45','1',1),(3,'Acute icteric hepatitis D',1,'2024-02-21 13:25:59','2',1),(4,'Viral gastroenteritis',1,'2024-02-21 13:26:25','3',1),(5,'Mumps NOS',1,'2024-02-21 13:26:33','1',1),(7,'Frequent common cold',1,'2024-02-22 16:34:08','3',1),(8,'Seasonal asthma',1,'2024-02-29 14:50:13','2',1),(9,'Bronchial Asthma',1,'2024-03-01 13:43:44','2',1),(10,'1',1,'2025-12-27 15:05:41','Personal',1);
/*!40000 ALTER TABLE `drugstemplate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `expenseclass`
--

DROP TABLE IF EXISTS `expenseclass`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `expenseclass` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `ExpCode` varchar(64) NOT NULL COMMENT 'Expense account code',
  `ExpName` varchar(64) NOT NULL COMMENT 'Expense account name',
  `DelMark` int NOT NULL DEFAULT '1' COMMENT 'Delete mark',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `expenseclass`
--

LOCK TABLES `expenseclass` WRITE;
/*!40000 ALTER TABLE `expenseclass` DISABLE KEYS */;
INSERT INTO `expenseclass` VALUES (1,'GHF','Registration fee',1),(2,'ZLF','diagnosis and treatment fee',1),(3,'JYF','inspection fee',1),(4,'JYCLF','Inspection Material Fee',1),(5,'CSJCF','Ultrasonic Inspection Fee',1),(6,'CSCLF','Ultrasonic Material Fee',1),(7,'FSJCF','Radiation examination fee',1),(8,'FSCLF','Radiation material fee',1),(9,'MRIJCF','MRI examination fee',1),(10,'MRICLF','MRI material fee',1),(11,'CTJCF','CT examination fee',1),(12,'CTCLF','CT material fee',1),(13,'XYF ','Western medicine fee',1),(14,'ZCYF','Chinese patent medicine fee',1),(15,'ZCYF','Chinese herbal medicine fee',1),(16,'CZF','Disposal Fee',1),(17,'CZCLF','Disposal material fee',1),(18,'MZF','Anesthetic fee',1),(19,'MZYF','Anesthetic fee',1),(20,'MZSSF','Outpatient surgery fee',1),(21,'QT','Others',1);
/*!40000 ALTER TABLE `expenseclass` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fmeditem`
--

DROP TABLE IF EXISTS `fmeditem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fmeditem` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `ItemCode` varchar(64) NOT NULL COMMENT 'Item code',
  `ItemName` varchar(64) NOT NULL COMMENT 'Item name',
  `Format` varchar(64) DEFAULT NULL COMMENT 'Specification',
  `Price` decimal(8,2) NOT NULL COMMENT 'unit price',
  `ExpClassID` int DEFAULT NULL COMMENT 'The expense account ID',
  `DeptID` int DEFAULT NULL COMMENT 'Executive department ID',
  `MnemonicCode` varchar(64) DEFAULT NULL COMMENT 'Pinyin mnemonic code',
  `CreationDate` datetime NOT NULL COMMENT 'Creation time',
  `LastUpdateDate` datetime DEFAULT NULL COMMENT 'Last modified time',
  `RecordType` int DEFAULT NULL COMMENT 'Project type',
  `DelMark` int NOT NULL DEFAULT '1' COMMENT 'Delete mark',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fmeditem`
--

LOCK TABLES `fmeditem` WRITE;
/*!40000 ALTER TABLE `fmeditem` DISABLE KEYS */;
INSERT INTO `fmeditem` VALUES (1,'120200001','great rescue\r','day\r',200.00,16,133,'DQJ','2024-02-01 00:00:00',NULL,3,1),(2,'120200002','be rescued in the middle\r','day\r',150.00,16,133,'ZQJ','2024-02-01 00:00:00',NULL,3,1),(3,'120200003','small rescue\r','day\r',80.00,16,133,'XQJ','2024-02-01 00:00:00',NULL,3,1),(4,'120300001','central oxygen uptake\r','hour\r',2.50,16,122,'ZXXY','2024-02-01 00:00:00',NULL,3,1),(5,'120300002','Low flow oxygen absorption\r','hour\r',2.00,16,122,'DLLXY','2024-02-01 00:00:00',NULL,3,1),(6,'120300003','high frequency oxygen absorption\r','hour\r',4.00,16,122,'GPXY','2024-02-01 00:00:00',NULL,3,1),(7,'120500001','large clear wound suture\r','second\r',120.00,16,133,'DQCFH','2024-02-01 00:00:00',NULL,3,1),(8,'120500002','medium clear wound suture\r','second\r',80.00,16,133,'ZQCFH','2024-02-01 00:00:00',NULL,3,1),(9,'120500003','small clear wound suture\r','second\r',40.00,16,133,'XQCFH','2024-02-01 00:00:00',NULL,3,1),(10,'121000001','gastric lavage\r','second\r',40.00,16,133,'XW','2024-02-01 00:00:00',NULL,3,1),(11,'120800002','Intestinal hypernutrient therapy\r','day\r',5.00,16,133,'CNGYYZL','2024-02-01 00:00:00',NULL,3,1),(12,'121500001','enema\r','second\r',10.00,16,133,'GC','2024-02-01 00:00:00',NULL,3,1),(13,'240100003','Computer Therapy Planning System (TPS)\r','course of treatment\r',180.00,7,128,'JSJZLJHXT','2024-02-01 00:00:00',NULL,3,1),(14,'240100004','Specific Computerized Treatment Planning System\r','course of treatment\r',500.00,7,128,'TDJSJZLJHXT','2024-02-01 00:00:00',NULL,3,1),(15,'240100004b','Accelerator-Adaptive Treatment Planning System\r','course of treatment\r',500.00,7,128,'JSQSXZLJHXT','2024-02-01 00:00:00',NULL,3,1),(16,'240100004c','Gamma Knife Treatment Planning System\r','course of treatment\r',500.00,7,128,'GMDZLJHXT','2024-02-01 00:00:00',NULL,3,1),(17,'240100004d','X Knife TPS Treatment Planning System\r','course of treatment\r',500.00,7,128,'XDZTPSZLJHXT','2024-02-01 00:00:00',NULL,3,1),(18,'240100004e','Reverse Intensification TPS and Optimization of Treatment Planni','course of treatment\r',500.00,7,128,'NXTQTPSJYHZLJHXT','2024-02-01 00:00:00',NULL,3,1),(19,'240100005','Timely monitoring of radiation therapy\r','second\r',50.00,7,128,'FSZLDSSJK','2024-02-01 00:00:00',NULL,3,1),(20,'210101001','general perspective\r','each part\r',5.00,7,128,'PTTS','2024-02-01 00:00:00',NULL,1,1),(25,'210101002','esophageal barium meal perspective\r','second\r',15.00,7,128,'SGBCTS','2024-02-01 00:00:00',NULL,1,1),(26,'210101003','Bedside perspective and intraoperative perspective\r','half an hour\r',40.00,7,128,'CPTSYSZTS','2024-02-01 00:00:00',NULL,1,1),(27,'210101004','C-arm intraoperative perspective\r','half an hour\r',150.00,7,128,'CXBSZTS','2024-02-01 00:00:00',NULL,1,1),(28,'210103001','pneumoencephalography\r','second\r',80.00,7,128,'QNZY','2024-02-01 00:00:00',NULL,1,1),(29,'210103003','ventricular iodine hydrography\r','second\r',60.00,7,128,'NSDSZY','2024-02-01 00:00:00',NULL,1,1),(30,'210103004','Determination of X-Creatine Kinase-MB Isozyme Activity (Dry X Me','second\r',60.00,3,125,'XQJSJM－MBTGMHXCD（GHXF）','2024-02-01 00:00:00',NULL,2,1),(31,'210103005','Determination of X-Creatine Kinase-MB Isozyme Activity (Gold Sta','second\r',60.00,3,125,'XQJSJM－MBTGMHXCD（JBF）','2024-02-01 00:00:00',NULL,2,1),(32,'210103006','Determination of α1 microglobulin in urine (chemical X-ray emiss','unilateral\r',50.00,3,125,'Nα1WLQDBCD（HXFGF）','2024-02-01 00:00:00',NULL,2,1),(33,'210103007','Determination of β2 microglobulin (various immunological X metho','unilateral\r',50.00,3,125,'β2WQDBCD（GZMYXFF）','2024-02-01 00:00:00',NULL,2,1),(34,'210103008','Determination of β2 microglobulin in X-clear (chemical X-ray emi','unilateral\r',40.00,3,125,'XQβ2WQDBCD（HXFGF）','2024-02-01 00:00:00',NULL,2,1),(35,'210103009','Determination of β2 microglobulin in urine (chemical X-ray emiss','unilateral\r',80.00,3,125,'Nβ2WQDBCD（HXFGF）','2024-02-01 00:00:00',NULL,2,1),(36,'210103010','Urinary protein electrophoresis analysis (gel method)\r','unilateral\r',70.00,3,125,'NDBDYFX（NJF）','2024-02-01 00:00:00',NULL,2,1),(37,'210103011','X-Qing anti-glutamic acid de-Jase antibody assay (various immune','unilateral\r',50.00,3,125,'XQKGASTJMKTCD（GZMYXFF）','2024-02-01 00:00:00',NULL,2,1),(38,'210103012','Measurement of gastrin (each)The X-Method of Immunity)\r','second\r',50.00,3,125,'WMSCD（GZMYXFF）','2024-02-01 00:00:00',NULL,2,1),(39,'210103013','X plasma coagulation X enzyme proto-time determination (PT) (ins','second\r',50.00,3,125,'XJNXMYSJCD(PT)(YQF)','2024-02-01 00:00:00',NULL,2,1),(40,'210103014','Determination of X-Creatine Kinase-MB Isozyme Activity (Rate Met','second\r',60.00,3,125,'XQJSJM－MBTGMHXCD（SLF）','2024-02-01 00:00:00',NULL,2,1),(41,'210103015','Determination of aldosterone (chemical X-luminescence, fluoresce','second\r',50.00,3,125,'QGTCD（HXFGF、YGMYF）','2024-02-01 00:00:00',NULL,2,1),(42,'210103016','determination of urinary catecholamine (chromatography)\r','second\r',80.00,3,125,'NECFACD（SPF）','2024-02-01 00:00:00',NULL,2,1),(43,'210103017','Determination of Urinary Vanilla Bitter Almond Acid (VMA)\r','second\r',60.00,3,125,'NXCKXRS(VMA)CD（SPF）','2024-02-01 00:00:00',NULL,2,1),(44,'210103018','Determination of renin activity in X plasma\r','second\r',80.00,3,125,'XJSSHXCD','2024-02-01 00:00:00',NULL,2,1),(45,'210103019','X-tube tension 管 determination\r','second\r',100.00,3,125,'XGJZSⅡCD','2024-02-01 00:00:00',NULL,2,1),(46,'210103020','erythropoietin assay\r','second\r',50.00,3,125,'CHXBSCSCD','2024-02-01 00:00:00',NULL,2,1),(47,'210103021','Testosterone determination (chemical X-ray, fluorescence immuniz','second\r',80.00,3,125,'ZTCD（HXFGF、YGMYF）','2024-02-01 00:00:00',NULL,2,1),(48,'210103022','Glucose determination (dry X method) (X-clear)\r','second\r',300.00,3,125,'PTTCD（GHXF）(XQ)','2024-02-01 00:00:00',NULL,2,1),(49,'210103023','determination of glycated X-hemoglobin (chromatography)\r','second\r',80.00,3,125,'THXHDBCD（SPF）','2024-02-01 00:00:00',NULL,2,1),(50,'210103024','X-spray lactic acid determination\r','second\r',80.00,3,125,'XJRSCD','2024-02-01 00:00:00',NULL,2,1),(51,'210103025','Determination of urinary N-X-β-D-glucosidase\r','second\r',70.00,3,125,'NN-X-β-D-AJPTTZMCD','2024-02-01 00:00:00',NULL,2,1),(52,'210103026','Determination of β-D-galactosidase in urine\r','second\r',50.00,3,125,'Nβ-D-BRTZMCD','2024-02-01 00:00:00',NULL,2,1),(53,'210103027','Down syndrome screening\r','unilateral\r',70.00,3,125,'TSZHZSC','2024-02-01 00:00:00',NULL,2,1),(54,'210103028','Estriol determination (chemical X-ray emission, fluorescence imm','second\r',50.00,3,125,'CSCCD（HXFGF、YGMYF）','2024-02-01 00:00:00',NULL,2,1),(55,'210103029','Estradiol assay (chemical X-ray, fluorescence immunization)\r','second\r',50.00,3,125,'CECCD（HXFGF、YGMYF）','2024-02-01 00:00:00',NULL,2,1),(56,'210103030','Progesterone determination (chemical X-ray, fluorescence immuniz','unilateral',50.00,3,125,'YTCD（HXFGF、YGMYF）','2024-02-01 00:00:00',NULL,2,1);
/*!40000 ALTER TABLE `fmeditem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `herbaldetailed`
--

DROP TABLE IF EXISTS `herbaldetailed`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `herbaldetailed` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `HerbalPresID` int NOT NULL COMMENT 'Herbal prescription ID',
  `HerbalID` int NOT NULL COMMENT 'drug ID',
  `Dosage` varchar(64) DEFAULT NULL COMMENT 'Dosage',
  `Price` decimal(8,2) NOT NULL COMMENT 'drug unit price',
  `Footnote` varchar(64) DEFAULT NULL COMMENT 'footnote',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `herbaldetailed`
--

LOCK TABLES `herbaldetailed` WRITE;
/*!40000 ALTER TABLE `herbaldetailed` DISABLE KEYS */;
/*!40000 ALTER TABLE `herbaldetailed` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `herbalprescription`
--

DROP TABLE IF EXISTS `herbalprescription`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `herbalprescription` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `MedicalID` int NOT NULL COMMENT 'medical_record_ID',
  `RegistID` int NOT NULL COMMENT 'registered_ID',
  `UserID` int NOT NULL COMMENT 'Doctor ID',
  `PrescriptionName` varchar(64) NOT NULL COMMENT 'prescription name',
  `CreationTime` datetime NOT NULL COMMENT 'Creation time',
  `PrescriptioType` varchar(64) DEFAULT NULL COMMENT 'Prescription type: decoction/soak in wine/powder/pill making/capsulation, etc.',
  `PayNumber` int DEFAULT NULL COMMENT 'PayNumber',
  `Frequency` varchar(64) DEFAULT NULL COMMENT 'Frequency',
  `DrugsUsage` varchar(64) DEFAULT NULL COMMENT 'Usage internal/external use',
  `Therapy` varchar(512) DEFAULT NULL COMMENT 'Therapy',
  `Detailed` varchar(512) DEFAULT NULL COMMENT 'Detailed treatment method',
  `Advice` varchar(512) DEFAULT NULL COMMENT 'Doctors advice',
  `State` int DEFAULT NULL COMMENT 'state',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `herbalprescription`
--

LOCK TABLES `herbalprescription` WRITE;
/*!40000 ALTER TABLE `herbalprescription` DISABLE KEYS */;
/*!40000 ALTER TABLE `herbalprescription` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `herbaltempdetailed`
--

DROP TABLE IF EXISTS `herbaltempdetailed`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `herbaltempdetailed` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `HerbalTempID` int NOT NULL COMMENT 'Herbal template ID',
  `HerbalID` int NOT NULL COMMENT 'drug ID',
  `Dosage` varchar(64) DEFAULT NULL COMMENT 'Dosage',
  `Unit` varchar(64) DEFAULT NULL COMMENT 'drug unit',
  `Footnote` varchar(64) DEFAULT NULL COMMENT 'footnote',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `herbaltempdetailed`
--

LOCK TABLES `herbaltempdetailed` WRITE;
/*!40000 ALTER TABLE `herbaltempdetailed` DISABLE KEYS */;
/*!40000 ALTER TABLE `herbaltempdetailed` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `herbaltemplate`
--

DROP TABLE IF EXISTS `herbaltemplate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `herbaltemplate` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `Name` varchar(64) NOT NULL COMMENT 'name',
  `DoctorID` int NOT NULL COMMENT 'Doctor ID',
  `CreationTime` datetime NOT NULL COMMENT 'Creation time',
  `PrescriptioType` varchar(64) DEFAULT NULL COMMENT 'Prescription type: decoction/soak in wine/powder/pill making/capsulation, etc.',
  `PayNumber` int DEFAULT NULL COMMENT 'PayNumber',
  `DrugsUsage` varchar(64) DEFAULT NULL COMMENT 'usage',
  `Therapy` varchar(512) DEFAULT NULL COMMENT 'Therapy',
  `Detailed` varchar(512) DEFAULT NULL COMMENT 'Detailed treatment method',
  `Advice` varchar(512) DEFAULT NULL COMMENT 'Doctors advice',
  `Scope` varchar(64) DEFAULT NULL COMMENT 'Scope of use: whole hospital/department/individual',
  `DelMark` int NOT NULL DEFAULT '1' COMMENT 'Delete mark',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `herbaltemplate`
--

LOCK TABLES `herbaltemplate` WRITE;
/*!40000 ALTER TABLE `herbaltemplate` DISABLE KEYS */;
/*!40000 ALTER TABLE `herbaltemplate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `invoice` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `InvoiceNum` varchar(64) NOT NULL COMMENT 'Invoice number',
  `Money` decimal(8,2) NOT NULL COMMENT 'Invoice amount',
  `State` int NOT NULL COMMENT 'Invoice status 1-normal 2-voided',
  `CreationTime` datetime NOT NULL COMMENT 'Collection/refund time',
  `UserID` int NOT NULL COMMENT 'ID of person who collects/refunds',
  `RegistID` int DEFAULT NULL COMMENT 'registered_ID ',
  `FeeType` int DEFAULT NULL COMMENT 'Charging method',
  `Back` varchar(64) DEFAULT NULL COMMENT 'red invoice number',
  `DailyState` int NOT NULL DEFAULT '0' COMMENT 'Invoice status 0-not yet settled 1-submitted 2-approved',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=273 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoice`
--

LOCK TABLES `invoice` WRITE;
/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
INSERT INTO `invoice` VALUES (56,'800801',50.00,2,'2024-02-25 10:09:28',9,24,51,'',1),(132,'800802',48.65,3,'2024-03-01 11:26:23',9,35,51,NULL,1),(133,'800803',-8.65,7,'2024-03-01 11:27:48',9,35,51,NULL,1),(134,'800804',48.65,3,'2024-03-01 11:38:23',9,35,51,NULL,1),(135,'800805',-48.65,7,'2024-03-01 11:39:40',9,35,51,NULL,0),(136,'800806',77.90,3,'2024-03-01 11:40:19',9,35,51,NULL,1),(137,'800807',-67.90,7,'2024-03-01 11:41:37',9,35,51,NULL,0),(138,'800808',-10.00,7,'2024-03-01 11:42:42',9,35,51,NULL,1),(139,'800809',8.00,3,'2024-03-01 13:25:23',9,37,51,NULL,0),(142,'800810',129.94,3,'2024-03-01 13:33:54',9,37,51,NULL,0),(143,'800811',-129.94,7,'2024-03-01 13:38:56',9,37,51,NULL,1),(144,'800812',247.37,3,'2024-03-01 13:39:37',9,37,52,NULL,1),(257,'800813',-50.00,7,'2024-12-23 10:50:19',10,24,51,'800813',1),(258,'800814',138.13,1,'2024-12-23 14:41:29',10,NULL,51,NULL,1),(259,'800815',294.16,1,'2024-12-23 14:42:38',10,NULL,51,NULL,1),(260,'800816',8.00,4,'2025-12-23 19:54:58',10,3,51,NULL,1),(261,'800817',174.86,1,'2025-12-23 19:55:43',10,NULL,51,NULL,1),(265,'800818',96.57,1,'2026-12-24 16:14:47',9,NULL,51,NULL,1),(266,'800819',296.57,1,'2026-12-27 14:58:18',9,NULL,51,NULL,0),(267,'800820',149.82,1,'2026-12-27 15:07:28',9,NULL,51,NULL,0),(268,'800821',56.00,1,'2026-12-27 15:18:16',9,NULL,51,NULL,0),(269,'800822',400.00,1,'2026-12-27 16:14:23',9,NULL,51,NULL,0),(270,'800823',27.37,1,'2026-12-27 16:22:14',9,NULL,51,NULL,0),(271,'800824',-50.00,7,'2024-03-08 18:31:42',9,24,51,'800824',1),(272,'800825',-50.00,7,'2024-03-08 18:31:46',9,24,51,'800825',1);
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicaldisease`
--

DROP TABLE IF EXISTS `medicaldisease`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medicaldisease` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `MedicalID` int NOT NULL COMMENT 'medical_record_ID',
  `RegistID` int NOT NULL COMMENT 'registered_ID',
  `DiseaseID` int NOT NULL COMMENT 'Disease ID',
  `DiagnoseType` int DEFAULT NULL COMMENT 'Diagnosis type 1-Western medicine 2-Traditional Chinese medicine',
  `GetSiskDate` datetime DEFAULT NULL COMMENT 'date of onset',
  `DiagnoseCate` int DEFAULT NULL COMMENT 'Diagnosis type 1-initial diagnosis 2-final diagnosis',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicaldisease`
--

LOCK TABLES `medicaldisease` WRITE;
/*!40000 ALTER TABLE `medicaldisease` DISABLE KEYS */;
INSERT INTO `medicaldisease` VALUES (4,1,3,10310,1,'2024-01-02 00:00:00',1),(6,3,4,4,1,'2024-01-02 00:00:00',1),(10,4,6,9,1,'2024-01-02 00:00:00',1),(12,5,9,5,1,'2024-01-02 00:00:00',2),(13,1,25,27149,2,'2024-01-02 00:00:00',2),(14,1,26,8,1,'2024-01-02 00:00:00',2),(16,8,27,8,1,'2024-01-02 00:00:00',2),(17,1,29,5,1,'2024-01-02 00:00:00',2),(18,1,29,10,1,'2024-01-02 00:00:00',2),(19,1,30,1,1,'2024-01-02 00:00:00',2),(20,19,34,4,1,'2024-01-02 00:00:00',1),(21,1,0,0,0,'2024-01-02 00:00:00',1);
/*!40000 ALTER TABLE `medicaldisease` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicalrecord`
--

DROP TABLE IF EXISTS `medicalrecord`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medicalrecord` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `CaseNumber` varchar(64) NOT NULL COMMENT 'medical_record_Id',
  `RegistID` int NOT NULL COMMENT 'registered_ID',
  `Readme` varchar(512) DEFAULT NULL COMMENT 'Main complaint',
  `Present` varchar(512) DEFAULT NULL COMMENT 'History of current illness',
  `PresentTreat` varchar(512) DEFAULT NULL COMMENT 'Treatment status of current disease',
  `History` varchar(512) DEFAULT NULL COMMENT 'History',
  `Allergy` varchar(512) DEFAULT NULL COMMENT 'Allergy history',
  `Physique` varchar(512) DEFAULT NULL COMMENT 'Physical examination',
  `Proposal` varchar(512) DEFAULT NULL COMMENT 'Check proposal',
  `Careful` varchar(512) DEFAULT NULL COMMENT 'Notes',
  `CheckResult` varchar(512) DEFAULT NULL COMMENT 'Check result',
  `Diagnosis` varchar(512) DEFAULT NULL COMMENT 'Diagnosis result',
  `Handling` varchar(512) DEFAULT NULL COMMENT 'Handling opinions',
  `CaseState` int DEFAULT NULL COMMENT 'Medical record status 1-temporary storage 2-submitted 3-diagnosis completed',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicalrecord`
--

LOCK TABLES `medicalrecord` WRITE;
/*!40000 ALTER TABLE `medicalrecord` DISABLE KEYS */;
INSERT INTO `medicalrecord` VALUES (1,'600601',3,'I started coughing after catching a cold half a month ago.','Paroxysmal cough','I took cough syrup for 3 days,','I have a history of chronic \".','none','BP 128/80mmHg,','Blood routine','None','Examination result 1','Abdominal disease','',2),(3,'600607',4,'Metastatic right .','During the course','The patient was admitted to the hospital on June 11, 2008','No history of tuberculosis and hepatitis, no history of diabetes, heart diseas..','none','none','blood routine','none','examination result 1','Abdominal disease','',1),(4,'600605',6,'Intermittent right upper quadrant pain for 2 years.','The disease is due to the onset of dull pain',' On January 14, 2010, in Ailing,','No history .','None','None','Abdominal color ultrasound (2208-06-11)','Low-fat diet','Examination results 1','Abdominal disease','',2),(5,' 600606',9,'Pain in the right lower abdomen with nausea.','The patient had abdominal pain without any trigger 8 hours ago. ','The patient was ','There is no history of tuberculosis and hepatitis, ','None','None','Blood routine','None','Examination result 1','Abdominal disease','',2),(6,'600609',25,'111',' 222','333','444','555','666','777','888','Examination result 1','Abdominal disease','',2),(7,'600607',26,'11','22','33','44','55','66','ww','gggg','Examination result 1','Abdominal disease','',2),(8,'600608',27,'Su Erqiang Su Erqiang Su Erqiang Su Erqiang Su Erqiang Su Erqiang ah','Su Erqiang Su Erqiang Su Erqiang Su Erqiang','Su Erqiang Su Erqiang, Su Erqiang, Su Erqiang','Su Erqiang, Su Erqiang, Su Erqiang, Su Erqiang','Su Erqiang, Su Erqiang, Su Erqiang, Su Erqiang','Su Erqiang, Su Erqiang, Su ErqiangQiang Su Erqiang Su Erqiang','Su Erqiang','Su Erqiang','Examination result 1','Abdominal disease','',3),(9,'600610',29,'q','q','q','q','q','q','q','q','Examination result 1','Abdominal disease','',3),(10,' 600611',30,'3','3','3','3','3','3','3','3','Examination result 1','Abdominal disease','',3),(11,'600609',28,'undefined','undefined','undefined','undefined','undefined','undefined','undefined','undefined','Check result 1','Abdominal disease','',3),(13,'600612',31,'','','','','','','','','','Abdominal Disease','',3),(15,'600613',32,'','','','','','','','','','Abdominal disease','',3),(18,'600614',33,'','','','','','','','','','Abdominal disease','',3),(19,'600615',34,'','','','','','','','','','abdominal disease','',2),(20,'600618',37,'qq','','','','','','','','','abdominal disease','',2),(21,'600616',35,'1','1','1','1','1','1','1','1','1','He-Kreuse dysentery [Subgroup A shigellosis]','1',3),(22,'600617',36,'Chief complaint 1','History of current disease 1','Treatment of current disease 1','Past history 1 ','Allergy history 1','Physical examination 1','Examination suggestions 1','Precautions 1','Examination results 1','Abdominal disease','1',3);
/*!40000 ALTER TABLE `medicalrecord` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patientcosts`
--

DROP TABLE IF EXISTS `patientcosts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patientcosts` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `RegistID` int NOT NULL COMMENT 'registered_ID',
  `InvoiceID` int NOT NULL COMMENT 'Invoice ID',
  `ItemID` int NOT NULL COMMENT 'Item ID',
  `ItemType` int NOT NULL COMMENT 'Item type 1-non-drug 2-drug',
  `Name` varchar(64) NOT NULL COMMENT 'Project name',
  `Price` decimal(8,2) NOT NULL COMMENT 'Project unit price',
  `Amount` decimal(8,2) NOT NULL COMMENT 'Amount',
  `DeptID` int NOT NULL COMMENT 'Executive department ID',
  `Createtime` datetime NOT NULL COMMENT 'Create time',
  `CreateOperID` int NOT NULL COMMENT 'Issuer ID',
  `PayTime` datetime NOT NULL COMMENT 'Payment/refund time',
  `RegisterID` int NOT NULL COMMENT 'ID of person who collects/refunds',
  `FeeType` int NOT NULL COMMENT 'Charging method',
  `BackID` int DEFAULT NULL COMMENT 'Refund corresponding record ID',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=275 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patientcosts`
--

LOCK TABLES `patientcosts` WRITE;
/*!40000 ALTER TABLE `patientcosts` DISABLE KEYS */;
INSERT INTO `patientcosts` VALUES (254,35,134,1,1,'Weisu Granules',1.73,5.00,22,'2024-02-01 11:11:11',301,'2024-03-01 11:38:23',301,51,NULL),(255,35,134,1,1,'Gastric lavage',40.00,1.00,22,'2024-02-01 11:11:11',301,'2024-03-01 11:38:23',301,51,NULL),(256,35,135,1,1,'Weisu Granules',1.73,-5.00,22,'2024-02-01 11:11:11',301,'2024-03-01 11:39:40',301,51,NULL),(257,35,135,1,1,'Gastric lavage',40.00,-1.00,22,'2024-02-01 11:11:11',301,'2024-03-01 11:39:40',301,51,NULL),(258,35,136,1,1,'Yam Granules',6.79,10.00,22,'2024-02-01 11:11:11',301,'2024-03-01 11:40:19',301,51,NULL),(259,35,136,1,1,'Enema',10.00,1.00,22,'2024-02-01 11:11:11',301,'2024-03-01 11:40:19',301,51,NULL),(260,35,137,1,1,'Yam Particles',6.79,-10.00,22,'2024-02-01 11:11:11',301,'2024-03-01 11:41:37',301,51,NULL),(261,35,138,1,1,'Enema',10.00,-1.00,22,'2024-02-01 11:11:11',301,'2024-03-01 11:42:42',301,51,NULL),(262,37,139,1,1,'Registration fee',8.00,1.00,1,'2024-02-01 11:11:11',9,'2024-03-01 13:25:23',9,51,NULL),(263,37,142,1,1,'Beeswax',3.47,2.00,22,'2024-02-01 11:11:11',301,'2024-03-01 13:33:54',301,51,NULL),(264,37,142,1,1,'Metroviolet solution',41.00,3.00,22,'2024-02-01 11:11:11',301,'2024-03-01 13:33:54',301,51,NULL),(265,37,143,1,1,'Beeswax',3.47,-2.00,22,'2024-02-01 11:11:11',301,'2024-03-01 13:38:56',301,51,NULL),(266,37,143,1,1,'methyl violet solution',41.00,-3.00,22,'2024-02-01 11:11:11',301,'2024-03-01 13:38:56',301,51,NULL),(267,37,144,1,1,'Hongqi Granules',30.79,3.00,22,'2024-02-01 11:11:11',301,'2024-03-01 13:39:37',301,51,NULL),(268,37,144,1,1,'Ventriculography',60.00,1.00,22,'2024-02-01 11:11:11',301,'2024-03-01 13:39:37',301,51,NULL),(269,37,144,1,1,' Pneumoencephalography',80.00,1.00,22,'2024-02-01 11:11:11',301,'2024-03-01 13:39:37',301,51,NULL),(270,37,144,1,1,'Esophageal barium meal fluoroscopy',15.00,1.00,22,'2024-02-01 11:11:11',301,'2024-03-01 13:39:37',301,51,NULL),(271,37,145,1,1,'Ventriculography',60.00,-1.00,22,'2024-02-01 11:11:11',301,'2024-03-01 13:39:57',301,51,NULL),(272,37,145,1,1,'Pneumoencephalography',80.00,-1.00,22,'2024-02-01 11:11:11',301,'2024-03-01 13:39:57',301,51,NULL),(273,37,145,1,1,'Esophageal barium meal fluoroscopy',15.00,-1.00,22,'2024-02-01 11:11:11',301,'2024-03-01 13:39:57',301,51,NULL),(274,36,800823,2912,2,'Rabid immune globulin (Shuyang)',27.37,1.00,1,'2024-02-01 11:11:11',10,'2026-12-25 16:22:14',10,51,NULL);
/*!40000 ALTER TABLE `patientcosts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prescription`
--

DROP TABLE IF EXISTS `prescription`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prescription` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `MedicalID` int NOT NULL COMMENT 'medical_record_ID',
  `RegistID` int NOT NULL COMMENT 'registered_ID',
  `UserID` int NOT NULL COMMENT 'Doctor ID',
  `PrescriptionName` varchar(64) NOT NULL COMMENT 'prescription name',
  `PrescriptionTime` datetime NOT NULL COMMENT 'Issuance time',
  `PrescriptionState` int NOT NULL COMMENT 'prescription status',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prescription`
--

LOCK TABLES `prescription` WRITE;
/*!40000 ALTER TABLE `prescription` DISABLE KEYS */;
INSERT INTO `prescription` VALUES (1,1,35,2,'Childrens cold','2024-02-01 01:01:01',2),(2,2,4,5,'Enteritis','2024-02-01 01:01:01',2),(38,5,9,1,'Template: Candida dermatitis','2024-02-01 01:01:01',1),(39,5,9,1,'New prescription 1','2024-02-01 01:01:01',1),(40,8,27,1,'New prescription 1','2024-02-01 01:01:01',2),(41,9,29,1,'New prescription 1','2024-02-01 01:01:01',6),(46,10,30,1,'www','2024-02-01 01:01:01',6),(47,10,30,1,'Template: Viral gastroenteritis','2024-02-01 01:01:01',6),(48,15,32,1,'s1','2024-02-01 01:01:01',6),(51,18,33,1,'Template: Viral gastroenteritis','2024-02-01 01:01:01',3),(52,18,33,1,'Template: Candidal dermatitis','2024-02-01 01:01:01',3),(53,19,34,1,'Template: Viral Gastroenteritis','2024-02-01 01:01:01',2),(54,19,34,1,'Template: Frequent seasonal asthma','2024-02-01 01:01:01',2),(55,7,26,1,'Template: Frequent seasonal asthma','2024-02-01 01:01:01',1),(56,20,37,1,'a1','2024-02-01 01:01:01',2),(57,20,37,1,'Template: Bronchial Asthma','2024-02-01 01:01:01',1),(58,21,35,1,'1','2024-02-01 01:01:01',3),(59,22,36,1,'1','2024-02-01 01:01:01',3);
/*!40000 ALTER TABLE `prescription` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prescriptiondetailed`
--

DROP TABLE IF EXISTS `prescriptiondetailed`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prescriptiondetailed` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `PrescriptionID` int NOT NULL COMMENT 'Pharmaceutical prescription ID',
  `DrugsID` int NOT NULL COMMENT 'drug ID',
  `DrugsUsage` varchar(64) DEFAULT NULL COMMENT 'usage',
  `Dosage` varchar(64) DEFAULT NULL COMMENT 'Dosage',
  `Frequency` varchar(64) DEFAULT NULL COMMENT 'Frequency',
  `Amount` decimal(8,2) NOT NULL COMMENT 'Amount',
  `State` int NOT NULL DEFAULT '2' COMMENT 'State',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prescriptiondetailed`
--

LOCK TABLES `prescriptiondetailed` WRITE;
/*!40000 ALTER TABLE `prescriptiondetailed` DISABLE KEYS */;
INSERT INTO `prescriptiondetailed` VALUES (1,1,10,'oral','30g','twice a day',10.00,3),(2,1,29,'oral','5g','once Twice a day',5.00,6),(3,51,36,'1','1','1',1.00,3),(4,51,39,'1','1',' 1',1.00,3),(5,51,2,'','','',1.00,3),(6,52,23,'Intravenous injection','100ml','Once a day',1.00,3),(7,52,30,'Intravenous injection','200ml','Once a day',1.00,2),(8,53,36,'1','1','1 ',1.00,3),(9,53,39,'1','1','1',1.00,3),(10,53,2,'','','',1.00,3),(11,54,9,'Oral','1g','Three times a day',1.00,3),(12,54,33,'Oral','2g','Three times a day',1.00,2),(13,54,47,'oral','appropriate amount','multiple times',1.00,2),(14,55,9,'oral','1g','three times a day',1.00,4),(15,55,33,'oral','2g','three times a day',1.00,4),(16,55,47,'oral','appropriate amount','multiple times',1.00,4),(17,56,5,'q','q','q',3.00,3),(18,56,45,'w','w','w',2.00,6),(19,56,2965,'e','e','e',3.00,6),(20,57,44,'11','11','11',1.00,2),(21,57,68,'22','22','22',1.00,2),(22,58,1659,'1','3','1',1.00,3),(23,58,2912,'1','3','1',1.00,3),(24,59,1659,'1','3','1',1.00,4),(25,59,2912,'1','3','1',1.00,4);
/*!40000 ALTER TABLE `prescriptiondetailed` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recordtemplate`
--

DROP TABLE IF EXISTS `recordtemplate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recordtemplate` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `Name` varchar(64) NOT NULL COMMENT 'name',
  `DeptID` int NOT NULL COMMENT 'Department ID',
  `UserID` int NOT NULL COMMENT 'Doctor ID',
  `CreationTime` datetime NOT NULL COMMENT 'Creation time',
  `Scope` varchar(64) DEFAULT NULL COMMENT 'Scope of use: whole hospital/department/individual',
  `Readme` varchar(512) DEFAULT NULL COMMENT 'Main complaint',
  `Present` varchar(512) DEFAULT NULL COMMENT 'History of current illness',
  `PresentTreat` varchar(512) DEFAULT NULL COMMENT 'Treatment status of current disease',
  `History` varchar(512) DEFAULT NULL COMMENT 'History',
  `Allergy` varchar(512) DEFAULT NULL COMMENT 'Allergy history',
  `Physique` varchar(512) DEFAULT NULL COMMENT 'Physical examination',
  `Proposal` varchar(512) DEFAULT NULL COMMENT 'Check proposal',
  `Careful` varchar(512) DEFAULT NULL COMMENT 'Notes',
  `CheckResult` varchar(512) DEFAULT NULL COMMENT 'Check result',
  `Diagnosis` varchar(512) DEFAULT NULL COMMENT 'Diagnosis result',
  `Handling` varchar(512) DEFAULT NULL COMMENT 'Handling opinions',
  `DelMark` int NOT NULL DEFAULT '1' COMMENT 'Delete mark',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recordtemplate`
--

LOCK TABLES `recordtemplate` WRITE;
/*!40000 ALTER TABLE `recordtemplate` DISABLE KEYS */;
INSERT INTO `recordtemplate` VALUES (1,'Bian Ques private template 1',1,1,'2024-03-01 11:38:23','personal','chief complaint 1','history of current illness 1','Current disease treatment status 1','Past history 1','Allergy history 1','Physical examination 1','Examination suggestions 1','Notes 1','Examination results 1','Diagnosis results 1','Handling Opinion 1',1),(2,'Bian Ques Department Template 1',1,1,'2024-03-01 11:38:23','Department','Main Complaint 2','History of Current Illness 2','Current disease treatment status 2','Past history 2','Allergy history 2','Physical examination 2','Examination recommendations 2','Precautions 2','Examination results 2','Diagnosis results 2','Handling opinion 2',1),(3,'Bian Ques public template 1',1,1,'2024-03-01 11:38:23','The whole court','Main complaint 3','History of current illness 3','Treatment of current illness 3','Past history 3','Allergy history 3','Physical examination 3','Examination recommendations 3','Precautions 3','Examination results 3','Diagnosis result 3','Handling opinion 3',1);
/*!40000 ALTER TABLE `recordtemplate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `register`
--

DROP TABLE IF EXISTS `register`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `register` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `CaseNumber` varchar(64) NOT NULL COMMENT 'medical_record_ID',
  `RealName` varchar(64) NOT NULL COMMENT 'name',
  `Gender` int NOT NULL COMMENT 'Gender',
  `IDnumber` varchar(18) DEFAULT NULL COMMENT 'ID number',
  `BirthDate` date DEFAULT NULL COMMENT 'Birth date',
  `Age` int DEFAULT NULL COMMENT 'Age',
  `AgeType` char(255) DEFAULT NULL COMMENT 'Age type years months days',
  `HomeAddress` varchar(64) DEFAULT NULL COMMENT 'Home Address',
  `VisitDate` date NOT NULL COMMENT 'Date of this visit',
  `Noon` char(255) NOT NULL COMMENT 'noon morning/afternoon',
  `DeptID` int NOT NULL COMMENT 'Department ID of this registration',
  `UserID` int NOT NULL COMMENT 'doctors ID',
  `RegistLeID` int NOT NULL COMMENT 'registration section ID',
  `SettleID` int NOT NULL COMMENT 'Settlement category ID',
  `IsBook` char(255) DEFAULT NULL COMMENT 'Medical record book to be or not yes/no',
  `RegistTime` datetime NOT NULL COMMENT 'Registration time',
  `RegisterID` int NOT NULL COMMENT 'Register ID',
  `VisitState` int DEFAULT NULL COMMENT 'This visit status',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `register`
--

LOCK TABLES `register` WRITE;
/*!40000 ALTER TABLE `register` DISABLE KEYS */;
INSERT INTO `register` VALUES (3,'600600','Patient R',71,'210103','1950-06-25',18,'years old','Shenyang Yuhou','2024-01-01','Morning',1,1,2,1,'1','2024-01-01 01:01:01',301,2),(4,'600601','Patient R',71,'','1950-06-25',17,'year','Liaoning North Town','2024-01-01','afternoon',2,1,1,2,'1','2024-01-01 01:01:01',301,1),(5,'600602','Patient R',71,'','1950-06-25',11,'year','Shenyang Sujiatun','2024-01-01','AM',2,1,2,1,'0','2024-01-01 01:01:01',301,1),(6,'600603','Patient R',71,'21','1950-06-25',11,'year','Dalian Hekou','2024-01-01','morning',1,1,1,2,'1','2024-01-01 01:01:01',301,2),(7,'600604','Patient R',72,'211','1950-06-25',56,'years old','Qingdao Huangdao District','2024-01-01','morning',1,1,1,2,'1','2024-01-01 01:01:01',301,1),(8,'600605','Patient R',71,'300','1950-06-25',67,'year','Changsha Yuelu Mountain Road','2024-01-01','morning',1,1,1,1,'1','2024-01-01 01:01:01',301,1),(9,'600606','Patient R',71,'3567','1950-06-25',33,'year','Tianjin Airport','2024-01-01','afternoon',2,1,2,1,'0','2024-01-01 01:01:01',301,2),(26,'600607','Patient R',71,'','1950-06-25',33,'years old','','2024-01-01',' AM',1,1,1,1,'1','2024-01-01 01:01:01',301,2),(27,'600608','Patient R',71,'','1950-06-25',72,'year','','2024-01-01','morning',1,1,1,1,'1','2024-01-01 01:01:01',301,3),(28,'600609','Patient R',71,'','1950-06-25',23,'year old','','2024-01-01','AM',1,1,1,1,'0','2024-01-01 01:01:01',301,3),(29,'600610','Patient R',71,'','1950-06-25',11,'years old','','2024-01-01','afternoon',1,1,1,1,'1','2024-01-01 01:01:01',9,3),(30,'600611','Patient R',71,'','1950-06-25',33,'years old','','2024-01-01','PM',1,1,1,1,'1','2024-01-01 01:01:01',10,3),(31,'600612','Patient R',71,'','1950-06-25',23,'year','','2024-01-01','morning',1,1,1,1,'1','2024-01-01 01:01:01',9,3),(32,'600613','Patient R',71,'','1950-06-25',22,'year','','2024-01-01','AM',1,1,1,1,'0','2024-01-01 01:01:01',9,2),(33,'600614','Patient R',71,' ','1950-06-25',22,'years','','2024-01-01','morning',1,1,1,1,'0','2024-01-01 01:01:01',9,3),(34,'600615','Patient R',71,'','1950-06-25',33,'years old','','2024-01-01','Morning',1,1,1,1,'0','2024-01-01 01:01:01',9,2),(35,'600616','Patient R',71,' 21','1950-06-25',45,'year','SSS','2024-01-01','morning',1,1,1,1,'0','2024-01-01 01:01:01',9,3),(36,'600617','Patient R',71,'','1950-06-25',8,'years','','2024-01-01','Afternoon',1,1,1,1,'1','2024-01-01 01:01:01',9,3),(37,'600618','Patient R',71,'211','1950-06-25',22,'year','AAZZ','2024-01-01','afternoon',1,2,2,1,'0','2024-01-01 01:01:01',9,2);
/*!40000 ALTER TABLE `register` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registlevel`
--

DROP TABLE IF EXISTS `registlevel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registlevel` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `RegistCode` varchar(64) NOT NULL COMMENT 'number code',
  `RegistName` varchar(64) NOT NULL COMMENT 'number name',
  `SequenceNo` int NOT NULL COMMENT 'Display sequence number',
  `RegistFee` decimal(8,2) DEFAULT NULL COMMENT 'Registration fee',
  `RegistQuota` int NOT NULL COMMENT 'Registration quota',
  `DelMark` int NOT NULL DEFAULT '1' COMMENT 'Delete mark',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registlevel`
--

LOCK TABLES `registlevel` WRITE;
/*!40000 ALTER TABLE `registlevel` DISABLE KEYS */;
INSERT INTO `registlevel` VALUES (1,'zjh','expert number',1,50.00,20,1),(2,'pth','ordinary number',2,8.00,30,1);
/*!40000 ALTER TABLE `registlevel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registwork`
--

DROP TABLE IF EXISTS `registwork`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registwork` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `RegisterID` int NOT NULL COMMENT 'Charge person ID',
  `StartTime` datetime NOT NULL COMMENT 'Daily settlement starting time',
  `EndTime` datetime NOT NULL COMMENT 'end time of daily settlement',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registwork`
--

LOCK TABLES `registwork` WRITE;
/*!40000 ALTER TABLE `registwork` DISABLE KEYS */;
/*!40000 ALTER TABLE `registwork` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rule`
--

DROP TABLE IF EXISTS `rule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rule` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `RuleName` varchar(64) NOT NULL COMMENT 'Rule name',
  `DeptID` int DEFAULT NULL COMMENT 'Department ID',
  `UserID` int DEFAULT NULL COMMENT 'Doctor ID',
  `Week` varchar(14) DEFAULT NULL COMMENT 'week',
  `DelMark` int NOT NULL DEFAULT '1' COMMENT 'Delete mark',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rule`
--

LOCK TABLES `rule` WRITE;
/*!40000 ALTER TABLE `rule` DISABLE KEYS */;
INSERT INTO `rule` VALUES (1,'q1',1,1,'11111111100000',1),(2,'q1',2,6,'11111111110000',1),(3,'q1',1,2,'11111100000000',1),(4,'q1',2,5,'11111111100000',1),(5,'q1',2,4,'11111100000000',1),(6,' q1',1,3,'11111111100000',1),(7,'Sunday duty',2,6,'00000000001100',1),(8,'Sunday duty',2,5,'00000000000011',1),(9,'m1',2,6,'00000011110000',1),(10,'b1',1,1,'11111111100000',1);
/*!40000 ALTER TABLE `rule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scheduling`
--

DROP TABLE IF EXISTS `scheduling`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `scheduling` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `SchedDate` date NOT NULL COMMENT 'Schedule date',
  `DeptID` int NOT NULL COMMENT 'Department ID',
  `UserID` int NOT NULL COMMENT 'Doctor ID',
  `Noon` char(255) NOT NULL COMMENT 'noon farewell',
  `RuleID` int NOT NULL COMMENT 'Scheduling rule ID',
  `DelMark` int NOT NULL DEFAULT '1' COMMENT 'Delete mark',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scheduling`
--

LOCK TABLES `scheduling` WRITE;
/*!40000 ALTER TABLE `scheduling` DISABLE KEYS */;
INSERT INTO `scheduling` VALUES (54,'2024-03-01',1,1,'AM',1,1),(55,'2024-03-01',1,2,'AM',3,1),(56,'2024-03-01',1,3,'morning',6,1),(57,'2024-03-01',1,2,'afternoon',3,1),(58,'2024-03-01',1,3,'PM',6,1),(59,'2024-03-02',1,2,'AM',3,1),(60,'2024-03-02',1,3,'morning',6,1),(61,'2024-03-02',1,2,'afternoon',3,1),(62,'2024-03-02',1,3,'Afternoon',6,1),(63,'2024-03-02',1,2,'Morning',3,1),(64,'2024-03-01',1,1,'PM',1,1),(65,'2024-03-03',1,3,'AM',6,1),(66,'2024-03-03',1,2,'Afternoon',3,1),(67,'2024-03-02',1,1,'Morning',1,1),(68,'2024-03-03',1,3,'Afternoon',6,1),(69,'2024-03-02',1,1,'Afternoon',1,1),(70,'2024-03-04',1,3,'morning',6,1),(71,'2024-03-03',1,1,'morning',1,1),(72,'2024-03-04',1,3,'Afternoon',6,1),(73,'2024-03-03',1,1,'Afternoon',1,1),(74,'2024-03-05',1,3,'AM',6,1),(75,'2024-03-04',1,1,'AM',1,1),(76,'2024-03-04',1,1,' PM',1,1),(77,'2024-03-05',1,1,'AM',1,1),(78,'2024-02-25',1,1,'AM',10,1),(79,'2024-02-25',1,1,'afternoon',10,1),(80,'2024-02-26',1,1,'morning',10,1),(81,'2024-02-26',1,1,'Afternoon',10,1),(82,'2024-02-27',1,1,'Morning',10,1),(83,'2024-02-27',1,1,'PM',10,1),(84,'2024-02-28',1,1,'AM',10,1),(85,'2024-02-28',1,1,'PM',10,1),(86,'2024-02-29',1,1,'AM',10,1);
/*!40000 ALTER TABLE `scheduling` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `settlecategory`
--

DROP TABLE IF EXISTS `settlecategory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `settlecategory` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `SettleCode` varchar(64) NOT NULL COMMENT 'Category code',
  `SettleName` varchar(64) NOT NULL COMMENT 'category name',
  `SequenceNo` int DEFAULT NULL COMMENT 'Display sequence number',
  `DelMark` int NOT NULL DEFAULT '1' COMMENT 'Delete mark',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `settlecategory`
--

LOCK TABLES `settlecategory` WRITE;
/*!40000 ALTER TABLE `settlecategory` DISABLE KEYS */;
INSERT INTO `settlecategory` VALUES (1,'js001','self-pay',1,1),(2,'js002','municipal medical insurance',2,1);
/*!40000 ALTER TABLE `settlecategory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
  `UserName` varchar(64) NOT NULL COMMENT 'Login name',
  `Password` varchar(64) NOT NULL COMMENT 'Password',
  `RealName` varchar(64) NOT NULL COMMENT 'real name',
  `UseType` int DEFAULT NULL COMMENT 'User category',
  `DocTitleID` int DEFAULT NULL COMMENT 'Doctor title ID',
  `IsScheduling` char(255) DEFAULT NULL COMMENT 'Whether to participate in shift scheduling',
  `DeptID` int NOT NULL COMMENT 'Department ID',
  `RegistLeID` int DEFAULT NULL COMMENT 'Registration level ID',
  `DelMark` int NOT NULL DEFAULT '1' COMMENT 'Delete mark',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'test1','1111','test1',3,81,'yes',1,1,1),(2,'test2','2222','fan No disease',3,83,'Yes',1,2,1),(3,'junghoon','junghoon','junghoon',3,83,'Yes',1,2,1),(4,'bilal','bilal','bilal',3,81,'yes',2,1,1),(5,'emran','emran','emran',3,83,'Yes',2,2,1),(6,'rafi','rafi','rafi',3,83,'Yes',2,2,1),(8,'usertype1',' 1111','alone',1,84,'no',9,2,1),(9,'root','root','ROOT',0,81,'no',1,1,1),(10,'222','123456','registered toll collector',2,81,'no',1,1,1),(11,'admin','admin','hospital administrator',1,81,'No',1,1,1),(12,'fifth','123456','Pharmacy Operator',5,81,'No',1,1,1),(13,'fourth','123456','Medical Technical Doctor',4,81,'No',1,1,1),(14,'sixth','123456','Financial Administrator',6,81,'No',1,1,1),(15,'third','123456','Outpatient doctor',3,81,'No',1,1,1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-09 13:49:13
