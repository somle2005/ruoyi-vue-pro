package cn.iocoder.yudao.framework.common.util.json;

import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * JSON 工具类
 *
 * @author 芋道源码
 */
@Slf4j
public class JsonUtils {

    private static final JsonUtilsInternal YUDAO=new JsonUtilsInternal();

    public static final JsonUtilsInternal SOMLE=new JsonUtilsInternal();



    /**
     * 初始化 objectMapper 属性
     * <p>
     * 通过这样的方式，使用 Spring 创建的 ObjectMapper Bean
     *
     * @param objectMapper ObjectMapper 对象
     */
    public static void init(ObjectMapper objectMapper) {
        YUDAO.reset(objectMapper);
    }

    @SneakyThrows
    public static String toJsonString(Object object) {
        return YUDAO.toJsonString(object);
    }

    @SneakyThrows
    public static byte[] toJsonByte(Object object) {
        return YUDAO.toJsonByte(object);
    }

    @SneakyThrows
    public static String toJsonPrettyString(Object object) {
        return YUDAO.toJsonPrettyString(object);
    }

    public static <T> T parseObject(String text, Class<T> clazz) {
        return YUDAO.parseObject(text, clazz);
    }

    public static <T> T parseObject(String text, String path, Class<T> clazz) {
         return YUDAO.parseObject(text, path, clazz);
    }

    public static <T> T parseObject(String text, Type type) {
        return YUDAO.parseObject(text, type);
    }

    /**
     * 将字符串解析成指定类型的对象
     * 使用 {@link #parseObject(String, Class)} 时，在@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS) 的场景下，
     * 如果 text 没有 class 属性，则会报错。此时，使用这个方法，可以解决。
     *
     * @param text 字符串
     * @param clazz 类型
     * @return 对象
     */
    public static <T> T parseObject2(String text, Class<T> clazz) {
        return YUDAO.parseObject2(text, clazz);
    }

    public static <T> T parseObject(byte[] bytes, Class<T> clazz) {
        return YUDAO.parseObject(bytes, clazz);
    }

    public static <T> T parseObject(String text, TypeReference<T> typeReference) {
        return YUDAO.parseObject(text, typeReference);
    }

    /**
     * 解析 JSON 字符串成指定类型的对象，如果解析失败，则返回 null
     *
     * @param text 字符串
     * @param typeReference 类型引用
     * @return 指定类型的对象
     */
    public static <T> T parseObjectQuietly(String text, TypeReference<T> typeReference) {
        return YUDAO.parseObjectQuietly(text, typeReference);
    }

    public static <T> List<T> parseArray(String text, Class<T> clazz) {
        return YUDAO.parseArray(text, clazz);
    }

    public static <T> List<T> parseArray(String text, String path, Class<T> clazz) {
        return YUDAO.parseArray(text, path, clazz);
    }

    public static JsonNode parseTree(String text) {
        return YUDAO.parseTree(text);
    }

    public static JsonNode parseTree(byte[] text) {
        return YUDAO.parseTree(text);
    }

    public static boolean isJson(String text) {
        return JSONUtil.isTypeJSON(text);
    }


    @Slf4j
    public static class JsonUtilsInternal {

        private ObjectMapper objectMapper = new ObjectMapper();



        public JsonUtilsInternal() {

            objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL); // 忽略 null 值
            objectMapper.registerModules(new JavaTimeModule()); // 解决 LocalDateTime 的序列化
            objectMapper.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        }

        public void reset(ObjectMapper objectMapper) {
            this.objectMapper = objectMapper;
        }

        @SneakyThrows
        public String toJsonString(Object object) {

            JavaTimeModule module = new JavaTimeModule();
            module.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            objectMapper.registerModule(module);

            return objectMapper.writeValueAsString(object);
        }

        @SneakyThrows
        public byte[] toJsonByte(Object object) {
            return objectMapper.writeValueAsBytes(object);
        }

        @SneakyThrows
        public String toJsonPrettyString(Object object) {
            return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
        }

        public <T> T parseObject(String text, Class<T> clazz) {
            if (StrUtil.isEmpty(text)) {
                return null;
            }
            try {
                return objectMapper.readValue(text, clazz);
            } catch (IOException e) {
                log.error("json parse err,json:{}", text, e);
                throw new RuntimeException(e);
            }
        }

        public <T> T parseObject(String text, String path, Class<T> clazz) {
            if (StrUtil.isEmpty(text)) {
                return null;
            }
            try {
                JsonNode treeNode = objectMapper.readTree(text);
                JsonNode pathNode = treeNode.path(path);
                return objectMapper.readValue(pathNode.toString(), clazz);
            } catch (IOException e) {
                log.error("json parse err,json:{}", text, e);
                throw new RuntimeException(e);
            }
        }

        public <T> T parseObject(String text, Type type) {
            if (StrUtil.isEmpty(text)) {
                return null;
            }
            try {
                return objectMapper.readValue(text, objectMapper.getTypeFactory().constructType(type));
            } catch (IOException e) {
                log.error("json parse err,json:{}", text, e);
                throw new RuntimeException(e);
            }
        }

        /**
         * 将字符串解析成指定类型的对象
         * 使用 {@link #parseObject(String, Class)} 时，在@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS) 的场景下，
         * 如果 text 没有 class 属性，则会报错。此时，使用这个方法，可以解决。
         *
         * @param text 字符串
         * @param clazz 类型
         * @return 对象
         */
        public <T> T parseObject2(String text, Class<T> clazz) {
            if (StrUtil.isEmpty(text)) {
                return null;
            }
            return JSONUtil.toBean(text, clazz);
        }

        public <T> T parseObject(byte[] bytes, Class<T> clazz) {
            if (ArrayUtil.isEmpty(bytes)) {
                return null;
            }
            try {
                return objectMapper.readValue(bytes, clazz);
            } catch (IOException e) {
                log.error("json parse err,json:{}", bytes, e);
                throw new RuntimeException(e);
            }
        }

        public <T> T parseObject(String text, TypeReference<T> typeReference) {
            try {
                return objectMapper.readValue(text, typeReference);
            } catch (IOException e) {
                log.error("json parse err,json:{}", text, e);
                throw new RuntimeException(e);
            }
        }

        /**
         * 解析 JSON 字符串成指定类型的对象，如果解析失败，则返回 null
         *
         * @param text 字符串
         * @param typeReference 类型引用
         * @return 指定类型的对象
         */
        public <T> T parseObjectQuietly(String text, TypeReference<T> typeReference) {
            try {
                return objectMapper.readValue(text, typeReference);
            } catch (IOException e) {
                return null;
            }
        }

        public <T> List<T> parseArray(String text, Class<T> clazz) {
            if (StrUtil.isEmpty(text)) {
                return new ArrayList<>();
            }
            try {
                return objectMapper.readValue(text, objectMapper.getTypeFactory().constructCollectionType(List.class, clazz));
            } catch (IOException e) {
                log.error("json parse err,json:{}", text, e);
                throw new RuntimeException(e);
            }
        }

        public <T> List<T> parseArray(String text, String path, Class<T> clazz) {
            if (StrUtil.isEmpty(text)) {
                return null;
            }
            try {
                JsonNode treeNode = objectMapper.readTree(text);
                JsonNode pathNode = treeNode.path(path);
                return objectMapper.readValue(pathNode.toString(), objectMapper.getTypeFactory().constructCollectionType(List.class, clazz));
            } catch (IOException e) {
                log.error("json parse err,json:{}", text, e);
                throw new RuntimeException(e);
            }
        }

        public JsonNode parseTree(String text) {
            try {
                return objectMapper.readTree(text);
            } catch (IOException e) {
                log.error("json parse err,json:{}", text, e);
                throw new RuntimeException(e);
            }
        }

        public JsonNode parseTree(byte[] text) {
            try {
                return objectMapper.readTree(text);
            } catch (IOException e) {
                log.error("json parse err,json:{}", text, e);
                throw new RuntimeException(e);
            }
        }

        public boolean isJson(String text) {
            return JSONUtil.isTypeJSON(text);
        }

    }


}



