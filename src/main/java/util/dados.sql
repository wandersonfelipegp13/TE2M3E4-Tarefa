DROP DATABASE IF EXISTS dados;

CREATE DATABASE dados;

USE dados;

CREATE TABLE legislatura (
	idLegislatura INT PRIMARY KEY NOT NULL,
	uri VARCHAR(100) NOT NULL,
	dataInicio DATE NOT NULL,
	dataFim DATE NOT NULL,
	anoEleicao INT NOT NULL
);

INSERT INTO legislatura VALUES 
("56", "https://dadosabertos.camara.leg.br/api/v2/legislaturas/%s56", "2019-02-01", "2023-01-31", 2018),
("55", "https://dadosabertos.camara.leg.br/api/v2/legislaturas/%s55", "2015-02-01", "2019-01-31", 2014);

CREATE TABLE deputado (
	
      uri VARCHAR(100) PRIMARY KEY NOT NULL,
      nome VARCHAR(100) NOT NULL,
      idLegislaturaInicial INT NOT NULL, 
      idLegislaturaFinal INT NOT NULL,
      nomeCivil VARCHAR(100) NOT NULL,
      siglaSexo CHAR(1) NOT NULL,
      urlRedeSocial 
      urlWebsite 
      dataNascimento 
      dataFalecimento 
      ufNascimento 
      municipioNascimento 
    
);
