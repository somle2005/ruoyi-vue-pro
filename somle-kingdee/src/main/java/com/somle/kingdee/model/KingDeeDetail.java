package com.somle.kingdee.model;

import lombok.Data;

/**
 * @className: KingDeeDetail
 * @author: Wqh
 * @date: 2024/10/24 17:30
 * @Version: 1.0
 * @description:
 */
@Data
public class KingDeeDetail {
    /**
    * 总数
    **/
    private Integer total;

    /**
     * 详情
     **/
    private Object rows;

    /**
     * 列表价税合计汇总，符合条件所有单据价税合计汇总，包含本页之外的数据
     **/
    private Object headers;
}
