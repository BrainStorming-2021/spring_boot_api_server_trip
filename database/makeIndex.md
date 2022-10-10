# 인덱스 화인
show index from user; 

create index [인덱스 이름] on [테이블이름] ([컬럼]); 
ALTER TABLE 테이블이름 MODIFY COLUMN [CONSTRAINT 제약조건이름] PRIMARY KEY (필드이름);  

```
ALTER TABLE user_client MODIFY COLUMN id int primary key
create index IX_user_client on user_client (user_name);

```

인덱스 명명 규칙  
https://kosate.tistory.com/142  