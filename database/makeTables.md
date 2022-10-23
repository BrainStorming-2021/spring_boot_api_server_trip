# CREATR TABLE
```
create table user_client 
(
    uuid        varchar(100) not null,
    id          varchar(50) not null, 
    password    varchar(100) not null,
    email       varchar(100) not null,
    nick_name   varchar(100) not null,
    password_expired boolean,
    user_status boolean
);
create table user_client_detail 
(
    uuid        varchar(100) not null,
    id          varchar(50) not null, 
    nick_name   varchar(100) not null
);
create table user_log 
(
    uuid varchar(100) not null,
    login_date datetime,
    login_status varchar(50),
    create_date datetime,
    create_ip varchar(100) not null,
    modify_date datetime,
    modify_ip varchar(100) not null,
    delete_date datetime,
    delete_ip varchar(100) not null
    
);

```

# 인덱스 만들어야 함