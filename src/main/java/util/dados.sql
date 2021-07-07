CREATE DATABASE dados;

USE dados;

CREATE TABLE legislatura (
	idLegislatura INT PRIMARY KEY NOT NULL,
	uri VARCHAR(100) NOT NULL,
	dataInicio DATE NOT NULL,
	dataFim DATE NOT NULL,
	anoEleicao INT NOT NULL
);