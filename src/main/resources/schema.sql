create sequence hibernate_sequence start with 1 increment by 1;
create table users (id bigint not null, name varchar(255), email varchar(255), password varchar(255), primary key (id));

