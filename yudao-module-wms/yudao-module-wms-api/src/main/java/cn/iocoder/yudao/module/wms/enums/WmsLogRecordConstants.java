package cn.iocoder.yudao.module.wms.enums;

/**
 * @author jisencai
 * WMS模块 - 操作日志常量
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
 * - {{#enable}}: 是否开启
 * - {{#requestId}}: 请求ID
 * - {{#itemIds}}: 项目ID列表
 */
public interface WmsLogRecordConstants {

    // ======================= 创建仓库 =======================
    /**
     * 仓库业务类型
     */
    String WMS_WAREHOUSE_REQUEST_TYPE = "WMS仓库";

    /**
     * 创建仓库
     */
    String WMS_WAREHOUSE_REQUEST_CREATE_SUB_TYPE = "创建仓库";
    /**
     * 更新仓库
     */
    String WMS_WAREHOUSE_REQUEST_UPDATE_SUB_TYPE = "更新仓库";
    /**
     * 删除仓库
     */
    String WMS_WAREHOUSE_REQUEST_DELETE_SUB_TYPE = "删除仓库";


    // ======================= 库区 =======================
    /**
     * 库区业务类型
     */
    String WMS_WAREHOUSE_ZONE_TYPE = "WMS库区";

    /**
     * 创建库区
     */
    String WMS_WAREHOUSE_ZONE_CREATE_SUB_TYPE = "创建库区";
    /**
     * 更新库区
     */
    String WMS_WAREHOUSE_ZONE_UPDATE_SUB_TYPE = "更新库区";
    /**
     * 删除库区
     */
    String WMS_WAREHOUSE_ZONE_DELETE_SUB_TYPE = "删除库区";


    // ======================= 库位 =======================
    /**
     * 库位业务类型
     */
    String WMS_WAREHOUSE_BIN_TYPE = "WMS库位";

    /**
     * 创建库位
     */
    String WMS_WAREHOUSE_BIN_CREATE_SUB_TYPE = "创建库位";
    /**
     * 更新库位
     */
    String WMS_WAREHOUSE_BIN_UPDATE_SUB_TYPE = "更新库位";
    /**
     * 删除库位
     */
    String WMS_WAREHOUSE_BIN_DELETE_SUB_TYPE = "删除库位";
    /**
     * 开关库位
     */
    String WMS_WAREHOUSE_BIN_SIWTCH_SUB_TYPE = "开关库位";

} 