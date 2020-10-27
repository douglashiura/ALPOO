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

