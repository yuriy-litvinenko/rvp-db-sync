package kz.izipaq.rvpdbsync.mapper;

import org.apache.kafka.connect.data.Struct;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Component
public class MapHandler {

    String getAsString(Struct struct, String fieldName) {
        Optional<String> opt = Optional.ofNullable(struct.getString(fieldName));
        return opt.orElse(null);
    }

    Timestamp getAsTimestamp(Struct struct, String fieldName) {
        Optional<Long> opt = Optional.ofNullable(struct.getInt64(fieldName));
        return opt.map(aLong -> new Timestamp(TimeUnit.MILLISECONDS.toSeconds(aLong))).orElse(null);
    }

    Boolean getAsBoolean(Struct struct, String fieldName) {
        Optional<Boolean> opt = Optional.ofNullable(struct.getBoolean(fieldName));
        return opt.orElse(false);
    }

    UUID getAsUUID(Struct struct, String fieldName) {
        Optional<String> opt = Optional.ofNullable(struct.getString(fieldName));
        return opt.map(UUID::fromString).orElse(null);
    }

    BigDecimal getAsBigDecimal(Struct struct, String fieldName) {
        Optional<Double> opt = Optional.ofNullable(struct.getFloat64(fieldName));
        return opt.map(BigDecimal::valueOf).orElse(null);
    }

    Long getAsLong(Struct struct, String fieldName) {
        Optional<Long> opt = Optional.ofNullable(struct.getInt64(fieldName));
        return opt.orElse(null);
    }

    Short getAsShort(Struct struct, String fieldName) {
        Optional<Short> opt = Optional.ofNullable(struct.getInt16(fieldName));
        return opt.orElse(null);
    }

    Integer getAsInteger(Struct struct, String fieldName) {
        Optional<Integer> opt = Optional.ofNullable(struct.getInt32(fieldName));
        return opt.orElse(null);
    }

}
