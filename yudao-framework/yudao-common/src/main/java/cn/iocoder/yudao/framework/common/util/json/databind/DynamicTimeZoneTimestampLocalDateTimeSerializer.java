package cn.iocoder.yudao.framework.common.util.json.databind;

import cn.iocoder.yudao.framework.common.enums.TimeZoneEnum;
import cn.iocoder.yudao.framework.common.enums.WebCommonEnum;
import cn.iocoder.yudao.framework.common.util.servlet.ServletUtils;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Objects;
import java.util.Optional;
import java.util.TimeZone;

public class DynamicTimeZoneTimestampLocalDateTimeSerializer extends JsonSerializer<LocalDateTime> {

    public static final DynamicTimeZoneTimestampLocalDateTimeSerializer INSTANCE;

    static {
        INSTANCE = new DynamicTimeZoneTimestampLocalDateTimeSerializer();
    }

    private DynamicTimeZoneTimestampLocalDateTimeSerializer() {
    }
    @Override
    public void serialize(LocalDateTime localDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        long epochMilli = localDateTime
                .atZone(TimeZoneEnum.UTC_ZONE_ID)
                .toInstant()
                .toEpochMilli();
        jsonGenerator.writeNumber(epochMilli);
    }
}
