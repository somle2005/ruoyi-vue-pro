package cn.iocoder.yudao.framework.redis.serializer;

import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 支持按类型动态 路由 序列化器（支持 byte[] 和 JSON，同时支持时间格式和类型信息）
 */
public class DynamicTypeRoutingRedisSerializer implements RedisSerializer<Object> {

    private final RedisSerializer<Object> jsonSerializer;
    private final RedisSerializer<byte[]> byteArraySerializer;

    public DynamicTypeRoutingRedisSerializer() {
        ObjectMapper mapper = new ObjectMapper();

        // 启用默认类型识别（关键：反序列化后可以强转为 Set<Long>、List<T> 等）
        BasicPolymorphicTypeValidator ptv = BasicPolymorphicTypeValidator.builder()
            .allowIfSubType(Object.class)
            .build();
        mapper.activateDefaultTyping(ptv, ObjectMapper.DefaultTyping.NON_FINAL, JsonTypeInfo.As.PROPERTY);

        //  配置 Java 8 时间模块
        JavaTimeModule javaTimeModule = new JavaTimeModule();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DatePattern.NORM_DATETIME_PATTERN); //不带时区的时间，因为默认就是0区，在MVC的时候统一转换

        javaTimeModule.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer(formatter));
        javaTimeModule.addDeserializer(LocalDate.class, new LocalDateDeserializer(formatter));
        javaTimeModule.addDeserializer(LocalTime.class, new LocalTimeDeserializer(formatter));
        javaTimeModule.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer(formatter));
        javaTimeModule.addSerializer(LocalDate.class, new LocalDateSerializer(formatter));
        javaTimeModule.addSerializer(LocalTime.class, new LocalTimeSerializer(formatter));
        mapper.registerModule(javaTimeModule);

        // 不写时间戳
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        // JSON 序列化器
        this.jsonSerializer = new GenericJackson2JsonRedisSerializer(mapper);
        // 原始字节序列化器
        this.byteArraySerializer = RedisSerializer.byteArray();
    }

    @Override
    public byte[] serialize(Object value) throws SerializationException {
        if (value instanceof byte[] || value instanceof Byte[]) {
            return byteArraySerializer.serialize(toPrimitive(value));
        }
        return jsonSerializer.serialize(value);
    }

    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        try {
            return byteArraySerializer.deserialize(bytes);
        } catch (Exception e) {
            return jsonSerializer.deserialize(bytes);
        }
    }

    private byte[] toPrimitive(Object value) {
        if (value instanceof byte[]) {
            return (byte[]) value;
        } else if (value instanceof Byte[] boxed) {
            byte[] raw = new byte[boxed.length];
            for (int i = 0; i < boxed.length; i++) raw[i] = boxed[i];
            return raw;
        }
        throw new IllegalArgumentException("不支持类型: " + value.getClass());
    }
}
