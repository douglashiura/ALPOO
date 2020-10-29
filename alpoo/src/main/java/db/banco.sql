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

CREATE OR REPLACE FUNCTION public.move_casas(_casa_origem text, _casa_destino text, id_tabuleiro INTEGER)
RETURNS BOOLEAN AS $$
DECLARE
	valor_casa_origem INTEGER;
	valor_casa_destino INTEGER;
BEGIN
        IF _casa_origem IS NOT NULL AND _casa_destino IS NOT NULL AND id_tabuleiro IS NOT NULL THEN
		EXECUTE format('SELECT %s FROM tabuleiro WHERE tabuleiro.id = %s', _casa_origem, id_tabuleiro) INTO valor_casa_origem;
		EXECUTE format('SELECT %s FROM tabuleiro WHERE tabuleiro.id = %s', _casa_destino, id_tabuleiro) INTO valor_casa_destino;

		EXECUTE format('UPDATE tabuleiro SET %s = %s, %s = %s WHERE tabuleiro.id = %s;', _casa_origem, valor_casa_destino, _casa_destino, valor_casa_origem, id_tabuleiro);
		RETURN TRUE;
	ELSE 
		RETURN FALSE;
	END IF;
END;
$$ LANGUAGE plpgsql;

INSERT INTO tabuleiro(casacimaesquerda,casacimameio,casacimadireita,casameioesquerda,casameio,casameiodireita,casainferioresquerda,casainferiormeio,casainferiordireita) VALUES (2,4,6,8,0,1,3,5,7);

select "move_casas"('casameio','casameioesquerda',1);

