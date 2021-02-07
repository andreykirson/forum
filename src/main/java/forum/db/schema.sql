create table if not exists posts (
  id serial primary key,
  name varchar(2000),
  description text,
  created timestamp without time zone default now()
);