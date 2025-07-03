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

import static cn.hutool.core.date.DatePattern.NORM_DATETIME_FORMATTER;

public class DynamicTimeZoneStringLocalDateTimeSerializer extends JsonSerializer<LocalDateTime> {
    public static final DynamicTimeZoneStringLocalDateTimeSerializer INSTANCE;

    static {
        INSTANCE = new DynamicTimeZoneStringLocalDateTimeSerializer();
    }

    private DynamicTimeZoneStringLocalDateTimeSerializer() {
    }

    @Override
    public void serialize(LocalDateTime localDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        ZoneId toZoneId = TimeZone.getDefault().toZoneId();
        Optional<ZoneId> zoneIdOptional = ServletUtils.getTimeZoneId();
        if (zoneIdOptional.isPresent()) {
            toZoneId = zoneIdOptional.get();
        }
        //        LocalDateTime转换为字符串
        String utcTime = localDateTime
                .atZone(TimeZoneEnum.UTC_ZONE_ID)
                .withZoneSameInstant(toZoneId)
                .toLocalDateTime()
                .format(NORM_DATETIME_FORMATTER);
        jsonGenerator.writeString(utcTime);
    }
}
