CREATE TABLE IF NOT EXISTS authorities (
  id serial primary key,
  authority VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS users (
  username VARCHAR(50) NOT NULL,
  password VARCHAR(100) NOT NULL,
  enabled boolean default true,
  authority_id int not null references authorities(id),
  PRIMARY KEY (username)
);

CREATE TABLE IF NOT EXISTS posts (
  id serial primary key,
  name VARCHAR(2000) NOT NULL,
  description text,
  created timestamp without time zone default now()
);