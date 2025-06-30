package com.somle.eccang.model.reps.erp.order;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangErpOrderListRespVO {

    // ================= 主响应字段 =================
    private String orderId;                    // 订单ID(易仓主键)
    private String platform;                   // 平台代码 [必填]
    private String orderType;                 // 订单类型: sale/resend/line [必填]
    private String createType;                // 创建类型: api/upload/hand [必填]
    private Integer status;                   // 订单状态: 0-8 [必填]
    private Integer processAgain;              // 处理状态: 1已处理/2未处理/3异常 [必填]
    private String referenceNo;               // 参考单号 [必填]
    private Integer trackStatus;               // 包裹状态: 0-10
    private String trackDeliveredTime;       // 签收时间
    private String orderCode;                 // 销售单号(唯一值) [必填]
    private String referenceNoSys;            // 系统单号 [必填]
    private String warehouseOrderCode;        // 仓库单号 [必填]
    private String companyCode;               // 公司代码 [必填]
    private String userAccount;               // 账号 [必填]
    private String platformUserName;          // 账号别名 [必填]
    private String shippingMethod;            // 仓库运输方式代码
    private String shippingMethodNo;         // 跟踪号
    private String serviceNumber;             // 服务号
    private String shippingMethodPlatform;     // 平台运输方式代码
    private String warehouseId;              // 仓库ID
    private String warehouseCode;             // 仓库代码

    // ================= 时间字段 =================
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateCreate;         // 创建时间

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateDate;         // 更新时间

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime platformPaidDate;   // 平台付款时间

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateCreatePlatform; // 平台创建时间

    private String platformShipDate;          // 平台发货时间

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime warehouseShipDate; // 仓库发货时间

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime platformLatestShipDate; // 最晚发货时间

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime fbaShippingDate;     // FBA发货时间

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateCreateSys;      // 系统创建时间

    // ================= 金额字段 =================
    private Float amountPaid;                 // 总金额 [必填]
    private Float subtotal;                   // 销售额 [必填]
    private Float shipFee;                    // 运费 [必填]
    private Float platformFeeTotal;           // 总手续费 [必填]
    private Float finalvalueFeeTotal;        // 总交易费 [必填]
    private Float otherFee;                  // 其他费用 [必填]
    private Float costShipFee;               // 试算运费 [必填]
    private Float fbaFee;                    // FBA费用 [必填]
    private Float sellerRebate;              // 平台补贴费 [必填]
    private Float tax;                       // 税费

    // ================= 买家信息 =================
    private String buyerId;                   // 买家ID [必填]
    private String buyerName;                 // 买家名称 [必填]
    private String buyerMail;                // 买家邮箱 [必填]
    private String site;                      // 订单站点
    private String countryCode;              // 国家二字码
    private Integer productCount;            // 订单出库数量
    private Float orderWeight;               // 订单重量

    // ================= 订单信息 =================
    private String orderDesc;                 // 买家留言
    private String paypalTransactionId;      // PayPal交易号
    private String paymentMethod;             // 付款方式
    private Integer abnormalType;             // 异常类型: 0-30
    private String abnormalReason;            // 异常信息
    private String customOrderType;          // 自定义订单类型
    private String isMark;                    // 标记状态: 0未标记/1已标记
    private String customerServiceNote;      // 客服备注
    private String discountVal;              // 折扣
    private String paypalAccount;            // PayPal收款账户
    private String isBusinessOrder;          // 是否B2B订单: 0/1
    private String buyerTaxRegistrationId;  // 收税人税号
    private String systemTagEn;              // 系统标记-英文
    private String systemTagZh;              // 系统标记-中文
    private String customTagEn;              // 自定义标记-英文
    private String customTagZh;              // 自定义标记-中文
    private String outboundBatchCarrier;     // 总单承运商
    private String outboundBatchTrackingNo;  // 总单跟踪号
    private String createrUserCode;          // 创建人账号 [必填]
    private String createrUserName;          // 创建人中文名 [必填]
    private String createrUserNameEn;        // 创建人英文名 [必填]
    private String systemNote;               // 系统备注 [必填]
    private String billNo;                   // 账单号 [必填]
    private Integer isReplacementOrder;      // Amazon换货单: 0否/1是
    private Integer isCod;                  // 货到付款订单: 0否/1是
    private Integer isTransferFbaDelivery;   // 转FBA配送: 0否/1是 [必填]
    private Integer fulfillmentType;         // 发货类型: 0自发货/1平台海外仓 [必填]
    private String shopifyAttrStoreName;     // Shopify门市名称
    private String shopifyAttrStoreCode;     // Shopify门市号码
    private String isCustomOrder;           // 定制订单: 1是(Amazon)
    private String amazonOrderNote;          // Amazon订单备注
    private String amazonCustomizedOrderNote;// Amazon定制备注
    private String vatAccount;               // VAT账号
    private String vatTaxRate;              // VAT税率
    private String evaluateShareAmount;      // 测评分摊费用
    private String isMerge;                  // 合并订单状态: 0-4
    private String tradeOrderId;             // 速卖通销售单(半托管平台)

    // ================= 嵌套对象 =================
    private OrderConfigDatas orderConfigDatas;      // 原始订单数据
    private List<OrderDetail> orderDetails;         // 订单明细(get_detail=1时返回)
    private OrderAddress orderAddress;             // 订单地址(get_address=1时返回)

    // ================= 嵌套类定义 =================
    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class OrderConfigDatas {
        private String originalOrderId;        // 平台订单ID
        private String originalAccount;       // 平台账号
        private Object ebayOrders;            // 原始订单数据(JSON字符串)
        private Object ebayOrderDetail;       // 原始订单明细数据(JSON字符串)
    }

    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class OrderDetail {
        private String opId;                  // 主键
        private String platformSku;          // 平台SKU
        private String productSkuInfo;      // SKU对应关系
        private String productSkuList;      // 仓库SKU列表
        private String productSkuQtyList;   // 仓库SKU*数量
        private List<WarehouseSku> warehouseSkuList; // 仓库SKU对象列表
        private Float unitPrice;             // 单价
        private Float itemPrice;             // 商品原单价(Amazon)
        private Float originalUnitPrice;    // 商品原单价(Amazon拉单接口)
        private Integer qty;                 // 数量
        private String productTitle;         // 产品名称
        private String pic;                  // 产品封面图
        private String opSite;               // 产品站点
        private String productUrl;           // 产品URL
        private String opRefItemId;          // 跟踪明细ID
        private String opRefItemLocation;    // 产地/ASIN值
        private Float unitFinalvaluefee;     // 单个交易费
        private Float unitPlatformfee;       // 单个手续费

        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime updateTime;    // 最后更新时间

        private Integer action;              // 是否发货: 0发/1不发
        private String orderCodeOrg;         // 平台原始订单号
        private String opRefTnx;             // 交易明细ID
        private String productSkuOrg;        // 原平台销售SKU
        private Integer productSkuOrgQty;    // 原平台销售SKU数量
        private String remark;               // 产品备注
        private Object promotionIdList;      // 商品促销编码(Amazon)
        private String subTradeOrderIndex;   // 子订单序号(速卖通)
        private String properties;           // 商品定制信息(Amazon)
        private String buyerCustomizedInfoUrl; // 定制信息URL(Amazon)
        private Object buyerCustomizedInfo;   // 原始定制信息(Amazon)
    }

    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class WarehouseSku {
        private String warehouseSku;          // 仓库SKU
        private String warehouseSkuQty;       // 仓库SKU数量
        private String customizedWidth;       // 定制宽
        private String customizedHeight;       // 定制高
        private List<CustomizedArr> customizedArr; // 定制宽高数组
    }

    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class CustomizedArr {
        private String width;                 // 宽
        private String height;                // 高
    }

    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class OrderAddress {
        private String shippingAddressId;     // 主键
        private String name;                  // 收件人名称
        private String companyName;           // 公司名称
        private String countryCode;           // 国家二字码
        private String countryName;           // 国家名称
        private String cityName;              // 城市名称
        private String postalCode;            // 邮编
        private String line1;                 // 地址第一行
        private String line2;                 // 地址第二行
        private String line3;                 // 地址第三行
        private String district;              // 区
        private String state;                 // 州/省
        private String doorplate;             // 门牌号
        private String phone;                 // 电话

        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime createdDate;   // 添加时间

        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime updateDate;     // 更新时间
    }
}