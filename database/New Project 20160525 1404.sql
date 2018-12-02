-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.51b-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema test
--

CREATE DATABASE IF NOT EXISTS test;
USE test;

--
-- Definition of table `cinema`
--

DROP TABLE IF EXISTS `cinema`;
CREATE TABLE `cinema` (
  `film_name` varchar(45) NOT NULL,
  `view_date` varchar(45) NOT NULL,
  `path` varchar(100) default NULL,
  `price` varchar(45) NOT NULL,
  PRIMARY KEY  (`film_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cinema`
--

/*!40000 ALTER TABLE `cinema` DISABLE KEYS */;
INSERT INTO `cinema` (`film_name`,`view_date`,`path`,`price`) VALUES 
 ('Evil_Dead_2013','20-6-2016','images\\Evil_Dead_2013.jpg','20 LE'),
 ('Kung Fu Jungle 2014','20-6-2016','images\\RuXWYQ9.jpg','25 LE'),
 ('Revelation Road 2 2013','25-6-2016','images\\Revelation Road 2 2013.jpg','50 LE'),
 ('Robot Evolution 2015','24-6-2016','images\\mm.jpg','45 LE');
/*!40000 ALTER TABLE `cinema` ENABLE KEYS */;


--
-- Definition of table `contact`
--

DROP TABLE IF EXISTS `contact`;
CREATE TABLE `contact` (
  `id` int(11) NOT NULL auto_increment,
  `date` varchar(50) default NULL,
  `mail` varchar(30) default NULL,
  `message` varchar(200) default NULL,
  `name` varchar(30) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `contact`
--

/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
INSERT INTO `contact` (`id`,`date`,`mail`,`message`,`name`) VALUES 
 (1,' 2016/05/14','salem@yahoo','confirm password changed','salem');
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;


--
-- Definition of table `emp`
--

DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `password` varchar(45) NOT NULL,
  `user` varchar(45) NOT NULL,
  PRIMARY KEY  (`password`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `emp`
--

/*!40000 ALTER TABLE `emp` DISABLE KEYS */;
INSERT INTO `emp` (`password`,`user`) VALUES 
 ('000','ahmed'),
 ('111','meky'),
 ('222','essam'),
 ('333','mohamed');
/*!40000 ALTER TABLE `emp` ENABLE KEYS */;


--
-- Definition of table `film_tourism`
--

DROP TABLE IF EXISTS `film_tourism`;
CREATE TABLE `film_tourism` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `tourism_email` varchar(45) NOT NULL,
  `film_name` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_film_tourism_1` (`film_name`),
  CONSTRAINT `FK_film_tourism_1` FOREIGN KEY (`film_name`) REFERENCES `cinema` (`film_name`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `film_tourism`
--

/*!40000 ALTER TABLE `film_tourism` DISABLE KEYS */;
INSERT INTO `film_tourism` (`id`,`tourism_email`,`film_name`) VALUES 
 (2,'ghonem@yahoo.com','Robot Evolution 2015'),
 (8,'ghonem@yahoo.com','Robot Evolution 2015'),
 (12,'alaaelfiky@yahoo.com','Robot Evolution 2015');
/*!40000 ALTER TABLE `film_tourism` ENABLE KEYS */;


--
-- Definition of table `service`
--

DROP TABLE IF EXISTS `service`;
CREATE TABLE `service` (
  `id` int(11) NOT NULL,
  `address` varchar(30) default NULL,
  `cinema` varchar(30) default NULL,
  `mail` varchar(30) default NULL,
  `name` varchar(30) default NULL,
  `phone` varchar(30) default NULL,
  `trip` varchar(30) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `service`
--

/*!40000 ALTER TABLE `service` DISABLE KEYS */;
/*!40000 ALTER TABLE `service` ENABLE KEYS */;


--
-- Definition of table `tourism`
--

DROP TABLE IF EXISTS `tourism`;
CREATE TABLE `tourism` (
  `e_mail` varchar(30) NOT NULL,
  `address` varchar(30) default NULL,
  `user_name` varchar(20) default NULL,
  `nationality` varchar(30) default NULL,
  `password` varchar(255) NOT NULL,
  `phone` varchar(13) default NULL,
  PRIMARY KEY  (`e_mail`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tourism`
--

/*!40000 ALTER TABLE `tourism` DISABLE KEYS */;
INSERT INTO `tourism` (`e_mail`,`address`,`user_name`,`nationality`,`password`,`phone`) VALUES 
 ('aaaaa@yahoo.com','ed','aaaaa','egy','3333','010202656691'),
 ('ahmed@yahoo.com','kafr al zayat','reda','egy','66666','01234567898'),
 ('alaaa@yahoo.com','santa','alaa','sgy','00000','01229439419'),
 ('alaaelfiky@yahoo.com','kafr al zayat','Ø¹Ù?Ø§Ø¡','egy','111','01229439419'),
 ('elfiky@gmail.com','kafr al zayat','jhklk','sgy','45566565','01229439419'),
 ('essam@yahoo.com','santa','salem','egy','4444','01028256361'),
 ('ghonem@yahoo.com','tanta','mohamed ghonem','masry','0123','01001682882'),
 ('redameky22@yahoo.com','kafr al zayat','meky','egy','333','01028256361'),
 ('resoo@yahoo.com','kafr al zayat','djdd','mnbkj','7777','01229439419'),
 ('resoreso322@yahoo.com','kafr elzayat','meky','mnbkj','465211','01234567898'),
 ('samir@yahoo.com','kom hamada','samir','egy','666','01023652896');
/*!40000 ALTER TABLE `tourism` ENABLE KEYS */;


--
-- Definition of table `trip_tourism`
--

DROP TABLE IF EXISTS `trip_tourism`;
CREATE TABLE `trip_tourism` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `tourism_email` varchar(45) NOT NULL,
  `trip_name` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_trip_tourism_1` (`tourism_email`),
  KEY `FK_trip_tourism_2` (`trip_name`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `trip_tourism`
--

/*!40000 ALTER TABLE `trip_tourism` DISABLE KEYS */;
INSERT INTO `trip_tourism` (`id`,`tourism_email`,`trip_name`) VALUES 
 (12,'ghonem@yahoo.com','aswan'),
 (14,'ghonem@yahoo.com','Alexandria'),
 (17,'alaaelfiky@yahoo.com','aswan'),
 (18,'ghonem@yahoo.com','Alexandria'),
 (19,'ghonem@yahoo.com','Balteem');
/*!40000 ALTER TABLE `trip_tourism` ENABLE KEYS */;


--
-- Definition of table `trips`
--

DROP TABLE IF EXISTS `trips`;
CREATE TABLE `trips` (
  `trip_name` varchar(45) NOT NULL,
  `trip_date` varchar(45) NOT NULL,
  `trip_path` varchar(45) NOT NULL,
  `limit_num` int(11) default NULL,
  `finish_date` varchar(45) NOT NULL,
  `about` varchar(200) NOT NULL,
  PRIMARY KEY  (`trip_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `trips`
--

/*!40000 ALTER TABLE `trips` DISABLE KEYS */;
INSERT INTO `trips` (`trip_name`,`trip_date`,`trip_path`,`limit_num`,`finish_date`,`about`) VALUES 
 ('aswan','4-7-2016','images/AswanEgypt.jpg',20,'7-7-2016',''),
 ('Balteem','30-6-2016','images/baltem.jpg',45,'3-7-2016',''),
 ('huergada','20-7-2016','images/hergada.jpg',25,'25-7-2016',''),
 ('marina','20-7-2016','images/marina.jpg',35,'27-7-2016',''),
 ('Matrooh','22-5-2016','images/mat.jpg',40,'25-5-2016',''),
 ('Sharm_Elshik','23-5-2016','images/sharm.jpg',30,'30-5-2016','');
/*!40000 ALTER TABLE `trips` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
