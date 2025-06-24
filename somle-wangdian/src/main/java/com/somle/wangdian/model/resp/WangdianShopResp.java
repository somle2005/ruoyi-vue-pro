package com.somle.wangdian.model.resp;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@NoArgsConstructor
public class WangdianShopResp {
    private Integer code;
    private String message;
    private Integer totalCount;
    private List<Shop> shoplist;



    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    @NoArgsConstructor
    public static class Shop {
        private String platformId;
        private String subPlatformId;
        private String shopId;
        private String shopNo;
        private String shopName;
        private String accountId;
        private String accountNick;
        private String provinceName;
        private String cityName;
        private String districtName;
        private String province;
        private String city;
        private String district;
        private String address;
        private String contact;
        private String zip;
        private String mobile;
        private String telno;
        private String remark;
        private String payAccountId;
        private String authState;
        private String pushRdsId;
        private String payAuthState;
        private String appKey;
        private String refreshToken;
        private String shSecret;
        private String authTime;
        private String expireTime;
        private String reExpireTime;
        private String freezeAuthTo;
        private String wmsCheck;
        private String logisticsId;
        private String codLogisticsId;
        private String country;
        private String addressId;
        private String email;
        private String website;
        private String prop1;
        private String prop2;
        private String isHoldEnabled;
        private String isNomerge;
        private String isNosplit;
        private String isForbiddenSetwarebygoods;
        private String isSetwarebygoods;
        private String isUndownloadTrade;
        private String custData;
        private String groupId;
        private String isTopreorder;
        private String isDisabled;
        private String taobaoShopId;
        private String invoicePayeeId;
        private String invoiceProviderId;
        private String paperInvoiceProviderId;
        private String logisticsSyncDelay;
        private String modified;
        private String created;
        private String forbiddenLogisticsList;
        private String shopPriority;
        private String greatDealLimit;
        private String greatDealWarehouse;
    }
}
