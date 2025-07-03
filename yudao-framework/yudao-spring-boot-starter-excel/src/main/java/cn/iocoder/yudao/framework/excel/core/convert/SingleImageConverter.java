package cn.iocoder.yudao.framework.excel.core.convert;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.util.IoUtils;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ObjectUtils;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;

/**
 * 单个 str 转图片，带 Caffeine 缓存
 *
 * @author wdy
 */
@Slf4j
public class SingleImageConverter implements Converter<String> {

    private static final int CONNECT_TIMEOUT = 2000;
    private static final int READ_TIMEOUT = 6000;
    //https://help.aliyun.com/zh/oss/user-guide/resize-images-4?spm=a2c4g.11186623.0.0.1f96f6ce36u09I#concept-hxj-c4n-vdb
    //缩放 宽度150
    private static final String RESIZE_SUFFIX = "?x-oss-process=image/resize,w_150";

    // Caffeine 本地缓存
    private static final Cache<String, byte[]> imageCache = Caffeine.newBuilder()
        .maximumSize(2000)
        .expireAfterWrite(1, TimeUnit.DAYS)
        .build();

    @Override
    public Class<?> supportJavaTypeKey() {
        return String.class;
    }

    @Override
    public WriteCellData<?> convertToExcelData(String value,
                                               ExcelContentProperty contentProperty,
                                               GlobalConfiguration globalConfiguration) {
        if (ObjectUtils.isEmpty(value)) {
            return new WriteCellData<>(new byte[0]);
        }
//TODO 使用产品二级缓存
        String resizedUrl = value + RESIZE_SUFFIX;

        try {
            // 尝试从缓存获取图片字节
            byte[] imageBytes = imageCache.get(resizedUrl, url -> {
                try {
                    URLConnection conn = new URL(url).openConnection();
                    conn.setConnectTimeout(CONNECT_TIMEOUT);
                    conn.setReadTimeout(READ_TIMEOUT);
                    try (InputStream in = conn.getInputStream()) {
                        byte[] bytes = IoUtils.toByteArray(in);
                        log.info("图片下载成功：{}", url);
                        return bytes;
                    }
                } catch (Exception e) {
                    log.warn("图片下载失败：{}", url, e);
                    return null; // 缓存中不保存 null
                }
            });

            if (imageBytes == null || imageBytes.length == 0) {
                return new WriteCellData<>("图片下载失败");
            }

            return new WriteCellData<>(imageBytes);

        } catch (Exception e) {
            log.warn("图片处理异常：{}", value, e);
            return new WriteCellData<>("图片处理失败");
        }
    }
}
