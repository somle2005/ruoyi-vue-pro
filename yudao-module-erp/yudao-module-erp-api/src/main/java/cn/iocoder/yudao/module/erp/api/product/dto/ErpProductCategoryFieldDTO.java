package cn.iocoder.yudao.module.erp.api.product.dto;

import lombok.*;


@Data
public class ErpProductCategoryFieldDTO {

    /**
     * ID
     */
    private Long id;
    /**
     * 分类id
     */
    private Long categoryId;
    /**
     * 字段id
     */
    private Long fieldId;

}