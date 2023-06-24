package com.kafka.producer

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class ProducerController(
    private val kafkaProducer: KafkaProducer
) {
    @GetMapping
    fun getOrder(@RequestParam message: String): String {
        kafkaProducer.sendMessage(message)
        return "1"
    }
}

@Service
class KafkaProducer(kafkaTemplate: KafkaTemplate<String, String>) {
    private val topicName: String = "my-topic"
    private val kafkaTemplate: KafkaTemplate<String, String>

    init {
        this.kafkaTemplate = kafkaTemplate
    }

    fun sendMessage(message: String?) {
        println(String.format("Produce message : %s", message))
        kafkaTemplate.send(topicName!!, message)
    }
}


