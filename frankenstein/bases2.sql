-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.7.24 - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.5.0.5332
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para proyectobases
CREATE DATABASE IF NOT EXISTS `proyectobases` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `proyectobases`;

-- Volcando estructura para tabla proyectobases.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `id_cliente` int(11) NOT NULL AUTO_INCREMENT,
  `primer_nombre` varchar(50) NOT NULL,
  `segundo_nombre` varchar(50) DEFAULT NULL,
  `primer_apellido` varchar(50) NOT NULL,
  `segundo_apellido` varchar(50) DEFAULT NULL,
  `edad` int(11) NOT NULL,
  `metodo_pago` varchar(50) NOT NULL,
  `numero_cedula` char(16) DEFAULT NULL,
  `titulo` varchar(50) DEFAULT NULL,
  `id_invitado` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`),
  KEY `id_invitado` (`id_invitado`),
  CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`id_invitado`) REFERENCES `invitado` (`id_invitado`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla proyectobases.cliente: ~0 rows (aproximadamente)
DELETE FROM `cliente`;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;

-- Volcando estructura para tabla proyectobases.comida
CREATE TABLE IF NOT EXISTS `comida` (
  `id_comida` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(50) NOT NULL,
  `descripcion` varchar(300) NOT NULL,
  `precio` float NOT NULL,
  PRIMARY KEY (`id_comida`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla proyectobases.comida: ~0 rows (aproximadamente)
DELETE FROM `comida`;
/*!40000 ALTER TABLE `comida` DISABLE KEYS */;
/*!40000 ALTER TABLE `comida` ENABLE KEYS */;

-- Volcando estructura para tabla proyectobases.cuarto
CREATE TABLE IF NOT EXISTS `cuarto` (
  `id_cuarto` char(3) NOT NULL,
  `estado` varchar(20) NOT NULL,
  `tipo_de_cuarto` varchar(20) NOT NULL,
  `precio_base` float NOT NULL,
  `descripcion` varchar(300) NOT NULL,
  PRIMARY KEY (`id_cuarto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla proyectobases.cuarto: ~0 rows (aproximadamente)
DELETE FROM `cuarto`;
/*!40000 ALTER TABLE `cuarto` DISABLE KEYS */;
/*!40000 ALTER TABLE `cuarto` ENABLE KEYS */;

-- Volcando estructura para tabla proyectobases.danos
CREATE TABLE IF NOT EXISTS `danos` (
  `id_danos` int(11) NOT NULL AUTO_INCREMENT,
  `id_mueble` int(11) DEFAULT NULL,
  `precio_a_pagar` float DEFAULT NULL,
  PRIMARY KEY (`id_danos`),
  KEY `id_mueble` (`id_mueble`),
  CONSTRAINT `danos_ibfk_1` FOREIGN KEY (`id_mueble`) REFERENCES `mueble` (`id_mueble`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla proyectobases.danos: ~0 rows (aproximadamente)
DELETE FROM `danos`;
/*!40000 ALTER TABLE `danos` DISABLE KEYS */;
/*!40000 ALTER TABLE `danos` ENABLE KEYS */;

-- Volcando estructura para tabla proyectobases.factura
CREATE TABLE IF NOT EXISTS `factura` (
  `id_factura` int(11) NOT NULL AUTO_INCREMENT,
  `id_cuarto` char(3) NOT NULL,
  `id_servicios` char(3) NOT NULL,
  `id_danos` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `cantidad_a_pagar` float DEFAULT NULL,
  `iva` float DEFAULT NULL,
  `cantidad_total_a_pagar` float DEFAULT NULL,
  PRIMARY KEY (`id_factura`),
  KEY `id_cuarto` (`id_cuarto`),
  KEY `id_servicios` (`id_servicios`),
  KEY `id_danos` (`id_danos`),
  KEY `id_cliente` (`id_cliente`),
  CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`id_cuarto`) REFERENCES `cuarto` (`id_cuarto`),
  CONSTRAINT `factura_ibfk_2` FOREIGN KEY (`id_servicios`) REFERENCES `servicios` (`id_servicios`),
  CONSTRAINT `factura_ibfk_3` FOREIGN KEY (`id_danos`) REFERENCES `danos` (`id_danos`),
  CONSTRAINT `factura_ibfk_4` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla proyectobases.factura: ~0 rows (aproximadamente)
DELETE FROM `factura`;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;

-- Volcando estructura para tabla proyectobases.inventario_ingredientes
CREATE TABLE IF NOT EXISTS `inventario_ingredientes` (
  `id_comida` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(300) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `fecha_pedido` date NOT NULL,
  `fecha_a_pedir` date NOT NULL,
  `cantidad_a_pedir` date NOT NULL,
  PRIMARY KEY (`id_comida`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla proyectobases.inventario_ingredientes: ~0 rows (aproximadamente)
DELETE FROM `inventario_ingredientes`;
/*!40000 ALTER TABLE `inventario_ingredientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventario_ingredientes` ENABLE KEYS */;

-- Volcando estructura para tabla proyectobases.invitado
CREATE TABLE IF NOT EXISTS `invitado` (
  `id_invitado` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad` int(11) DEFAULT NULL,
  `descripcion` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id_invitado`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla proyectobases.invitado: ~0 rows (aproximadamente)
DELETE FROM `invitado`;
/*!40000 ALTER TABLE `invitado` DISABLE KEYS */;
/*!40000 ALTER TABLE `invitado` ENABLE KEYS */;

-- Volcando estructura para tabla proyectobases.limpieza
CREATE TABLE IF NOT EXISTS `limpieza` (
  `id_limpieza` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(300) NOT NULL,
  `precio` float NOT NULL,
  PRIMARY KEY (`id_limpieza`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla proyectobases.limpieza: ~0 rows (aproximadamente)
DELETE FROM `limpieza`;
/*!40000 ALTER TABLE `limpieza` DISABLE KEYS */;
/*!40000 ALTER TABLE `limpieza` ENABLE KEYS */;

-- Volcando estructura para tabla proyectobases.masaje
CREATE TABLE IF NOT EXISTS `masaje` (
  `id_masaje` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(300) NOT NULL,
  `precio` float NOT NULL,
  PRIMARY KEY (`id_masaje`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla proyectobases.masaje: ~0 rows (aproximadamente)
DELETE FROM `masaje`;
/*!40000 ALTER TABLE `masaje` DISABLE KEYS */;
/*!40000 ALTER TABLE `masaje` ENABLE KEYS */;

-- Volcando estructura para tabla proyectobases.mueble
CREATE TABLE IF NOT EXISTS `mueble` (
  `id_mueble` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `precio` float NOT NULL,
  `estado_entrada` varchar(30) DEFAULT NULL,
  `estado_salida` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_mueble`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla proyectobases.mueble: ~0 rows (aproximadamente)
DELETE FROM `mueble`;
/*!40000 ALTER TABLE `mueble` DISABLE KEYS */;
/*!40000 ALTER TABLE `mueble` ENABLE KEYS */;

-- Volcando estructura para tabla proyectobases.servicios
CREATE TABLE IF NOT EXISTS `servicios` (
  `id_servicios` char(3) NOT NULL,
  `precio_total` float DEFAULT NULL,
  `id_comida` int(11) DEFAULT NULL,
  `id_masaje` int(11) DEFAULT NULL,
  `id_limpieza` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_servicios`),
  KEY `id_limpieza` (`id_limpieza`),
  KEY `id_masaje` (`id_masaje`),
  KEY `id_comida` (`id_comida`),
  CONSTRAINT `servicios_ibfk_1` FOREIGN KEY (`id_limpieza`) REFERENCES `limpieza` (`id_limpieza`),
  CONSTRAINT `servicios_ibfk_2` FOREIGN KEY (`id_masaje`) REFERENCES `masaje` (`id_masaje`),
  CONSTRAINT `servicios_ibfk_3` FOREIGN KEY (`id_comida`) REFERENCES `comida` (`id_comida`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla proyectobases.servicios: ~0 rows (aproximadamente)
DELETE FROM `servicios`;
/*!40000 ALTER TABLE `servicios` DISABLE KEYS */;
/*!40000 ALTER TABLE `servicios` ENABLE KEYS */;

-- Volcando estructura para tabla proyectobases.trabajadores
CREATE TABLE IF NOT EXISTS `trabajadores` (
  `id_trabajador` char(3) NOT NULL,
  `primer_nombre` varchar(50) NOT NULL,
  `segundo_nombre` varchar(50) DEFAULT NULL,
  `primer_apellido` varchar(50) NOT NULL,
  `segundo_apellido` varchar(50) DEFAULT NULL,
  `cumpleaños` date NOT NULL,
  `cargo` varchar(50) NOT NULL,
  `pago` float NOT NULL,
  `foto` varchar(100) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `cuenta_banco` char(15) DEFAULT NULL,
  PRIMARY KEY (`id_trabajador`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla proyectobases.trabajadores: ~0 rows (aproximadamente)
DELETE FROM `trabajadores`;
/*!40000 ALTER TABLE `trabajadores` DISABLE KEYS */;
/*!40000 ALTER TABLE `trabajadores` ENABLE KEYS */;

-- Volcando estructura para tabla proyectobases.usuarios
CREATE TABLE IF NOT EXISTS `usuarios` (
  `id_usuario` char(3) NOT NULL,
  `id_trabajador` char(3) DEFAULT NULL,
  `contraseña` varchar(50) DEFAULT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`),
  KEY `id_trabajador` (`id_trabajador`),
  CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`id_trabajador`) REFERENCES `trabajadores` (`id_trabajador`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla proyectobases.usuarios: ~0 rows (aproximadamente)
DELETE FROM `usuarios`;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
