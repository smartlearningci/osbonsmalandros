CREATE TABLE MALANDRO
(
	ID int  NOT NULL PRIMARY KEY,
	UTILIZADOR varchar(255),
	SENHA varchar(255)
);

CREATE TABLE PECA_ARTE
(
	ID int  NOT NULL PRIMARY KEY,
	TIPO varchar(255),
	NUMERO_DE_PECAS int,
	DESCRICAO varchar(255),
	AUTOR varchar(255),
	SECULO varchar(255)
);
