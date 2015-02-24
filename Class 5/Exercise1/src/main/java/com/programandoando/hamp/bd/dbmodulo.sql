-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.32


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema modulo
--

CREATE DATABASE IF NOT EXISTS dbmodulo;
USE dbmodulo;

--
-- Definition of table `asignado`
--

DROP TABLE IF EXISTS `asignado`;
CREATE TABLE `asignado` (
  `chr_asigcodigo` char(6) NOT NULL,
  `chr_sucucodigo` char(3) NOT NULL,
  `chr_emplcodigo` char(4) NOT NULL,
  `dtt_asigfechaalta` date NOT NULL,
  `dtt_asigfechabaja` date DEFAULT NULL,
  PRIMARY KEY (`chr_asigcodigo`),
  KEY `idx_asignado01` (`chr_emplcodigo`),
  KEY `idx_asignado02` (`chr_sucucodigo`),
  CONSTRAINT `fk_asignado_empleado` FOREIGN KEY (`chr_emplcodigo`) REFERENCES `empleado` (`chr_emplcodigo`),
  CONSTRAINT `fk_asignado_sucursal` FOREIGN KEY (`chr_sucucodigo`) REFERENCES `sucursal` (`chr_sucucodigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `asignado`
--

/*!40000 ALTER TABLE `asignado` DISABLE KEYS */;
INSERT INTO `asignado` (`chr_asigcodigo`,`chr_sucucodigo`,`chr_emplcodigo`,`dtt_asigfechaalta`,`dtt_asigfechabaja`) VALUES 
 ('000001','001','0004','2007-11-15',NULL),
 ('000002','002','0001','2007-11-20',NULL),
 ('000003','003','0002','2007-11-28',NULL),
 ('000005','005','0006','2007-12-20',NULL),
 ('000006','006','0005','2008-01-05',NULL),
 ('000007','004','0007','2008-01-07',NULL),
 ('000008','005','0008','2008-01-07',NULL),
 ('000009','001','0011','2008-01-08',NULL),
 ('000010','002','0009','2008-01-08',NULL),
 ('000011','006','0010','2008-01-08',NULL);
/*!40000 ALTER TABLE `asignado` ENABLE KEYS */;


--
-- Definition of table `cargomantenimiento`
--

DROP TABLE IF EXISTS `cargomantenimiento`;
CREATE TABLE `cargomantenimiento` (
  `chr_monecodigo` char(2) NOT NULL,
  `dec_cargMontoMaximo` decimal(12,2) NOT NULL,
  `dec_cargImporte` decimal(12,2) NOT NULL,
  PRIMARY KEY (`chr_monecodigo`),
  KEY `idx_cargomantenimiento01` (`chr_monecodigo`),
  CONSTRAINT `fk_cargomantenimiento_moneda` FOREIGN KEY (`chr_monecodigo`) REFERENCES `moneda` (`chr_monecodigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cargomantenimiento`
--

/*!40000 ALTER TABLE `cargomantenimiento` DISABLE KEYS */;
INSERT INTO `cargomantenimiento` (`chr_monecodigo`,`dec_cargMontoMaximo`,`dec_cargImporte`) VALUES 
 ('01','3500.00','7.00'),
 ('02','1200.00','2.50');
/*!40000 ALTER TABLE `cargomantenimiento` ENABLE KEYS */;


--
-- Definition of table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE `cliente` (
  `chr_cliecodigo` char(5) NOT NULL,
  `vch_cliepaterno` varchar(25) NOT NULL,
  `vch_cliematerno` varchar(25) NOT NULL,
  `vch_clienombre` varchar(30) NOT NULL,
  `chr_cliedni` char(8) NOT NULL,
  `vch_clieciudad` varchar(30) NOT NULL,
  `vch_cliedireccion` varchar(50) NOT NULL,
  `vch_clietelefono` varchar(20) DEFAULT NULL,
  `vch_clieemail` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`chr_cliecodigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cliente`
--

/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` (`chr_cliecodigo`,`vch_cliepaterno`,`vch_cliematerno`,`vch_clienombre`,`chr_cliedni`,`vch_clieciudad`,`vch_cliedireccion`,`vch_clietelefono`,`vch_clieemail`) VALUES 
 ('00001','CORONEL','CASTILLO','ERIC GUSTAVO','06914897','LIMA','LOS OLIVOS','9666-4457','gcoronel@viabcp.com'),
 ('00002','VALENCIA','MORALES','PEDRO HUGO','01576173','LIMA','MAGDALENA','924-7834','pvalencia@terra.com.pe'),
 ('00003','MARCELO','VILLALOBOS','RICARDO','10762367','LIMA','LINCE','993-62966','ricardomarcelo@hotmail.com'),
 ('00004','ROMERO','CASTILLO','CARLOS ALBERTO','06531983','LIMA','LOS OLIVOS','865-84762','c.romero@hotmail.com'),
 ('00005','ARANDA','LUNA','ALAN ALBERTO','10875611','LIMA','SAN ISIDRO','834-67125','a.aranda@hotmail.com'),
 ('00006','AYALA','PAZ','JORGE LUIS','10679245','LIMA','SAN BORJA','963-34769','j.ayala@yahoo.com'),
 ('00007','CHAVEZ','CANALES','EDGAR RAFAEL','10145693','LIMA','MIRAFLORES','999-96673','e.chavez@gmail.com'),
 ('00008','FLORES','CHAFLOQUE','ROSA LIZET','10773456','LIMA','LA MOLINA','966-87567','r.florez@hotmail.com'),
 ('00009','FLORES','CASTILLO','CRISTIAN RAFAEL','10346723','LIMA','LOS OLIVOS','978-43768','c.flores@hotmail.com'),
 ('00010','GONZALES','GARCIA','GABRIEL ALEJANDRO','10192376','LIMA','SAN MIGUEL','945-56782','g.gonzales@yahoo.es'),
 ('00011','LAY','VALLEJOS','JUAN CARLOS','10942287','LIMA','LINCE','956-12657','j.lay@peru.com'),
 ('00012','MONTALVO','SOTO','DEYSI LIDIA','10612376','LIMA','SURCO','965-67235','d.montalvo@hotmail.com'),
 ('00013','RICALDE','RAMIREZ','ROSARIO ESMERALDA','10761324','LIMA','MIRAFLORES','991-23546','r.ricalde@gmail.com'),
 ('00014','RODRIGUEZ','FLORES','ENRIQUE MANUEL','10773345','LIMA','LINCE','976-82838','e.rodriguez@gmail.com'),
 ('00015','ROJAS','OSCANOA','FELIX NINO','10238943','LIMA','LIMA','962-32158','f.rojas@yahoo.com'),
 ('00016','TEJADA','DEL AGUILA','TANIA LORENA','10446791','LIMA','PUEBLO LIBRE','966-23854','t.tejada@hotmail.com'),
 ('00017','VALDEVIESO','LEYVA','LIDIA ROXANA','10452682','LIMA','SURCO','956-78951','r.valdivieso@terra.com.pe'),
 ('00018','VALENTIN','COTRINA','JUAN DIEGO','10398247','LIMA','LA MOLINA','921-12456','j.valentin@terra.com.pe'),
 ('00019','YAURICASA','BAUTISTA','YESABETH','10934584','LIMA','MAGDALENA','977-75777','y.yauricasa@terra.com.pe'),
 ('00020','ZEGARRA','GARCIA','FERNANDO MOISES','10772365','LIMA','SAN ISIDRO','936-45876','f.zegarra@hotmail.com');
 
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;


--
-- Definition of table `contador`
--

DROP TABLE IF EXISTS `contador`;
CREATE TABLE `contador` (
  `vch_conttabla` varchar(30) NOT NULL,
  `int_contitem` int(11) NOT NULL,
  `int_contlongitud` int(11) NOT NULL,
  PRIMARY KEY (`vch_conttabla`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `contador`
--

/*!40000 ALTER TABLE `contador` DISABLE KEYS */;
INSERT INTO `contador` (`vch_conttabla`,`int_contitem`,`int_contlongitud`) VALUES 
 ('Asignado',11,6),
 ('Cliente',22,5),
 ('Empleado',11,4),
 ('Moneda',3,2),
 ('Parametro',2,3),
 ('Sucursal',7,3),
 ('TipoMovimiento',10,3);
/*!40000 ALTER TABLE `contador` ENABLE KEYS */;


--
-- Definition of table `costomovimiento`
--

DROP TABLE IF EXISTS `costomovimiento`;
CREATE TABLE `costomovimiento` (
  `chr_monecodigo` char(2) NOT NULL,
  `dec_costimporte` decimal(12,2) NOT NULL,
  PRIMARY KEY (`chr_monecodigo`),
  KEY `idx_costomovimiento` (`chr_monecodigo`),
  CONSTRAINT `fk_costomovimiento_moneda` FOREIGN KEY (`chr_monecodigo`) REFERENCES `moneda` (`chr_monecodigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `costomovimiento`
--

/*!40000 ALTER TABLE `costomovimiento` DISABLE KEYS */;
INSERT INTO `costomovimiento` (`chr_monecodigo`,`dec_costimporte`) VALUES 
 ('01','2.00'),
 ('02','0.60');
/*!40000 ALTER TABLE `costomovimiento` ENABLE KEYS */;


--
-- Definition of table `cuenta`
--

DROP TABLE IF EXISTS `cuenta`;
CREATE TABLE `cuenta` (
  `chr_cuencodigo` char(8) NOT NULL,
  `chr_monecodigo` char(2) NOT NULL,
  `chr_sucucodigo` char(3) NOT NULL,
  `chr_emplcreacuenta` char(4) NOT NULL,
  `chr_cliecodigo` char(5) NOT NULL,
  `dec_cuensaldo` decimal(12,2) NOT NULL,
  `dtt_cuenfechacreacion` date NOT NULL,
  `vch_cuenestado` varchar(15) NOT NULL DEFAULT 'ACTIVO',
  `int_cuencontmov` int(11) NOT NULL,
  `chr_cuenclave` char(6) NOT NULL,
  PRIMARY KEY (`chr_cuencodigo`),
  KEY `idx_cuenta01` (`chr_cliecodigo`),
  KEY `idx_cuenta02` (`chr_emplcreacuenta`),
  KEY `idx_cuenta03` (`chr_sucucodigo`),
  KEY `idx_cuenta04` (`chr_monecodigo`),
  CONSTRAINT `fk_cuenta_cliente` FOREIGN KEY (`chr_cliecodigo`) REFERENCES `cliente` (`chr_cliecodigo`),
  CONSTRAINT `fk_cuenta_moneda` FOREIGN KEY (`chr_monecodigo`) REFERENCES `moneda` (`chr_monecodigo`),
  CONSTRAINT `fk_cuenta_sucursal` FOREIGN KEY (`chr_sucucodigo`) REFERENCES `sucursal` (`chr_sucucodigo`),
  CONSTRAINT `fk_cuente_empleado` FOREIGN KEY (`chr_emplcreacuenta`) REFERENCES `empleado` (`chr_emplcodigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cuenta`
--

/*!40000 ALTER TABLE `cuenta` DISABLE KEYS */;
INSERT INTO `cuenta` (`chr_cuencodigo`,`chr_monecodigo`,`chr_sucucodigo`,`chr_emplcreacuenta`,`chr_cliecodigo`,`dec_cuensaldo`,`dtt_cuenfechacreacion`,`vch_cuenestado`,`int_cuencontmov`,`chr_cuenclave`) VALUES 
 ('00100001','01','001','0004','00005','7398.00','2008-01-06','ACTIVO',13,'123456'),
 ('00100002','02','001','0004','00005','4500.00','2008-01-08','ACTIVO',4,'123456'),
 ('00200001','01','002','0001','00008','7000.00','2008-01-05','ACTIVO',15,'123456'),
 ('00200002','01','002','0001','00001','6800.00','2008-01-09','ACTIVO',3,'123456'),
 ('00200003','02','002','0001','00007','6000.00','2008-01-11','ACTIVO',6,'123456');
/*!40000 ALTER TABLE `cuenta` ENABLE KEYS */;


--
-- Definition of table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
CREATE TABLE `empleado` (
  `chr_emplcodigo` char(4) NOT NULL,
  `vch_emplpaterno` varchar(25) NOT NULL,
  `vch_emplmaterno` varchar(25) NOT NULL,
  `vch_emplnombre` varchar(30) NOT NULL,
  `vch_emplciudad` varchar(30) NOT NULL,
  `vch_empldireccion` varchar(50) DEFAULT NULL,
  `vch_emplusuario` varchar(15) NOT NULL,
  `vch_emplclave` varchar(15) NOT NULL,
  PRIMARY KEY (`chr_emplcodigo`),
  UNIQUE KEY `U_Empleado_vch_emplusuario` (`vch_emplusuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `empleado`
--

/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` (`chr_emplcodigo`,`vch_emplpaterno`,`vch_emplmaterno`,`vch_emplnombre`,`vch_emplciudad`,`vch_empldireccion`,`vch_emplusuario`,`vch_emplclave`) VALUES 
 ('0001','Romero','Castillo','Carlos Alberto','Trujillo','Call1 1 Nro. 456','cromero','chicho'),
 ('0002','Castro','Vargas','Lidia','Lima','Federico Villarreal 456 - SMP','lcastro','flaca'),
 ('0004','Ramos','Garibay','Angelica','Chiclayo','Calle Barcelona 345','aramos','china'),
 ('0005','Ruiz','Zabaleta','Claudia','Cusco','Calle Cruz Verde 364','cvalencia','angel'),
 ('0006','Cruz','Tarazona','Ricardo','Areguipa','Calle La Gruta 304','rcruz','cerebro'),
 ('0007','Diaz','Flores','Edith','Lima','Av. Pardo 546','ediaz','princesa'),
 ('0008','Sarmiento','Bellido','Claudia Rocio','Areguipa','Calle Alfonso Ugarte 1567','csarmiento','chinita'),
 ('0009','Pachas','Sifuentes','Luis Alberto','Trujillo','Francisco Pizarro 1263','lpachas','gato'),
 ('0010','Tello','Alarcon','Hugo Valentin','Cusco','Los Angeles 865','htello','machupichu'),
 ('0011','Carrasco','Vargas','Pedro Hugo','Chiclayo','Av. Balta 1265','pcarrasco','tinajones'),
 ('9999','Internet','Internet','internet','Internet','internet','internet','internet');
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;


--
-- Definition of table `interesmensual`
--

DROP TABLE IF EXISTS `interesmensual`;
CREATE TABLE `interesmensual` (
  `chr_monecodigo` char(2) NOT NULL,
  `dec_inteimporte` decimal(12,2) NOT NULL,
  PRIMARY KEY (`chr_monecodigo`),
  KEY `idx_interesmensual01` (`chr_monecodigo`),
  CONSTRAINT `fk_interesmensual_moneda` FOREIGN KEY (`chr_monecodigo`) REFERENCES `moneda` (`chr_monecodigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `interesmensual`
--

/*!40000 ALTER TABLE `interesmensual` DISABLE KEYS */;
INSERT INTO `interesmensual` (`chr_monecodigo`,`dec_inteimporte`) VALUES 
 ('01','0.70'),
 ('02','0.60');
/*!40000 ALTER TABLE `interesmensual` ENABLE KEYS */;


--
-- Definition of table `moneda`
--

DROP TABLE IF EXISTS `moneda`;
CREATE TABLE `moneda` (
  `chr_monecodigo` char(2) NOT NULL,
  `vch_monedescripcion` varchar(20) NOT NULL,
  PRIMARY KEY (`chr_monecodigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `moneda`
--

/*!40000 ALTER TABLE `moneda` DISABLE KEYS */;
INSERT INTO `moneda` (`chr_monecodigo`,`vch_monedescripcion`) VALUES 
 ('01','Soles'),
 ('02','Dolares');
/*!40000 ALTER TABLE `moneda` ENABLE KEYS */;


--
-- Definition of table `movimiento`
--

DROP TABLE IF EXISTS `movimiento`;
CREATE TABLE `movimiento` (
  `chr_cuencodigo` char(8) NOT NULL,
  `int_movinumero` int(11) NOT NULL,
  `dtt_movifecha` date NOT NULL,
  `chr_emplcodigo` char(4) NOT NULL,
  `chr_tipocodigo` char(3) NOT NULL,
  `dec_moviimporte` decimal(12,2) NOT NULL,
  `chr_cuenreferencia` char(8) DEFAULT NULL,
  PRIMARY KEY (`chr_cuencodigo`,`int_movinumero`),
  KEY `idx_movimiento01` (`chr_tipocodigo`),
  KEY `idx_movimiento02` (`chr_emplcodigo`),
  KEY `idx_movimiento03` (`chr_cuencodigo`),
  CONSTRAINT `fk_movimiento_cuenta` FOREIGN KEY (`chr_cuencodigo`) REFERENCES `cuenta` (`chr_cuencodigo`),
  CONSTRAINT `fk_movimiento_empleado` FOREIGN KEY (`chr_emplcodigo`) REFERENCES `empleado` (`chr_emplcodigo`),
  CONSTRAINT `fk_movimiento_tipomovimiento` FOREIGN KEY (`chr_tipocodigo`) REFERENCES `tipomovimiento` (`chr_tipocodigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `movimiento`
--

/*!40000 ALTER TABLE `movimiento` DISABLE KEYS */;
INSERT INTO `movimiento` (`chr_cuencodigo`,`int_movinumero`,`dtt_movifecha`,`chr_emplcodigo`,`chr_tipocodigo`,`dec_moviimporte`,`chr_cuenreferencia`) VALUES 
 ('00100001',1,'2008-01-06','0004','001','2800.00',NULL),
 ('00100001',2,'2008-01-15','0004','003','3200.00',NULL),
 ('00100001',3,'2008-01-20','0004','004','800.00',NULL),
 ('00100001',4,'2008-02-14','0004','003','2000.00',NULL),
 ('00100001',5,'2008-02-25','0004','004','500.00',NULL),
 ('00100001',6,'2008-03-03','0004','004','800.00',NULL),
 ('00100001',7,'2008-03-15','0004','003','1000.00',NULL),
 ('00100001',8,'2015-02-07','0001','003','100.00',NULL),
 ('00100001',9,'2015-02-07','0001','003','200.00',NULL),
 ('00100001',10,'2015-02-07','0001','003','100.00',NULL),
 ('00100001',11,'2015-02-07','0001','004','100.00',NULL),
 ('00100001',12,'2015-02-07','0001','010','2.00',NULL),
 ('00100001',13,'2015-02-07','0001','003','200.00',NULL),
 ('00100002',1,'2008-01-08','0004','001','1800.00',NULL),
 ('00100002',2,'2008-01-25','0004','004','1000.00',NULL),
 ('00100002',3,'2008-02-13','0004','003','2200.00',NULL),
 ('00100002',4,'2008-03-08','0004','003','1500.00',NULL),
 ('00200001',1,'2008-01-05','0001','001','5000.00',NULL),
 ('00200001',2,'2008-01-07','0001','003','4000.00',NULL),
 ('00200001',3,'2008-01-09','0001','004','2000.00',NULL),
 ('00200001',4,'2008-01-11','0001','003','1000.00',NULL),
 ('00200001',5,'2008-01-13','0001','003','2000.00',NULL),
 ('00200001',6,'2008-01-15','0001','004','4000.00',NULL),
 ('00200001',7,'2008-01-19','0001','003','2000.00',NULL),
 ('00200001',8,'2008-01-21','0001','004','3000.00',NULL),
 ('00200001',9,'2008-01-23','0001','003','7000.00',NULL),
 ('00200001',10,'2008-01-27','0001','004','1000.00',NULL),
 ('00200001',11,'2008-01-30','0001','004','3000.00',NULL),
 ('00200001',12,'2008-02-04','0001','003','2000.00',NULL),
 ('00200001',13,'2008-02-08','0001','004','4000.00',NULL),
 ('00200001',14,'2008-02-13','0001','003','2000.00',NULL),
 ('00200001',15,'2008-02-19','0001','004','1000.00',NULL),
 ('00200002',1,'2008-01-09','0001','001','3800.00',NULL),
 ('00200002',2,'2008-01-20','0001','003','4200.00',NULL),
 ('00200002',3,'2008-03-06','0001','004','1200.00',NULL),
 ('00200003',1,'2008-01-11','0001','001','2500.00',NULL),
 ('00200003',2,'2008-01-17','0001','003','1500.00',NULL),
 ('00200003',3,'2008-01-20','0001','004','500.00',NULL),
 ('00200003',4,'2008-02-09','0001','004','500.00',NULL),
 ('00200003',5,'2008-02-25','0001','003','3500.00',NULL),
 ('00200003',6,'2008-03-11','0001','004','500.00',NULL);
/*!40000 ALTER TABLE `movimiento` ENABLE KEYS */;


--
-- Definition of table `parametro`
--

DROP TABLE IF EXISTS `parametro`;
CREATE TABLE `parametro` (
  `chr_paracodigo` char(3) NOT NULL,
  `vch_paradescripcion` varchar(50) NOT NULL,
  `vch_paravalor` varchar(70) NOT NULL,
  `vch_paraestado` varchar(15) NOT NULL DEFAULT 'ACTIVO',
  PRIMARY KEY (`chr_paracodigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `parametro`
--

/*!40000 ALTER TABLE `parametro` DISABLE KEYS */;
INSERT INTO `parametro` (`chr_paracodigo`,`vch_paradescripcion`,`vch_paravalor`,`vch_paraestado`) VALUES 
 ('001','ITF - Impuesto a la Transacciones Financieras','0.08','ACTIVO'),
 ('002','Numero de Operaciones Sin Costo','15','ACTIVO');
/*!40000 ALTER TABLE `parametro` ENABLE KEYS */;


--
-- Definition of table `sucursal`
--

DROP TABLE IF EXISTS `sucursal`;
CREATE TABLE `sucursal` (
  `chr_sucucodigo` char(3) NOT NULL,
  `vch_sucunombre` varchar(50) NOT NULL,
  `vch_sucuciudad` varchar(30) NOT NULL,
  `vch_sucudireccion` varchar(50) DEFAULT NULL,
  `int_sucucontcuenta` int(11) NOT NULL,
  PRIMARY KEY (`chr_sucucodigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sucursal`
--

/*!40000 ALTER TABLE `sucursal` DISABLE KEYS */;
INSERT INTO `sucursal` (`chr_sucucodigo`,`vch_sucunombre`,`vch_sucuciudad`,`vch_sucudireccion`,`int_sucucontcuenta`) VALUES 
 ('001','Sipan','Chiclayo','Av. Balta 1456',2),
 ('002','Chan Chan','Trujillo','Jr. Independencia 456',3),
 ('003','Los Olivos','Lima','Av. Central 1234',0),
 ('004','Pardo','Lima','Av. Pardo 345 - Miraflores',0),
 ('005','Misti','Arequipa','Bolivar 546',0),
 ('006','Machupicchu','Cusco','Calle El Sol 534',0),
 ('007','Grau','Piura','Av. Grau 1528',0);
/*!40000 ALTER TABLE `sucursal` ENABLE KEYS */;


--
-- Definition of table `tipomovimiento`
--

DROP TABLE IF EXISTS `tipomovimiento`;
CREATE TABLE `tipomovimiento` (
  `chr_tipocodigo` char(3) NOT NULL,
  `vch_tipodescripcion` varchar(40) NOT NULL,
  `vch_tipoaccion` varchar(10) NOT NULL,
  `vch_tipoestado` varchar(15) NOT NULL DEFAULT 'ACTIVO',
  PRIMARY KEY (`chr_tipocodigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tipomovimiento`
--

/*!40000 ALTER TABLE `tipomovimiento` DISABLE KEYS */;
INSERT INTO `tipomovimiento` (`chr_tipocodigo`,`vch_tipodescripcion`,`vch_tipoaccion`,`vch_tipoestado`) VALUES 
 ('001','Apertura de Cuenta','INGRESO','ACTIVO'),
 ('002','Cancelar Cuenta','SALIDA','ACTIVO'),
 ('003','Deposito','INGRESO','ACTIVO'),
 ('004','Retiro','SALIDA','ACTIVO'),
 ('005','Interes','INGRESO','ACTIVO'),
 ('006','Mantenimiento','SALIDA','ACTIVO'),
 ('007','ITF','SALIDA','ACTIVO'),
 ('008','Transferencia','INGRESO','ACTIVO'),
 ('009','Transferencia','SALIDA','ACTIVO'),
 ('010','Cargo por Movimiento','SALIDA','ACTIVO');
/*!40000 ALTER TABLE `tipomovimiento` ENABLE KEYS */;


--
-- Definition of procedure `usp_actualiza_datos_cliente`
--

DROP PROCEDURE IF EXISTS `usp_actualiza_datos_cliente`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_actualiza_datos_cliente`(
	out p_estado varchar(200), -- Parámetro de salida
	p_cliecodigo char(5), 
	p_cliepaterno varchar(25), 
	p_cliematerno varchar(25),  
	p_clienombre varchar(30), 
	p_cliedni char(8), 
	p_clieciudad varchar(30),
	p_cliedireccion varchar(50), 
	p_clietelefono varchar(20),
	p_clieemail varchar(50) 

)
BEGIN

        DECLARE EXIT HANDLER FOR SQLEXCEPTION, SQLWARNING, NOT FOUND
	BEGIN
		rollback;
		set p_estado = 'Error en el proceso de actualización.';
	END;

	start transaction;
	set p_estado = null;
	update cliente
	set
		vch_cliepaterno   = p_cliepaterno,
		vch_cliematerno   = p_cliematerno,
		vch_clienombre    = p_clienombre,
		chr_cliedni       = p_cliedni,
		vch_clieciudad    = p_clieciudad,
		vch_cliedireccion = p_cliedireccion,
		vch_clietelefono  = p_clietelefono,
		vch_clieemail     = p_clieemail
	where
		chr_cliecodigo = p_cliecodigo;

	commit;


END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `usp_consulta_clientes_por_distrito`
--

DROP PROCEDURE IF EXISTS `usp_consulta_clientes_por_distrito`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_consulta_clientes_por_distrito`(
  par_distrito VARCHAR(50)
)
BEGIN

    select chr_cliecodigo as codigo, vch_clienombre as nombre
    from cliente
    where vch_cliedireccion=par_distrito;

END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `usp_consulta_telefono_de_cliente`
--

DROP PROCEDURE IF EXISTS `usp_consulta_telefono_de_cliente`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_consulta_telefono_de_cliente`(

   in par_codigo char(5),
   out par_telefono varchar(20)
)
BEGIN

   select vch_clietelefono 
   into par_telefono
   from cliente
   where chr_cliecodigo=par_codigo;

END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `usp_deposito`
--

DROP PROCEDURE IF EXISTS `usp_deposito`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_deposito`( 
	out p_estado varchar(500), -- Parámetro de salida
	p_cuenta char(8), 
	p_importe decimal(12,2),  
	p_empleado char(4)
)
BEGIN

	DECLARE costoMov decimal(12,2);
	DECLARE cont int;
	
	DECLARE EXIT HANDLER FOR SQLEXCEPTION, SQLWARNING, NOT FOUND
	BEGIN
		rollback;
		set p_estado := 'Error en el proceso de actualización.';
	END;

	set p_estado = "ok";

	-- Iniciar Transacción
	start transaction;
	
	-- Tabla Cuenta: Contador de Movimientos
	select int_cuencontmov into cont
	from cuenta where chr_cuencodigo = p_cuenta;
	
	-- Registrar el deposito
	update cuenta
		set dec_cuensaldo = dec_cuensaldo + p_importe,
			int_cuencontmov = int_cuencontmov + 1
		where chr_cuencodigo = p_cuenta;
	
	set cont := cont + 1;
	
	insert into movimiento(chr_cuencodigo,int_movinumero,dtt_movifecha,
		chr_emplcodigo,chr_tipocodigo,dec_moviimporte,chr_cuenreferencia)
		values(p_cuenta,cont,current_date,p_empleado,'003',p_importe,null);
	
	commit;
	
END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `usp_retiro`
--

DROP PROCEDURE IF EXISTS `usp_retiro`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_retiro`( 
	out p_estado varchar(500), -- Parámetro de salida
	p_cuenta char(8), 
	p_clave  varchar(15),
	p_importe decimal(12,2),  
	p_empleado char(4)
)
BEGIN

    DECLARE moneda char(2);
	DECLARE saldo  decimal(12,2);
	DECLARE cargo decimal(12,2);
	DECLARE cont int;
	DECLARE claveDB varchar(15);
	DECLARE codigo varchar(8);
	
	DECLARE EXIT HANDLER FOR SQLEXCEPTION, SQLWARNING, NOT FOUND
	BEGIN
		rollback;
        if( p_estado is null ) then
            set p_estado = 'Error en el proceso de actualización.';
        end if;
	END;

	set p_estado = null;

	-- Obtener Datos de la Cuenta
	select chr_monecodigo, dec_cuensaldo, int_cuencontmov, chr_cuenclave
	into moneda, saldo, cont, claveDB
	from cuenta where chr_cuencodigo = p_cuenta;
	
	if( p_clave != claveDB ) then
		set p_estado = 'Error, datos no son correctos.';
	else
        -- Obtener cargo por movimiento
		select dec_costimporte into cargo
		from costomovimiento where chr_monecodigo = moneda;
		
		if(  (p_importe + cargo) > saldo ) then
			set p_estado = 'Error, saldo insuficiente.';
		else
            -- Se inicia la Transacción
			start transaction;
			-- Actualizar Saldo de la Cuenta
			update cuenta 
				set dec_cuensaldo = dec_cuensaldo - (p_importe + cargo),
				    int_cuencontmov = int_cuencontmov + 2
				where chr_cuencodigo = p_cuenta;
            -- Registrar Importe
			set cont = cont + 1;
            insert into movimiento(chr_cuencodigo,int_movinumero,dtt_movifecha,
				chr_emplcodigo,chr_tipocodigo,dec_moviimporte,chr_cuenreferencia)
				values(p_cuenta,cont,current_date,p_empleado,'004',p_importe,null);             
			-- Registrar Cargo por Movimiento
			set cont = cont + 1;
			insert into movimiento(chr_cuencodigo,int_movinumero,dtt_movifecha,
				chr_emplcodigo,chr_tipocodigo,dec_moviimporte,chr_cuenreferencia)
				values(p_cuenta,cont,current_date,p_empleado,'010',cargo,null);
            -- Finalizar Transacción
            commit;
			set p_estado = 'ok';
		end if;
	end if;
END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `usp_transferencia`
--

DROP PROCEDURE IF EXISTS `usp_transferencia`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_transferencia`( 
	out p_estado varchar(500), -- Par�metro de salida
	p_cuenta1 char(8), 
	p_cuenta2 char(8), 
	p_clave1  varchar(15),
	p_importe decimal(12,2),  
	p_empleado char(4)
)
BEGIN

	DECLARE moneda1 char(2);
	DECLARE moneda2 char(2);
	DECLARE saldo1  decimal(12,2);
	DECLARE cargo decimal(12,2);
	DECLARE cont1 int;
	DECLARE cont2 int;
	DECLARE clave1 varchar(15);
	DECLARE codigo varchar(8);
	
	DECLARE EXIT HANDLER FOR SQLEXCEPTION, SQLWARNING, NOT FOUND
	BEGIN
		rollback;
		-- set p_estado = 'Error en el proceso de actualizaci�n.'
	END;

	set p_estado = null;

	-- Verificar la moneda
	select chr_monecodigo, dec_cuensaldo, int_cuencontmov, chr_cuenclave
	into moneda1, saldo1, cont1, clave1
	from cuenta where chr_cuencodigo = p_cuenta1;
	
	select chr_monecodigo, int_cuencontmov
	into moneda2, cont2
	from cuenta where chr_cuencodigo = p_cuenta2;
	
	if ( moneda1 != moneda2 ) then
		set p_estado = 'Error, cuentas deben ser de la misma moneda';
	else 
		if( p_clave1 != clave1 ) then
			set p_estado = 'Error, datos no son correctos';
		else
		    
			select dec_costimporte into cargo
			from costomovimiento where chr_monecodigo = moneda1;
		
			if(  (p_importe + cargo) > saldo1 ) then
				set p_estado = 'Error, saldo insuficiente.';
			else
				start transaction;
				
				-- Registrar el retiro
				update cuenta 
					set dec_cuensaldo = dec_cuensaldo - (p_importe + cargo),
					    int_cuencontmov = int_cuencontmov + 2
					where chr_cuencodigo = p_cuenta1;
				set cont1 = cont1 + 1;
							
				insert into movimiento(chr_cuencodigo,int_movinumero,dtt_movifecha,
					chr_emplcodigo,chr_tipocodigo,dec_moviimporte,chr_cuenreferencia)
					values(p_cuenta1,cont1,current_date,p_empleado,'009',p_importe,p_cuenta2);
				
				set cont1 = cont1 + 1;
				
				insert into movimiento(chr_cuencodigo,int_movinumero,dtt_movifecha,
					chr_emplcodigo,chr_tipocodigo,dec_moviimporte,chr_cuenreferencia)
					values(p_cuenta1,cont1,current_date,p_empleado,'010',cargo,null);
				-- Registrar el deposito
				update cuenta
					set dec_cuensaldo = dec_cuensaldo + p_importe,
					    int_cuencontmov = int_cuencontmov + 1
					where chr_cuencodigo = p_cuenta2;
				set cont2 = cont2;
				insert into movimiento(chr_cuencodigo,int_movinumero,dtt_movifecha,
					chr_emplcodigo,chr_tipocodigo,dec_moviimporte,chr_cuenreferencia)
					values(p_cuenta2,cont2,current_date,p_empleado,'008',p_importe,p_cuenta1);
				commit;
				set p_estado = 'ok';
			end if;
		end if;
	end if;
END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
