-- Import the following code.
-- You can ignore dropping and creating if you have a javaToSql database for other things.
DROP DATABASE IF EXISTS javaToSql; 

CREATE DATABASE javaToSql;

CREATE TABLE `typeOne` (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name VARCHAR(100) NOT NULL,
    age INT not null
);

INSERT INTO `typeOne` (name, age) VALUES
('Bob', 18),
('Tom', 21),
('JEFF GOLDBLUM', 71)