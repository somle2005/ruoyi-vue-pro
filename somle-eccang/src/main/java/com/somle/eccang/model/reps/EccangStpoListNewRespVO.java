package com.somle.eccang.model.reps;


import cn.hutool.core.date.DateTime;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
//eccang-StpoListNew 响应体
public class EccangStpoListNewRespVO {
    private String orderCode; // 订单号
    private String stpoCode; // 头程单号
    private String referenceNo; // 入库单号
    private String tpCode; // 下架单号
    private DateTime addTime; // 创建时间
    private DateTime updateTime; // 更新时间
    private DateTime shipTime; // 出库时间
    private DateTime expectedDate; // 预计到货时间
    private String trackingNumber; // 跟踪号
    private String refNo; // 参考号
    private String receivingStatus; // 收货状态
    private String userAccount; // 平台账号
    private String toWarehouse; // 目的仓库
    private Integer toWarehouseId; // 目的仓库ID
    private String warehouse; // 发运仓库
    private Integer warehouseId; // 发运仓库ID
    private String smCode; // 运输方式代码
    private String smNameCn; // 运输方式代码中文名称
    private String destination; // 目的地
    private Float headFreight; // 头程费用
    private Float headTariff; // 头程关税
    private String costCurrencyCode; // 头程费用币种
    private String tariffCurrencyCode; // 头程关税币种
    private String parcelQuantity; // 内件数
    private String boxCount; // 数量（箱）
    private Float amount; // 金额
    private List<ReceivingAndPurchaseEntry> receivingAndPurchase; // SKU的采购单号/入库单号
    private String soWeight; // 包裹重量（kg）
    private String systemWeight; // 系统重量（kg）
    private String remark; // 备注
    private String oabName; // 收件人
    private String oabPhone; // 联系电话
    private String oabFax; // 传真
    private String oabCompany; // 收件人公司
    private String oabEmail; // 收件人电子邮件
    private String oabPostcode; // 收件人邮编
    private String oabCounty; // 收件人国家
    private String oabState; // 收件人州/区域
    private String oabCity; // 收件人城市
    private String oabStreetAddress1; // 收件人地址1
    private String oabStreetAddress2; // 收件人地址2
    private String oabDoorplate; // 收件人门牌号
    private Integer createUserId; // 创建人ID
    private String createUser; // 创建人名称
    private Integer stpoStatus; // 单据状态枚举
    private String stpoStatusName; // 单据状态名称
    private List<Product> productInfo; // 订单产品信息
    private List<PackingInfo> packingInfo; // 装箱单信息
    private JsonNode dgOrderInfo; // 轨迹信息
    private List<PackingReceivingAndPurchaseEntry> packingReceivingAndPurchaseInfo; // 装箱批次信息
    private String stpoCancelPlanRemark; // 回退备注
    private String isStraight; // 是否直发

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class Product{
        private String productTitle; // 产品名称
        private String productBarcode; // 产品代码
        private String barcodeCode; // 三方仓库产品代码
        private String opQuantity; // 产品数量
        private Float weight; // 产品单重（kg）
        private String volume; // 产品体积（cm³）
        private DateTime opRefPaydate; // 产品付款时间
        private Float totalWeight; // 产品总重量（kg，产品单重*产品数量）
        private List<String> serialNoList; // 序列号（beta版待上线）
        private List<String> customNumber; // 批次号（自定义批次号）（beta版待上线）
    }
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class PackingInfo{
        private String referenceNo; // 参考号
        private String tppCode; // 装箱单号
        private Integer tppQuantity; // 产品数量
        private Float tppWeight; // 重量（kg）
        private String tppVolume; // 体积（cm³）
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class DgOrder{
        // 提单号
        private String billNo;
        // 柜号
        private String counterNo;
        // 报关单号
        private Integer customsNo;
        // 船公司代码
        private Float shippingCompanyCode;
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class ReceivingAndPurchaseEntry{
        // 产品SKU
        private String productBarcode;
        // 入库单号
        private String receivingCode;
        // 采购单号
        private String poCode;
        // 数量
        private Integer quantity;
    }


    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class PackingReceivingAndPurchaseEntry {
        // 产品代码
        private String productBarcode;
        // 入库单号
        private String receivingCode;
        // 采购单号
        private String poCode;
        // 装箱参考号
        private String referenceNo;
        // 装箱单号
        private String tppCode;
        // 数量
        private Integer quantity;
        // 箱重（kg）
        private Float tppWeight;
        // 箱体积（cm³）
        private String tppVolume;
    }

}
