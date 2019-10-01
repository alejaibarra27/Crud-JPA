CREATE DATABASE `celu_quindio`;

USE `celu_quindio`;

DROP TABLE IF EXISTS `celu_quindio`.`celular`;

CREATE TABLE `celu_quindio`.`celular`(
`codigo` INT UNSIGNED AUTO_INCREMENT NOT NULL,
`marca` VARCHAR(100) DEFAULT NULL,
`procesador` VARCHAR(80) DEFAULT NULL,
`sistema_operativo` VARCHAR(20) DEFAULT NULL,
`memoria_interna` VARCHAR(5) DEFAULT NULL,
`valor` VARCHAR(10) DEFAULT NULL,
PRIMARY KEY (`codigo`)
)ENGINE=InnoDB DEFAULT  CHARSET=latin1;


