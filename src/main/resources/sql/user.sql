drop table if exists user;

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   ID                   bigint not null,
   username             varchar(50) not null,
   password             varchar(50) not null,
   nick_name            varchar(50) not null,
   address              varchar(200) not null,
   user_phone           varchar(11) not null,
   add_date             datetime not null,
   email                varchar(50),
   order_count          int default 0,
   order_amount         decimal(10,2) default 0.00,
   primary key (ID)
);
