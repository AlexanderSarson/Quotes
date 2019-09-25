CREATE USER 'dev'@'localhost' IDENTIFIED BY 'dev';
GRANT SELECT,INSERT,UPDATE,DELETE,CREATE,DROP ON *.* TO 'dev'@'localhost';
DROP DATABASE IF EXISTS QuotesDB;
CREATE DATABASE QoutesDB;
USE QoutesDB;
CREATE TABLE Qoutes(
    qoutes VARCHAR(100) NOT NULL
);

INSERT INTO Qoutes (qoutes) VALUES ("blabla"),("klakla"),("okok"),("yes mand!"),("SUPER GODT"),("MEGET VIGTIGT");