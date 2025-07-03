package cn.iocoder.yudao.framework.excel.core.convert;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.data.ImageData;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.util.IoUtils;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import lombok.extern.slf4j.Slf4j;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 集合 String URL 转图片，带 Caffeine 缓存
 * 用于 Excel 导出
 *
 * @author wdy
 */
@Slf4j
public class ListImageConverter implements Converter<List<String>> {

    public static final String SIZE_URL = "?x-oss-process=image/resize,w_100";

    // 缓存图片，最多 1000 个，过期时间 30 分钟
    private static final Cache<String, byte[]> imageCache = Caffeine.newBuilder()
        .maximumSize(2000)
        .expireAfterWrite(1, TimeUnit.DAYS)
        .build();

    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.STRING;
    }

    @Override
    public WriteCellData<?> convertToExcelData(List<String> value,
                                               ExcelContentProperty contentProperty,
                                               GlobalConfiguration globalConfiguration) {
        WriteCellData<String> writeCellData = new WriteCellData<>();
        writeCellData.setType(CellDataTypeEnum.STRING);

        if (value == null || value.isEmpty()) {
            log.debug("convertToExcelData[value is empty] 逃过转换IMGs str");
            writeCellData.setStringValue("");
            return writeCellData;
        }
//TODO 使用产品二级缓存
        List<ImageData> imageDataList = new ArrayList<>();

        for (String url : value) {
            String resizedUrl = url + SIZE_URL;
            try {
                // 尝试从缓存获取
                byte[] imageBytes = imageCache.get(resizedUrl, key -> {
                    try {
                        URL imageUrl = new URL(key);
                        byte[] bytes = IoUtils.toByteArray(imageUrl.openConnection().getInputStream());
                        log.info("图片下载成功：{}", imageUrl.getPath());
                        return bytes;
                    } catch (Exception ex) {
                        log.warn("下载图片失败：{}", key, ex);
                        return null;
                    }
                });

                if (imageBytes != null && imageBytes.length > 0) {
                    ImageData imageData = new ImageData();
                    imageData.setImage(imageBytes);
                    imageDataList.add(imageData);
                }

            } catch (Exception e) {
                log.warn("处理图片异常：{}", resizedUrl, e);
            }
        }

        writeCellData.setImageDataList(imageDataList);
        return writeCellData;
    }
}
