package cn.iocoder.yudao.module.tms.dal.mysql.vessel.tracking;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.module.tms.controller.admin.vessel.tracking.vo.TmsVesselTrackingPageReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.vessel.tracking.TmsVesselTrackingDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 出运跟踪信息表（由外部API更新，船） Mapper
 *
 * @author wdy
 */
@Mapper
public interface TmsVesselTrackingMapper extends BaseMapperX<TmsVesselTrackingDO> {

    default PageResult<TmsVesselTrackingDO> selectPage(TmsVesselTrackingPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<TmsVesselTrackingDO>().eqIfPresent(TmsVesselTrackingDO::getId, reqVO.getId())
            .eqIfPresent(TmsVesselTrackingDO::getUpstreamType, reqVO.getUpstreamType()).eqIfPresent(TmsVesselTrackingDO::getUpstreamId, reqVO.getUpstreamId())
            .betweenIfPresent(TmsVesselTrackingDO::getArriveEstimateTime, reqVO.getArriveEstimateTime())
            .betweenIfPresent(TmsVesselTrackingDO::getDepartEstimateTime, reqVO.getDepartEstimateTime())
            .betweenIfPresent(TmsVesselTrackingDO::getArriveActualTime, reqVO.getArriveActualTime())
            .betweenIfPresent(TmsVesselTrackingDO::getDepartActualTime, reqVO.getDepartActualTime())
            .betweenIfPresent(TmsVesselTrackingDO::getPickupTime, reqVO.getPickupTime())
            .betweenIfPresent(TmsVesselTrackingDO::getReturnTime, reqVO.getReturnTime()).eqIfPresent(TmsVesselTrackingDO::getApiSource, reqVO.getApiSource())
            .betweenIfPresent(TmsVesselTrackingDO::getLastSyncTime, reqVO.getLastSyncTime()).eqIfPresent(TmsVesselTrackingDO::getRevision, reqVO.getRevision())
            .betweenIfPresent(TmsVesselTrackingDO::getCreateTime, reqVO.getCreateTime())
            .eqIfPresent(TmsVesselTrackingDO::getTransitPort, reqVO.getTransitPort()).eqIfPresent(TmsVesselTrackingDO::getToPort, reqVO.getToPort())
            .eqIfPresent(TmsVesselTrackingDO::getFromPort, reqVO.getFromPort())
            .eqIfPresent(TmsVesselTrackingDO::getCarrierCompanyId, reqVO.getCarrierCompanyId()).eqIfPresent(TmsVesselTrackingDO::getVessel, reqVO.getVessel())
            .eqIfPresent(TmsVesselTrackingDO::getVoyage, reqVO.getVoyage())
            .eqIfPresent(TmsVesselTrackingDO::getForwarderCompanyId, reqVO.getForwarderCompanyId())
            .eqIfPresent(TmsVesselTrackingDO::getContainerNo, reqVO.getContainerNo()).orderByDesc(TmsVesselTrackingDO::getId));
    }

}