package com.somle.gigacloud.model.req;

import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
public class GigaCloudBatchInventoryQueryReq {
    /**
     * 批次号 - 可为空字符串
     */
    private String batchNumber;

    /**
     * 客户编码 - 必填字段
     */
    private String customerCode;

    /**
     * 国家代码 - 支持两位ISO国家代码或自定义编码
     */
    private String country;

    /**
     * 仓库ID - 可为空字符串
     */
    private String whId;

    /**
     * 集装箱编码 - 可为空
     */
    private String containerCode;

    /**
     * 产品编码 - 可为空
     */
    private String productCode;

    /**
     * 客户SKU编码 - 可为空
     */
    private String customerSku;

    /**
     * 入库日期范围查询 [开始日期, 结束日期]
     * 格式: ["yyyy-MM-dd", "yyyy-MM-dd"]
     */
    private List<String> inStorageDay;

    /**
     * 收货日期范围查询 [开始日期, 结束日期]
     * 格式: ["yyyy-MM-dd", "yyyy-MM-dd"]
     */
    private List<String> receivingDate;

    /**
     * 创建日期范围查询 [开始日期, 结束日期]
     * 格式: ["yyyy-MM-dd", "yyyy-MM-dd"]
     */
    private List<String> creationDate;

    /**
     * 是否显示零库存数据 - 默认false
     */
    private Boolean showZeroData;

    /**
     * 当前页码 - 至少为1
     */
    private Integer pageNum;

    /**
     * 每页条数 - 10到100之间
     */
    private Integer pageSize;
}