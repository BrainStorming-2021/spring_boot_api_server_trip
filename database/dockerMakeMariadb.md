#도커 마리아 디비 설치 및 실행 
1. docker pull mariadb  
2. docker run --name mariadb -d -p 3307:3307 --restart=always -e MYSQL_ROOT_PASSWORD=root mariadb  
3. docker exec -it mariadb /bin/bash  
4. mysql -u root -p  

## 마리아 디비 포트 확인하기
- show global variables like 'PORT';
- /etc/mysql/ 하단 설정파일로 변경가능