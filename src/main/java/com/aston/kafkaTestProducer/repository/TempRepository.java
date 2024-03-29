package com.aston.kafkaTestProducer.repository;

import com.aston.kafkaTestProducer.entity.Temp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TempRepository extends JpaRepository<Temp, Long> {
}
