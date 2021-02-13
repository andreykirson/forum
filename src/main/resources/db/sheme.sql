CREATE TABLE IF NOT EXISTS users (
  username VARCHAR(50) NOT NULL,
  password VARCHAR(100) NOT NULL,
  enabled boolean default true,
  PRIMARY KEY (username)
);

CREATE TABLE IF NOT EXISTS authorities (
  id serial primary key,
  authority VARCHAR(50) NOT NULL
);