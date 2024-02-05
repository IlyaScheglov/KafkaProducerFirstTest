package com.aston.kafkaTestProducer.kafka.service;

import com.aston.kafkaTestProducer.dto.TempDto;
import com.aston.kafkaTestProducer.entity.Temp;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import reactor.kafka.sender.KafkaSender;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class KafkaProducer {

    private final KafkaTemplate<String, Message<TempDto>> kafkaTemplate;
    private final String topicName = "first-test-topic";

    public String sendTemp(TempDto tempDto){
        Message<TempDto> message = MessageBuilder.withPayload(tempDto)
                .setHeader("replicationFactor", "3".getBytes())
                .setHeader("messCreated", System.currentTimeMillis())
                .setHeader("partition", "currency".getBytes())
                .build();
        kafkaTemplate.send(topicName, message);
        return "Получилось";
    }
}
