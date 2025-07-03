package com.somle.xincang.model.resp;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class XinCangTokenResp {

    private Rst rst;
    private Integer errno;
    private String err;

    @Data
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
    public static class Rst {
        private String id;
        private String customerNo;
        private String customerType;
        private String password;
        private String linkUser;
        private String linkInfo;
        private String linkPhone;
        private String companyName;
        private String warehouse;
        private String settlementCurrency;
        private String state;
        private String province;
        private String city;
        private String address;
        private String salesRepresentative;
        private String serviceRepresentative;
        private String creditLine;
        private String creditLineStart;
        private String creditLineEnd;
        private BigDecimal inbillAmount;
        private BigDecimal outbillAmount;
        private BigDecimal leftAmount;
        private String availableLine;
        private String agreementEndDate;
        private String accountOpeningDate;
        private String modelType;
        private String logistics;
        private String isRebackFace;
        private String customerCategory;
        private String remark;
        private String pinyinCode;
        private String pinyinFirstCode;
        private String addUser;
        private String gmtCreate;
        private String gmtModify;
        private String deleted;
        private String version;
        private String token;
        private String tokenExpireTime;
        private String appkey;
        private String secret;
        private String optimalwarehouseSort;
        private String optimalwarehouseRule;
    }
}