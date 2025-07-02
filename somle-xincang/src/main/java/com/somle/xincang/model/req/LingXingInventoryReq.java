package com.somle.xincang.model.req;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;

/**
 * 库存查询请求参数实体类
 * 使用Lombok简化代码
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LingXingInventoryReq {

    /**
     * SKU列表，多个以英文逗号分割，如: sku1,sku2
     */
    private String skuList;

    /**
     * 仓库代码列表，多个以英文逗号分割，如: WH001,WH002
     */
    private String whCodeList;

    /**
     * 当前页码（最小值为1）
     */
    private Integer page;

    /**
     * 每页显示条数（范围1-100）
     */
    private Integer pageSize;

    /**
     * 节点时间类型（固定为"operateTime"）
     */
    private String timeType = "operateTime";

    /**
     * 节点起始时间（格式：yyyy-MM-dd HH:mm:ss）
     * 默认当前时间的前60天
     */
    private Date startTime;

    /**
     * 节点截止时间（格式：yyyy-MM-dd HH:mm:ss）
     * 默认当前时间
     */
    private Date endTime;

    /**
     * 库存类型属性 0-正品 1-次品
     */
    private Integer stockType;
}