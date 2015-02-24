
CREATE TABLE `language` (
  `lan_id` int(11) NOT NULL AUTO_INCREMENT,
  `lan_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`lan_id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=latin1;


CREATE TABLE `developer` (
  `dev_id` int(11) NOT NULL AUTO_INCREMENT,
  `dev_name` varchar(45) DEFAULT NULL,
  `dev_lastname` varchar(45) DEFAULT NULL,
  `dev_lanid` int(11) DEFAULT NULL,
  PRIMARY KEY (`dev_id`),
  KEY `fk_dev_lan_idx` (`dev_lanid`),
  CONSTRAINT `fk_dev_lan` FOREIGN KEY (`dev_lanid`) REFERENCES `language` (`lan_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;



