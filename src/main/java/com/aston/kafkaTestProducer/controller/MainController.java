package com.aston.kafkaTestProducer.controller;

import com.aston.kafkaTestProducer.dto.TempDto;
import com.aston.kafkaTestProducer.entity.Temp;
import com.aston.kafkaTestProducer.mapper.TempMapper;
import com.aston.kafkaTestProducer.service.TempService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class MainController {

    private final TempService tempService;
    private final TempMapper tempMapper;

    @PostMapping("/send-temp")
    public void sendTemp(@RequestBody TempDto tempDto){
        Temp temp = tempMapper.mapToTemp(tempDto);
        tempService.saveAndSend(temp);
    }
}
