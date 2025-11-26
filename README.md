# Kafka Topic Setup


# Start Docker containers
docker-compose up -d

# List running containers
docker ps

# List existing Kafka topics
docker exec -it kafka kafka-topics --bootstrap-server localhost:9092 --list

# Enter Kafka container bash (optional)
 docker exec -it kafka bash

# Create topic order.created
docker exec -it kafka kafka-topics --create --topic order.created --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

# Start Kafka console producer (to type messages manually)
 docker exec -it kafka kafka-console-producer --bootstrap-server localhost:9092 --topic order.created

# Start Kafka console consumer (to read messages)
docker exec -it kafka kafka-console-consumer --bootstrap-server localhost:9092 --topic order.created --from-beginning

