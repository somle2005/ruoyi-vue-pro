package cn.iocoder.yudao.module.oms.domain.dto;

import cn.iocoder.yudao.module.oms.domain.entity.ErpSkuImage;
import lombok.Data;

import java.util.List;

/**
 * @description:
 * @author: LaoSan
 * @create: 2025-03-21 14:47
 **/
@Data
public class ErpSkuImageDto {

    private Long storeId;
    private String storeName;
    private Long platId;
    private String platName;

    private Long skuId;
    private String sku;

    private List<ErpSkuImage> erpSkuImages;


}
