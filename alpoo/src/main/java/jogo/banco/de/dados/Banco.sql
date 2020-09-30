CREATE TABLE pessoa(
	pessoa_id SERIAL NOT NULL,
	nome VARCHAR(256),
	dt_nasc DATE
);

ALTER TABLE pessoa ADD PRIMARY KEY(pessoa_id);

select * from pessoa;

CREATE TABLE aposta(
	aposta_id SERIAL NOT NULL,
	nome VARCHAR(255),
	aposta VARCHAR(32),
	valor INTEGER
);

ALTER TABLE aposta ADD PRIMARY KEY(aposta_id);

DROP TABLE vencedor;

SELECT * FROM aposta;
SELECT * FROM vencedor;

CREATE TABLE vencedor(
	vencedor_id SERIAL NOT NULL,
	aposta_id INTEGER NOT NULL,
	horario TIMESTAMP
)

ALTER TABLE vencedor ADD PRIMARY KEY(vencedor_id);

ALTER TABLE vencedor ADD CONSTRAINT fk_vencedor_aposta 
FOREIGN KEY (aposta_id) REFERENCES aposta(aposta_id);

SELECT * FROM vencedor;