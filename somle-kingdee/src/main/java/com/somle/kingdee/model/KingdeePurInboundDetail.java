package com.somle.kingdee.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * 金蝶采购入库单详情
 *
 * @author: wdy
 */
@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class KingdeePurInboundDetail {
    // 应付款余额
    private double allDebt;
    // 审核时间
    private String auditTime;
    // 审核人id
    private String auditorId;
    // 审核人名称
    private String auditorName;
    // 审核人编码
    private String auditorNumber;
    // 单据日期
    private String billDate;
    // 整单折扣额
    private double billDisAmount;
    // 整单折扣率
    private double billDisRate;
    // 单据编码
    private String billNo;
    // 单据状态，Z：未审核，C：已审核
    private String billStatus;
    // 联系地址 敏感数据解密
    private String contactAddress;
    // 客户市区id
    private String contactCityId;
    // 客户市区名称
    private String contactCityName;
    // 客户市区编码
    private String contactCityNumber;
    // 客户国家id
    private String contactCountryId;
    // 客户国家名称
    private String contactCountryName;
    // 客户国家编码
    private String contactCountryNumber;
    // 客户区县id
    private String contactDistrictId;
    // 客户区县名称
    private String contactDistrictName;
    // 客户区县编码
    private String contactDistrictNumber;
    // 联系信息-联系方式 敏感数据解密
    private String contactPhone;
    // 客户省份id
    private String contactProvinceId;
    // 客户省份名称
    private String contactProvinceName;
    // 客户省份编码
    private String contactProvinceNumber;
    // 采购费用明细
    private CostFeeEntity costFeeEntity;
    // 创建时间
    private String createTime;
    // 创建人id
    private String creatorId;
    // 创建人名称
    private String creatorName;
    // 创建人编码
    private String creatorNumber;
    // 币别id
    private String currencyId;
    // 自定义字段使用指南
    private Map<String, String> customField;
    // 客户id
    private String customerId;
    // 客户名称
    private String customerName;
    // 客户编码
    private String customerNumber;
    // 部门id
    private String deptId;
    // 部门名称
    private String deptName;
    // 部门编码
    private String deptNumber;
    // 发货地址-详细地址 敏感数据解密
    private String dispatcherAddress;
    // 发货地址-市ID
    private String dispatcherCityId;
    // 发货市区名称
    private String dispatcherCityName;
    // 发货市区编码
    private String dispatcherCityNumber;
    // 发货国家id
    private String dispatcherCountryId;
    // 发货国家名称
    private String dispatcherCountryName;
    // 发货国家编码
    private String dispatcherCountryNumber;
    // 发货地址-区ID
    private String dispatcherDistrictId;
    // 发货区县名称
    private String dispatcherDistrictName;
    // 发货区县编码
    private String dispatcherDistrictNumber;
    // 发货人
    private String dispatcherLinkman;
    // 发货联系电话 敏感数据解密
    private String dispatcherPhone;
    // 发货地址-省ID
    private String dispatcherProvinceId;
    // 发货省份名称
    private String dispatcherProvinceName;
    // 发货省份编码
    private String dispatcherProvinceNumber;
    // 结算日期
    private String dueDate;
    // 付款账户id
    private String editPayAccountId;
    // 付款账户名称
    private String editPayAccountName;
    // 付款账户编码
    private String editPayAccountNumber;
    // 支出类别id
    private String editPayTypeId;
    // 付款方式名称
    private String editPayTypeName;
    // 付款方式编码
    private String editPayTypeNumber;
    // 业务员id
    private String empId;
    // 业务员名称
    private String empName;
    // 业务员编码
    private String empNumber;
    // 汇率
    private double exchangeRate;
    // 单据ID
    private String id;
    // 上次欠款余额
    private double lastDebt;
    // 商品分录
    private List<MaterialEntity> materialEntity;
    // 修改人id
    private String modifierId;
    // 修改人名称
    private String modifierName;
    // 修改人编码
    private String modifierNumber;
    // 修改时间
    private String modifyTime;
    // 付款信息单据体
    private List<PaymentEntry> paymentEntry;
    // 备注
    private String remark;
    // 结算期限id
    private String settingTermId;
    // 结算期限名称
    private String settingTermName;
    // 结算期限编码
    private String settingTermNumber;
    // 本单核销状态
    private String settleStatus;
    // 供应商id
    private String supplierId;
    // 供应商名称
    private String supplierName;
    // 供应商编码
    private String supplierNumber;
    // 本次应付账款
    private double totalAmount;
    // 付款合计
    private double totalInsAmount;
    // 抵扣预付款
    private double totalPreAmount;
    // 已核销金额
    private double totalUnsettleAmount;
    // 已核销金额（本位币）
    private double totalUnsettleAmountFor;
    // 业务类型
    private String transType;

    /**
     * 商品分录
     */
    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class MaterialEntity {
        // 价税合计
        private double allAmount;
        // 价税合计本位币
        private double allAmountFor;
        // 辅助换算率
        private double auxCoefficient;
        // 辅助属性1id
        private String auxId1;
        // 辅助属性2id
        private String auxId2;
        // 辅助属性3id
        private String auxId3;
        // 辅助属性1名称
        private String auxName1;
        // 辅助属性2名称
        private String auxName2;
        // 辅助属性3名称
        private String auxName3;
        // 辅助属性1编码
        private String auxNumber1;
        // 辅助属性2编码
        private String auxNumber2;
        // 辅助属性3编码
        private String auxNumber3;
        // 辅助属性id
        private String auxPropId;
        // 辅助属性名称
        private String auxPropName;
        // 辅助属性编码
        private String auxPropNumber;
        // 辅助单位数量
        private double auxQty;
        // 辅助单位id
        private String auxUnitId;
        // 辅助单位名称
        private String auxUnitName;
        // 辅助单位编码
        private String auxUnitNumber;
        // 条形码
        private String barcode;
        // 基本数量
        private double baseQty;
        // 基本单位id
        private String baseUnitId;
        // 基本单位名称
        private String baseUnitName;
        // 基本单位编码
        private String baseUnitNumber;
        // 批次号
        private String batchNo;
        // 增值税率
        private double cess;
        // 换算率
        private double coefficient;
        // 行备注
        private String comment;
        // 换算公式
        private String conversionRate;
        // 入库成本
        private double costView;
        // 本次核销金额
        private double curSettleAmountFor;
        // 自定义字段使用指南
        private Map<String, String> customEntityField;
        // 辅助基本数量
        private double defFloatQty;
        // 折扣率
        private double disRate;
        // 折扣（小数）
        private double discount;
        // 分录核销状态
        private String entrySettleStatus;
        // 分录ID
        private String id;
        // 基本库存数量
        private double invBaseQty;
        // 库存数量
        private double invQty;
        // 生产日期
        private String kfDate;
        // 保质期天数
        private int kfPeriod;
        // 保质期类型，1：天，2：月，3：年
        private String kfType;
        // 商品id
        private String materialId;
        // 商品是否启用辅助属性
        private boolean materialIsAsstAttr;
        // 商品是否开启批次
        private boolean materialIsBatch;
        // 商品是否开启保质期
        private boolean materialIsKfPeriod;
        // 商品是否多单位
        private boolean materialIsMultiUnit;
        // 商品是否序列号
        private boolean materialIsSerial;
        // 商品规格
        private String materialModel;
        // 商品名称
        private String materialName;
        // 商品编码
        private String materialNumber;
        // 图片url
        private String picture;
        // 单价
        private double price;
        // 生产许可证号
        private String proLicense;
        // 产地
        private String proPlace;
        // 注册证号
        private String proRegNo;
        // 数量
        private double qty;
        // 退货数量
        private double returnQty;
        // 分录序号
        private int seq;
        // 序列号 格式：001:备注1
        private String snList;
        // 序列号流转ID
        private String snListId;
        // 仓位id
        private String spId;
        // 仓位名称
        private String spName;
        // 仓位编码
        private String spNumber;
        // 源单日期
        private String srcBillDate;
        // 源单id
        private String srcBillNo;
        // 源单类型：采购订单pur_bill_order
        private String srcBillTypeId;
        // 源单类型名称
        private String srcBillTypeName;
        // 源单类型编码
        private String srcBillTypeNumber;
        // 源单分录ID
        private String srcEntryId;
        // 源单id
        private String srcInterId;
        // 源单行号
        private int srcSeq;
        // 仓库id
        private String stockId;
        // 仓库启用仓位管理
        private boolean stockIsAllowFreight;
        // 仓库名称
        private String stockName;
        // 仓库编码
        private String stockNumber;
        // 含税单价
        private double taxPrice;
        // 入库单位成本
        private double unitCostView;
        // 单位id
        private String unitId;
        // 单位名称
        private String unitName;
        // 单位编码
        private String unitNumber;
        // 有效日期
        private String validDate;
    }

    /**
     * 付款信息单据体
     */
    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class PaymentEntry {
        // 付款ID
        private String id;
        // 收款金额
        private String payAmount;
        // 备注
        private String payComment;
        // 支付方式id
        private String payTypeId;
        // 支付方式名称
        private String payTypeName;
        // 序号
        private int seq;
        // 收款账户id
        private String settleAccountId;
        // 收款账户名称
        private String settleAccountName;
        // 交易号/票据号
        private String transNumber;
    }

    /**
     * 采购费用明细
     */
    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class CostFeeEntity {
        // 采购费用分录
        private List<CostFeeRows> feeRecords;
    }

    /**
     * 采购费用分录
     */
    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class CostFeeRows {
        // 供应商，当付款金额合计等于费用时为非必填项
        private String supplierId;
        // 价税合计
        private String allAmount;
        // 价税合计本位币
        private String allAmountFor;
        // 费用
        private String amount;
        // 费用本位币
        private String amountFor;
        // 税率
        private String cess;
        // 备注
        private String comment;
        // 币别id
        private String currencyId;
        // 汇率
        private String exchangeRate;
        // 销售费用分录ID，修改时必传，否则为新增
        private String id;
        // 生成的其他应付单号
        private String linkedBillNo;
        // 支出类型
        private String pacctTypeId;
        // 付款信息单据体
        private List<ReceiveInfoRows> receiveInfoEntity;
        // 结算供应商id
        private String settleSupplierId;
        // 结算供应商名称
        private String settleSupplierName;
        // 结算供应商id，当付款金额合计等于费用时为非必填项
        private String settleSupplierNumber;
        // 税额
        private String taxAmount;
    }

    /**
     * 付款信息单据体
     */
    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class ReceiveInfoRows {
        // 支出类别id
        private String payTypeId;
        // 付款金额
        private String receiveAmount;
        // 付款账户id
        private String settleAccountId;
    }
} 