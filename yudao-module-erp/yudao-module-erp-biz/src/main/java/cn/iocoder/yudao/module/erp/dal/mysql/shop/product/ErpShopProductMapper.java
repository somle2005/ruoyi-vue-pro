package cn.iocoder.yudao.module.erp.dal.mysql.shop.product;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.ErpShopProductDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.erp.controller.admin.shop.product.vo.*;

/**
 * ERP 店铺产品 Mapper
 *
 * @author 索迈管理员
 */
@Mapper
public interface ErpShopProductMapper extends BaseMapperX<ErpShopProductDO> {

    default PageResult<ErpShopProductDO> selectPage(ErpShopProductPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<ErpShopProductDO>()
                .likeIfPresent(ErpShopProductDO::getName, reqVO.getName())
                .eqIfPresent(ErpShopProductDO::getCode, reqVO.getCode())
                .eqIfPresent(ErpShopProductDO::getRemark, reqVO.getRemark())
                .eqIfPresent(ErpShopProductDO::getStatus, reqVO.getStatus())
                .betweenIfPresent(ErpShopProductDO::getCreateTime, reqVO.getCreateTime())
                .eqIfPresent(ErpShopProductDO::getUrl, reqVO.getUrl())
                .orderByDesc(ErpShopProductDO::getId));
    }

}