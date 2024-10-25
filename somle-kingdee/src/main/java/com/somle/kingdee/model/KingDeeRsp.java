package com.somle.kingdee.model;

import lombok.Data;

import java.util.Map;

/**
 * @className: KingDeeRsp
 * @author: Wqh
 * @date: 2024/10/24 17:24
 * @Version: 1.0
 * @description:
 */
@Data
public class KingDeeRsp {
    /**
    * 公司名称
    **/
    private String companyName;

    /**
     * 数据
     **/
    private KingDeeDetail data;
}
