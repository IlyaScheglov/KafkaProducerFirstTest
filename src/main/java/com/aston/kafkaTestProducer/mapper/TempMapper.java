package com.aston.kafkaTestProducer.mapper;

import com.aston.kafkaTestProducer.dto.TempDto;
import com.aston.kafkaTestProducer.entity.Temp;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TempMapper {

    TempDto mapToTempDto(Temp temp);

    List<TempDto> mapToTempDtos(List<Temp> temps);

    Temp mapToTemp(TempDto tempDto);

    List<Temp> mapToTemps(List<TempDto> tempDtos);
}
