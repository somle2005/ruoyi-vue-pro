package cn.iocoder.yudao.framework.excel.core.convert;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.data.ImageData;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.util.IoUtils;
import lombok.extern.slf4j.Slf4j;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * 对于集合string处理图片
 *
 * @author wdy
 */
@Slf4j
public class ExcelImageListConverter implements Converter<List<String>> {
    //https://help.aliyun.com/zh/oss/user-guide/resize-images-4?spm=a2c4g.11186623.0.0.1f96f6ce36u09I#concept-hxj-c4n-vdb
    //阿里云OSS缩放图片，不然excel体积太大
    //# Excel 导出使用：宽度 150，自动等比缩放
    //?x-oss-process=image/resize,w_150
    public static String SIZE_URL = "?x-oss-process=image/resize,w_100";

    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.STRING;
    }

    @Override
    public WriteCellData<?> convertToExcelData(List<String> value, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) {
        WriteCellData<String> writeCellData = new WriteCellData<>();
        // 1. 为空时直接返回提示
        if (value == null || value.isEmpty()) {
            log.debug("convertToExcelData[value is empty] 逃过转换IMGs str");
            writeCellData.setStringValue("");
            writeCellData.setType(CellDataTypeEnum.STRING);
            return writeCellData;
        }

        List<ImageData> imageDataList = new ArrayList<>();
        for (String url : value) {
            try {
                //https://help.aliyun.com/zh/oss/user-guide/resize-images-4?spm=a2c4g.11186623.0.0.1f96f6ce36u09I#concept-hxj-c4n-vdb
                //阿里云OSS缩放图片，不然excel体积太大
                //# Excel 导出使用：宽度 150，自动等比缩放
                //?x-oss-process=image/resize,w_150
                URL imageUrl = new URL(url + SIZE_URL);
                byte[] bytes = IoUtils.toByteArray(imageUrl.openConnection().getInputStream());
                ImageData imageData = new ImageData();
                imageData.setImage(bytes);
                imageDataList.add(imageData);
                //info
                log.info("图片下载成功：{}", imageUrl.getPath());
            } catch (Exception e) {
                log.error("图片下载异常：{}", url, e);
            }
        }

        writeCellData.setImageDataList(imageDataList);
        writeCellData.setType(CellDataTypeEnum.STRING);
        return writeCellData;
    }
}

