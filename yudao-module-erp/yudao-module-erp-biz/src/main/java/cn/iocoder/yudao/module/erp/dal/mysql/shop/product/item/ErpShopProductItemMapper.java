package cn.iocoder.yudao.module.erp.dal.mysql.shop.product.item;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.item.ErpShopProductItemDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.erp.controller.admin.shop.product.item.vo.*;

/**
 * ERP 店铺产品项 Mapper
 *
 * @author 索迈管理员
 */
@Mapper
public interface ErpShopProductItemMapper extends BaseMapperX<ErpShopProductItemDO> {

    default PageResult<ErpShopProductItemDO> selectPage(ErpShopProductItemPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<ErpShopProductItemDO>()
                .eqIfPresent(ErpShopProductItemDO::getProductId, reqVO.getProductId())
                .eqIfPresent(ErpShopProductItemDO::getRemark, reqVO.getRemark())
                .betweenIfPresent(ErpShopProductItemDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(ErpShopProductItemDO::getId));
    }

}