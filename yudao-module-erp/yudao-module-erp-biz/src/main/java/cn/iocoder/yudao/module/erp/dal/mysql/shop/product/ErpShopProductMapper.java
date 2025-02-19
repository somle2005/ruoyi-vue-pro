package cn.iocoder.yudao.module.erp.dal.mysql.shop.product;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.MPJLambdaWrapperX;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.customrule.ErpCustomRuleDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.ErpShopDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.ErpShopProductDO;
import com.github.yulichang.wrapper.MPJLambdaWrapper;
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

        // 构建查询，应用条件并进行分页查询
        MPJLambdaWrapper<ErpShopProductDO> query = new MPJLambdaWrapperX<ErpShopProductDO>()
            .likeIfPresent(ErpShopProductDO::getName, reqVO.getName())
            .eqIfPresent(ErpShopProductDO::getCode, reqVO.getCode())
            .eqIfPresent(ErpShopProductDO::getRemark, reqVO.getRemark())
            .eqIfPresent(ErpShopProductDO::getStatus, reqVO.getStatus())
            .betweenIfPresent(ErpShopProductDO::getCreateTime, reqVO.getCreateTime())
            .eqIfPresent(ErpShopProductDO::getUrl, reqVO.getUrl())
            .eqIfPresent(ErpShopProductDO::getShopId, reqVO.getShopId())
            .orderByDesc(ErpShopProductDO::getId)
            .innerJoin(ErpShopDO.class, ErpShopDO::getId, ErpShopProductDO::getShopId)  // 连接店铺表
            .likeIfExists(ErpShopDO::getName, reqVO.getShopName())
            .likeIfExists(ErpShopDO::getPlatform, reqVO.getPlatform())
            ;

        return selectJoinPage(reqVO, ErpShopProductDO.class, query);



//        return selectPage(reqVO, new LambdaQueryWrapperX<ErpShopProductDO>()
//                .likeIfPresent(ErpShopProductDO::getName, reqVO.getName())
//                .eqIfPresent(ErpShopProductDO::getCode, reqVO.getCode())
//                .eqIfPresent(ErpShopProductDO::getRemark, reqVO.getRemark())
//                .eqIfPresent(ErpShopProductDO::getStatus, reqVO.getStatus())
//                .betweenIfPresent(ErpShopProductDO::getCreateTime, reqVO.getCreateTime())
//                .eqIfPresent(ErpShopProductDO::getUrl, reqVO.getUrl())
//                .eqIfPresent(ErpShopProductDO::getShopId, reqVO.getShopId())
//                .orderByDesc(ErpShopProductDO::getId));
    }

}