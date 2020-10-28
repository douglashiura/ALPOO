CREATE TABLE tabuleiro(
	id SERIAL,
	casacimaesquerda INT NOT NULL,
	casacimameio INT NOT NULL,
	casacimadireita INT NOT NULL,
	casameioesquerda INT NOT NULL,
	casameio INT NOT NULL,
	casameiodireita INT NOT NULL,
	casainferioresquerda INT NOT NULL,
	casainferiormeio INT NOT NULL,
	casainferiordireita INT NOT NULL
	
);

ALTER TABLE tabuleiro ADD PRIMARY KEY (id);

CREATE OR REPLACE FUNCTION public.move_casas(casa_origem VARCHAR, casa_destino VARCHAR,	id_tabuleiro INTEGER)
RETURNS BOOLEAN AS $$
DECLARE
	valor_casa_origem INTEGER = (SELECT casa_origem FROM tabuleiro WHERE id = id_tabuleiro);
	valor_casa_destino INTEGER = (SELECT casa_destino FROM tabuleiro WHERE id = id_tabuleiro);
BEGIN
	IF valor_casa_origem IS NOT NULL AND valor_casa_destino IS NOT NULL
		THEN
			UPDATE tabuleiro
			SET casa_origem = valor_casa_destino
			WHERE id = id_tabuleiro;
			
			UPDATE tabuleiro
			SET casa_destino = valor_casa_origem
			WHERE id = id_tabuleiro;
			
			RETURN TRUE;
	END IF;
	RETURN FALSE;
END;
$$ LANGUAGE plpgsql;

INSERT INTO tabuleiro(casacimaesquerda,casacimameio,casacimadireita,casameioesquerda,casameio,casameiodireita,casainferioresquerda,casainferiormeio,casainferiordireita) VALUES (2,4,6,8,0,1,3,5,7);

select "move_casas"('casameio','casameioesquerda',1);

