## kafka를 사용하는 토이프로젝트 입니다

아래 링크의 블로그를 보며 만들었습니다.

kafka docker
https://devocean.sk.com/blog/techBoardDetail.do?ID=164007

spring-boot kafka
https://docs.spring.io/spring-kafka/docs/current/reference/html/
https://velog.io/@taehodot/SpringBoot-%EC%B9%B4%ED%94%84%EC%B9%B4%EC%99%80-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EC%97%B0%EB%8F%99

consumer group
https://www.popit.kr/kafka-consumer-group/

docker-compose up -d   

docker-compose exec kafka kafka-topics --create --topic my-topic --bootstrap-server kafka:9092 --replication-factor 1 --partitions 1

kafka-topics kafka kafka-topics --create --topic my-topic --bootstrap-server localhost:29092 --replication-factor 1 --partitions 1