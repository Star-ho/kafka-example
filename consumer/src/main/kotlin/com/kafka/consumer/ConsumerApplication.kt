package com.kafka.consumer

import org.apache.kafka.clients.consumer.ConsumerConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service
import java.io.IOException


@SpringBootApplication
class ConsumerApplication

fun main(args: Array<String>) {
    runApplication<ConsumerApplication>(*args)
}

@Service
class KafkaConsumer {
    @KafkaListener(topics = ["my-topic"], groupId = ConsumerConfig.GROUP_ID_CONFIG)
    @Throws(IOException::class)
    fun consume(message: String?) {
        println(String.format("Consumed message : %s", message))
    }
}