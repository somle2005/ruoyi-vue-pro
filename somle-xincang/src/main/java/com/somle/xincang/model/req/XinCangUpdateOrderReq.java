package com.somle.xincang.model.req;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
@Builder
public class XinCangUpdateOrderReq{
    /**
     * 详细地址
     */
    private String address;
    private String address2;
    /**
     * 城市/区
     */
    private String city;
    /**
     * 参考号
     */
    private String ckh;
    /**
     * 国家
     */
    private String country;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 只有当order_type为wayfair时，才需要传。png包含头(data:image/png;base64, )  pdf
     * 包含头(data:application/pdf;base64,)
     */
    private String faceBase64;
    /**
     * 跟踪号
     */
    private String gzh;
    /**
     * 签名服务；填是或否
     */
    private String isSign;
    /**
     * 物流方式
     */
    private String logisticsType;
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 订单类型；必须为common或者wayfair
     */
    private String orderType;
    /**
     * 收件人电话
     */
    private String phone;
    /**
     * 邮编
     */
    private String postcode;
    /**
     * 产品SKU
     */
    private String productSku;
    /**
     * 省/州/府
     */
    private String province;
    /**
     * 收件人姓名
     */
    private String receiveUser;
    /**
     * 数量
     */
    private String skuCount;
    /**
     * 仓库代码
     */
    private String warehouseCode;
}