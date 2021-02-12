CREATE TABLE IF NOT EXISTS posts (
  id serial primary key,
  name VARCHAR(2000) NOT NULL,
  description text,
  created timestamp without time zone default now()
);

CREATE TABLE users (
  username VARCHAR(50) NOT NULL,
  password VARCHAR(100) NOT NULL,
  enabled boolean default true,
  PRIMARY KEY (username)
);

CREATE TABLE authorities (
  id serial primary key,
  authority VARCHAR(50) NOT NULL,
  FOREIGN KEY (username) REFERENCES users(username)
);