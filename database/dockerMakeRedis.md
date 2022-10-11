https://emflant.tistory.com/235
1. docker pull redis
2. docker network create redis-net
3. docker run --name my-redis -p 6379:6379 --network redis-net -v my/folder:/data -d redis:alpine redis-server --appendonly yes
4.