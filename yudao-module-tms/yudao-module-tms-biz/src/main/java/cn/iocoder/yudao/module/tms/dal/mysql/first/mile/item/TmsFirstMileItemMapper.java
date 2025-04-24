package cn.iocoder.yudao.module.tms.dal.mysql.first.mile.item;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.item.vo.TmsFirstMileItemPageReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.item.TmsFirstMileItemDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 头程单明细 Mapper
 *
 * @author wdy
 */
@Mapper
public interface TmsFirstMileItemMapper extends BaseMapperX<TmsFirstMileItemDO> {

    default PageResult<TmsFirstMileItemDO> selectPage(TmsFirstMileItemPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<TmsFirstMileItemDO>()
            .eqIfPresent(TmsFirstMileItemDO::getCreator, reqVO.getCreator())
            .betweenIfPresent(TmsFirstMileItemDO::getCreateTime, reqVO.getCreateTime())
            .eqIfPresent(TmsFirstMileItemDO::getUpdater, reqVO.getUpdater())
            .betweenIfPresent(TmsFirstMileItemDO::getUpdateTime, reqVO.getUpdateTime())
            .eqIfPresent(TmsFirstMileItemDO::getRequestItemId, reqVO.getRequestItemId())
            .eqIfPresent(TmsFirstMileItemDO::getProductId, reqVO.getProductId())
            .betweenIfPresent(TmsFirstMileItemDO::getBoxQty, reqVO.getBoxQty())
            .eqIfPresent(TmsFirstMileItemDO::getCompanyId, reqVO.getCompanyId())
            .eqIfPresent(TmsFirstMileItemDO::getDeptId, reqVO.getDeptId())
            .likeIfPresent(TmsFirstMileItemDO::getRemark, reqVO.getRemark())
            .betweenIfPresent(TmsFirstMileItemDO::getOutboundClosedQty, reqVO.getOutboundClosedQty())
            .betweenIfPresent(TmsFirstMileItemDO::getOutboundPlanQty, reqVO.getOutboundPlanQty())
            .betweenIfPresent(TmsFirstMileItemDO::getInboundClosedQty, reqVO.getInboundClosedQty())
            .eqIfPresent(TmsFirstMileItemDO::getFromWarehouseId, reqVO.getFromWarehouseId())
            .betweenIfPresent(TmsFirstMileItemDO::getPackageLength, reqVO.getPackageLength())
            .betweenIfPresent(TmsFirstMileItemDO::getPackageWidth, reqVO.getPackageWidth())
            .betweenIfPresent(TmsFirstMileItemDO::getPackageHeight, reqVO.getPackageHeight())
            .betweenIfPresent(TmsFirstMileItemDO::getPackageWeight, reqVO.getPackageWeight())
            .betweenIfPresent(TmsFirstMileItemDO::getVolume, reqVO.getVolume())
            .orderByDesc(TmsFirstMileItemDO::getId));
    }

}