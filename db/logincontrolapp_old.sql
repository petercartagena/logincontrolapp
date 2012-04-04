CREATE DATABASE logincontrolapp;

GRANT ALL ON logincontrolapp.* TO loginuser@'%' IDENTIFIED BY 'plogincontrolappuser';
GRANT ALL ON logincontrolapp.* TO loginuser@localhost IDENTIFIED BY 'plogincontrolappuser';

USE logincontrolapp;

CREATE TABLE users (
  id INTEGER NOT NULL AUTO_INCREMENT,
  username varchar(255),
  password varchar(255),
  PRIMARY KEY (id)

);
CREATE INDEX users_description ON users(username);