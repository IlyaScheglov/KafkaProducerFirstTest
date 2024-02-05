package com.aston.kafkaTestProducer.mapper;

import com.aston.kafkaTestProducer.dto.TempDto;
import com.aston.kafkaTestProducer.entity.Temp;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-05T16:48:22+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class TempMapperImpl implements TempMapper {

    @Override
    public TempDto mapToTempDto(Temp temp) {
        if ( temp == null ) {
            return null;
        }

        TempDto tempDto = new TempDto();

        return tempDto;
    }

    @Override
    public List<TempDto> mapToTempDtos(List<Temp> temps) {
        if ( temps == null ) {
            return null;
        }

        List<TempDto> list = new ArrayList<TempDto>( temps.size() );
        for ( Temp temp : temps ) {
            list.add( mapToTempDto( temp ) );
        }

        return list;
    }

    @Override
    public Temp mapToTemp(TempDto tempDto) {
        if ( tempDto == null ) {
            return null;
        }

        int temperature = 0;
        String cityName = null;

        Temp temp = new Temp( temperature, cityName );

        return temp;
    }

    @Override
    public List<Temp> mapToTemps(List<TempDto> tempDtos) {
        if ( tempDtos == null ) {
            return null;
        }

        List<Temp> list = new ArrayList<Temp>( tempDtos.size() );
        for ( TempDto tempDto : tempDtos ) {
            list.add( mapToTemp( tempDto ) );
        }

        return list;
    }
}
