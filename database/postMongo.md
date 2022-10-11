# 게시글 몽고디비
# 스키머 및 데이터베이스 생성
1. use post;
2. db.createCollection("share_post")
3. db.share_post.insertOne({테스트1 : 'TEST01'}); 
4. db.share_post.find({})
- 참고
- https://rastalion.me/mongodb-collection-%EC%83%9D%EC%84%B1%ED%95%98%EA%B8%B0/