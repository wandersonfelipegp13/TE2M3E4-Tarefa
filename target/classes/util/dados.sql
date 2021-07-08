DROP DATABASE IF EXISTS dados;

CREATE DATABASE dados;

USE dados;

CREATE TABLE legislatura (
	idLegislatura INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	uri VARCHAR(100) NOT NULL,
	dataInicio DATE NOT NULL,
	dataFim DATE NOT NULL,
	anoEleicao INT NOT NULL
) ENGINE=InnoDb charset=utf8 COLLATE utf8_unicode_ci;

CREATE TABLE urlRedeSocial (
	id_dep VARCHAR(100) PRIMARY KEY NOT NULL,
	url VARCHAR(100) NOT NULL
	
) ENGINE=InnoDb charset=utf8 COLLATE utf8_unicode_ci;

CREATE TABLE deputado (
	
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	uri VARCHAR(100) NOT NULL,
    nome VARCHAR(100) NOT NULL,
    idLegislaturaInicial INT NOT NULL, 
    idLegislaturaFinal INT NOT NULL,
    nomeCivil VARCHAR(100) NOT NULL,
    cpf VARCHAR(20),
    siglaSexo CHAR(1) NOT NULL,
    dataNascimento DATE NOT NULL,
    dataFalecimento DATE,
    ufNascimento CHAR(2) NOT NULL,
    municipioNascimento VARCHAR(100) NOT NULL,
	
    CONSTRAINT fk_LegislaturaInicial FOREIGN KEY (idLegislaturaInicial) REFERENCES Legislatura (idLegislatura),
    CONSTRAINT fk_LegislaturaFinal FOREIGN KEY (idLegislaturaFinal) REFERENCES Legislatura (idLegislatura)
    
) ENGINE=InnoDb charset=utf8 COLLATE utf8_unicode_ci;


