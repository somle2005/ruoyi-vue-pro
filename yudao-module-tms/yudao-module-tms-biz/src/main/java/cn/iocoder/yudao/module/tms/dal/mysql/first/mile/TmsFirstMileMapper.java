package cn.iocoder.yudao.module.tms.dal.mysql.first.mile;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.TmsFirstMilePageReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.TmsFirstMileDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 头程单 Mapper
 *
 * @author wdy
 */
@Mapper
public interface TmsFirstMileMapper extends BaseMapperX<TmsFirstMileDO> {

    default PageResult<TmsFirstMileDO> selectPage(TmsFirstMilePageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<TmsFirstMileDO>()
            .betweenIfPresent(TmsFirstMileDO::getCreateTime, reqVO.getCreateTime())
            .likeIfPresent(TmsFirstMileDO::getCode, reqVO.getCode())
            .betweenIfPresent(TmsFirstMileDO::getBillTime, reqVO.getBillTime())
            .eqIfPresent(TmsFirstMileDO::getCarrierId, reqVO.getCarrierId())
            .betweenIfPresent(TmsFirstMileDO::getSettlementDate, reqVO.getSettlementDate())
            .eqIfPresent(TmsFirstMileDO::getBalance, reqVO.getBalance())
            .eqIfPresent(TmsFirstMileDO::getAuditorId, reqVO.getAuditorId())
            .betweenIfPresent(TmsFirstMileDO::getAuditTime, reqVO.getAuditTime())
            .eqIfPresent(TmsFirstMileDO::getAuditStatus, reqVO.getAuditStatus())
            .eqIfPresent(TmsFirstMileDO::getToWarehouseId, reqVO.getToWarehouseId())
            .likeIfPresent(TmsFirstMileDO::getLadingNo, reqVO.getLadingNo())
            .eqIfPresent(TmsFirstMileDO::getCabinetType, reqVO.getCabinetType())
            .betweenIfPresent(TmsFirstMileDO::getPackTime, reqVO.getPackTime())
            .betweenIfPresent(TmsFirstMileDO::getArrivePlanTime, reqVO.getArrivePlanTime())
            .betweenIfPresent(TmsFirstMileDO::getDeliveryEstimateTime, reqVO.getDeliveryEstimateTime())
            .betweenIfPresent(TmsFirstMileDO::getDeliveryActualTime, reqVO.getDeliveryActualTime())
            .betweenIfPresent(TmsFirstMileDO::getTotalVolume, reqVO.getTotalVolume())
            .betweenIfPresent(TmsFirstMileDO::getTotalWeight, reqVO.getTotalWeight())
            .betweenIfPresent(TmsFirstMileDO::getNetWeight, reqVO.getNetWeight())
            .betweenIfPresent(TmsFirstMileDO::getTotalValue, reqVO.getTotalValue())
            .betweenIfPresent(TmsFirstMileDO::getTotalQty, reqVO.getTotalQty())
            .likeIfPresent(TmsFirstMileDO::getRemark, reqVO.getRemark())
            .eqIfPresent(TmsFirstMileDO::getOutboundStatus, reqVO.getOutboundStatus())
            .betweenIfPresent(TmsFirstMileDO::getOutboundTime, reqVO.getOutboundTime())
            .eqIfPresent(TmsFirstMileDO::getInboundStatus, reqVO.getInboundStatus())
            .betweenIfPresent(TmsFirstMileDO::getInboundTime, reqVO.getInboundTime())
            .orderByDesc(TmsFirstMileDO::getId));
    }

}