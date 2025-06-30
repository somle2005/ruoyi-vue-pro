package com.somle.eccang.model.req.wms.order;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangWMSCheckAddressReqVO {

    // 必填参数
    private String countryCode;     // 收件人国家二字码,参考getCountry
    private String shippingMethod;  // 运输方式,参考getShippingMethod
    
    // 可选参数
    private String consigneeProvince;  // 省
    private String consigneeCity;      // 城市
    private String consigneeStreet;    // 地址1 (length:30)
    private String consigneeStreet1;   // 地址2 (length:30)
    private String consigneeStreet2;   // 地址3 (length:30)
    private String consigneePostcode;  // 邮编
    private String consigneeAreacode; // 地区代码
    private String consigneeDoorplate; // 门牌号
    private String consigneeCompany;   // 公司名
    private String consigneeName;      // 收件人姓名
    private String consigneeTelephone; // 收件人联系方式
    private String consigneeEmail;     // 收件人邮箱
    private String consigneeFax;       // 传真
    private String apiCheck;           // 是否调用服务商接口校验地址
}