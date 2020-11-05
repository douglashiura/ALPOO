CREATE TABLE tabuleiro(
	id SERIAL,
	casa_cima_esquerda INT NOT NULL,
	casa_cima_meio INT NOT NULL,
	casa_cima_direita INT NOT NULL,
	casa_meio_esquerda INT NOT NULL,
	casa_meio INT NOT NULL,
	casa_meio_direita INT NOT NULL,
	casa_inferior_esquerda INT NOT NULL,
	casa_inferior_meio INT NOT NULL,
	casa_inferior_direita INT NOT NULL
);


SELECT * from jogador;
INSERT INTO jogador (id_tabuleiro, nome) values (1, 'teste')
SELECT * from log_jogadas;

INSERT INTO log_jogadas (id_jogador, casa_origem, casa_destino) values (1, 'teste', 'teste');


CREATE TABLE jogador(
	id SERIAL,
	id_tabuleiro INT,
	nome VARCHAR(50) NOT NULL
);

CREATE TABLE log_jogadas(
	id SERIAL,
	id_jogador INT,
	casa_origem VARCHAR (50) NOT NULL,
	casa_destino VARCHAR (50) NOT NULL
);

ALTER TABLE jogador ADD PRIMARY KEY (id);
ALTER TABLE log_jogadas ADD PRIMARY KEY (id);

ALTER TABLE jogador 
   ADD CONSTRAINT fk_jogador_tabuleiro
   FOREIGN KEY (id_tabuleiro) 
   REFERENCES tabuleiro(id);
   
ALTER TABLE log_jogadas 
   ADD CONSTRAINT fk_jogador_log
   FOREIGN KEY (id_jogador) 
   REFERENCES jogador(id);


INSERT INTO tabuleiro(casa_cima_esquerda,casa_cima_meio,casa_cima_direita,casa_meio_esquerda,casa_meio,casa_meio_direita,casa_inferior_esquerda,casa_inferior_meio,casa_inferior_direita) VALUES (2,4,6,8,0,1,3,5,7);
CREATE OR REPLACE FUNCTION public.move_casas(_casa_origem text, _casa_destino text,	id_tabuleiro INTEGER)
RETURNS BOOLEAN AS $$
DECLARE
	valor_casa_origem INTEGER;
	valor_casa_destino INTEGER;
	valor_id_jogador INTEGER;
BEGIN	
        IF _casa_origem IS NOT NULL AND _casa_destino IS NOT NULL AND id_tabuleiro IS NOT NULL THEN			
		IF check_for_column(_casa_origem) AND check_for_column(_casa_destino) THEN
			
			EXECUTE format('SELECT %s FROM tabuleiro WHERE tabuleiro.id = %s', _casa_origem, id_tabuleiro) INTO valor_casa_origem;
			EXECUTE format('SELECT %s FROM tabuleiro WHERE tabuleiro.id = %s', _casa_destino, id_tabuleiro) INTO valor_casa_destino;

			IF valor_casa_origem IS NOT NULL AND valor_casa_destino IS NOT NULL THEN
				EXECUTE format('UPDATE tabuleiro SET %s = %s, %s = %s WHERE tabuleiro.id = %s', _casa_origem, valor_casa_destino, _casa_destino, valor_casa_origem, id_tabuleiro);
				EXECUTE format('SELECT id FROM jogador WHERE jogador.id = 1') INTO valor_id_jogador;
				INSERT INTO log_jogadas (id_jogador, casa_origem, casa_destino) VALUES (valor_id_jogador, _casa_origem, _casa_destino);				
				RETURN TRUE;
			END IF;
		END IF;
	END IF;
		
	RETURN FALSE;
END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE FUNCTION public.check_for_column(_column_name text)
RETURNS BOOLEAN AS $$
DECLARE
	column_found text = (SELECT column_name FROM information_schema.columns WHERE table_name = 'tabuleiro' and column_name = _column_name);
BEGIN
	IF column_found IS NOT NULL THEN
		RETURN TRUE;
	END IF;
	
	RETURN FALSE;
END;
$$ LANGUAGE plpgsql;

select "move_casas"('casa_meio_esquerda','casa_cima_meio',1);
