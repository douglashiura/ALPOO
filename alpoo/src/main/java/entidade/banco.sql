CREATE TABLE Aposta (
	id SERIAL PRIMARY KEY,
	nome VARCHAR(255) NOT NULL,
	aposta VARCHAR(32) NOT NULL,
	valor INTEGER NOT NULL
);

CREATE TABLE vencedor(
	id SERIAL PRIMARY KEY,
	data DATE NOT NULL,
	id_aposta INTEGER NOT NULL
);

alter table vencedor
add constraint fk_aposta_vencedor foreign key(id_aposta)
references aposta(id)
on update cascade
on delete no action;