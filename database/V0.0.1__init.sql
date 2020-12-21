GRANT ALL PRIVILEGES ON DATABASE docker TO docker;

CREATE TABLES users (
    id          uuid PRIMARY KEY,
    username    varchar(40)
    password    varchar(40)
    name        varchar(40)
    email       varchar(40)
)