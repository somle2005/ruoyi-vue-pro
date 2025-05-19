package cn.iocoder.yudao.module.srm.api.log;

/**
 * SRM 模块 - 操作日志常量
 * <p>
 * 常量说明:
 * 1. TYPE: 业务类型常量,用于区分不同业务模块
 * 2. SUB_TYPE: 操作类型常量,用于区分同一业务模块下的不同操作
 * 3. SUCCESS: 操作成功后的日志模板,支持 SpEL 表达式
 * - {{#vo.code}}: 单据编号
 * - {{#businessName}}: 业务名称
 * - {{#codes}}: 多个单据编号
 * - {_DIFF{#vo}}: 变更内容
 * - {{#reqVO.reviewed}}: 是否已审核
 * - {{#reqVO.pass}}: 是否审核通过
 */
public interface LogRecordConstants {

    // ======================= 采购申请单 =======================
    /**
     * 采购申请单业务类型
     */
    String SRM_PURCHASE_REQUEST_TYPE = "采购申请单";

    /**
     * 创建采购申请单
     */
    String SRM_PURCHASE_REQUEST_CREATE_SUB_TYPE = "创建采购申请单";
    /**
     * 更新采购申请单
     */
    String SRM_PURCHASE_REQUEST_UPDATE_SUB_TYPE = "更新采购申请单";
    /**
     * 删除采购申请单
     */
    String SRM_PURCHASE_REQUEST_DELETE_SUB_TYPE = "删除采购申请单";
    /**
     * 提交采购申请单审核
     */
    String SRM_PURCHASE_REQUEST_SUBMIT_AUDIT_SUB_TYPE = "提交采购申请单审核";
    /**
     * 审核采购申请单
     */
    String SRM_PURCHASE_REQUEST_AUDIT_SUB_TYPE = "审核采购申请单";

    /**
     * 创建采购申请单日志模板
     */
    String SRM_PURCHASE_REQUEST_CREATE_SUCCESS = "创建了采购申请单【{{#vo.code}}】";
    /**
     * 更新采购申请单日志模板
     */
    String SRM_PURCHASE_REQUEST_UPDATE_SUCCESS = "更新了采购申请单【{{#vo.code}}】: {_DIFF{#vo}}";
    /**
     * 删除采购申请单日志模板
     */
    String SRM_PURCHASE_REQUEST_DELETE_SUCCESS = "删除了采购申请单【{{#businessName}}】";
    /**
     * 提交采购申请单审核日志模板
     */
    String SRM_PURCHASE_REQUEST_SUBMIT_AUDIT_SUCCESS = "提交了采购申请单【{{#codes}}】审核";
    /**
     * 审核采购申请单日志模板
     */
    String SRM_PURCHASE_REQUEST_AUDIT_SUCCESS = "{{#reqVO.reviewed ? (#reqVO.pass ? '审核通过' : '审核不通过') : '反审核'}}了采购申请单【{{#vo.code}}】";

    // ======================= 采购订单 =======================
    /**
     * 采购订单业务类型
     */
    String SRM_PURCHASE_ORDER_TYPE = "采购订单";

    /**
     * 创建采购订单
     */
    String SRM_PURCHASE_ORDER_CREATE_SUB_TYPE = "创建采购订单";
    /**
     * 更新采购订单
     */
    String SRM_PURCHASE_ORDER_UPDATE_SUB_TYPE = "更新采购订单";
    /**
     * 删除采购订单
     */
    String SRM_PURCHASE_ORDER_DELETE_SUB_TYPE = "删除采购订单";
    /**
     * 提交采购订单审核
     */
    String SRM_PURCHASE_ORDER_SUBMIT_AUDIT_SUB_TYPE = "提交采购订单审核";
    /**
     * 审核采购订单
     */
    String SRM_PURCHASE_ORDER_AUDIT_SUB_TYPE = "审核采购订单";

    /**
     * 创建采购订单日志模板
     */
    String SRM_PURCHASE_ORDER_CREATE_SUCCESS = "创建了采购订单【{{#vo.code}}】";
    /**
     * 更新采购订单日志模板
     */
    String SRM_PURCHASE_ORDER_UPDATE_SUCCESS = "更新了采购订单【{{#vo.code}}】: {_DIFF{#vo}}";
    /**
     * 删除采购订单日志模板
     */
    String SRM_PURCHASE_ORDER_DELETE_SUCCESS = "删除了采购订单【{{#businessName}}】";
    /**
     * 提交采购订单审核日志模板
     */
    String SRM_PURCHASE_ORDER_SUBMIT_AUDIT_SUCCESS = "提交了采购订单【{{#codes}}】审核";
    /**
     * 审核采购订单日志模板
     */
    String SRM_PURCHASE_ORDER_AUDIT_SUCCESS = "{{#reqVO.reviewed ? (#reqVO.pass ? '审核通过' : '审核不通过') : '反审核'}}了采购订单【{{#vo.code}}】";

    // ======================= 采购入库单 =======================
    /**
     * 采购入库单业务类型
     */
    String SRM_PURCHASE_IN_TYPE = "采购入库单";

    /**
     * 创建采购入库单
     */
    String SRM_PURCHASE_IN_CREATE_SUB_TYPE = "创建采购入库单";
    /**
     * 更新采购入库单
     */
    String SRM_PURCHASE_IN_UPDATE_SUB_TYPE = "更新采购入库单";
    /**
     * 删除采购入库单
     */
    String SRM_PURCHASE_IN_DELETE_SUB_TYPE = "删除采购入库单";
    /**
     * 提交采购入库单审核
     */
    String SRM_PURCHASE_IN_SUBMIT_AUDIT_SUB_TYPE = "提交采购入库单审核";
    /**
     * 审核采购入库单
     */
    String SRM_PURCHASE_IN_AUDIT_SUB_TYPE = "审核采购入库单";

    /**
     * 创建采购入库单日志模板
     */
    String SRM_PURCHASE_IN_CREATE_SUCCESS = "创建了采购入库单【{{#vo.code}}】";
    /**
     * 更新采购入库单日志模板
     */
    String SRM_PURCHASE_IN_UPDATE_SUCCESS = "更新了采购入库单【{{#vo.code}}】: {_DIFF{#vo}}";
    /**
     * 删除采购入库单日志模板
     */
    String SRM_PURCHASE_IN_DELETE_SUCCESS = "删除了采购入库单【{{#businessName}}】";
    /**
     * 提交采购入库单审核日志模板
     */
    String SRM_PURCHASE_IN_SUBMIT_AUDIT_SUCCESS = "提交了采购入库单【{{#codes}}】审核";
    /**
     * 审核采购入库单日志模板
     */
    String SRM_PURCHASE_IN_AUDIT_SUCCESS = "{{#reqVO.reviewed ? (#reqVO.pass ? '审核通过' : '审核不通过') : '反审核'}}了采购入库单【{{#vo.code}}】";
} 