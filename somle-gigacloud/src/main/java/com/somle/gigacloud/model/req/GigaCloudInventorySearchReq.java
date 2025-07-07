package com.somle.gigacloud.model.req;

import lombok.Builder;
import lombok.Data;

/**
 * 库存查询请求体
 */
@Data
@Builder
public class GigaCloudInventorySearchReq {

    /**
     * 客户编码（图片中示例值：D303）
     */
    private String customerCode;

    /**
     * 国家/地区代码（图片中示例值：2）
     */
    private String country;

    /**
     * 产品编码（允许为空）
     */
    private String productCode;

    /**
     * 客户SKU编码（允许为空）
     */
    private String customerSku;

    /**
     * 仓库ID（允许为空）
     */
    private String whId;

    /**
     * 是否显示零库存数据（图片中示例值：false）
     */
    private Boolean showZeroData;

    /**
     * 当前页码（图片中示例值：2）
     */
    private Integer pageNum;

    /**
     * 每页条数（图片中示例值：10）
     */
    private Integer pageSize;
}