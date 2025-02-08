package cn.iocoder.yudao.module.erp.dal.mysql.shop;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.ErpShopDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.erp.controller.admin.shop.vo.*;

/**
 * ERP 店铺 Mapper
 *
 * @author c-tao
 */
@Mapper
public interface ErpShopMapper extends BaseMapperX<ErpShopDO> {

    default PageResult<ErpShopDO> selectPage(ErpShopPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<ErpShopDO>()
                .likeIfPresent(ErpShopDO::getName, reqVO.getName())
                .likeIfPresent(ErpShopDO::getCode, reqVO.getCode())
                .eqIfPresent(ErpShopDO::getStatus, reqVO.getStatus())
                .betweenIfPresent(ErpShopDO::getCreateTime, reqVO.getCreateTime())
                .eqIfPresent(ErpShopDO::getType, reqVO.getType())
                .eqIfPresent(ErpShopDO::getPlatform, reqVO.getPlatform())
                .eqIfPresent(ErpShopDO::getAccount, reqVO.getAccount())
                .orderByDesc(ErpShopDO::getId));
    }

}