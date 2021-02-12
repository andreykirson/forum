CREATE TABLE IF NOT EXISTS posts (
  id serial primary key,
  name VARCHAR(2000) NOT NULL,
  description text,
  created timestamp without time zone default now()
);
