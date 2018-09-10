CREATE TABLE 	`documentos` (
 `id` BIGINT(20) unsigned NOT NULL AUTO_INCREMENT,
 `tipo` varchar(50) NOT NULL,
 `numero` varchar(15) NOT NULL,
 `pessoa_fk` BIGINT(10) unsigned NOT NULL,
 PRIMARY KEY (`id`) USING BTREE,
 CONSTRAINT `fk_documentos_id` FOREIGN KEY (`pessoa_fk`) REFERENCES `pessoa` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;