CREATE DATABASE  IF NOT EXISTS `hotelito` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `hotelito`;
-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: hotelito
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cliente` (
  `id_cli` int(11) NOT NULL AUTO_INCREMENT,
  `cedula_cli` varchar(16) DEFAULT NULL,
  `prinombre_cli` varchar(50) NOT NULL,
  `segnombre_cli` varchar(50) DEFAULT NULL,
  `priapellido_cli` varchar(50) NOT NULL,
  `segapellido_cli` varchar(50) DEFAULT NULL,
  `edad_cli` int(11) NOT NULL,
  `telefono_cli` varchar(15) DEFAULT NULL,
  `email_cli` varchar(80) DEFAULT NULL,
  `titulo_cli` varchar(20) DEFAULT NULL,
  `tipo_cli` varchar(30) DEFAULT NULL,
  `estado_cli` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id_cli`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'001-200699-1235A','Pedro','','Lopez','',21,'84562147','pedritoL@gmail.com','Ingeniero','Huesped','activo');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `danos`
--

DROP TABLE IF EXISTS `danos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `danos` (
  `num_fact` char(10) NOT NULL,
  `id_mue` int(11) NOT NULL,
  `subtotal` float DEFAULT NULL,
  PRIMARY KEY (`num_fact`,`id_mue`),
  KEY `id_mue` (`id_mue`),
  CONSTRAINT `danos_ibfk_1` FOREIGN KEY (`num_fact`) REFERENCES `factura` (`num_fact`),
  CONSTRAINT `danos_ibfk_2` FOREIGN KEY (`id_mue`) REFERENCES `mueble` (`id_mue`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `danos`
--

LOCK TABLES `danos` WRITE;
/*!40000 ALTER TABLE `danos` DISABLE KEYS */;
/*!40000 ALTER TABLE `danos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `empleado` (
  `id_emp` int(11) NOT NULL AUTO_INCREMENT,
  `cedula_em` varchar(16) NOT NULL,
  `prinombre_emp` varchar(50) NOT NULL,
  `segnombre_emp` varchar(50) DEFAULT NULL,
  `priapellido_emp` varchar(50) NOT NULL,
  `segapellido_emp` varchar(50) DEFAULT NULL,
  `foto_emp` varchar(100) NOT NULL,
  `nacimiento_emp` date NOT NULL,
  `telefono_emp` varchar(15) NOT NULL,
  `email_emp` varchar(80) NOT NULL,
  `cargo_emp` varchar(50) NOT NULL,
  `sueldo_emp` float DEFAULT NULL,
  `estado_emp` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id_emp`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` VALUES (1,'001-110599-1003B','Samuel','Mohasir','Barberena','Fuentes','null','1999-05-11','86459488','samuelbarberena12@gmail.com','Gerente',200000,'activo');
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evento`
--

DROP TABLE IF EXISTS `evento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `evento` (
  `id_even` int(11) NOT NULL AUTO_INCREMENT,
  `id_cli` int(11) NOT NULL,
  `id_salon` int(11) NOT NULL,
  `fecha_even` date NOT NULL,
  `cantidad_personas` int(11) DEFAULT NULL,
  `hora_inicio` time DEFAULT NULL,
  `hora_fin` time DEFAULT NULL,
  `estado_even` varchar(20) DEFAULT NULL,
  `costo_servicios` float DEFAULT NULL,
  `subtotal` float DEFAULT NULL,
  `total` float DEFAULT NULL,
  PRIMARY KEY (`id_even`),
  KEY `id_cli` (`id_cli`),
  KEY `id_salon` (`id_salon`),
  CONSTRAINT `evento_ibfk_1` FOREIGN KEY (`id_cli`) REFERENCES `cliente` (`id_cli`),
  CONSTRAINT `evento_ibfk_2` FOREIGN KEY (`id_salon`) REFERENCES `salon` (`id_salon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evento`
--

LOCK TABLES `evento` WRITE;
/*!40000 ALTER TABLE `evento` DISABLE KEYS */;
/*!40000 ALTER TABLE `evento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evento_servicios`
--

DROP TABLE IF EXISTS `evento_servicios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `evento_servicios` (
  `id_even` int(11) NOT NULL,
  `id_ser` int(11) NOT NULL,
  `subtotal` float DEFAULT NULL,
  PRIMARY KEY (`id_even`,`id_ser`),
  KEY `id_ser` (`id_ser`),
  CONSTRAINT `evento_servicios_ibfk_1` FOREIGN KEY (`id_even`) REFERENCES `evento` (`id_even`),
  CONSTRAINT `evento_servicios_ibfk_2` FOREIGN KEY (`id_ser`) REFERENCES `servicio` (`id_ser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evento_servicios`
--

LOCK TABLES `evento_servicios` WRITE;
/*!40000 ALTER TABLE `evento_servicios` DISABLE KEYS */;
/*!40000 ALTER TABLE `evento_servicios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `factura` (
  `num_fact` char(10) NOT NULL,
  `id_cli` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `forma_pago` varchar(20) DEFAULT NULL,
  `costo_servicios` float DEFAULT NULL,
  `costo_danos` float DEFAULT NULL,
  `subtototal` float DEFAULT NULL,
  `total_fact` float DEFAULT NULL,
  PRIMARY KEY (`num_fact`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `habitacion`
--

DROP TABLE IF EXISTS `habitacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `habitacion` (
  `id_hab` int(11) NOT NULL AUTO_INCREMENT,
  `numero_hab` char(3) NOT NULL,
  `tipo_hab` varchar(20) NOT NULL,
  `descripcion_hab` varchar(50) DEFAULT NULL,
  `capacidad_hab` int(11) DEFAULT NULL,
  `precio_hab` float DEFAULT NULL,
  `estado_hab` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id_hab`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habitacion`
--

LOCK TABLES `habitacion` WRITE;
/*!40000 ALTER TABLE `habitacion` DISABLE KEYS */;
INSERT INTO `habitacion` VALUES (1,'001','Doble','Habitacion con desayuno incluido',2,30,'disponible');
/*!40000 ALTER TABLE `habitacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `insumo`
--

DROP TABLE IF EXISTS `insumo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `insumo` (
  `id_insumo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_insumo` varchar(50) NOT NULL,
  `descripcion` varchar(80) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `fecha_pedido` date NOT NULL,
  `fecha_a_pedir` date NOT NULL,
  `cantidad_a_pedir` date NOT NULL,
  PRIMARY KEY (`id_insumo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `insumo`
--

LOCK TABLES `insumo` WRITE;
/*!40000 ALTER TABLE `insumo` DISABLE KEYS */;
/*!40000 ALTER TABLE `insumo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mueble`
--

DROP TABLE IF EXISTS `mueble`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mueble` (
  `id_mue` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_mue` varchar(50) DEFAULT NULL,
  `descripcion_mue` varchar(80) DEFAULT NULL,
  `precio_mue` float NOT NULL,
  `id_hab` int(11) NOT NULL,
  PRIMARY KEY (`id_mue`),
  KEY `id_hab` (`id_hab`),
  CONSTRAINT `mueble_ibfk_1` FOREIGN KEY (`id_hab`) REFERENCES `habitacion` (`id_hab`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mueble`
--

LOCK TABLES `mueble` WRITE;
/*!40000 ALTER TABLE `mueble` DISABLE KEYS */;
INSERT INTO `mueble` VALUES (1,'Sofa S0012','Sofa color rojo',1500,1);
/*!40000 ALTER TABLE `mueble` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pago_evento`
--

DROP TABLE IF EXISTS `pago_evento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `pago_evento` (
  `id_pago` int(11) NOT NULL AUTO_INCREMENT,
  `id_even` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `forma_pago` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_pago`),
  KEY `id_even` (`id_even`),
  CONSTRAINT `pago_evento_ibfk_1` FOREIGN KEY (`id_even`) REFERENCES `evento` (`id_even`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pago_evento`
--

LOCK TABLES `pago_evento` WRITE;
/*!40000 ALTER TABLE `pago_evento` DISABLE KEYS */;
/*!40000 ALTER TABLE `pago_evento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pago_reservacion`
--

DROP TABLE IF EXISTS `pago_reservacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `pago_reservacion` (
  `id_pago` int(11) NOT NULL AUTO_INCREMENT,
  `id_res` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `forma_pago` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_pago`),
  KEY `id_res` (`id_res`),
  CONSTRAINT `pago_reservacion_ibfk_1` FOREIGN KEY (`id_res`) REFERENCES `reservacion` (`id_res`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pago_reservacion`
--

LOCK TABLES `pago_reservacion` WRITE;
/*!40000 ALTER TABLE `pago_reservacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `pago_reservacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `proveedor` (
  `id_pro` int(11) NOT NULL AUTO_INCREMENT,
  `ruc_pro` varchar(16) NOT NULL,
  `nombre_pro` varchar(50) NOT NULL,
  `direccion_pro` varchar(100) DEFAULT NULL,
  `telefono_emp` varchar(15) DEFAULT NULL,
  `email_emp` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`id_pro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservacion`
--

DROP TABLE IF EXISTS `reservacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `reservacion` (
  `id_res` int(11) NOT NULL AUTO_INCREMENT,
  `id_cli` int(11) NOT NULL,
  `fecha_entrada` date NOT NULL,
  `fecha_salida` date NOT NULL,
  `cantidad_hab` int(11) DEFAULT NULL,
  `cantidad_personas` int(11) DEFAULT NULL,
  `estado` varchar(20) DEFAULT NULL,
  `total_res` float DEFAULT NULL,
  PRIMARY KEY (`id_res`),
  KEY `id_cli` (`id_cli`),
  CONSTRAINT `reservacion_ibfk_1` FOREIGN KEY (`id_cli`) REFERENCES `cliente` (`id_cli`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservacion`
--

LOCK TABLES `reservacion` WRITE;
/*!40000 ALTER TABLE `reservacion` DISABLE KEYS */;
INSERT INTO `reservacion` VALUES (1,1,'2019-08-11','2019-08-13',0,0,'',0);
/*!40000 ALTER TABLE `reservacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservacion_habitaciones`
--

DROP TABLE IF EXISTS `reservacion_habitaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `reservacion_habitaciones` (
  `id_res` int(11) NOT NULL,
  `id_hab` int(11) NOT NULL,
  `subtotal` float DEFAULT NULL,
  PRIMARY KEY (`id_res`,`id_hab`),
  KEY `id_hab` (`id_hab`),
  CONSTRAINT `reservacion_habitaciones_ibfk_1` FOREIGN KEY (`id_res`) REFERENCES `reservacion` (`id_res`),
  CONSTRAINT `reservacion_habitaciones_ibfk_2` FOREIGN KEY (`id_hab`) REFERENCES `habitacion` (`id_hab`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservacion_habitaciones`
--

LOCK TABLES `reservacion_habitaciones` WRITE;
/*!40000 ALTER TABLE `reservacion_habitaciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservacion_habitaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservacion_huesped`
--

DROP TABLE IF EXISTS `reservacion_huesped`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `reservacion_huesped` (
  `id_res` int(11) NOT NULL,
  `id_cli` int(11) NOT NULL,
  PRIMARY KEY (`id_res`,`id_cli`),
  KEY `id_cli` (`id_cli`),
  CONSTRAINT `reservacion_huesped_ibfk_1` FOREIGN KEY (`id_cli`) REFERENCES `cliente` (`id_cli`),
  CONSTRAINT `reservacion_huesped_ibfk_2` FOREIGN KEY (`id_res`) REFERENCES `reservacion` (`id_res`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservacion_huesped`
--

LOCK TABLES `reservacion_huesped` WRITE;
/*!40000 ALTER TABLE `reservacion_huesped` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservacion_huesped` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salon`
--

DROP TABLE IF EXISTS `salon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `salon` (
  `id_salon` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_salon` varchar(50) DEFAULT NULL,
  `costo` float DEFAULT NULL,
  `capacidad` int(11) DEFAULT NULL,
  `descripcion_salon` varchar(100) DEFAULT NULL,
  `estado_salon` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id_salon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salon`
--

LOCK TABLES `salon` WRITE;
/*!40000 ALTER TABLE `salon` DISABLE KEYS */;
/*!40000 ALTER TABLE `salon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicio`
--

DROP TABLE IF EXISTS `servicio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `servicio` (
  `id_ser` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_ser` varchar(20) NOT NULL,
  `tipo_ser` varchar(20) DEFAULT NULL,
  `descripcion_ser` varchar(80) DEFAULT NULL,
  `precio_ser` float DEFAULT NULL,
  `estado_ser` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id_ser`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicio`
--

LOCK TABLES `servicio` WRITE;
/*!40000 ALTER TABLE `servicio` DISABLE KEYS */;
INSERT INTO `servicio` VALUES (1,'Almuerzo','Serv. Habitacion','Almuerzo incluye bebida',120,'disponible');
/*!40000 ALTER TABLE `servicio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicios_contratados`
--

DROP TABLE IF EXISTS `servicios_contratados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `servicios_contratados` (
  `num_fact` char(10) NOT NULL,
  `id_ser` int(11) NOT NULL,
  `id_hab` int(11) NOT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `subtotal` float DEFAULT NULL,
  PRIMARY KEY (`num_fact`,`id_ser`),
  KEY `id_ser` (`id_ser`),
  KEY `id_hab` (`id_hab`),
  CONSTRAINT `servicios_contratados_ibfk_1` FOREIGN KEY (`num_fact`) REFERENCES `factura` (`num_fact`),
  CONSTRAINT `servicios_contratados_ibfk_2` FOREIGN KEY (`id_ser`) REFERENCES `servicio` (`id_ser`),
  CONSTRAINT `servicios_contratados_ibfk_3` FOREIGN KEY (`id_hab`) REFERENCES `habitacion` (`id_hab`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicios_contratados`
--

LOCK TABLES `servicios_contratados` WRITE;
/*!40000 ALTER TABLE `servicios_contratados` DISABLE KEYS */;
/*!40000 ALTER TABLE `servicios_contratados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `usuario` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `id_emp` int(11) NOT NULL,
  `username_user` varchar(50) NOT NULL,
  `password_user` varchar(15) NOT NULL,
  `estado_user` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id_user`),
  KEY `id_emp` (`id_emp`),
  CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`id_emp`) REFERENCES `empleado` (`id_emp`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,1,'sbarberena','H_sb2019','activo');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-11 11:23:41
