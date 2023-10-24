-- CREATE TABLE users(
--   id SERIAL PRIMARY KEY,
--   username TEXT NOT NULL,
--   email TEXT NOT NULL,
--   password TEXT NOT NULL,
--   createdAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP ,L,
-- );

-- CREATE TABLE tasks(
--   id SERIAL PRIMARY KEY,
--   title TEXT NOT NULL,
--   description TEXT NOT NULL,
--   priority TEXT NOT NULL,
--   idUser TEXT NOT NULL,
--   price INTEGER NOT NULL,
--   image TEXT
-- );

CREATE TABLE foods(
  id SERIAL PRIMARY KEY,
  title TEXT NOT NULL,
  price INTEGER NOT NULL,
  image TEXT
);

