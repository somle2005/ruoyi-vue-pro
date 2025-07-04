package cn.iocoder.yudao.framework.excel.core.convert;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.data.ImageData;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * List<byte[]> -> 图片，用于 Excel 导出
 * 每个 byte[] 表示一张图片
 * 使用 @ExcelProperty(converter = ImageListConverter.class) 注解生效
 */
@Slf4j
public class ImageListConverter implements Converter<List<byte[]>> {

    @Override
    public Class<?> supportJavaTypeKey() {
        return List.class;
    }

    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.STRING; // 实际写入图片，但使用 STRING 作为类型占位
    }

    @Override
    public WriteCellData<?> convertToExcelData(List<byte[]> value,
                                               ExcelContentProperty contentProperty,
                                               GlobalConfiguration globalConfiguration) {
        WriteCellData<String> writeCellData = new WriteCellData<>();
        writeCellData.setType(CellDataTypeEnum.STRING);

        if (value == null || value.isEmpty()) {
            log.debug("convertToExcelData[value is empty] 跳过图片转换");
            writeCellData.setStringValue("");
            return writeCellData;
        }

        List<ImageData> imageDataList = new ArrayList<>();
        for (byte[] imageBytes : value) {
            if (imageBytes != null && imageBytes.length > 0) {
                try {
                    ImageData imageData = new ImageData();
                    imageData.setImage(imageBytes);
                    imageDataList.add(imageData);
                } catch (Exception e) {
                    log.warn("转换图片失败，大小: {}", imageBytes.length, e);
                }
            }
        }

        writeCellData.setImageDataList(imageDataList);
        return writeCellData;
    }
}
