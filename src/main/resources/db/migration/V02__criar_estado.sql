CREATE TABLE 	`estado` (
 `id` BIGINT(10) unsigned NOT NULL AUTO_INCREMENT,
 `uf` varchar(2) NOT NULL,
 `nome` varchar(20) NOT NULL,
 PRIMARY KEY (`id`) USING BTREE,
 CONSTRAINT `fk_estado_id` FOREIGN KEY (`id`) REFERENCES `pessoa` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;