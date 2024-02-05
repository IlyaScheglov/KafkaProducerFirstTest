package com.aston.kafkaTestProducer.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "temperature_table")
public class Temp implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "temperature")
    private int temperature;

    @Column(name = "city_name")
    private String cityName;

    public Temp(int temperature, String cityName) {
        this.temperature = temperature;
        this.cityName = cityName;
    }
}
