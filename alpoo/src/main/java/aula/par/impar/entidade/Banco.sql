CREATE TABLE Aposta (
	id SERIAL PRIMARY KEY,
	nome VARCHAR(255) NOT NULL,
	aposta VARCHAR(32) NOT NULL,
	valor INTEGER NOT NULL
);

SELECT * FROM APOSTA
----------------------
CREATE TABLE jogos (
	jogos_id SERIAL NOT NULL,
);

CREATE TABLE aposta (
	id SERIAL NOT NULL PRIMARY KEY,
	nome VARCHAR(255) NOT NULL,
	aposta VARCHAR(32) NOT NULL,
	valor INTEGER NOT NULL
);

CREATE TABLE vencedor (
	id SERIAL NOT NULL PRIMARY KEY,
	aposta_id INTEGER NOT NULL,
	data TIMESTAMP NOT NULL,
    
	CONSTRAINT vencedor_aposta_fk
    	FOREIGN KEY(aposta_id) 
    		REFERENCES aposta(id)
);
-----------------------
CREATE VIEW vencedores AS
SELECT aposta.id, aposta.nome, aposta.aposta FROM aposta
INNER JOIN vencedor ON aposta.id = vencedor.aposta_id
-----------------------