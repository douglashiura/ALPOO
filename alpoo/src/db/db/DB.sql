CREATE TABLE Game (
    game_id SERIAL NOT NULL,
    start_sequence VARCHAR(9) NOT NULL
);
ALTER TABLE Game ADD PRIMARY KEY (game_id);

CREATE TABLE Movement(
    move_id SERIAL NOT NULL,
    game_id INT NOT NULL,
    movement VARCHAR(5)
);
ALTER TABLE Movement ADD PRIMARY KEY (move_id);
ALTER TABLE Movement ADD FOREIGN KEY (game_id) REFERENCES Game (game_id);

CREATE TABLE Leaderboard(
    entry_id SERIAL NOT NULL,
    game_id INT NOT NULL,
    moves INT NOT NULL,
    player_name VARCHAR(255),
);
ALTER TABLE Leaderboard ADD PRIMARY KEY (entry_id);
ALTER TABLE Leaderboard ADD FOREIGN KEY (game_id) REFERENCES Game (game_id);


CREATE USER "eightPuzzleO" WITH PASSWORD 'db8pw';
GRANT CONNECT ON DATABASE "EightPuzzle" TO "eightPuzzleO";
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO "eightPuzzleO";
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA public TO "eightPuzzleO";