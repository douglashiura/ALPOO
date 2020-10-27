CREATE TABLE pessoa(
	id SERIAL NOT NULL,
	nome VARCHAR(256),
	nascimento DATE
);

ALTER TABLE pessoa
ADD PRIMARY KEY(id);

CREATE TABLE aposta(
	id SERIAL NOT NULL,
	nome VARCHAR(255),
	aposta VARCHAR(32),
	valor INTEGER
);

ALTER TABLE aposta
ADD PRIMARY KEY(id);
CREATE TABLE vencedor(
	id SERIAL NOT NULL,
	aposta_id INTEGER NOT NULL,
	horario TIMESTAMP
);

ALTER TABLE vencedor
ADD PRIMARY KEY(id);

ALTER TABLE vencedor
ADD CONSTRAINT fk_vencedor_aposta FOREIGN KEY (id) REFERENCES aposta(id);