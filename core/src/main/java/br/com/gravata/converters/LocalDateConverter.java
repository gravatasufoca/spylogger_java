package br.com.gravata.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;
import java.time.LocalDate;

/**
 * criado por bruno em 12/10/17.
 */
@Converter(autoApply = true)
public class LocalDateConverter implements AttributeConverter<LocalDate,Date>{

    public Date convertToDatabaseColumn(LocalDate date) {
        return date!=null? Date.valueOf(date):null;
    }

    public LocalDate convertToEntityAttribute(Date dbData) {
        return dbData!=null?dbData.toLocalDate():null;
    }
}
