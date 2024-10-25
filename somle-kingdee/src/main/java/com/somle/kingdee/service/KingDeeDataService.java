package com.somle.kingdee.service;

import com.somle.kingdee.model.KingDeeRsp;

import java.util.List;

/**
* @Author Wqh
* @Description 对外暴露的接口
* @Date 14:30 2024/10/24
**/
public interface KingDeeDataService {
    /**
    * @Author Wqh
    * @Description 获取采购申请单列表
    * @Date 15:18 2024/10/24
    * @Param []
    * @return java.util.List<java.lang.Object>
    **/
    List<KingDeeRsp> getPurchaseApplyList();
}
