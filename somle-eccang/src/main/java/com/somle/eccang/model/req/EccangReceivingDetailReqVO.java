package com.somle.eccang.model.req;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 获取入库单明细-入参
 */
@Data
@Builder
public class EccangReceivingDetailReqVO {

    /**
     * 入库单开始日期
     * 格式：Y-m-d 例如：2020-01-01 或 2020-01-01 00:00 或 2020-01-01 00:00:00
     */
    private String dateFor;

    /**
     * 入库单截止日期
     * 格式：Y-m-d 例如：2020-01-01 或 2020-01-01 00:00 或 2020-01-01 00:00:00
     */
    private String dateTo;

    /**
     * 入库单号
     */
    private String receivingCode;

    /**
     * 仓库ID数组（默认查询全部仓库）
     */
    private List<Integer> warehouseIds;

    /**
     * 仓库代码数组（元素最大个数为1000）
     */
    private List<String> warehouseCodes;

    /**
     * 产品条形码
     */
    private String productBarcode;

    /**
     * 产品条形码查询方式：
     * 1：模糊查询
     * 0：精确查询
     */
    private Integer productBarcodeType;

    /**
     * 产品负责人类型（可选值如下）:
     * buyer_id：采购负责人
     * seller_responsible_id：销售负责人
     * develop_responsible_id：开发负责人
     */
    private String operationUserType;

    /**
     * 操作类型（可选）
     */
    private String applicationCode;

    /**
     * 产品负责人ID（可通过获取用户列表接口获取）
     */
    private Integer personId;

    /**
     * 产品品类ID（可通过获取品类接口获取）
     */
    private Integer productCategoryId;

    /**
     * 当前页码，默认为1
     */
    private Integer page = 1;

    /**
     * 每页显示条数，默认为50，最大100
     */
    private Integer pageSize = 100;

    /**
     * 上一次分页的返回值，利用索引的有序性，提高查询效率
     */
    private Integer rlId = 0;

}
