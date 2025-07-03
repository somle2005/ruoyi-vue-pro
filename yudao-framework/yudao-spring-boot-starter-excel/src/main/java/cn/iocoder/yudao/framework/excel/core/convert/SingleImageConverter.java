package cn.iocoder.yudao.framework.excel.core.convert;


import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.util.IoUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ObjectUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * 单个str转图片
 *
 * @author wdy
 */
@Slf4j
public class SingleImageConverter implements Converter<String> {

    public static int urlConnectTimeout = 2000;
    public static int urlReadTimeout = 6000;

    @Override
    public Class<?> supportJavaTypeKey() {
        return String.class;
    }

    @Override
    public WriteCellData<?> convertToExcelData(String value,
                                               ExcelContentProperty contentProperty,
                                               GlobalConfiguration globalConfiguration) throws IOException {
        InputStream inputStream = null;
        try {
            if (ObjectUtils.isEmpty(value)) {
                return new WriteCellData<>(new byte[0]);
            }
            //https://help.aliyun.com/zh/oss/user-guide/resize-images-4?spm=a2c4g.11186623.0.0.1f96f6ce36u09I#concept-hxj-c4n-vdb
            //阿里云OSS缩放图片，不然excel体积太大
            //# Excel 导出使用：宽度 150，自动等比缩放
            //?x-oss-process=image/resize,w_150
            URL url = new URL(value + ExcelImageListConverter.SIZE_URL); // 将 String 转为 URL
            URLConnection urlConnection = url.openConnection();
            urlConnection.setConnectTimeout(urlConnectTimeout);
            urlConnection.setReadTimeout(urlReadTimeout);

            inputStream = urlConnection.getInputStream();
            byte[] bytes = IoUtils.toByteArray(inputStream);
            log.info("图片下载成功：{}", url.getPath());
            return new WriteCellData<>(bytes);
        } catch (MalformedURLException e) {
            log.warn("图片链接格式错误：{}", value, e);
            return new WriteCellData<>("图片链接格式错误");
        } catch (Exception e) {
            log.warn("图片下载异常：{}", value, e);
            return new WriteCellData<>("图片下载失败");
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}

