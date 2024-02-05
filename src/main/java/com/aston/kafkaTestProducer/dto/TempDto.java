package com.aston.kafkaTestProducer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TempDto {

    @JsonProperty("temperature")
    private int temperature;

    @JsonProperty("cityName")
    private String cityName;
}
