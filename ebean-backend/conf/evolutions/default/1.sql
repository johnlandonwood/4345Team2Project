# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table publication (
  title                         varchar(255),
  media_type                    varchar(255),
  date                          varchar(255),
  link                          varchar(255)
);

create table user (
  id                            bigint auto_increment not null,
  username                      varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (id)
);


# --- !Downs

drop table if exists publication;

drop table if exists user;

