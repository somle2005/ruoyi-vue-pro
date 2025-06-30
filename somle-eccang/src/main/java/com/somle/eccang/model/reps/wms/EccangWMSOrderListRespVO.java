package com.somle.eccang.model.reps.wms;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangWMSOrderListRespVO {
        private String orderId;                  // 订单ID
        private String orderBusinessType;        // 业务类型(b2c)
        private String companyCode;              // 公司代码
        private String orderCode;                // 订单号
        private String swOrderNumber;            // 公共平台订单号
        private String referenceNo;              // 参考号
        private String platform;                 // 平台(ALIEXPRESS)
        private String orderStatus;              // 订单状态("4")
        private String shippingMethod;           // 运输方式代码("A6")
        private String trackingNo;              // 跟踪号
        private String carrierName;              // 承运商名称
        private String returnSlipNumber;         // 退货单号
        private String warehouseCode;            // 仓库代码
        private Double orderWeight;              // 订单重量
        private String orderDesc;                // 订单描述
        private String orderVolume;              // 订单体积
        
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime dateCreate;                // 创建时间
        
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime dateRelease;               // 发布时间
        
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime dateShipping;              // 发货时间
        
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime dateModify;                // 修改时间
        
        @JsonProperty("consignee_country_code") // 特殊处理蛇形字段
        private String consigneeCountryCode;     // 收货人国家代码("RU")
        
        private String consigneeCountryName;     // 收货人国家名称("RUSSIA")
        private String consigneeState;           // 收货人州/省
        private String consigneeCity;            // 收货人城市
        private String consigneeStreet1;         // 收货人街道1
        private String consigneeStreet2;         // 收货人街道2
        private String consigneeStreet3;         // 收货人街道3
        private String consigneeDistrict;        // 收货人区/县
        private String consigneeZipcode;         // 收货人邮编("800600")
        private String consigneeDoorplate;       // 收货人门牌号
        private String consigneeCompany;         // 收货人公司
        private String consigneeName;            // 收货人姓名
        private String consigneePhone;           // 收货人电话("186649857042")
        private String consigneeEmail;           // 收货人邮箱
        private String platformShop;             // 平台店铺
        private String currency;                 // 币种
        private String abnormalReason;          // 异常原因
        private String courierName;              // 快递员名称
        private Boolean isOrderCod;              // 是否货到付款
        private Double orderCodPrice;            // 货到付款金额
        private String orderCodCurrency;         // 货到付款币种("AUD")
        private String warehouseNote;            // 仓库备注
        private String createType;               // 创建方式("手工创建")
        private String transferOrderNo;          // 转移订单号
        private String serviceNumber;             // 服务号
        
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime shipBatchTime;              // 发货批次时间
        
        private Boolean isSignature;             // 是否签名
        private Double insuranceValue;           // 保险金额
        private String insuranceValueCurrency;   // 保险货币("USD")
        
        private FeeDetails feeDetails;           // 费用详情
        private List<FeeItem> feeItems;          // 费用项目列表
        private List<OrderItem> items;           // 订单项列表
        private List<InventoryBatch> inventoryBatchOut; // 出库批次
        
        // 海关信息
        private Integer isVip;                   // 是否VIP(1)
        private String invoiceNumber;             // 发票号("659825")
        private String consigneeTaxNumber;        // 收货人税号
        private String orderBatteryType;          // 订单电池类型
        private Integer allotStatus;              // 分配状态(1)
        private String customsCompanyName;        // 清关公司名称
        private String customsAddress;            // 清关地址
        private String customsContactName;        // 清关联系人姓名
        private String customsEmail;              // 清关邮箱
        private String customsTaxCode;            // 清关税号("156156156")
        private String customsPhone;              // 清关电话("15625231521")
        private String customsCity;               // 清关城市
        private String customsState;              // 清关州/省
        private String customsCountryCode;        // 清关国家代码("CN")
        private String customsPostcode;           // 清关邮编("434400")
        private String customsDoorplate;          // 清关门牌号
        private String vatTaxCode;                // 增值税号("145451465")
        private String distributionInformation;  // 分发信息
        private Integer consigneeTaxType;         // 收货人税务类型(2)
        private String apiSource;                 // API来源("mabangerp")
        private Integer addressType;             // 地址类型(0)
        private Integer isAllowOpen;              // 是否允许开箱
        private Integer isPrime;                  // 是否Prime
        
        private List<OrderPackBox> orderPackBox;  // 订单包装箱列表
        
        private BatchInfo batchInfo;              // 批次信息
        private Double orderSaleAmount;           // 订单销售金额
        private String orderSaleCurrency;         // 订单销售币种("CNY")

    
    // 费用详情
    @Data
    @NoArgsConstructor
    public static class FeeDetails {
        private Double totalFee;                 // 总费用("12058.700")
        private Double shipping;                 // 运输费("12000.000")
        private Double opf;                      // OPF费("52.700")
        private Double fsc;                      // FSC费("0.000")
        private Double rsf;                      // RSF费("0.000")
        private Double whf;                      // WHF费("0.000")
        private Double dt;                        // DT费("0.000")
        private Double skuFee;                   // SKU费("0.000")
        private Double otf;                       // OTF费("0.000")
        private String feeStatus;                // 费用状态("未核账")
        
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime feeTime;                   // 费用时间
    }
    
    // 费用项目
    @Data
    @NoArgsConstructor
    public static class FeeItem {
        private String ftCode;                  // 费用类型代码
        private Double amount;                   // 金额
        private String currencyCode;             // 币种代码("HGH","CLK")
    }
    
    // 订单项
    @Data
    @NoArgsConstructor
    public static class OrderItem {
        private String productSku;               // 产品SKU("M-001")
        private Integer quantity;                // 数量("1")
        private String serialNumber;             // 序列号("156152")
        private String ebayItemId;               // eBay商品ID("1653123232136")
        private String ebayTransactionId;        // eBay交易ID("2312121219006")
    }
    
    // 库存批次
    @Data
    @NoArgsConstructor
    public static class InventoryBatch {
        private String receivingCode;            // 收货代码
        private String productBarcode;           // 产品条码
        private Integer quantity;                 // 数量
    }
    
    // 包装箱
    @Data
    @NoArgsConstructor
    public static class OrderPackBox {
        private String boxCode;                  // 箱码("A001-180810-0019-1")
        private Integer boxNum;                  // 箱数("1")
        private Double boxLength;                // 箱长("100.000")
        private Double boxWidth;                 // 箱宽("100.000")
        private Double boxHeight;                // 箱高("100.000")
        private Double boxWeight;                // 箱重("100.00")
        private Integer productQty;              // 产品数量("10")
        private String trackingNumber;           // 跟踪号("111")
        private String ppBarcode;                // PP条码("P000001")
        private List<ProductDetail> productDetails; // 产品详情
        private List<FeeItem> feeItems;          // 费用项目
    }
    
    // 产品详情
    @Data
    @NoArgsConstructor
    public static class ProductDetail {
        private String productBarcode;            // 产品条码("TC-007EWEWEW")
        private Integer quantity;                 // 数量("1")
    }
    
    // 批次信息
    @Data
    @NoArgsConstructor
    public static class BatchInfo {
        private String productSku;               // 产品SKU("RYGB0000007")
        private String inventoryCode;             // 库存代码
        private Integer skuQuantity;              // SKU数量("1")
    }
}