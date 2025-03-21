package cn.iocoder.yudao.module.oms.model.dto;

import lombok.Data;

import java.util.List;

/**
 * @description:
 * @author: LaoSan
 * @create: 2025-03-20 11:03
 **/
@Data
public class ErpSkuVariantBridgeDto {

    private Long storeId;
    private String storeName;
    private Long platId;
    private String platName;

    private Long parentId;
    private String parentSku;

    private List<ErpSkuVariantBridgeChildDto> childrenS;

    @Data
    public static class ErpSkuVariantBridgeChildDto {
        private Long childId;
        private String childSku;
    }

}
