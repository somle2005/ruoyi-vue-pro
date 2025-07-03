package com.somle.xincang.model.resp;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class XinCangProductListResp {
    private Rst rst;
    private Integer errno;
    private String err;

    @Data
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
    public static class Rst {
        private String code;
        private String msg;
        private List<Product> data;
        private String count;
    }

    @Data
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
    public static class Product {
        private String id;
        private String productNo;
        private String productCode;
        private String productImage;
        private String chnName;
        private String enName;
        private String customerId;
        private String customerName;
        private BigDecimal amount;
        private String cubic;
        private String upcCode;
        private String barCode;
        private String outBarCode;
        private String packingRate;
        private String warehouseCode;
        private String ckm;
        private String outboxCode;
        private String outboxCapacity;
        private String customsWeight;
        private BigDecimal weightKg;
        private BigDecimal weightLbs;
        private BigDecimal sizeLCm;
        private BigDecimal sizeWCm;
        private BigDecimal sizeHCm;
        private BigDecimal sizeLLn;
        private BigDecimal sizeWLn;
        private BigDecimal sizeHLn;
        private BigDecimal volumeCm;
        private BigDecimal volumeLn;
        private BigDecimal outSizeLCm;
        private BigDecimal outSizeWCm;
        private BigDecimal outSizeHCm;
        private BigDecimal outSizeLLn;
        private BigDecimal outSizeWLn;
        private BigDecimal outSizeHLn;
        private String weightVolume;
        private String ahsDimensions;
        private String ahsWeight;
        private String oversize;
        private String unauthorized;
        private String productProp;
        private String remark;
        private String textHtml;
        private String fileName;
        private String pinyinCode;
        private String pinyinFirstCode;
        private String addUser;
        private String gmtCreate;
        private String gmtModify;
        private String deleted;
        private String state;
        private BigDecimal volumeM;
        private String stateName;
    }
}