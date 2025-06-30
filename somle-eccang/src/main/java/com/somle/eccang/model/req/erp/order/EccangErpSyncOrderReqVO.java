package com.somle.eccang.model.req.erp.order;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangErpSyncOrderReqVO{

    // 基本参数
    private String actionType;                 // 操作类型: ADD/EDIT [必填]
    private Order order;                       // 单头数据 [必填]
    private List<OrderDetail> orderDetails;    // 订单明细 [必填]
    private OrderAddress orderAddress;         // 订单地址 [必填]
    private OrderProperty orderProperty;       // 订单属性
    private List<OrderAttachment> orderAttachment; // 订单附件
    private String orderVerify;                // 是否直接审核: "1"/"0" [默认"0"]
    private String isUniqueReferenceNo;        // 参考号是否唯一: "1"/"0" [默认"0"]
    private String orderCode;                  // 订单号(更新时必填)
    private String isUpdateOrderStatus;        // 是否强制更新订单状态: "1"/"0" [默认"0"]

    // ================= 嵌套对象定义 =================
    @Data
    @Builder
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class Order{
        // 基础信息
        private String platform;               // 平台代码 [必填]
        private String orderType;              // 订单类型: sale/resend/line [必填]
        private String referenceNo;            // 参考号 [必填]
        private String userAccount;            // 账号 [必填]
        private String currency;               // 币种 [必填]
        private String buyerId;                // 买家ID [必填]
        private String buyerName;              // 买家名称 [必填]
        
        // 物流信息
        private String warehouseId;            // 仓库ID
        private String shippingMethod;          // 仓库运输方式
        private String shippingMethodPlatform;  // 平台运输方式代码
        
        // 时间信息
        private LocalDateTime dateCreatePlatform; // 平台创建时间
        private LocalDateTime platformPaidDate; // 付款时间
        private LocalDateTime platformLatestShipDate; // 最晚发货时间
        
        // 金额信息
        private Float shipFee;                 // 平台运费 [默认0.000]
        private Float discount;                // 折扣值
        private Integer discountDeductionMethod; // 折扣扣减逻辑: 0/1/2/3
        private Float subtotal;                // 销售额
        private Float finalvaluefee;           // 交易费
        private Float platformFee;             // 手续费
        private Float otherFee;                // 其他费用
        private Float sellerRebate;            // 平台补贴费
        
        // 订单详情
        private String buyerMail;              // 买家邮箱
        private String site;                   // 订单站点
        private String orderDesc;              // 买家留言
        private String paypalTransactionId;    // PayPal交易ID
        private String transactionId;          // 交易ID
        private String orderStatus;            // 订单状态
        private String cod;                    // 是否货到付款: "1"/"0"
        private String paymentMethod;          // 付款方式
        private String customOrderTypeName;    // 订单自定义类型名称
        private String shippingMethodNo;       // 跟踪号
        private String faceBase64;             // 面单base64内容
        private String faceType;               // 面单类型 [默认pdf]
    }

    @Data
    @Builder
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class OrderDetail {
        private String productSku;             // 销售SKU [必填]
        private Float unitPrice;               // 单价 [必填]
        private Integer productSkuQty;         // 数量 [必填]
        private String productTitle;          // 产品名称 [必填]
        private String productUrl;             // 产品URL
        private String refItemId;              // 跟踪明细ID
        private String opRefTnx;               // 交易明细ID
        private Float unitFinalValueFee;        // 单个交易费 [默认0.000]
        private Float unitTransactionPrice;    // 单个手续费 [默认0.000]
        private Float unitOtherFee;            // 单个其他费用 [默认0.000]
        private String orderRemark;            // 产品备注
        private String platformOrderCode;      // 平台原始订单号
        private String refItemLocation;        // 产品产地
        private Integer action;                 // 是否发货: 0发/1不发 [默认0]
        private String subTradeOrderIndex;     // 子订单序号(速卖通)
        private String properties;             // 商品定制信息(Amazon)
    }

    @Data
    @Builder
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class OrderAddress {
        private String name;                   // 收件人名称 [必填]
        private String countryCode;            // 国家二字码 [必填]
        private String cityName;               // 城市名称 [必填]
        private String postalCode;             // 邮编
        private String line1;                  // 地址第一行 [必填]
        private String line2;                 // 地址第二行
        private String line3;                 // 地址第三行
        private String district;               // 区
        private String state;                 // 州/省
        private String doorplate;              // 门牌号
        private String phone;                 // 电话
        private String company;                // 公司名称
    }

    @Data
    @Builder
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class OrderProperty {
        private String customerServiceNote;    // 客服备注
        private String taxNumber;              // 收件人税号
        private String ioss;                   // IOSS号码
        private String amazonOrderNote;        // Amazon订单备注
        private String amazonCustomizedOrderNote; // Amazon定制备注
        private String consigneeId;            // 收件人ID
    }

    @Data
    @Builder
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class OrderAttachment {
        private String type;                   // 附件类型 [必填]
        private String name;                   // 附件名称 [必填]
        private String content;                // Base64内容 [必填]
    }
}