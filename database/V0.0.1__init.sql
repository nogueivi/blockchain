GRANT ALL PRIVILEGES ON DATABASE uchain TO uchain;

CREATE TABLE users (
    id          uuid PRIMARY KEY,
    username    varchar(40),
    password    varchar(40),
    name        varchar(40),
    email       varchar(40)
);