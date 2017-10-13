package br.com.gravata.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

/**
 * criado por bruno em 12/10/17.
 */
@Converter(autoApply = true)
public class LocalDateTimeConverter implements AttributeConverter<LocalDateTime,Date>{

    public Date convertToDatabaseColumn(LocalDateTime date) {
        if(date!=null) {
            return new java.sql.Date(Date.from(date.toInstant(ZoneOffset.UTC)).getTime());
        }
        return null;
    }

    public LocalDateTime convertToEntityAttribute(Date dbData) {
        if(dbData!=null){
            return LocalDateTime.ofInstant(dbData.toInstant(), ZoneId.systemDefault());
        }
        return null;
    }
}
