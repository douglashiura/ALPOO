-- PESQUISAS DE TESTE DO BANCO

DELETE FROM vencedor;
DELETE FROM aposta;

-- Tabelas
SELECT * FROM vencedor;
SELECT * FROM aposta;

-- Views
SELECT * FROM vencedores;

----------------------
/* Tabela que talvez seja utilizada depois */
CREATE TABLE jogos (
	jogos_id SERIAL NOT NULL,
);
/*-----------------------------------------*/
DROP TABLE IF EXISTS ganhador;
DROP TABLE IF EXISTS aposta;
DROP TABLE IF EXISTS vencedor;

CREATE TABLE pessoa (
    id SERIAL NOT NULL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    nascimento TIMESTAMP NOT NULL,
);

CREATE TABLE aposta (
	id SERIAL NOT NULL PRIMARY KEY,
	aposta VARCHAR(32) NOT NULL,
	valor INTEGER NOT NULL,
    pessoa_id INTEGER NOT NULL,
    
    CONSTRAINT pessoa_aposta_fk
    	FOREIGN KEY(pessoa_id) 
    		REFERENCES pessoa(id)
);

CREATE TABLE vencedor (
	id SERIAL NOT NULL PRIMARY KEY,
	data TIMESTAMP NOT NULL,
    aposta_id INTEGER NOT NULL,
    
	CONSTRAINT vencedor_aposta_fk
    	FOREIGN KEY(aposta_id) 
    		REFERENCES aposta(id)
);
-----------------------
CREATE OR REPLACE VIEW vencedores AS
SELECT aposta.id, pessoa.nome, aposta.aposta FROM aposta
INNER JOIN vencedor ON aposta.id = vencedor.aposta_id
INNER JOIN pessoa ON aposta.pessoa_id = pessoa.id;
-----------------------