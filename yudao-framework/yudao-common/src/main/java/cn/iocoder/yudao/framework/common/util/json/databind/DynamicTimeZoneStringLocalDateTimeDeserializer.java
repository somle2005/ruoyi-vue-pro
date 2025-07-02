package cn.iocoder.yudao.framework.common.util.json.databind;

import cn.iocoder.yudao.framework.common.enums.TimeZoneEnum;
import cn.iocoder.yudao.framework.common.enums.WebCommonEnum;
import cn.iocoder.yudao.framework.common.util.servlet.ServletUtils;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Objects;
import java.util.Optional;
import java.util.TimeZone;

import static cn.hutool.core.date.DatePattern.NORM_DATETIME_FORMATTER;


public class DynamicTimeZoneStringLocalDateTimeDeserializer extends JsonDeserializer<LocalDateTime> {

    public static final DynamicTimeZoneStringLocalDateTimeDeserializer INSTANCE;

    static {
        INSTANCE = new DynamicTimeZoneStringLocalDateTimeDeserializer();
    }

    private DynamicTimeZoneStringLocalDateTimeDeserializer() {
    }

    @Override
    public LocalDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        ZoneId formZoneId = TimeZone.getDefault().toZoneId();
        Optional<ZoneId> zoneIdOptional = ServletUtils.getTimeZoneId();
        if (zoneIdOptional.isPresent()) {
            formZoneId = zoneIdOptional.get();
        }
//        字符串转换为LocalDateTime
        String valueAsString = jsonParser.getValueAsString();
        return LocalDateTime.parse(valueAsString, NORM_DATETIME_FORMATTER)
                .atZone(formZoneId)
                .withZoneSameInstant(TimeZoneEnum.UTC_ZONE_ID)
                .toLocalDateTime();
    }
}
