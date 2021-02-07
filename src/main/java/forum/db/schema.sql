CREATE TABLE IF NOT EXISTS posts (
  id serial primary key,
  name VARCHAR(2000) NOT NULL,
  description text,
  created timestamp without time zone default now()
);

CREATE TABLE IF NOT EXISTS authorities (
  id serial primary key,
  authority VARCHAR(50) NOT NULL unique
);

CREATE TABLE IF NOT EXISTS users (
  id serial primary key,
  username VARCHAR(50) NOT NULL unique,
  password VARCHAR(100) NOT NULL,
  enabled boolean default true,
  authority_id int not null references authorities(id)
);

insert into authorities (authority) values ('ROLE_USER');
insert into authorities (authority) values ('ROLE_ADMIN');

insert into users (username, password, authority_id)
values ('root', '123', (select id from authorities where authority = 'ROLE_ADMIN'));