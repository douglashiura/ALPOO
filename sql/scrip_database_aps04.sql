-- create table's 

CREATE TABLE matrixEight
(
    idMatrix INTEGER NOT NULL,
    a11 integer NOT NULL,
    a12 integer NOT NULL,
    a13 integer NOT NULL,
    a21 integer NOT NULL,
    a22 integer NOT NULL,
    a23 integer NOT NULL,
    a31 integer NOT NULL,
    a32 integer NOT NULL,
    a33 integer NOT NULL
);

CREATE TABLE auditLog(
idAudit INTEGER NOT NULL,
matrixEight_auditLog INTEGER NOT NULL,
lastUpdate TIMESTAMP NOT NULL);

CREATE TABLE score(
idScore INTEGER NOT NULL,
valueScore INTEGER NOT NULL);

-- create sequence
CREATE SEQUENCE idMatrixseq start 1;
CREATE SEQUENCE idAuditSeq start 1;
CREATE SEQUENCE idScoreSeq start 1;


-- create pk

ALTER TABLE matrixEight ADD PRIMARY KEY(idMatrix);
ALTER TABLE auditLog ADD PRIMARY KEY (idAudit);
ALTER TABLE score ADD PRIMARY KEY (idScore);


-- create triggers

CREATE OR REPLACE FUNCTION auditLog()
RETURNS TRIGGER LANGUAGE plpgsql AS $$
BEGIN
	INSERT INTO auditLog VALUES(
	nextval('idAuditSeq'), new.idMatrix, now());
	RETURN NEW;
END; $$;

CREATE TRIGGER auditLog
AFTER INSERT 
ON matrixEight
FOR EACH ROW
EXECUTE PROCEDURE auditLog();

CREATE OR REPLACE FUNCTION countScore()
RETURNS TRIGGER LANGUAGE PLPGSQL AS $$
BEGIN
	INSERT INTO score
	SELECT nextval('idScoreSeq'),COUNT(m.idMatrix) FROM matrixeight m;
	ALTER SEQUENCE idMatrixseq RESTART;
	RETURN OLD;
END; $$;

CREATE OR REPLACE FUNCTION restartSeq()
RETURNS TRIGGER LANGUAGE PLPGSQL AS $$
BEGIN 
ALTER SEQUENCE idMatrixseq RESTART;
RETURN NEW;
END; $$;

CREATE TRIGGER countScore
BEFORE TRUNCATE
ON matrixEight
FOR EACH STATEMENT
EXECUTE PROCEDURE countScore();

CREATE TRIGGER restartSeq
BEFORE TRUNCATE
ON matrixEight
FOR EACH STATEMENT
EXECUTE PROCEDURE restartSeq();

-- create functions

CREATE OR REPLACE FUNCTION insertMatrix(numbers INT[])
RETURNS VOID LANGUAGE PLPGSQL AS $$
BEGIN
INSERT INTO matrixeight VALUES(
nextval('idMatrixseq'), numbers[1] ,numbers[2], numbers[3],numbers[4], numbers[5],numbers[6], numbers[7],numbers[8],numbers[9]);
END; $$;

CREATE OR REPLACE FUNCTION maxScore()
RETURNS BIGINT LANGUAGE PLPGSQL AS $$
BEGIN 
	RETURN MIN(valueScore) FROM score;
END; $$;

CREATE OR REPLACE FUNCTION currentScore()
RETURNS BIGINT LANGUAGE PLPGSQL AS $$
BEGIN
	RETURN COUNT(matrixeight) FROM matrixeight;
END; $$;
