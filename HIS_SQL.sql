DROP TABLE IF EXISTS `checkapply`;

CREATE TABLE `checkapply` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `MedicalID` int(11) NOT NULL COMMENT 'medical_record_ID',
   `RegistID` int(11) NOT NULL COMMENT 'registered_ID',
   `ItemID` int(11) NOT NULL COMMENT 'Item ID',
   `Name` varchar(64) NOT NULL COMMENT 'Project name',
   `Objective` varchar(512) DEFAULT NULL COMMENT 'Objective requirement',
   `Position` varchar(64) DEFAULT NULL COMMENT 'Check position',
   `IsUrgent` int(11) DEFAULT '0' COMMENT 'Whether it is urgent, 1 means urgent, 0 means not urgent',
   `Num` int(11) DEFAULT NULL COMMENT 'Quantity',
   `CreationTime` datetime NOT NULL COMMENT 'Creation time',
   `DoctorID` int(11) DEFAULT NULL COMMENT 'Doctor ID',
   `CheckOperID` int(11) NOT NULL COMMENT 'CheckOperID',
   `ResultOperID` int(11) NOT NULL COMMENT 'Result entry personnel ID',
   `CheckTime` datetime DEFAULT NULL COMMENT 'Check time',
   `Result` varchar(512) DEFAULT NULL COMMENT 'Check result',
   `ResultTime` datetime DEFAULT NULL COMMENT 'result time',
   `State` int(11) DEFAULT NULL COMMENT 'state',
   `RecordType` int(11) NOT NULL COMMENT 'Record type 1-check 2-test 3-dispose',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


LOCK TABLES `checkapply` WRITE;
INSERT INTO `checkapply` VALUES 
(1,5,9,25,'Abdominal pain','Cause','Abdomen',1,1,'2019-03-25 08:39:40',1,2,2,NULL,NULL,NULL ,3,1),
(6,6,35,10,'poisoned',NULL,NULL,0,1,'2019-03-25 14:24:23',1,2,2,NULL,NULL,NULL,6,1) ,
(7,6,35,12,'Poisoned',NULL,NULL,0,1,'2019-03-25 14:24:23',1,2,2,NULL,NULL,NULL,6,1) ,
(12,6,25,7,'Template: Frozen Shoulder',NULL,NULL,0,1,'2019-03-25 16:51:38',1,2,2,NULL,NULL,NULL, 2,1),
(24,6,25,10,'Template: Bone Trauma',NULL,'Stomach',0,1,'2019-03-26 09:02:05',1,2,2,NULL,NULL, NULL,2,1),(
25,6,25,1,'Template: Bone Trauma',NULL,'Whole Body',0,1,'2019-03-26 09:02:05',1,2,2,NULL,NULL,NULL, 3,1),
(30,7,26,36,'Template: Childrens cold',NULL,NULL,0,1,'2019-03-26 09:43:02',1,2,2,NULL,NULL,NULL,2 ,1),
(31,7,26,44,'Template: Tenosynovitis',NULL,NULL,0,1,'2019-03-26 09:43:44',1,2,2,NULL,NULL,NULL,2, 1),
(32,7,26,41,'Template: Tenosynovitis',NULL,NULL,0,1,'2019-03-26 09:43:44',1,2,2,NULL,NULL,NULL,2, 1),
(33,7,26,36,'Template: Childrens cold',NULL,NULL,0,1,'2019-03-26 09:55:12',1,2,2,NULL,NULL,NULL,2 ,1),
(34,7,26,55,'Template: Childrens cold',NULL,NULL,0,1,'2019-03-26 09:55:12',1,2,2,NULL,NULL,NULL,2 ,1),
(37,8,27,1,'Template: Bone Trauma',NULL,'Whole Body',0,1,'2019-03-28 10:59:30',1,2,2,NULL,NULL,NULL ,3,1),
(38,8,27,10,'Template: Bone Trauma',NULL,'Stomach',0,1,'2019-03-28 10:59:30',1,2,2,NULL,NULL, NULL,2,1),
(39,9,29,20,'q','q','q',0,1,'2019-03-28 13:47:54',1,2,2,NULL,NULL,NULL, 2,1),
(40,9,29,29,'d','d','d',0,1,'2019-03-28 13:48:02',1,2,2,NULL,NULL,NULL, 3,1),
(41,10,30,20,'3','3','3',0,1,'2019-03-28 15:26:19',1,2,2,NULL,NULL,NULL, 2,1),
(42,10,30,27,'e','e','e',0,1,'2019-03-28 15:26:29',1,2,2,NULL,NULL,NULL, 2,1),
(43,10,30,29,'r','r','r',0,1,'2019-03-28 15:26:39',1,2,2,NULL,NULL,NULL, 3,1),
(44,15,32,20,'d','d','d',0,1,'2019-03-29 09:26:36',1,2,2,NULL,NULL,NULL, 2,1),
(45,15,32,25,'f','f','f',0,1,'2019-03-29 09:26:42',1,2,2,NULL,NULL,NULL, 3,1),
(46,15,32,28,'g','g','g',0,1,'2019-03-29 09:26:51',1,2,2,NULL,NULL,NULL, 3,1),
(47,15,32,44,'Template: Tenosynovitis',NULL,NULL,0,1,'2019-03-29 13:05:35',1,2,2,NULL,NULL,NULL,2, 1),
(48,15,32,41,'Template: Tenosynovitis',NULL,NULL,0,1,'2019-03-29 13:05:35',1,2,2,NULL,NULL,NULL,2, 1),
(49,18,33,55,'Template: Childrens cold',NULL,NULL,0,1,'2019-03-29 14:47:28',1,2,2,NULL,NULL,NULL,2 ,1),
(50,18,33,36,'Template: Childrens cold',NULL,NULL,0,1,'2019-03-29 14:47:28',1,2,2,NULL,NULL,NULL,2 ,1),
(51,19,34,55,'Template: Childrens cold',NULL,NULL,0,1,'2019-03-29 15:20:02',1,2,2,NULL,NULL,NULL,2 ,1),
(52,19,34,36,'Template: Childrens cold',NULL,NULL,0,1,'2019-03-29 15:20:03',1,2,2,NULL,NULL,NULL,2 ,1),(
53,20,37,29,'w','w','w',0,1,'2019-04-01 13:26:55',1,2,2,NULL,NULL,NULL,3 ,1),
(54,20,37,28,'e','e','e',0,1,'2019-04-01 13:27:04',1,2,2,NULL,NULL,NULL, 3,1),
(55,20,37,25,'g','g','g',0,1,'2019-04-01 13:27:12',1,2,2,NULL,NULL,NULL, 3,1),
(58,4,6,41,'Template: Tenosynovitis',NULL,NULL,0,1,'2019-04-01 16:23:35',1,2,2,NULL,NULL,NULL,2, 1),
(59,4,6,44,'Template: Tenosynovitis',NULL,NULL,0,1,'2019-04-01 16:23:35',1,2,2,NULL,NULL,NULL,2, 1),
(60,21,35,1,'Big Rescue','1','1',1,1,'2021-12-27 14:45:49',1,1,1,NULL,'', NULL,3,1),
(61,22,36,1,'Big Rescue','1','1',1,1,'2021-12-27 16:05:40',1,1,1,NULL,'', NULL,3,1),
(62,22,36,1,'Big Rescue','1','1',1,1,'2021-12-27 16:06:22',1,1,1,NULL,'', NULL,4,3);
UNLOCK TABLES;

DROP TABLE IF EXISTS `checkrelation`;

CREATE TABLE `checkrelation` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `CheckProjID` int(11) NOT NULL COMMENT 'Project ID',
   `CheckTempID` int(11) NOT NULL COMMENT 'Application template ID',
   `Position` varchar(64) DEFAULT NULL COMMENT 'Check position',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

LOCK TABLES `checkrelation` WRITE;

INSERT INTO `checkrelation` VALUES (1,41,2,NULL),(2,44,2,NULL),(3,1,4,'whole body'),
(4,10,4,'Stomach'),(5,55,1,NULL),(6,36,1,NULL),(7,29,3,NULL),(8,5,3, NULL);

UNLOCK TABLES;


DROP TABLE IF EXISTS `checktemplate`;

CREATE TABLE `checktemplate` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `Name` varchar(64) NOT NULL COMMENT 'name',
   `UserID` int(11) NOT NULL COMMENT 'Doctor ID',
   `CreationTime` datetime NOT NULL COMMENT 'Creation time',
   `Scope` char(2) DEFAULT NULL COMMENT 'Scope of use: whole hospital/department/individual',
   `RecordType` int(11) NOT NULL COMMENT 'Record type 1-check 2-test 3-dispose',
   `DelMark` int(11) NOT NULL DEFAULT '1' COMMENT 'Delete mark',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


LOCK TABLES `checktemplate` WRITE;
INSERT INTO `checktemplate` VALUES (1,'Childrens cold',1,'2019-03-22 16:46:37','1',1,1),
(2,'Tenosynovitis',1,'2019- 03-22 16:47:58','1',1,1),
(3,'Frozen shoulder',1,'2019-03-22 16:48:37','1',1,1 ),
(4,'Osteopathic trauma',1,'2019-03-22 17:09:05','3',1,1),
(5,'Test',5,'2021-12-26 18 :28:51','1',2,0);
UNLOCK TABLES;
DROP TABLE IF EXISTS `constantitem`;

CREATE TABLE `constantitem` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `ConstantTypeID` int(11) NOT NULL COMMENT 'Constant category ID',
   `ConstantCode` varchar(64) NOT NULL COMMENT 'Constant item code',
   `ConstantName` varchar(64) NOT NULL COMMENT 'Constant item name',
   `DelMark` int(11) NOT NULL DEFAULT '1' COMMENT 'Delete mark',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=165 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
--
-- Dumping data for table `constantitem`
--

LOCK TABLES `constantitem` WRITE;

INSERT INTO `constantitem` VALUES (11,1,'NK','Internal Medicine',1),(12,1,'WK','Surgery',1),(
14,1,'EK','Pediatrics',1),(15,1,'CRBK','Infectious Diseases Department',1),(16,1,'FCK','Obstetrics and Gynecology',1) ,(17,1,'NK','Andrology',1),
(18,1,'JSXLK','Psychiatric Department',1),(19,1,'PFXBK','Dermatology and Venereology Department',1),(20,1,'ZYK','Traditional Chinese Medicine Department', 1),
(21,1,'ZLK','Oncology',1),(22,1,'GK','Orthopedics',1),(23,1,'WGK','Otology',1),
(24,1,'KFYXK','Department of Rehabilitation Medicine',1),(25,1,'MZYXK','Department of Anesthesia Medicine',1),
(26,1,'YYK','Nutrition Department',1),(27,1,'YJK','Medical Technology Department',1),(28,1,'YXYXX','Medical Imaging', 1),
(29,1,'QTKS','Other Departments',1),(51,5,'XJ','Cash',1),(52,5,'YBK','Medical Insurance Card',1),
(53,5,'YHK','Bank Card',1),(54,5,'XYK','Credit Card',1),(55,5,'WX','WeChat',1),
(56,5,'ZFB','Alipay',1),(57,5,'YSF','Cloud QuickPass',1),(58,5,'QT','Others',1),
(71,7,'NAN','Male',1),(72,7,'NV','Female',1),(81,8,'ZRYS','Chief Physician',1),
(82,8,'FZRYS','Deputy Chief Physician',1),(83,8,'ZZYS','Attending Physician',1),
(84,8,'ZYYS','Resident Physician',1),(101,10,'XY','Western Medicine',1),
(102,10,'ZCY','Chinese patent medicine',1),(103,10,'ZCY','Chinese herbal medicine',1),
(110,11,'ZJ','Injection',1),(111,11,'PJ','Tablet',1),
(112,11,'ZYYP','Chinese medicine pieces',1),(113,11,'SJ','Powder',1),
(114,11,'JN','capsule',1),(115,11,'KLJ','granule',1),
(116,11,'FJ','Powder',1),(117,11,'BMP','Diaphragm',1),
(118,11,'RJ','emulsion',1),(119,11,'YJ','liquid',1),
(120,11,'NJ','gel',1),(121,11,'RGJ','ointment',1),
(122,11,'QWJ','Aerosol',1),(123,11,'FSP','Dispersible Tablet',1),
(124,11,'YPQX','Drug and Device',1),(125,11,'SJ','Suppository',1),
(126,11,'NFSJ','Internal liquid',1),(127,11,'PJ','Spray',1),
(128,11,'JJ','Glue',1),(129,11,'TJ','Tincture',1),
(130,11,'DJ','Drops',1),(131,11,'HSP','Sustained-release tablets',1),
(132,11,'YGZJ','Eye ointment preparation',1),(133,11,'CRP','Enteric-coated tablets',1),
(134,11,'SJ','Cream',1),(135,11,'DEJ','Ear Drops',1),
(136,11,'HXJ','suspension',1),(137,11,'HSJN','sustained-release capsule',1),
(138,11,'NJJN','Gel Capsule',1),(139,11,'CJ','Liniment',1),
(140,11,'HP','lozenge',1),(141,11,'GHJ','dry mix',1),
(142,11,'XJ','Lotion',1),(143,11,'BPJ','Nasal Spray',1),
(144,11,'MJ','membrane',1),(145,11,'TG','patch',1),
(146,11,'TJ','Patch',1),(147,11,'HJ','Mixture',1),
(148,11,'SJ','wet wipes',1),(149,11,'KPJ','oral spray',1),
(150,11,'DSY','Large infusion',1),(151,11,'YPCL','Pharmaceutical materials',1),
(152,11,'KSP','Controlled-release tablets',1),(153,11,'DBJ','Nasal drops',1),
(154,11,'DW','Dropping Pill',1),(155,11,'GTJJ','Dry Syrup',1),
(156,11,'WHXRJ','Aerosol inhalation agent',1),(157,11,'YLY','API',1),
(158,11,'TJJ','Syrup',1),(159,11,'RJN','Soft Capsule',1),(160,11,'DYJ','Eye Drops',1 ),(161,11,'DGFZ','lyophilized powder',1),(162,11,'CJ','powder',1),
(163,11,'WJ','pill',1),
(164,11,'KFYL','oral liquid',1);

UNLOCK TABLES;

--
-- Table structure for table `constanttype`
--

DROP TABLE IF EXISTS `constanttype`;

CREATE TABLE `constanttype` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `ConstantTypeCode` varchar(64) NOT NULL COMMENT 'Constant type code',
   `ConstantTypeName` varchar(64) NOT NULL COMMENT 'Constant category name',
   `DelMark` int(11) NOT NULL DEFAULT '1' COMMENT 'Delete mark',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


LOCK TABLES `constanttype` WRITE;
INSERT INTO `constanttype` VALUES (1,'DeptCategory','Department Category',1),
(5,'FeeType','Charging method',1),(7,'Gender','Gender type',1),
(8,'DocTitle','Doctor Title',1),(10,'Drugs_Type','Drug Type',1),
(11,'Drugs_Dosage','Drug dosage form',1);
UNLOCK TABLES;


DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `DeptCode` varchar(64) NOT NULL COMMENT 'Department code',
   `DeptName` varchar(64) NOT NULL COMMENT 'Department name',
   `DeptCategoryID` int(11) NOT NULL COMMENT 'Department Category',
   `DeptType` int(11) DEFAULT NULL COMMENT 'Department type',
   `DelMark` int(11) NOT NULL DEFAULT '1' COMMENT 'Delete mark',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=139 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


LOCK TABLES `department` WRITE;

INSERT INTO `department` VALUES (1,'XXGNK','Cardiovascular Medicine',11,1,1),
(2,'SJNK','Neurology',11,1,1), (3,'PTNK','General Internal Medicine',11,1,1),
(4,'XHNK','Gastroenterology',11,1,1), (5,'HXNK','Respiratory Medicine',11,1,1),
(6,'NFMK','Endocrinology',11,1,1), (7,'SBNK','Nephrology',11,1,1),
(8,'XYNK','Hematology',11,1,1),(9,'GRNK','Infectious Disease',11,1,1),
(10,'LNBNK','Geriatric Medicine',11,1,1), (11,'FSMYNK','Rheumatology and Immunology',11,1,1),
(12,'TXK','Dialysis Department',11,1,1), (13,'BTFYK','Allergy Department',11,1,1),
(14,'PTWK','General Surgery',12,1,1), (15,'MNWK','Urology',12,1,1),
(16,'SJWK','Neurosurgery',12,1,1), (17,'XWK','Thoracic Surgery',12,1,1),
(18,'ZXWK','Plastic Surgery',12,1,1),(19,'GCWK','Anorectal Surgery',12,1,1),
(20,'GDWK','Hepatobiliary Surgery',12,1,1), (21,'RXWK','Breast Surgery',12,1,1),
(22,'XXGWK','Cardiovascular Surgery',12,1,1),(23,'XZWK','Cardiovascular Surgery',12,1,1),
(24,'QGYZ','Organ Transplantation',12,1,1), (25,'WCWK','Minimally Invasive Surgery',12,1,1),
(26,'GNSJWK','Functional Neurosurgery',12,1,1), (27,'XTWK','Glandular Surgery',12,1,1),
(28,'EKZH','Pediatric General',14,1,1), (29,'XEWK','Pediatric Surgery',14,1,1),
(30,'ETBJK','Child Health Department',14,1,1),(31,'XSEK','Neonatology Department',14,1,1),
(32,'XEGK','Pediatric Orthopedics',14,1,1), (33,'XESJNK','Pediatric Neurology',14,1,1),
(34,'XEHXK','Pediatric Respiratory Department',14,1,1), (35,'XEXYK','Pediatric Hematology Department',14,1,1),
(36,'XEEBHK','Pediatric Otolaryngology',14,1,1),(37,'XEXNK','Pediatric Cardiology',14,1,1),
(38,'XEKFK','Pediatric Rehabilitation Department',14,1,1), (39,'XEJSK','Pediatric Psychiatry',14,1,1),
(40,'XESNK','Pediatric Nephrology',14,1,1), (41,'XEXHK','Pediatric Gastroenterology',14,1,1),
(42,'XEPFK','Pediatric Dermatology',14,1,1), (43,'XEJZK','Pediatric Emergency Department',14,1,1),
(44,'XENFMK','Pediatric Endocrinology',14,1,1), (45,'XEMNWK','Pediatric Urology',14,1,1),
(46,'XEGRK','Pediatric Infectious Disease Department',14,1,1), (47,'XEXWK01','Pediatric Cardiac Surgery',14,1,1),
(48,'XEXWK02','Pediatric Thoracic Surgery',14,1,1),(49,'XESJWK','Pediatric Neurosurgery',14,1,1),
(50,'XEZXK','Pediatric Plastic Surgery',14,1,1), (51,'XEFSMYK','Pediatric Rheumatology and Immunology',14,1,1),
(52,'XEFK','Pediatric Gynecology',14,1,1),(53,'CRK','Infectious Disease Department',15,1,1),(54,'GBK','Hepatology Department', 15,1,1),
(55,'AZBK','AIDS Department',15,1,1),(56,'CRWZS','Infectious Disease Critical Care Unit',15,1,1),(57,'FCKZH','Obstetrics and Gynecology Department Comprehensive',16,1,1),
(58,'FK','Gynecology',16,1,1),(59,'CK','Obstetrics',16,1,1),(60,'JHSYK','Family Planning',16 ,1,1),
(61,'FKNFM','Gynecological Endocrinology',16,1,1),(62,'YCZYK','Genetic Counseling Department',16,1,1),(63,'CQJCK','Prenatal examination Branch',16,1,1),
(64,'FMNK','Urology',16,1,1),(65,'QLX','Prostate',17,1,1),
(66,'XGNZA','Sexual dysfunction',17,1,1),(67,'SZQGR','Genital infection',17,1,1),
(68,'NXBY','Male Infertility',17,1,1),(69,'SZZX','Reproductive Plastic Surgery',17,1,1),
(70,'JSK','Psychiatric Department',18,1,1),(71,'SFJDK','Forensic Identification Department',18,1,1),
(72,'YWYLK','Drug Dependence Department',18,1,1),(73,'ZYJSK','Traditional Chinese Medicine Psychiatry Department',18,1,1),
(74,'SXZAK','Bipolar Disorder Department',18,1,1),(75,'PFK','Dermatology Department',19,1,1),
(76,'XBK','Department of Sexually Transmitted Diseases',19,1,1),(77,'ZYZHK','Department of Comprehensive Traditional Chinese Medicine',20,1,1),
(78,'ZJK','Acupuncture',20,1,1),(79,'ZYGK','Traditional Chinese Medicine Orthopedics',20,1,1),
(80,'ZYFCK','Obstetrics and Gynecology of Traditional Chinese Medicine',20,1,1),(81,'ZYWK','Surgery of Traditional Chinese Medicine',20,1,1),
(82,'ZYEK','Traditional Chinese Medicine Pediatrics',20,1,1),(83,'ZYGCK','Traditional Chinese Medicine Anorectal Department',20,1,1),
(84,'ZYPFK','Traditional Chinese Medicine Dermatology',20,1,1),(85,'ZYWGK','Traditional Chinese Medicine Dermatology',20,1,1),
(86,'ZYAMK','Traditional Chinese Medicine Massage',20,1,1),(87,'ZYXHK','Traditional Chinese Medicine Gastroenterology',20,1,1),

(88,'ZYZLK','Traditional Chinese Medicine Oncology',20,1,1),(89,'ZYXNK','Traditional Chinese Medicine Cardiology',20,1,1),
(90,'ZYSJNK','Department of Neurology of Traditional Chinese Medicine',20,1,1),(91,'ZYSBNK','Department of Nephrology of Traditional Chinese Medicine',20,1,1),
(92,'ZYNFM','Traditional Chinese Medicine Endocrinology',20,1,1),(93,'ZYHXK','Traditional Chinese Medicine Respiratory Medicine',20,1,1),
(94,'ZYGBK','Hepatology Department of Traditional Chinese Medicine',20,1,1),(95,'ZYNK','Andrology Department of Traditional Chinese Medicine',20,1,1),
(96,'ZYFSMYNK','Department of Rheumatology and Immunology of Traditional Chinese Medicine',20,1,1),(97,'ZYXYK','Department of Hematology of Traditional Chinese Medicine',20,1,1),
(98,'ZYRXWK','Breast Surgery of Traditional Chinese Medicine',20,1,1),(99,'ZYLNBK','Geriatric Surgery of Traditional Chinese Medicine',20,1,1),
(100,'ZLZHK','Comprehensive Oncology',21,1,1),(101,'ZLNK','Medical Oncology',21,1,1),
(102,'FLK','Radiotherapy Department',21,1,1),(103,'ZLWK','Surgery Oncology',21,1,1),
(104,'ZLFK','Gynecology Oncology',21,1,1),(105,'GZLK','Osteology Oncology',21,1,1),
(106,'ZLKFK','Rehabilitation Oncology Department',21,1,1),(107,'GWK','Orthopedic Surgery',22,1,1),
(108,'SWK','Hand Surgery',22,1,1),(109,'CSGK','Orthopedics of Trauma',22,1,1),(110,'JZWK','Spine Surgery', 22,1,1),
(111,'GGJK','Osteoporosis Department',22,1,1), (112,'GZSSK','Osteoporosis Department',22,1,1),
(113,'JXGK','Orthopedics',22,1,1),(114,'EBYHTJK','Otolaryngology-Head and Neck Surgery',23,1,1),
(115,'KQK','Stomatology',23,1,1),(116,'YK','Ophthalmology',23,1,1),
(117,'KFK','Rehabilitation Department',24,2,1),(118,'LLK','Physiotherapy Department',24,2,1),
(119,'MZK','Aesthesiology Department',25,2,1),(120,'TTK','Pain Department',25,2,1),
(121,'YYK','Nutrition Department',26,2,1),(122,'GYYK','Hyperbaric Oxygen Department',27,2,1),
(123,'GNJCK','Functional Test Department',27,2,1),(124,'BLK','Pathology Department',27,2,1),
(125,'JYK','Laboratory Department',27,2,1),(126,'SYZX','Experimental Center',27,2,1),
(127,'XDTK','Electrocardiography Department',27,2,1),(128,'FSK','Radiology Department',28,2,1),
(129,'CSZDK','Diagnostic Ultrasound Department',28,2,1),(130,'YXYXK','Medical Imaging Department',28,2,1),
(131,'HYK','Department of Nuclear Medicine',28,2,1),(132,'YJK','Department of Pharmacy',29,2,1),
(133,'HLK','Nursing Department',29,2,1),(134,'TJK','Physical Examination Department',29,2,1),
(135,'JZK','Emergency Department',29,2,1),(136,'GGWSYYFK','Public Health and Prevention Department',29,2,1),
(137,'SBK','Equipment Department',29,4,1),(138,'CWK','Finance Department',29,3,1);
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diagnosistemplate`
--

DROP TABLE IF EXISTS `diagnosistemplate`;

CREATE TABLE `diagnosistemplate` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `DeptID` int(11) NOT NULL COMMENT 'Department ID',
   `UserID` int(11) NOT NULL COMMENT 'Doctor ID',
   `Diagnosis` varchar(512) DEFAULT NULL COMMENT 'Diagnosis result',
   `Handling` varchar(512) DEFAULT NULL COMMENT 'Handling opinions',
   `Scope` char(2) DEFAULT NULL COMMENT 'Scope of use: whole hospital/department/individual',
   `DelMark` int(11) NOT NULL DEFAULT '1' COMMENT 'Delete mark',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `diagnosistemplate`
--

LOCK TABLES `diagnosistemplate` WRITE;

INSERT INTO `diagnosistemplate` VALUES
(1,1,1,'pneumonia','pay attention to rest','whole hospital',1),
(2,1,1,'cold','drink more hot water','department',1),
(3,1,1,'Fever','Keep warm','Personal',1),
(21,1,1,'Shiga-Kreuse dysentery [Subgroup A shigellosis]','1','Individual',1),(22,1,1,'Porcine abdominal disease', '1','Individual',1);

UNLOCK TABLES;

--
-- Table structure for table `disease`
--

DROP TABLE IF EXISTS `disease`;

CREATE TABLE `disease` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `DiseaseCode` varchar(64) NOT NULL COMMENT 'Disease mnemonic code',
   `DiseaseName` varchar(255) NOT NULL COMMENT 'Disease name',
   `DiseaseICD` varchar(64) NOT NULL COMMENT 'International ICD code',
   `DiseCategoryID` int(11) NOT NULL COMMENT 'Disease category',
   `DelMark` int(11) NOT NULL DEFAULT '1' COMMENT 'Delete mark',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=29396 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


LOCK TABLES `disease` WRITE;

INSERT INTO `disease` VALUES (1,'GDXHL','Classical cholera','A00.051',140,1),
(2,'ZXDXHL','Medium [Typical] Cholera','A00.052',140,1),(
3,'ZXBFXHGXHL','Severe [fulminant or dry] cholera','A00.053',140,1),
(4,'QXFDXHL','Mild [atypical] cholera','A00.151',140,1),
(5,'AETHL','Elto Cholera','A00.152',140,1),
(6,'AETXCY','Eltor Enteritis','A00.153',33,1),
(7,'HL','Cholera NOS','A00.901',140,1),(8,'SH','Typhoid','A01.001',306,1),
(9,'SHGJXBXZ','Typhi sepsis','A01.002',306,1),
(10,'SHXNMY','Typhoid meningitis','A01.003+',232,1),
(11,'SHFY','Typhoid pneumonia','A01.051+',81,1),
(12,'SHFMY','Typhoid peritonitis','A01.052',306,1),
(13,'ABTSBSH','Eberth`s disease (typhoid fever)','A01.053',306,1),
(14,'CCXXSH','Enterohemorrhagic typhoid fever','A01.054',306,1),
(15,'SHXCCK','Typhoid intestinal perforation','A01.055',306,1),
(16,'CSH','Entertyphoid','A01.056',306,1),
(17,'SHYXCY','Typhoid-like enteritis','A01.057',33,1),
(18,'JXFSH','Paratyphoid A','A01.101',306,1),
(19,'YXFSH','Paratyphoid B','A01.201',306,1),
(20,'BXFSH','Paratyphoid C','A01.301',306,1),
(21,'FSH','Paratyphoid','A01.401',306,1),
(22,'QSMSJCY','Salmonella group B enteritis','A02.001',33,1),
(23,'QSMSJCY','Salmonella group C enteritis','A02.002',33,1),
(24,'AGLSMSJCY','Salmonella Agora Enteritis','A02.003',33,1),
(25,'SMSJXCY','Salmonella enteritis','A02.004',33,1),
(26,'SMSJLDXQXCY','Salmonella London serovar Enteritis','A02.005',33,1),
(27,'SMSJWCY','Salmonella Gastroenteritis','A02.006',33,1),
(28,'SSHSMSJXCY','Salmonella Typhimurium Enteritis','A02.007',33,1),
(29,'YESMSJCY','Salmonella enteritis infantis','A02.008',33,1),
(30,'SMSJCDGR','Salmonella enteric infection','A02.051',31,1),
(31,'SMSJYLSNXCY','Salmonella (Arizona) Enteritis','A02.052',33,1),
(32,'SMSJBXZ','Salmonella sepsis','A02.101',9,1),
(33,'SMSJSSHBYBXZ','Salmonella typhimurium with sepsis','A02.102',306,1),
(34,'SMSJXFY','Salmonella pneumonia','A02.201+',81,1),
(35,'SMSJXGJY','Salmonella arthritis','A02.202+',123,1),
(36,'SMSJXNMY','Salmonella meningitis','A02.203+',232,1),
(37,'SMSJXGSY','Salmonella osteomyelitis','A02.251+',114,1),
(38,'SMSJXSXGJZB','Salmonella tubulo-interstitial disease','A02.252+',161,1),
(39,'QTTZDSMSJGR','Other specified Salmonella infections','A02.851',95,1),
(40,'SMSJGR','Salmonella infection NOS','A02.901',95,1),
(41,'SSHSMSJGR','Salmonella typhimurium infection','A02.902',306,1),
(42,'SMSJSSWZD','Salmonella food poisoning','A02.903',324,1),
(43,'SMSZHJLJ','Shigella dysentery','A03.001',200,1),
(44,'ZHKLZLJYQZHJB','Shiga-Kreuse dysentery [Subgroup A shigellosis]','A03.051',200,1),
(45,'SMCSDCLJ','Schmitz (-Stitzer) dysentery','A03.052',200,1),
(46,'FSZHJLJ','Shigella freundii dysentery','A03.101',200,1),
(47,'XSLSXJXLJ','His-Russell dysentery','A03.151',380,1),
(48,'BSZHJLJ','Shigella baumannii','A03.201',200,1),
(49,'BYDXJXLJ','Boyds dysentery','A03.251',380,1);

UNLOCK TABLES;

--
-- Table structure for table `disecategory`
--

DROP TABLE IF EXISTS `disecategory`;


CREATE TABLE `disecategory` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `DicaCode` varchar(64) NOT NULL COMMENT 'Category code',
   `DicaName` varchar(64) NOT NULL COMMENT 'Category name',
   `SequenceNo` int(11) DEFAULT NULL COMMENT 'Display sequence number',
   `DicaType` int(11) NOT NULL COMMENT 'Disease type',
   `DelMark` int(11) NOT NULL DEFAULT '1' COMMENT 'Delete mark',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=483 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


--
-- Dumping data for table `disecategory`
--

LOCK TABLES `disecategory` WRITE;
/*!40000 ALTER TABLE `disecategory` DISABLE KEYS */;
INSERT INTO `disecategory` VALUES (1,'AMBB','amoebiasis',1,1,1),
(2,'AZ','Cancer',2,1,1),(3,'','Vitiligo',3,1,1),
(4,'','cataract',4,1,1),(5,'','leukemia',5,1,1),
(6,'','Leukemia',6,1,1),(7,'','Pertussis',7,1,1),
(8,'','sepsis',8,1,1),(9,'','sepsis',9,1,1),
(10,'','Spotted fever',10,1,1),(11,'','Scar',11,1,1),
(12,'','Meniscal disease',12,1,1),(13,'','Foreskin disease',13,1,1),
(14,'','sporomycosis',14,1,1),(15,'','cardia disease',15,1,1),
(16,'','nasal disease',16,1,1),(17,'','tonsil disease',17,1,1),
(18,'','Tonsillitis',18,1,1),(19,'','Patellar disease',19,1,1),
(20,'','Viral disease',20,1,1),(21,'','Vitreous disease',21,1,1),
(22,'','Vitritis',22,1,1),(23,'','Bad sexual behavior',23,1,1),
(24,'','Infertility',24,1,1),(25,'','Postpartum disease',25,1,1),
(26,'','Obstetric diseases',26,1,1),(27,'','Prenatal check-up',27,1,1),
(28,'','Birth trauma',28,1,1),(29,'','Diseases caused by birth trauma',29,1,1),
(30,'','Intestinal infectious diseases',30,1,1),(31,'','Intestinal diseases',31,1,1),
(32,'','intestinal obstruction',32,1,1),(33,'','enteritis',33,1,1),(34,'','dementia',34,1,1 ),
(35,'','Alveolar disease',35,1,1),(36,'','Insect disease',36,1,1),(37,'','Tics',37, 1,1),
(38,'','Hemorrhagic fever',38,1,1),(39,'','Hemorrhagic fever',39,1,1),(40,'','Removal of foreign bodies',40,1, 1),
(41,'','Tetus',41,1,1),(42,'','Tetus',42,1,1),(43,'','sore',43,1 ,1),
(44,'','Trauma disease',44,1,1),(45,'','Pituitary disease',45,1,1),(46,'','Cleft lip',46,1 ,1),
(47,'','gonadotropin deficiency',47,1,1),(48,'','acne',48,1,1),(49,'','bruise',49, 1,1);
/*!40000 ALTER TABLE `disecategory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drugs`
--

DROP TABLE IF EXISTS `drugs`;

CREATE TABLE `drugs` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `DrugsCode` char(14) NOT NULL COMMENT 'drug code',
   `DrugsName` varchar(512) NOT NULL COMMENT 'drug name',
   `DrugsFormat` varchar(512) DEFAULT NULL COMMENT 'Drug specifications',
   `DrugsUnit` varchar(64) DEFAULT NULL COMMENT 'Packaging unit',
   `Manufacturer` varchar(512) DEFAULT NULL COMMENT 'Manufacturer',
   `DrugsDosageID` int(11) DEFAULT NULL COMMENT 'Drug dosage form',
   `DrugsTypeID` int(11) DEFAULT NULL COMMENT 'drug type',
   `DrugsPrice` decimal(8,2) NOT NULL COMMENT 'drug unit price',
   `MnemonicCode` varchar(64) DEFAULT NULL COMMENT 'Pinyin mnemonic code',
   `CreationDate` datetime NOT NULL COMMENT 'Creation time',
   `LastUpdateDate` datetime DEFAULT NULL COMMENT 'Last modified time',
   `DelMark` int(11) NOT NULL DEFAULT '1' COMMENT 'Delete mark',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2967 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Dumping data for table `drugs`
--

LOCK TABLES `drugs` WRITE;
/*!40000 ALTER TABLE `drugs` DISABLE KEYS */;
INSERT INTO `drugs` VALUES (1,'86979474000208','Methotrexate for injection','1g×1 tube','branch','Jiangsu Hengrui Pharmaceutical Co., Ltd.',110,101,15.73,'ZSYJAZZ' ,'2019-03-01 00:00:00',NULL,1),(2,'86979474000209','Fluconazole Sodium Chloride Injection (Diflucan)','200mg×100ml/bottle', 'Bottle','Pfizer Pharmaceutical Co., Ltd.',110,101,7.01,'FKZLHNZSY(DFK)','2019-03-01 00:00:00',NULL,1),
(3,'86979474000208','50% Glucose injection (plastic bottle)','10:20ml×1 tube','branch','China Otsuka Pharmaceutical Co., Ltd.',110,101,25.16,'PTTZSY(SP)','2019-03-01 00: 00:00',NULL,1),
(4,'86979474000209','Terbinafine Hydrochloride Effervescent Tablets (DINK)','50mg×7 tablets/box','box','Qilu Pharmaceutical Co., Ltd.' ,111,101,40.62,'YSTBZFYDPTP (DK)','2019-03-01 00:00:00',NULL,1),(5,'86979474000208','Hongqi Granule','10g/bag',' Bag','Nanjing Pharmaceutical Co., Ltd. Medicinal Materials Branch',112,103,30.79,'HZ','2019-03-01 00:00:00','2019-03-28 16:07:32',1 ),(6,'86979474000208','Aminolevulinic acid hydrochloride powder (external use)','118mg×1 bottle','bottle','Shanghai Fudan Zhangjiang Biopharmaceutical Co., Ltd.',113,101,19.51,'YSATWSS（ WY)','2019-03-01 00:00:00',NULL,1),(7,'86979474000209','Memantine Hydrochloride Tablets (Ibeson)','10mg×28 tablets/box', 'Box','Danish Lundbeck Pharmaceutical Factory',111,101,22.05,'YSMJGP(YBS)','2019-03-01 00:00:00',NULL,1),(8,'86979474000208','Phosphoric acid Oseltamivir capsules (Tamiflu)','75mg×10 capsules/box','box','Shanghai Roche Pharmaceutical Co., Ltd. S',114,101,60.96,'LSASTWJN(DF)','2019-03-01 00:00:00',NULL,1),(9,'86979474000209','Alismatis granules','1g/10g/bag','bag','Jiangyin Tianjiang Pharmaceutical Co., Ltd.',115,102,0.09 ,'ZXKL','2019-03-01 00:00:00',NULL,1),(10,'86979474000208','Yam granules','0.5g/10g/bag','bag','' ,115,102,6.79,'SYKL','2019-03-01 00:00:00',NULL,1),(11,'86979474000208','Cooked rhubarb granules','1g/6g/bag','bag ','Jiangyin Tianjiang Pharmaceutical Co., Ltd.',115,102,23.51,'SDHKL','2019-03-01 00:00:00',NULL,1),(12,'86979474000209','Coptis Granules', '0.5g/3g bag','bag','Jiangyin Tianjiang Pharmaceutical Co., Ltd.',115,102,1.07,'HLKL','2019-03-01 00:00:00',NULL,1),(13 ,'86979474000208','Scutellaria baicalensis granules (wine)','2g/10g/bag','bag','Jiangyin Tianjiang Pharmaceutical Co., Ltd.',115,102,81.74,'HZKL(J)','2019-03 -01 00:00:00',NULL,1),
(14,'86979474000209','Fried white peony granules','1g/10g/bag','bag','Jiangyin Tianjiang Pharmaceutical Co., Ltd.', 115,102,31.86,'CBSKL','2019-03-01 00:00:00',NULL,1),
(15,'86979474000208','Fried Atractylodes Granules','3g/10g/bag','bag' ,'',115,102,41.50,'CBSKL','2019-03-01 00:00:00',NULL,1),(16,'86979474000208','Angelica Angelica granules','1g/6g/bag', 'Bag','Jiangyin Tianjiang Pharmaceutical Co., Ltd.',115,102,67.72,'BZKL','2019-03-01 00:00:00',NULL,1),(17,'86979474000209','Xiebai Granules ','2.5g/10g bag','bag','Jiangyin Tianjiang Pharmaceutical Co., Ltd.',115,102,17.95,'ZBKL','2019-03-01 00:00:00',NULL,1), (18,'86979474000208','Chuanxiong granules','2g/6g/bag','bag','',115,102,0.70,'CZKL','2019-03-01 00:00:00',NULL, 1),(19,'86979474000209','Vitamin K1 Injection','1ml:10mg×10 pieces/box','box','Wuhu Kangqi Pharmaceutical',110,101,10.39,'WSSK1ZSY','2019- 03-01 00:00:00',NULL,1),(20,'86979474000208','Risperdal Tablets (Risperdal)','1mg×20 tablets/box','box','Xian Janssen Pharmaceutical Co., Ltd.',111,101,5.52,'LPTP (WST)','2019-03-01 00:00:00',NULL,1),(21,'86979474000208','0.9% Sodium Chloride Injection( Plastic bottle)','2.25g:250ml×1 bottle','Bottle','China Otsuka Pharmaceutical Co., Ltd.',110,101,14.34,'0.9%LHNZSY(SP)','2019-03-01 00:00 :00',NULL,1),(22,'86979474000209','0.9 sodium chloride injection (Baxter)','500ml×1 bag','bottle','Shanghai Baxter Medical Products Co., Ltd.' ,110,101,46.91,'0.9%LHNZSY (BT)','2019-03-01 00:00:00',NULL,1),(23,'86979474000208','0.9% Sodium Chloride Injection (Plastic Bottle )','0.9g:100ml×1bottle','bottle','China Otsuka Pharmaceutical Co., Ltd.',110,101,6.34,'0.9%LHNZSY(SP)','2019-03-01 00:00:00 ',NULL,1),(24,'86979474000209','10% glucose injection (plastic bottle)','50g:500ml×1 bottle','bottle','China Otsuka Pharmaceutical Co., Ltd.',110,101, 5.04,'10%PTTZSY(SP)','2019-03-01 00:00:00',NULL,1),(25,'86979474000208','10% glucose injection (plastic bottle)','25g :250ml×1bottle','bag','China Otsuka Pharmaceutical Co., Ltd.',110,101,16.02,'10%PTTZSY(SP)','2019-03-01 00:00:00',NULL,1) ,(26,'86979474000208','5% glucose injection (plastic bottle)','25g:500ml×1 bottle','bottle','China Otsuka Pharmaceutical Co., Ltd.',110,101,47.78,'5%PTTZSY (SP)','2019-03-01 00:00:00',NULL,1),(27,'86979474000209','5% glucose injection (plastic bottle)','12.5g:250ml×1 bottle ','Bottle','China Otsuka Pharmaceutical Co., Ltd.',110,101,45.62,'5%PTTZSY(SP)','2019-03-01 00:00:00',NULL,1),(28,' 86979474000208','5% glucose injection (plastic bottle)','5g:100ml×1 bottle','bottle','China Otsuka Pharmaceutical Co., Ltd.',110,101,17.53,'5%PTTZSY(SP)', '2019-03-01 00:00:00',NULL,1),(29,'86979474000209','Weisu granules','5g*9 bags/box','box','Yangzijiang Pharmaceutical Group Co., Ltd. Company',115,102,1.73,'WSKL','2019-03-01 00:00:00',NULL,1);

UNLOCK TABLES;


DROP TABLE IF EXISTS `drugsdetailed`;

CREATE TABLE `drugsdetailed` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `DrugsTempID` int(11) NOT NULL COMMENT 'Pharmaceutical template ID',
   `DrugsID` int(11) NOT NULL COMMENT 'drug ID',
   `DrugsUsage` varchar(64) DEFAULT NULL COMMENT 'usage',
   `Dosage` varchar(64) DEFAULT NULL COMMENT 'Dosage',
   `Frequency` varchar(64) DEFAULT NULL COMMENT 'Frequency',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

LOCK TABLES `drugsdetailed` WRITE;

INSERT INTO `drugsdetailed` VALUES (2,2,23,'Intravenous injection','100ml','Once a day'),(3,2,30,'Intravenous injection','200ml','Once a day' ),(4,5,86,'','',''),(6,3,5,'11','11','11'),(7,3,57,'22', '22','22'),(8,7,9,'1','1','1'),(9,4,36,'1','1','1'),( 10,4,39,'1','1','1'),(11,4,2,'','',''),(12,8,9,'oral','1g' ,'Three times a day'),(13,8,33,'Oral','2g','Three times a day'),(14,8,47,'Oral','Appropriate amount','Multiple times') ,(15,9,44,'11','11','11'),(18,9,68,'22','22','22'),(19,10,1659,'1 ','3','1'),(20,10,2912,'1','3','1');

UNLOCK TABLES;

--
-- Table structure for table `drugstemplate`
--

DROP TABLE IF EXISTS `drugstemplate`;

CREATE TABLE `drugstemplate` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `Name` varchar(64) NOT NULL COMMENT 'name',
   `UserID` int(11) NOT NULL COMMENT 'Doctor ID',
   `CreationTime` datetime NOT NULL COMMENT 'Creation time',
   `Scope` char(2) DEFAULT NULL COMMENT 'Scope of use: whole hospital/department/individual',
   `DelMark` int(11) NOT NULL DEFAULT '1' COMMENT 'Delete mark',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


LOCK TABLES `drugstemplate` WRITE;

INSERT INTO `drugstemplate` VALUES (2,'Candida dermatitis',1,'2019-03-21 13:25:45','1',1),(3,'Acute icteric hepatitis D', 1,'2019-03-21 13:25:59','2',1),(4,'Viral gastroenteritis',1,'2019-03-21 13:26:25','3 ',1),(5,'Mumps NOS',1,'2019-03-21 13:26:33','1',1),(7,'Frequent common cold',1 ,'2019-03-22 16:34:08','3',1),(8,'Seasonal asthma',1,'2019-03-29 14:50:13','2' ,1),(9,'Bronchial Asthma',1,'2019-04-01 13:43:44','2',1),(10,'1',1,'2021-12-27 15 :05:41','Personal',1);
/*!40000 ALTER TABLE `drugstemplate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `expenseclass`
--

DROP TABLE IF EXISTS `expenseclass`;

CREATE TABLE `expenseclass` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `ExpCode` varchar(64) NOT NULL COMMENT 'Expense account code',
   `ExpName` varchar(64) NOT NULL COMMENT 'Expense account name',
   `DelMark` int(11) NOT NULL DEFAULT '1' COMMENT 'Delete mark',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


LOCK TABLES `expenseclass` WRITE;

INSERT INTO `expenseclass` VALUES (1,'GHF','Registration fee',1),(2,'ZLF','diagnosis and treatment fee',1),(3,'JYF','inspection fee',1) ,(4,'JYCLF','Inspection Material Fee',1),(5,'CSJCF','Ultrasonic Inspection Fee',1),(6,'CSCLF','Ultrasonic Material Fee',1),( 7,'FSJCF','Radiation examination fee',1),(8,'FSCLF','Radiation material fee',1),(9,'MRIJCF','MRI examination fee',1),(10, 'MRICLF','MRI material fee',1),(11,'CTJCF','CT examination fee',1),(12,'CTCLF','CT material fee',1),(13,'XYF ','Western medicine fee',1),(14,'ZCYF','Chinese patent medicine fee',1),(15,'ZCYF','Chinese herbal medicine fee',1),(16,'CZF','Disposal Fee',1),(17,'CZCLF','Disposal material fee',1),(18,'MZF','Anesthetic fee',1),(19,'MZYF','Anesthetic fee', 1),(20,'MZSSF','Outpatient surgery fee',1),(21,'QT','Others',1);

UNLOCK TABLES;



DROP TABLE IF EXISTS `fmeditem`;

CREATE TABLE `fmeditem` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `ItemCode` varchar(64) NOT NULL COMMENT 'Item code',
   `ItemName` varchar(64) NOT NULL COMMENT 'Item name',
   `Format` varchar(64) DEFAULT NULL COMMENT 'Specification',
   `Price` decimal(8,2) NOT NULL COMMENT 'unit price',
   `ExpClassID` int(11) DEFAULT NULL COMMENT 'The expense account ID',
   `DeptID` int(11) DEFAULT NULL COMMENT 'Executive department ID',
   `MnemonicCode` varchar(64) DEFAULT NULL COMMENT 'Pinyin mnemonic code',
   `CreationDate` datetime NOT NULL COMMENT 'Creation time',
   `LastUpdateDate` datetime DEFAULT NULL COMMENT 'Last modified time',
   `RecordType` int(11) DEFAULT NULL COMMENT 'Project type',
   `DelMark` int(11) NOT NULL DEFAULT '1' COMMENT 'Delete mark',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `fmeditem`
--

LOCK TABLES `fmeditem` WRITE;
/*!40000 ALTER TABLE `fmeditem` DISABLE KEYS */;
INSERT INTO `fmeditem` VALUES (1,'120200001','大抢救','日',200.00,16,133,'DQJ','2019-03-01 00:00:00',NULL,3,1),(2,'120200002','中抢救','日',150.00,16,133,'ZQJ','2019-03-01 00:00:00',NULL,3,1),(3,'120200003','小抢救','日',80.00,16,133,'XQJ','2019-03-01 00:00:00',NULL,3,1),(4,'120300001','中心吸氧','小时',2.50,16,122,'ZXXY','2019-03-01 00:00:00',NULL,3,1),(5,'120300002','低流量吸氧','小时',2.00,16,122,'DLLXY','2019-03-01 00:00:00',NULL,3,1),(6,'120300003','高频吸氧','小时',4.00,16,122,'GPXY','2019-03-01 00:00:00',NULL,3,1),(7,'120500001','大清创缝合','次',120.00,16,133,'DQCFH','2019-03-01 00:00:00',NULL,3,1),(8,'120500002','中清创缝合','次',80.00,16,133,'ZQCFH','2019-03-01 00:00:00',NULL,3,1),(9,'120500003','小清创缝合','次',40.00,16,133,'XQCFH','2019-03-01 00:00:00',NULL,3,1),(10,'121000001','洗胃','次',40.00,16,133,'XW','2019-03-01 00:00:00',NULL,3,1),(11,'120800002','肠内高营养治疗','日',5.00,16,133,'CNGYYZL','2019-03-01 00:00:00',NULL,3,1),(12,'121500001','灌肠','次',10.00,16,133,'GC','2019-03-01 00:00:00',NULL,3,1),(13,'240100003','计算机治疗计划系统(TPS)','疗程',180.00,7,128,'JSJZLJHXT','2019-03-01 00:00:00',NULL,3,1),(14,'240100004','特定计算机治疗计划系统','疗程',500.00,7,128,'TDJSJZLJHXT','2019-03-01 00:00:00',NULL,3,1),(15,'240100004b','加速器适型治疗计划系统','疗程',500.00,7,128,'JSQSXZLJHXT','2019-03-01 00:00:00',NULL,3,1),(16,'240100004c','伽玛刀治疗计划系统','疗程',500.00,7,128,'GMDZLJHXT','2019-03-01 00:00:00',NULL,3,1),(17,'240100004d','X刀之TPS治疗计划系统','疗程',500.00,7,128,'XDZTPSZLJHXT','2019-03-01 00:00:00',NULL,3,1),(18,'240100004e','逆向调强TPS及优化治疗计划系统','疗程',500.00,7,128,'NXTQTPSJYHZLJHXT','2019-03-01 00:00:00',NULL,3,1),(19,'240100005','放射治疗的适时监控','次',50.00,7,128,'FSZLDSSJK','2019-03-01 00:00:00',NULL,3,1),(20,'210101001','普通透视','每个部位',5.00,7,128,'PTTS','2019-03-01 00:00:00',NULL,1,1),(25,'210101002','食管钡餐透视','次',15.00,7,128,'SGBCTS','2019-03-01 00:00:00',NULL,1,1),(26,'210101003','床旁透视与术中透视','半小时',40.00,7,128,'CPTSYSZTS','2019-03-01 00:00:00',NULL,1,1),(27,'210101004','C型臂术中透视','半小时',150.00,7,128,'CXBSZTS','2019-03-01 00:00:00',NULL,1,1),(28,'210103001','气脑造影','次',80.00,7,128,'QNZY','2019-03-01 00:00:00',NULL,1,1),(29,'210103003','脑室碘水造影','次',60.00,7,128,'NSDSZY','2019-03-01 00:00:00',NULL,1,1),(30,'210103004','X清肌酸激酶－MB同工酶活性测定（干化X法）','次',60.00,3,125,'XQJSJM－MBTGMHXCD（GHXF）','2019-03-01 00:00:00',NULL,2,1),(31,'210103005','X清肌酸激酶－MB同工酶活性测定（金标法）','次',60.00,3,125,'XQJSJM－MBTGMHXCD（JBF）','2019-03-01 00:00:00',NULL,2,1),(32,'210103006','尿α1微量球蛋白测定（化X发光法）','单侧',50.00,3,125,'Nα1WLQDBCD（HXFGF）','2019-03-01 00:00:00',NULL,2,1),(33,'210103007','β2微球蛋白测定（各种免疫X方法）','单侧',50.00,3,125,'β2WQDBCD（GZMYXFF）','2019-03-01 00:00:00',NULL,2,1),(34,'210103008','X清β2微球蛋白测定（化X发光法）','单侧',40.00,3,125,'XQβ2WQDBCD（HXFGF）','2019-03-01 00:00:00',NULL,2,1),(35,'210103009','尿β2微球蛋白测定（化X发光法）','单侧',80.00,3,125,'Nβ2WQDBCD（HXFGF）','2019-03-01 00:00:00',NULL,2,1),(36,'210103010','尿蛋白电泳分析（凝胶法）','单侧',70.00,3,125,'NDBDYFX（NJF）','2019-03-01 00:00:00',NULL,2,1),(37,'210103011','X清抗谷氨酸脱J酶抗体测定（各种免疫X方法）','单侧',50.00,3,125,'XQKGASTJMKTCD（GZMYXFF）','2019-03-01 00:00:00',NULL,2,1),(38,'210103012','胃泌素测定（各种免疫X方法）','次',50.00,3,125,'WMSCD（GZMYXFF）','2019-03-01 00:00:00',NULL,2,1),(39,'210103013','X浆凝X酶原时间测定(PT)(仪器法)','次',50.00,3,125,'XJNXMYSJCD(PT)(YQF)','2019-03-01 00:00:00',NULL,2,1),(40,'210103014','X清肌酸激酶－MB同工酶活性测定（速率法）','次',60.00,3,125,'XQJSJM－MBTGMHXCD（SLF）','2019-03-01 00:00:00',NULL,2,1),(41,'210103015','醛固酮测定（化X发光法、荧光免疫法）','次',50.00,3,125,'QGTCD（HXFGF、YGMYF）','2019-03-01 00:00:00',NULL,2,1),(42,'210103016','尿儿茶酚胺测定（色谱法）','次',80.00,3,125,'NECFACD（SPF）','2019-03-01 00:00:00',NULL,2,1),(43,'210103017','尿香草苦杏仁酸(VMA)测定（色谱法）','次',60.00,3,125,'NXCKXRS(VMA)CD（SPF）','2019-03-01 00:00:00',NULL,2,1),(44,'210103018','X浆肾素活性测定','次',80.00,3,125,'XJSSHXCD','2019-03-01 00:00:00',NULL,2,1),(45,'210103019','X管紧张素Ⅱ测定','次',100.00,3,125,'XGJZSⅡCD','2019-03-01 00:00:00',NULL,2,1),(46,'210103020','促红细胞生成素测定','次',50.00,3,125,'CHXBSCSCD','2019-03-01 00:00:00',NULL,2,1),(47,'210103021','睾酮测定（化X发光法、荧光免疫法）','次',80.00,3,125,'ZTCD（HXFGF、YGMYF）','2019-03-01 00:00:00',NULL,2,1),(48,'210103022','葡萄糖测定（干化X法）(X清)','次',300.00,3,125,'PTTCD（GHXF）(XQ)','2019-03-01 00:00:00',NULL,2,1),(49,'210103023','糖化X红蛋白测定（色谱法）','次',80.00,3,125,'THXHDBCD（SPF）','2019-03-01 00:00:00',NULL,2,1),(50,'210103024','X浆乳酸测定','次',80.00,3,125,'XJRSCD','2019-03-01 00:00:00',NULL,2,1),(51,'210103025','尿N-X-β-D-氨基葡萄糖苷酶测定','次',70.00,3,125,'NN-X-β-D-AJPTTZMCD','2019-03-01 00:00:00',NULL,2,1),(52,'210103026','尿β-D-半乳糖苷酶测定','次',50.00,3,125,'Nβ-D-BRTZMCD','2019-03-01 00:00:00',NULL,2,1),(53,'210103027','唐氏综合症筛查','单侧',70.00,3,125,'TSZHZSC','2019-03-01 00:00:00',NULL,2,1),(54,'210103028','雌三醇测定（化X发光法、荧光免疫法）','次',50.00,3,125,'CSCCD（HXFGF、YGMYF）','2019-03-01 00:00:00',NULL,2,1),(55,'210103029','雌二醇测定（化X发光法、荧光免疫法）','次',50.00,3,125,'CECCD（HXFGF、YGMYF）','2019-03-01 00:00:00',NULL,2,1),(56,'210103030','孕酮测定（化X发光法、荧光免疫法）','单侧',50.00,3,125,'YTCD（HXFGF、YGMYF）','2019-03-01 00:00:00',NULL,2,1);

UNLOCK TABLES;

--
-- Table structure for table `herbaldetailed`
--

DROP TABLE IF EXISTS `herbaldetailed`;

CREATE TABLE `herbaldetailed` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `HerbalPresID` int(11) NOT NULL COMMENT 'Herbal prescription ID',
   `HerbalID` int(11) NOT NULL COMMENT 'drug ID',
   `Dosage` varchar(64) DEFAULT NULL COMMENT 'Dosage',
   `Price` decimal(8,2) NOT NULL COMMENT 'drug unit price',
   `Footnote` varchar(64) DEFAULT NULL COMMENT 'footnote',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


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


CREATE TABLE `herbalprescription` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `MedicalID` int(11) NOT NULL COMMENT 'medical_record_ID',
   `RegistID` int(11) NOT NULL COMMENT 'registered_ID',
   `UserID` int(11) NOT NULL COMMENT 'Doctor ID',
   `PrescriptionName` varchar(64) NOT NULL COMMENT 'prescription name',
   `CreationTime` datetime NOT NULL COMMENT 'Creation time',
   `PrescriptioType` varchar(64) DEFAULT NULL COMMENT 'Prescription type: decoction/soak in wine/powder/pill making/capsulation, etc.',
   `PayNumber` int(11) DEFAULT NULL COMMENT 'PayNumber',
   `Frequency` varchar(64) DEFAULT NULL COMMENT 'Frequency',
   `DrugsUsage` varchar(64) DEFAULT NULL COMMENT 'Usage internal/external use',
   `Therapy` varchar(512) DEFAULT NULL COMMENT 'Therapy',
   `Detailed` varchar(512) DEFAULT NULL COMMENT 'Detailed treatment method',
   `Advice` varchar(512) DEFAULT NULL COMMENT 'Doctors advice',
   `State` int(11) DEFAULT NULL COMMENT 'state',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


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

CREATE TABLE `herbaltempdetailed` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `HerbalTempID` int(11) NOT NULL COMMENT 'Herbal template ID',
   `HerbalID` int(11) NOT NULL COMMENT 'drug ID',
   `Dosage` varchar(64) DEFAULT NULL COMMENT 'Dosage',
   `Unit` varchar(64) DEFAULT NULL COMMENT 'drug unit',
   `Footnote` varchar(64) DEFAULT NULL COMMENT 'footnote',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


--
-- Dumping data for table `herbaltempdetailed`
--

LOCK TABLES `herbaltempdetailed` WRITE;

UNLOCK TABLES;

--
-- Table structure for table `herbaltemplate`
--

DROP TABLE IF EXISTS `herbaltemplate`;

CREATE TABLE `herbaltemplate` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `Name` varchar(64) NOT NULL COMMENT 'name',
   `DoctorID` int(11) NOT NULL COMMENT 'Doctor ID',
   `CreationTime` datetime NOT NULL COMMENT 'Creation time',
   `PrescriptioType` varchar(64) DEFAULT NULL COMMENT 'Prescription type: decoction/soak in wine/powder/pill making/capsulation, etc.',
   `PayNumber` int(11) DEFAULT NULL COMMENT 'PayNumber',
   `DrugsUsage` varchar(64) DEFAULT NULL COMMENT 'usage',
   `Therapy` varchar(512) DEFAULT NULL COMMENT 'Therapy',
   `Detailed` varchar(512) DEFAULT NULL COMMENT 'Detailed treatment method',
   `Advice` varchar(512) DEFAULT NULL COMMENT 'Doctors advice',
   `Scope` varchar(64) DEFAULT NULL COMMENT 'Scope of use: whole hospital/department/individual',
   `DelMark` int(11) NOT NULL DEFAULT '1' COMMENT 'Delete mark',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


--
-- Dumping data for table `herbaltemplate`
--

LOCK TABLES `herbaltemplate` WRITE;

UNLOCK TABLES;

--
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;

CREATE TABLE `invoice` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `InvoiceNum` varchar(64) NOT NULL COMMENT 'Invoice number',
   `Money` decimal(8,2) NOT NULL COMMENT 'Invoice amount',
   `State` int(11) NOT NULL COMMENT 'Invoice status 1-normal 2-voided',
   `CreationTime` datetime NOT NULL COMMENT 'Collection/refund time',
   `UserID` int(11) NOT NULL COMMENT 'ID of person who collects/refunds',
   `RegistID` int(11) DEFAULT NULL COMMENT 'registered_ID ',
   `FeeType` int(11) DEFAULT NULL COMMENT 'Charging method',
   `Back` varchar(64) DEFAULT NULL COMMENT 'red invoice number',
   `DailyState` int(11) NOT NULL DEFAULT '0' COMMENT 'Invoice status 0-not yet settled 1-submitted 2-approved',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=271 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


--
-- Dumping data for table `invoice`
--

LOCK TABLES `invoice` WRITE;
/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
INSERT INTO `invoice` VALUES (56,'800801',50.00,2,'2019-03-25 10:09:28',9,24,51,'',1),
(132,'800802',48.65,3,'2019-04-01 11:26:23',9,35,51,NULL,1),(133,'800803',-8.65,7,'2019-04-01 11:27:48',9,35,51,NULL,1),(134,'800804',48.65,3,'2019-04-01 11:38:23',9,35,51,NULL,1),(135,'800805',-48.65,7,'2019-04-01 11:39:40',9,35,51,NULL,0),(136,'800806',77.90,3,'2019-04-01 11:40:19',9,35,51,NULL,1),(137,'800807',-67.90,7,'2019-04-01 11:41:37',9,35,51,NULL,0),(138,'800808',-10.00,7,'2019-04-01 11:42:42',9,35,51,NULL,1),(139,'800809',8.00,3,'2019-04-01 13:25:23',9,37,51,NULL,0),(142,'800810',129.94,3,'2019-04-01 13:33:54',9,37,51,NULL,0),(143,'800811',-129.94,7,'2019-04-01 13:38:56',9,37,51,NULL,1),(144,'800812',247.37,3,'2019-04-01 13:39:37',9,37,52,NULL,1),(257,'800813',-50.00,7,'2021-12-23 10:50:19',10,24,51,'800813',1),(258,'800814',138.13,1,'2021-12-23 14:41:29',10,NULL,51,NULL,1),(259,'800815',294.16,1,'2021-12-23 14:42:38',10,NULL,51,NULL,1),(260,'800816',8.00,4,'2021-12-23 19:54:58',10,3,51,NULL,1),(261,'800817',174.86,1,'2021-12-23 19:55:43',10,NULL,51,NULL,1),(265,'800818',96.57,1,'2021-12-24 16:14:47',9,NULL,51,NULL,0),(266,'800819',296.57,1,'2021-12-27 14:58:18',9,NULL,51,NULL,0),(267,'800820',149.82,1,'2021-12-27 15:07:28',9,NULL,51,NULL,0),(268,'800821',56.00,1,'2021-12-27 15:18:16',9,NULL,51,NULL,0),(269,'800822',400.00,1,'2021-12-27 16:14:23',9,NULL,51,NULL,0),(270,'800823',27.37,1,'2021-12-27 16:22:14',9,NULL,51,NULL,0);
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicaldisease`
--

DROP TABLE IF EXISTS `medicaldisease`;


CREATE TABLE `medicaldisease` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `MedicalID` int(11) NOT NULL COMMENT 'medical_record_ID',
   `RegistID` int(11) NOT NULL COMMENT 'registered_ID',
   `DiseaseID` int(11) NOT NULL COMMENT 'Disease ID',
   `DiagnoseType` int(11) DEFAULT NULL COMMENT 'Diagnosis type 1-Western medicine 2-Traditional Chinese medicine',
   `GetSiskDate` datetime DEFAULT NULL COMMENT 'date of onset',
   `DiagnoseCate` int(11) DEFAULT NULL COMMENT 'Diagnosis type 1-initial diagnosis 2-final diagnosis',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


--
-- Dumping data for table `medicaldisease`
--
LOCK TABLES `medicaldisease` WRITE;
/*!40000 ALTER TABLE `medicaldisease` DISABLE KEYS */;
INSERT INTO `medicaldisease` VALUES (4,1,3,10310,1,'2010-06-11 00:00:00',1),(6,3,4,4,1,'2010-06-11 00:00:00',1),(10,4,6,9,1,'2019-03-19 00:00:00',1),(12,5,9,5,1,'2019-03-20 15:21:00',2),(13,1,25,27149,2,'2019-03-25 16:51:00',2),(14,1,26,8,1,'2019-03-26 09:28:00',2),(16,8,27,8,1,'2019-03-28 00:00:00',2),(17,1,29,5,1,'2019-03-28 13:45:00',2),(18,1,29,10,1,'2019-03-28 13:45:00',2),(19,1,30,1,1,'2019-03-28 15:25:00',2),(20,19,34,4,1,'2019-03-29 15:15:00',1),(21,1,0,0,0,'2019-04-01 13:26:36',1);
/*!40000 ALTER TABLE `medicaldisease` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicalrecord`
--

DROP TABLE IF EXISTS `medicalrecord`;

CREATE TABLE `medicalrecord` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `CaseNumber` varchar(64) NOT NULL COMMENT 'medical_record_Id',
   `RegistID` int(11) NOT NULL COMMENT 'registered_ID',
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
   `CaseState` int(11) DEFAULT NULL COMMENT 'Medical record status 1-temporary storage 2-submitted 3-diagnosis completed',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


--
-- Dumping data for table `medicalrecord`
--

LOCK TABLES `medicalrecord` WRITE;
/*!40000 ALTER TABLE `medicalrecord` DISABLE KEYS */;
INSERT INTO `medicalrecord` VALUES (1,'600601',3,'I started coughing after catching a cold half a month ago. It was paroxysmal, no fear of cold or fever, no hemoptysis or chest pain, accompanied by a small amount of white sticky sputum. I have taken cough syrup, etc. 3 days, but the effect is not good.','Paroxysmal cough for half a month','I took cough syrup for 3 days, but the effect is not good','I have a history of chronic cough for more than 10 years and was diagnosed as "chronic bronchitis", He does not smoke. He denies a history of tuberculosis.','none','BP 128/80mmHg, no dyspnea, no cyanosis on the lips, scattered dry rales in both lungs, and no wet rales, heart rate 90 beats/min , smooth, no murmur, abdomen flat and soft without tenderness, liver and spleen not palpable, no edema in both lower limbs.','Blood routine, chest X-ray','None','Examination result 1','Abdominal disease','' ,2),(3,'600607',4,'Metastatic right lower abdominal pain accompanied by nausea and vomiting for 8 hours.','The patient had abdominal pain without cause 8 hours ago. The initial manifestation was dull pain in the upper abdomen, which lasted 4 hours. Afterwards, the pain gradually worsened and transferred to the right lower abdomen and was fixed. There was no radiating pain in the lower back and perineum. It showed paroxysmal attacks, accompanied by nausea and vomiting several times. The vomitus was gastric contents, with a total volume of about 200 ml. For diagnosis and treatment, he came to our hospital for treatment because of unrelieved abdominal pain, and was admitted to the hospital with the diagnosis of "abdominal pain pending investigation". During the course of the disease, the patient had no cough, sputum, palpitations, shortness of breath, dyspnea, abdominal distension, diarrhea, frequent urination, or frequent urination. Urgency, painful urination and hematuria. Since the onset of the illness, he has suffered from poor sleep, poor appetite, and normal bowel movements.', 'The patient was admitted to the hospital on June 11, 2008 with metastatic right lower abdominal pain accompanied by nausea and vomiting for 8 hours.', 'No history of tuberculosis and hepatitis, no history of diabetes, heart disease, hypertension, no history of drug allergies and surgery.','none','none','blood routine','none','examination result 1', 'Abdominal disease','',1),(4,'600605',6,'Intermittent right upper quadrant pain for 2 years.','The disease is due to the onset of dull pain in the right upper abdomen 2 years ago without obvious triggers, accompanied by right upper quadrant pain. Radiating pain in the chest and back, no radiating pain in the shoulders, and intermittent abdominal pain. The abdominal pain was relieved after anti-infective treatment (the specific drug name and dosage is unknown).',' On January 14, 2010, in Ailing, Siping City An ultrasound examination at Qi Hospital showed that multiple gallbladder stones had not been treated. He came to our hospital for further treatment and was admitted to the hospital with gallbladder stones as an outpatient. During the course of the disease, there were no chills, high fever, no acid reflux, belching, no nausea, vomiting, and no Vomiting blood, black stool, no yellow stain. Since the onset of illness, I have had poor sleep, poor appetite, and normal bowel movements.','No history of tuberculosis and hepatitis, no history of diabetes, heart disease, hypertension, no history of drug allergies or surgery .','None','None','Abdominal color ultrasound (2008-06-11)','Low-fat diet','Examination results 1','Abdominal disease','',2),(5,' 600606',9,'Pain in the right lower abdomen with nausea.','The patient had abdominal pain without any trigger 8 hours ago. The initial manifestation was a dull pain in the upper abdomen. After 4 hours, the pain gradually worsened and transferred to the right lower abdomen and was fixed. There was no pain in the lower back. and perineal pain, with paroxysmal attacks, accompanied by nausea and vomiting several times. The vomitus was gastric contents, with a total volume of about 200 ml. Without any diagnosis and treatment, he came to our hospital for treatment because of unrelieved abdominal pain. Outpatient service He was admitted to the hospital with "abdominal pain pending investigation". During the course of the disease, the patient had no cough, sputum, palpitations, shortness of breath, dyspnea, abdominal distension, diarrhea, frequent urination, urgency, dysuria, or hematuria. Since the onset of the illness, the patient had poor sleep, poor appetite, and normal bowel movements. ','The patient was admitted to the hospital on June 11, 2008 with metastatic right lower abdominal pain accompanied by nausea and vomiting for 8 hours. ','There is no history of tuberculosis and hepatitis, no history of diabetes, heart disease, or hypertension, no history of drug allergies, and no history of surgery. ','None','None','Blood routine','None','Examination result 1','Abdominal disease','',2),(6,'600609',25,'111',' 222','333','444','555','666','777','888','Examination result 1','Abdominal disease','',2),(7,'600607' ,26,'11','22','33','44','55','66','ww','gggg','Examination result 1','Abdominal disease','',2 ),(8,'600608',27,'Su Erqiang Su Erqiang Su Erqiang Su Erqiang Su Erqiang Su Erqiang ah','Su Erqiang Su Erqiang Su Erqiang Su Erqiang','Su Erqiang Su Erqiang, Su Erqiang, Su Erqiang', 'Su Erqiang, Su Erqiang, Su Erqiang, Su Erqiang', 'Su Erqiang, Su Erqiang, Su Erqiang, Su Erqiang', 'Su Erqiang, Su Erqiang, Su Erqiang' 'Qiang Su Erqiang Su Erqiang','Su Erqiang','Su Erqiang','Examination result 1','Abdominal disease','',3),
(9,'600610',29,'q' ,'q','q','q','q','q','q','q','Examination result 1','Abdominal disease','',3),(10,' 600611',30,'3','3','3','3','3','3','3','3','Examination result 1','Abdominal disease','' ,3),(11,'600609',28,'undefined','undefined','undefined','undefined','undefined','undefined','undefined','undefined','Check result 1' ,'Abdominal disease','',3),(13,'600612',31,'','','','','','','','','','Abdominal Disease','',3),(15,'600613',32,'','','','','','','','','','Abdominal disease', '',3),(18,'600614',33,'','','','','','','','','','Abdominal disease','', 3),(19,'600615',34,'','','','','','','','','','abdominal disease','',2), (20,'600618',37,'qq','','','','','','','','','abdominal disease','',2),(21 ,'600616',35,'1','1','1','1','1','1','1','1','1','He-Kreuse dysentery [Subgroup A shigellosis]','1',3),(22,'600617',36,'Chief complaint 1','History of current disease 1','Treatment of current disease 1','Past history 1 ','Allergy history 1','Physical examination 1','Examination suggestions 1','Precautions 1','Examination results 1','Abdominal disease','1',3);
/*!40000 ALTER TABLE `medicalrecord` ENABLE KEYS */;
UNLOCK TABLES;
--
-- Table structure for table `patientcosts`
--

DROP TABLE IF EXISTS `patientcosts`;

CREATE TABLE `patientcosts` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `RegistID` int(11) NOT NULL COMMENT 'registered_ID',
   `InvoiceID` int(11) NOT NULL COMMENT 'Invoice ID',
   `ItemID` int(11) NOT NULL COMMENT 'Item ID',
   `ItemType` int(11) NOT NULL COMMENT 'Item type 1-non-drug 2-drug',
   `Name` varchar(64) NOT NULL COMMENT 'Project name',
   `Price` decimal(8,2) NOT NULL COMMENT 'Project unit price',
   `Amount` decimal(8,2) NOT NULL COMMENT 'Amount',
   `DeptID` int(11) NOT NULL COMMENT 'Executive department ID',
   `Createtime` datetime NOT NULL COMMENT 'Create time',
   `CreateOperID` int(11) NOT NULL COMMENT 'Issuer ID',
   `PayTime` datetime NOT NULL COMMENT 'Payment/refund time',
   `RegisterID` int(11) NOT NULL COMMENT 'ID of person who collects/refunds',
   `FeeType` int(11) NOT NULL COMMENT 'Charging method',
   `BackID` int(11) DEFAULT NULL COMMENT 'Refund corresponding record ID',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=275 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `patientcosts`
--

LOCK TABLES `patientcosts` WRITE;
/*!40000 ALTER TABLE `patientcosts` DISABLE KEYS */;
INSERT INTO `patientcosts` VALUES (254,35,134,1,1,'Weisu Granules',1.73,5.00,22,'2019-04-01 11:38:23',301,'2019-04-01 11: 38:23',301,51,NULL),(255,35,134,1,1,'Gastric lavage',40.00,1.00,22,'2019-04-01 11:38:23',301,'2019- 04-01 11:38:23',301,51,NULL),(256,35,135,1,1,'Weisu Granules',1.73,-5.00,22,'2019-04-01 11:39:40 ',301,'2019-04-01 11:39:40',301,51,NULL),(257,35,135,1,1,'Gastric lavage',40.00,-1.00,22,'2019-04- 01 11:39:40',301,'2019-04-01 11:39:40',301,51,NULL),(258,35,136,1,1,'Yam Granules',6.79,10.00,22, '2019-04-01 11:40:19',301,'2019-04-01 11:40:19',301,51,NULL),(259,35,136,1,1,'Enema',10.00, 1.00,22,'2019-04-01 11:40:19',301,'2019-04-01 11:40:19',301,51,NULL),(260,35,137,1,1,'Yam Particles',6.79,-10.00,22,'2019-04-01 11:41:37',301,'2019-04-01 11:41:37',301,51,NULL),(261,35,138, 1,1,'Enema',10.00,-1.00,22,'2019-04-01 11:42:42',301,'2019-04-01 11:42:42',301,51,NULL), (262,37,139,1,1,'Registration fee',8.00,1.00,1,'2019-04-01 13:25:23',9,'2019-04-01 13:25:23',9, 51,NULL),(263,37,142,1,1,'Beeswax',3.47,2.00,22,'2019-04-01 13:33:54',301,'2019-04-01 13:33:54 ',301,51,NULL),(264,37,142,1,1,'Metroviolet solution',41.00,3.00,22,'2019-04-01 13:33:54',301,'2019-04- 01 13:33:54',301,51,NULL),(265,37,143,1,1,'Beeswax',3.47,-2.00,22,'2019-04-01 13:38:56',301, '2019-04-01 13:38:56',301,51,NULL),(266,37,143,1,1,'methyl violet solution',41.00,-3.00,22,'2019-04-01 13: 38:56',301,'2019-04-01 13:38:56',301,51,NULL),(267,37,144,1,1,'Hongqi Granules',30.79,3.00,22,'2019 -04-01 13:39:37',301,'2019-04-01 13:39:37',301,51,NULL),(268,37,144,1,1,'Ventriculography',60.00 ,1.00,22,'2019-04-01 13:39:37',301,'2019-04-01 13:39:37',301,51,NULL),(269,37,144,1,1,' Pneumoencephalography',80.00,1.00,22,'2019-04-01 13:39:37',301,'2019-04-01 13:39:37',301,51,NULL),(270,37,144 ,1,1,'Esophageal barium meal fluoroscopy',15.00,1.00,22,'2019-04-01 13:39:37',301,'2019-04-01 13:39:37',301,51,NULL ),(271,37,145,1,1,'Ventriculography',60.00,-1.00,22,'2019-04-01 13:39:57',301,'2019-04-01 13:39: 57',301,51,NULL),(272,37,145,1,1,'Pneumoencephalography',80.00,-1.00,22,'2019-04-01 13:39:57',301,'2019- 04-01 13:39:57',301,51,NULL),(273,37,145,1,1,'Esophageal barium meal fluoroscopy',15.00,-1.00,22,'2019-04-01 13:39:57 ',301,'2019-04-01 13:39:57',301,51,NULL),(274,36,800823,2912,2,'Rabid immune globulin (Shuyang)',27.37,1.00 ,1,'2021-12-27 16:22:14',10,'2021-12-27 16:22:14',10,51,NULL);
/*!40000 ALTER TABLE `patientcosts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prescription`
--

DROP TABLE IF EXISTS `prescription`;

CREATE TABLE `prescription` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `MedicalID` int(11) NOT NULL COMMENT 'medical_record_ID',
   `RegistID` int(11) NOT NULL COMMENT 'registered_ID',
   `UserID` int(11) NOT NULL COMMENT 'Doctor ID',
   `PrescriptionName` varchar(64) NOT NULL COMMENT 'prescription name',
   `PrescriptionTime` datetime NOT NULL COMMENT 'Issuance time',
   `PrescriptionState` int(11) NOT NULL COMMENT 'prescription status',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


--
-- Dumping data for table `prescription`
--

LOCK TABLES `prescription` WRITE;
/*!40000 ALTER TABLE `prescription` DISABLE KEYS */;
INSERT INTO `prescription` VALUES (1,1,35,2,'Childrens cold','2019-03-17 17:19:19',2),(2,2,4,5,'Enteritis',' 2019-03-17 17:59:19',2),(38,5,9,1,'Template: Candida dermatitis','2019-03-28 10:27:28',1),( 39,5,9,1,'New prescription 1','2019-03-28 10:38:57',1),(40,8,27,1,'New prescription 1','2019- 03-28 11:00:14',2),(41,9,29,1,'New prescription 1','2019-03-28 13:46:47',6),(46,10, 30,1,'www','2019-03-28 15:27:01',6),(47,10,30,1,'Template: Viral gastroenteritis','2019-03-28 15 :28:12',6),(48,15,32,1,'s1','2019-03-29 09:27:12',6),(51,18,33,1,'Template: Viral gastroenteritis','2019-03-29 14:47:46',3),(52,18,33,1,'Template: Candidal dermatitis','2019-03-29 14:47 :52',3),(53,19,34,1,'Template: Viral Gastroenteritis','2019-03-29 15:20:15',2),(54,19,34,1 ,'Template: Frequent seasonal asthma','2019-03-29 15:20:22',2),(55,7,26,1,'Template: Frequent seasonal asthma','2019-03 -29 15:42:04',1),(56,20,37,1,'a1','2019-04-01 13:27:53',2),(57,20,37,1, 'Template: Bronchial Asthma','2019-04-01 13:47:39',1),(58,21,35,1,'1','2021-12-27 15:05:14',3 ),(59,22,36,1,'1','2021-12-27 16:06:37',3);
/*!40000 ALTER TABLE `prescription` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prescriptiondetailed`
--

DROP TABLE IF EXISTS `prescriptiondetailed`;

CREATE TABLE `prescriptiondetailed` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `PrescriptionID` int(11) NOT NULL COMMENT 'Pharmaceutical prescription ID',
   `DrugsID` int(11) NOT NULL COMMENT 'drug ID',
   `DrugsUsage` varchar(64) DEFAULT NULL COMMENT 'usage',
   `Dosage` varchar(64) DEFAULT NULL COMMENT 'Dosage',
   `Frequency` varchar(64) DEFAULT NULL COMMENT 'Frequency',
   `Amount` decimal(8,2) NOT NULL COMMENT 'Amount',
   `State` int(11) NOT NULL DEFAULT '2' COMMENT 'State',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

LOCK TABLES `prescriptiondetailed` WRITE;

INSERT INTO `prescriptiondetailed` VALUES (1,1,10,'oral','30g','twice a day',10.00,3),(2,1,29,'oral','5g','once Twice a day',5.00,6),(3,51,36,'1','1','1',1.00,3),(4,51,39,'1','1',' 1',1.00,3),(5,51,2,'','','',1.00,3),(6,52,23,'Intravenous injection','100ml','Once a day' ,1.00,3),(7,52,30,'Intravenous injection','200ml','Once a day',1.00,2),(8,53,36,'1','1','1 ',1.00,3),(9,53,39,'1','1','1',1.00,3),(10,53,2,'','','',1.00,3 ),(11,54,9,'Oral','1g','Three times a day',1.00,3),(12,54,33,'Oral','2g','Three times a day',1.00 ,2),(13,54,47,'oral','appropriate amount','multiple times',1.00,2),(14,55,9,'oral','1g','three times a day', 1.00,4),(15,55,33,'oral','2g','three times a day',1.00,4),(16,55,47,'oral','appropriate amount','multiple times' ,1.00,4),(17,56,5,'q','q','q',3.00,3),(18,56,45,'w','w','w',2.00 ,6),(19,56,2965,'e','e','e',3.00,6),(20,57,44,'11','11','11',1.00,2 ),(21,57,68,'22','22','22',1.00,2),(22,58,1659,'1','3','1',1.00,3), (23,58,2912,'1','3','1',1.00,3),(24,59,1659,'1','3','1',1.00,4),(25 ,59,2912,'1','3','1',1.00,4);

UNLOCK TABLES;
--
-- Table structure for table `recordtemplate`
--

DROP TABLE IF EXISTS `recordtemplate`;

CREATE TABLE `recordtemplate` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `Name` varchar(64) NOT NULL COMMENT 'name',
   `DeptID` int(11) NOT NULL COMMENT 'Department ID',
   `UserID` int(11) NOT NULL COMMENT 'Doctor ID',
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
   `DelMark` int(11) NOT NULL DEFAULT '1' COMMENT 'Delete mark',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


LOCK TABLES `recordtemplate` WRITE;

INSERT INTO `recordtemplate` VALUES (1,'Bian Ques private template 1',1,1,'2019-04-01 11:38:23','personal','chief complaint 1','history of current illness 1', 'Current disease treatment status 1', 'Past history 1', 'Allergy history 1', 'Physical examination 1', 'Examination suggestions 1', 'Notes 1', 'Examination results 1', 'Diagnosis results 1', 'Handling Opinion 1',1),(2,'Bian Ques Department Template 1',1,1,'2019-04-01 11:38:23','Department','Main Complaint 2','History of Current Illness 2','Current disease treatment status 2','Past history 2','Allergy history 2','Physical examination 2','Examination recommendations 2','Precautions 2','Examination results 2','Diagnosis results 2','Handling opinion 2',1),(3,'Bian Ques public template 1',1,1,'2019-04-01 11:38:23','The whole court','Main complaint 3' ,'History of current illness 3','Treatment of current illness 3','Past history 3','Allergy history 3','Physical examination 3','Examination recommendations 3','Precautions 3','Examination results 3' ,'Diagnosis result 3','Handling opinion 3',1);

UNLOCK TABLES;

--
-- Table structure for table `register`
--

DROP TABLE IF EXISTS `register`;

CREATE TABLE `register` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `CaseNumber` varchar(64) NOT NULL COMMENT 'medical_record_ID',
   `RealName` varchar(64) NOT NULL COMMENT 'name',
   `Gender` int(11) NOT NULL COMMENT 'Gender',
   `IDnumber` varchar(18) DEFAULT NULL COMMENT 'ID number',
   `BirthDate` date DEFAULT NULL COMMENT 'Birth date',
   `Age` int(11) DEFAULT NULL COMMENT 'Age',
   `AgeType` char(1) DEFAULT NULL COMMENT 'Age type years months days',
   `HomeAddress` varchar(64) DEFAULT NULL COMMENT 'Home Address',
   `VisitDate` date NOT NULL COMMENT 'Date of this visit',
   `Noon` char(2) NOT NULL COMMENT 'noon morning/afternoon',
   `DeptID` int(11) NOT NULL COMMENT 'Department ID of this registration',
   `UserID` int(11) NOT NULL COMMENT 'doctors ID',
   `RegistLeID` int(11) NOT NULL COMMENT 'registration section ID',
   `SettleID` int(11) NOT NULL COMMENT 'Settlement category ID',
   `IsBook` char(1) DEFAULT NULL COMMENT 'Medical record book to be or not yes/no',
   `RegistTime` datetime NOT NULL COMMENT 'Registration time',
   `RegisterID` int(11) NOT NULL COMMENT 'Register ID',
   `VisitState` int(11) DEFAULT NULL COMMENT 'This visit status',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


LOCK TABLES `register` WRITE;

INSERT INTO `register` VALUES (3,'600600','Li Bai',71,'210103','1900-01-01',18,'years old','Shenyang Yuhou','2019-03-18' ,'Morning',1,1,2,1,'1','2019-03-18 09:20:34',301,2),(4,'600601','Du Fu',71,'' ,'1900-01-01',17,'year','Liaoning North Town','2019-03-19','afternoon',2,1,1,2,'1','2019-03- 18 09:21:26',301,1),(5,'600602','Li Shangyin',71,'','1900-01-01',11,'year','Shenyang Sujiatun', '2019-03-18','AM',2,1,2,1,'0','2019-03-18 09:22:24',301,1),(6,'600603',' Du Mu',71,'21','1900-01-01',11,'year','Dalian Hekou','2019-03-19','morning',1,1,1,2,'1 ','2019-03-19 09:18:25',301,2),(7,'600604','Li Qingzhao',72,'211','1900-01-01',56,'years old' ,'Qingdao Huangdao District','2019-03-19','morning',1,1,1,2,'1','2019-03-19 10:08:51',301,1), (8,'600605','Li He',71,'300','1900-01-01',67,'year','Changsha Yuelu Mountain Road','2019-03-19','morning', 1,1,1,1,'1','2019-03-19 10:09:35',301,1),(9,'600606','Lu Zhaolin',71,'3567','1900- 01-01',33,'year','Tianjin Airport','2019-03-19','afternoon',2,1,2,1,'0','2019-03-19 10:10: 44',301,2),(26,'600607','Su Mingyu',71,'','1900-01-01',33,'years old','','2019-03-26',' AM',1,1,1,1,'1','2019-03-26 09:27:00',301,2),(27,'600608','Su Daqiang',71,'',' 1900-01-01',72,'year','','2019-03-28','morning',1,1,1,1,'1','2019-03-28 10:55: 20',301,3),(28,'600609','Su Erqiang',71,'','1900-01-01',23,'year old','','2019-03-28' ,'AM',1,1,1,1,'0','2019-03-28 10:57:03',301,3),(29,'600610','aa',71,'' ,'1900-01-01',11,'years old','','2019-03-28','afternoon',1,1,1,1,'1','2019-03-28 13: 45:25',9,3),(30,'600611','utilization',71,'','1900-01-01',33,'years old','','2019-03-28' ,'PM',1,1,1,1,'1','2019-03-28 15:23:48',10,3),(31,'600612','cdfg',71,'' ,'1900-01-01',23,'year','','2019-03-26','morning',1,1,1,1,'1','2019-03-28 16: 53:35',9,3),(32,'600613','code cloud',71,'','1900-01-01',22,'year','','2019-03-29 ','AM',1,1,1,1,'0','2019-03-29 09:23:45',9,2),(33,'600614','aa',71,' ','1900-01-01',22,'years','','2019-03-29','morning',1,1,1,1,'0','2019-03-29 14 :41:00',9,3),(34,'600615','bb',71,'','1900-01-01',33,'years old','','2019-03-29 ','Morning',1,1,1,1,'0','2019-03-29 14:46:17',9,2),(35,'600616','Malu',71,' 21','1900-01-01',45,'year','SSS','2019-03-29','morning',1,1,1,1,'0','2019-04- 01 10:17:58',9,3),(36,'600617','k',71,'','1900-01-01',8,'years','','2019-04 -01','Afternoon',1,1,1,1,'1','2019-04-01 10:36:40',9,3),(37,'600618','Sequential number', 71,'211','1900-01-01',22,'year','AAZZ','2019-04-01','afternoon',1,2,2,1,'0','2019 -04-01 13:25:23',9,2);

UNLOCK TABLES;

--
-- Table structure for table `registlevel`
--

DROP TABLE IF EXISTS `registlevel`;

CREATE TABLE `registlevel` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `RegistCode` varchar(64) NOT NULL COMMENT 'number code',
   `RegistName` varchar(64) NOT NULL COMMENT 'number name',
   `SequenceNo` int(11) NOT NULL COMMENT 'Display sequence number',
   `RegistFee` decimal(8,2) DEFAULT NULL COMMENT 'Registration fee',
   `RegistQuota` int(11) NOT NULL COMMENT 'Registration quota',
   `DelMark` int(11) NOT NULL DEFAULT '1' COMMENT 'Delete mark',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


LOCK TABLES `registlevel` WRITE;

INSERT INTO `registlevel` VALUES (1,'zjh','expert number',1,50.00,20,1),(2,'pth','ordinary number',2,8.00,30,1);

UNLOCK TABLES;

--
-- Table structure for table `registwork`
--

DROP TABLE IF EXISTS `registwork`;

CREATE TABLE `registwork` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `RegisterID` int(11) NOT NULL COMMENT 'Charge person ID',
   `StartTime` datetime NOT NULL COMMENT 'Daily settlement starting time',
   `EndTime` datetime NOT NULL COMMENT 'end time of daily settlement',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

LOCK TABLES `registwork` WRITE;

UNLOCK TABLES;

--
-- Table structure for table `rule`
--

DROP TABLE IF EXISTS `rule`;

CREATE TABLE `rule` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `RuleName` varchar(64) NOT NULL COMMENT 'Rule name',
   `DeptID` int(11) DEFAULT NULL COMMENT 'Department ID',
   `UserID` int(11) DEFAULT NULL COMMENT 'Doctor ID',
   `Week` varchar(14) DEFAULT NULL COMMENT 'week',
   `DelMark` int(11) NOT NULL DEFAULT '1' COMMENT 'Delete mark',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;


LOCK TABLES `rule` WRITE;
INSERT INTO `rule` VALUES (1,'q1',1,1,'11111111100000',1),(2,'q1',2,6,'11111111110000',1),(3,'q1',1 ,2,'11111100000000',1),(4,'q1',2,5,'11111111100000',1),(5,'q1',2,4,'11111100000000',1),(6,' q1',1,3,'11111111100000',1),(7,'Sunday duty',2,6,'00000000001100',1),(8,'Sunday duty',2,5,'00000000000011' ,1),(9,'m1',2,6,'00000011110000',1),(10,'b1',1,1,'11111111100000',1);
UNLOCK TABLES;

DROP TABLE IF EXISTS `scheduling`;

CREATE TABLE `scheduling` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `SchedDate` date NOT NULL COMMENT 'Schedule date',
   `DeptID` int(11) NOT NULL COMMENT 'Department ID',
   `UserID` int(11) NOT NULL COMMENT 'Doctor ID',
   `Noon` char(2) NOT NULL COMMENT 'noon farewell',
   `RuleID` int(11) NOT NULL COMMENT 'Scheduling rule ID',
   `DelMark` int(11) NOT NULL DEFAULT '1' COMMENT 'Delete mark',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

LOCK TABLES `scheduling` WRITE;
INSERT INTO `scheduling` VALUES (54,'2019-04-01',1,1,'AM',1,1),(55,'2019-04-01',1,2,'AM',3 ,1),(56,'2019-04-01',1,3,'morning',6,1),(57,'2019-04-01',1,2,'afternoon',3,1 ),(58,'2019-04-01',1,3,'PM',6,1),(59,'2019-04-02',1,2,'AM',3,1), (60,'2019-04-02',1,3,'morning',6,1),(61,'2019-04-02',1,2,'afternoon',3,1),(62 ,'2019-04-02',1,3,'Afternoon',6,1),(63,'2019-04-03',1,2,'Morning',3,1),(64,' 2019-04-01',1,1,'PM',1,1),(65,'2019-04-03',1,3,'AM',6,1),(66,'2019- 04-03',1,2,'Afternoon',3,1),(67,'2019-04-02',1,1,'Morning',1,1),(68,'2019-04- 03',1,3,'Afternoon',6,1),(69,'2019-04-02',1,1,'Afternoon',1,1),(70,'2019-04-04' ,1,3,'morning',6,1),(71,'2019-04-03',1,1,'morning',1,1),(72,'2019-04-04',1 ,3,'Afternoon',6,1),(73,'2019-04-03',1,1,'Afternoon',1,1),(74,'2019-04-05',1,3 ,'AM',6,1),(75,'2019-04-04',1,1,'AM',1,1),(76,'2019-04-04',1,1,' PM',1,1),(77,'2019-04-05',1,1,'AM',1,1),(78,'2019-03-25',1,1,'AM' ,10,1),(79,'2019-03-25',1,1,'afternoon',10,1),(80,'2019-03-26',1,1,'morning',10 ,1),(81,'2019-03-26',1,1,'Afternoon',10,1),(82,'2019-03-27',1,1,'Morning',10,1 ),(83,'2019-03-27',1,1,'PM',10,1),(84,'2019-03-28',1,1,'AM',10,1), (85,'2019-03-28',1,1,'PM',10,1),(86,'2019-03-29',1,1,'AM',10,1);
UNLOCK TABLES;

DROP TABLE IF EXISTS `settlecategory`;

CREATE TABLE `settlecategory` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `SettleCode` varchar(64) NOT NULL COMMENT 'Category code',
   `SettleName` varchar(64) NOT NULL COMMENT 'category name',
   `SequenceNo` int(11) DEFAULT NULL COMMENT 'Display sequence number',
   `DelMark` int(11) NOT NULL DEFAULT '1' COMMENT 'Delete mark',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

LOCK TABLES `settlecategory` WRITE;
INSERT INTO `settlecategory` VALUES (1,'js001','self-pay',1,1),(2,'js002','municipal medical insurance',2,1);
UNLOCK TABLES;
DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
   `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID_Primary_key',
   `UserName` varchar(64) NOT NULL COMMENT 'Login name',
   `Password` varchar(64) NOT NULL COMMENT 'Password',
   `RealName` varchar(64) NOT NULL COMMENT 'real name',
   `UseType` int(11) DEFAULT NULL COMMENT 'User category',
   `DocTitleID` int(11) DEFAULT NULL COMMENT 'Doctor title ID',
   `IsScheduling` char(1) DEFAULT NULL COMMENT 'Whether to participate in shift scheduling',
   `DeptID` int(11) NOT NULL COMMENT 'Department ID',
   `RegistLeID` int(11) DEFAULT NULL COMMENT 'Registration level ID',
   `DelMark` int(11) NOT NULL DEFAULT '1' COMMENT 'Delete mark',
   PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

LOCK TABLES `user` WRITE;

INSERT INTO `user` VALUES (1,'bianque','123456','bianque',3,81,'yes',1,1,1),(2,'fwb','fwb123','fan No disease',3,83,'Yes',1,2,1),(3,'hqb','hqb123','Huo Qubing',3,83,'Yes',1,2,1),( 4,'huatuo','huatuo123','Huatuo',3,81,'yes',2,1,1),(5,'xll','xll123','Xilaile',3,83, 'Yes',2,2,1),(6,'adq','adq123','安道全',3,83,'Yes',2,2,1),(8,'dd',' iop888','alone',1,84,'no',9,2,1),(9,'root','root','ROOT',0,81,'no',1,1,1 ),(10,'ghy','123456','registered toll collector',2,81,'no',1,1,1),(11,'admin','123456','hospital administrator' ,1,81,'No',1,1,1),(12,'fifth','123456','Pharmacy Operator',5,81,'No',1,1,1),(13 ,'fourth','123456','Medical Technical Doctor',4,81,'No',1,1,1),(14,'sixth','123456','Financial Administrator',6,81 ,'No',1,1,1),(15,'third','123456','Outpatient doctor',3,81,'No',1,1,1);

UNLOCK TABLES;