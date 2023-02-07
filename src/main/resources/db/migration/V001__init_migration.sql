-- Создание схемы
CREATE SCHEMA IF NOT EXISTS my_store;

-- Создание последовательности;
CREATE SEQUENCE IF NOT EXISTS my_store.my_store_id_seq;

-- Создание таблицы;
CREATE TABLE IF NOT EXISTS my_store.order
(
    id integer NOT NULL DEFAULT nextval('my_store.my_store_id_seq') PRIMARY KEY,
    creation_date    date,
    price            double precision
    );


CREATE TABLE IF NOT EXISTS my_store.product
(
    id serial NOT NULL PRIMARY KEY ,
    fk_order_id integer constraint data_source_fk_connection_id_fkey references my_store.order,
    price      double precision,
    name text
);
