package cn.iocoder.yudao.module.erp.dal.mysql.sale;


import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.MPJLambdaWrapperX;
import cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel.product.ErpChannelProductPageReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.sale.ErpChannelDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.sale.ErpChannelProductDO;
import cn.iocoder.yudao.module.system.api.user.dto.AdminUserRespDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ERP 渠道平台产品 Mapper
 *
 * @author 王奇辉
 */
@Mapper
public interface ErpChannelProductMapper extends BaseMapperX<ErpChannelProductDO> {

    default PageResult<ErpChannelProductDO> selectPage(ErpChannelProductPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<ErpChannelProductDO>()
                .eqIfPresent(ErpChannelProductDO::getCode, reqVO.getCode())
                .likeIfPresent(ErpChannelProductDO::getName, reqVO.getName())
                .eqIfPresent(ErpChannelProductDO::getStatus, reqVO.getStatus())
                .eqIfPresent(ErpChannelProductDO::getChannelId, reqVO.getChannelId())
                .eqIfPresent(ErpChannelProductDO::getProductId, reqVO.getProductId())
                .eqIfPresent(ErpChannelProductDO::getRemark, reqVO.getRemark())
                .eqIfPresent(ErpChannelProductDO::getUrl, reqVO.getUrl())
                .eqIfPresent(ErpChannelProductDO::getBottomPrice, reqVO.getBottomPrice())
                .eqIfPresent(ErpChannelProductDO::getOwnerId, reqVO.getOwnerId())
                .betweenIfPresent(ErpChannelProductDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(ErpChannelProductDO::getId));
    }

    default List<ErpChannelProductDO> selectByParentIdAndNameOrCode(String name, String code){
        return selectList(new LambdaQueryWrapperX<ErpChannelProductDO>()
                .eq(ErpChannelProductDO::getName, name)
                .or()
                .eq(ErpChannelProductDO::getCode, code));
    }

    default List<ErpChannelProductDO> selectListByChannelId(Long channelId){
        return selectList(new LambdaQueryWrapperX<ErpChannelProductDO>()
                .eq(ErpChannelProductDO::getChannelId, channelId));
    }
}