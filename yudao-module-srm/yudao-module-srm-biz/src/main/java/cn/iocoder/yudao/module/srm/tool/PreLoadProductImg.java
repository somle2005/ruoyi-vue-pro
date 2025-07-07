package cn.iocoder.yudao.module.srm.tool;

import cn.iocoder.yudao.module.erp.api.product.ErpProductApi;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductImageRespDTO;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 图片预热工具类
 */
public class PreLoadProductImg {
    /**
     * 预热并填充Excel导出图片字段
     *
     * @param hasImg     是否需要图片
     * @param excelList  Excel导出VO列表，需实现ProductImgExportable接口
     * @param productApi 产品API
     * @param <T>        VO类型
     */
    public static <T extends ProductImgExportable> void preLoadProductImg(Boolean hasImg, List<T> excelList, ErpProductApi productApi) {
        if (hasImg != null && hasImg && excelList != null && !excelList.isEmpty()) {
            Set<Long> productIds = excelList.stream()
                .map(ProductImgExportable::getProductId)
                .filter(Objects::nonNull)
                .collect(Collectors.toSet());
            productApi.preloadProductImages(productIds);
            for (T vo : excelList) {
                ErpProductImageRespDTO imgDTO = productApi.getProductImageDTOListByProductId(vo.getProductId());
                Optional.ofNullable(imgDTO.getImg()).ifPresent(vo::setPrimaryImage);
                Optional.ofNullable(imgDTO.getImg2()).ifPresent(imgList -> vo.setSecondaryImageList(Arrays.asList(imgList)));
            }
        }
    }

    /**
     * 图片导出VO接口，需由Excel VO实现
     */
    public interface ProductImgExportable {
        Long getProductId();

        void setPrimaryImage(byte[] img);

        void setSecondaryImageList(List<byte[]> imgList);
    }
}
