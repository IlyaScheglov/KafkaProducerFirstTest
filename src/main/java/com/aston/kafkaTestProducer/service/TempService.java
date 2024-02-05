package com.aston.kafkaTestProducer.service;

import com.aston.kafkaTestProducer.entity.Temp;
import com.aston.kafkaTestProducer.kafka.service.KafkaProducer;
import com.aston.kafkaTestProducer.mapper.TempMapper;
import com.aston.kafkaTestProducer.repository.TempRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TempService {

    private final TempRepository tempRepository;
    private final KafkaProducer kafkaProducer;
    private final TempMapper tempMapper;

    public void saveAndSend(Temp temp){
        tempRepository.save(temp);
        kafkaProducer.sendTemp(tempMapper.mapToTempDto(temp));
    }


}
