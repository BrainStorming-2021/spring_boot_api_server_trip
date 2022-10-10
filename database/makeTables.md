# CREATR TABLE
```
create table user_client 
(
    id          int null,
    user_name   varchar(30)  null,
    password    varchar(100) not null,
    email       varchar(100) not null,
    nick_name   varchar(100) null,
    create_date datetime,
    modify_date datetime
);

create table user_log 
(
    id int null,
    login_date datetime,
    login_status varchar(50)
);

```

# 인덱스 만들어야 함