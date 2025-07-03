package com.somle.xincang.model.req;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
@Builder
public class XinCangUpdateProductReq {
    /**
     * AHS尺寸：0=>否，1=>是，默认为0
     */
    private String ahsDimensions;
    /**
     * AHS重：0=>否，1=>是，默认为0
     */
    private String ahsWeight;
    /**
     * 金额
     */
    private String amount;
    /**
     * 产品条码
     */
    private String barCode;
    /**
     * 中文名
     */
    private String chnName;
    /**
     * 仓库码
     */
    private String ckm;
    /**
     * OVERSIZE：0=>否，1=>是，默认为0
     */
    private String oversize;
    /**
     * 装箱率/箱率
     */
    private String packingRate;
    /**
     * 产品图片
     */
    private String productImage;
    /**
     * SKU
     */
    private String productNo;
    /**
     * 备注
     */
    private String remark;
    /**
     * 高度(in)
     */
    private String sizeHLn;
    /**
     * 长度(in)
     */
    private String sizeLLn;
    /**
     * 宽度(in)
     */
    private String sizeWLn;
    private String token;
    /**
     * 毛重(lbs)
     */
    private String weightLbs;
}