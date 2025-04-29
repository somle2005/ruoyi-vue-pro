package cn.iocoder.yudao.module.tms.dal.mysql.first.mile.item;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.MPJLambdaWrapperX;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.item.vo.TmsFirstMileItemPageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.req.TmsFirstMilePageReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.TmsFirstMileDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.item.TmsFirstMileItemDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.vessel.tracking.TmsVesselTrackingDO;
import cn.iocoder.yudao.module.tms.enums.SourceTypeEnum;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileItemBO;
import com.github.yulichang.wrapper.MPJLambdaWrapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 头程单明细 Mapper
 *
 * @author wdy
 */
@Mapper
public interface TmsFirstMileItemMapper extends BaseMapperX<TmsFirstMileItemDO> {

    //MPJLambdaWrapperX build
    default MPJLambdaWrapperX<TmsFirstMileItemDO> buildWrapper(TmsFirstMileItemPageReqVO vo) {
        if (vo == null) {
            vo = new TmsFirstMileItemPageReqVO();
        }
        return new MPJLambdaWrapperX<TmsFirstMileItemDO>()
            .inIfPresent(TmsFirstMileItemDO::getId, vo.getId())
            .eqIfPresent(TmsFirstMileItemDO::getCreator, vo.getCreator())
            .betweenIfPresent(TmsFirstMileItemDO::getCreateTime, vo.getCreateTime())
            .eqIfPresent(TmsFirstMileItemDO::getUpdater, vo.getUpdater())
            .betweenIfPresent(TmsFirstMileItemDO::getUpdateTime, vo.getUpdateTime())
            .eqIfPresent(TmsFirstMileItemDO::getRequestItemId, vo.getRequestItemId())
            .eqIfPresent(TmsFirstMileItemDO::getProductId, vo.getProductId())
            .betweenIfPresent(TmsFirstMileItemDO::getBoxQty, vo.getBoxQty())
            .eqIfPresent(TmsFirstMileItemDO::getCompanyId, vo.getCompanyId())
            .eqIfPresent(TmsFirstMileItemDO::getDeptId, vo.getDeptId())
            .likeIfPresent(TmsFirstMileItemDO::getRemark, vo.getRemark())
            .betweenIfPresent(TmsFirstMileItemDO::getOutboundClosedQty, vo.getOutboundClosedQty())
            .betweenIfPresent(TmsFirstMileItemDO::getOutboundPlanQty, vo.getOutboundPlanQty())
            .betweenIfPresent(TmsFirstMileItemDO::getInboundClosedQty, vo.getInboundClosedQty())
            .eqIfPresent(TmsFirstMileItemDO::getFromWarehouseId, vo.getFromWarehouseId())
            .betweenIfPresent(TmsFirstMileItemDO::getPackageLength, vo.getPackageLength())
            .betweenIfPresent(TmsFirstMileItemDO::getPackageWidth, vo.getPackageWidth())
            .betweenIfPresent(TmsFirstMileItemDO::getPackageHeight, vo.getPackageHeight())
            .betweenIfPresent(TmsFirstMileItemDO::getPackageWeight, vo.getPackageWeight())
            .betweenIfPresent(TmsFirstMileItemDO::getVolume, vo.getVolume())
            .orderByDesc(TmsFirstMileItemDO::getCreateTime);
    }

    //build BO wrapperX
    default MPJLambdaWrapper<TmsFirstMileItemDO> buildBOWrapper(TmsFirstMilePageReqVO vo) {
        if (vo == null) {
            vo = new TmsFirstMilePageReqVO();
        }
        if (vo.getTrackingQueryVO() == null) {
            vo.setTrackingQueryVO(new TmsFirstMilePageReqVO.TmsVesselTrackingQueryVO());
        }
        return buildWrapper(vo.getItemPageReqVO())
            .leftJoin(TmsFirstMileDO.class, TmsFirstMileDO::getId, TmsFirstMileItemDO::getFirstMileId)
            .inIfPresent(TmsFirstMileDO::getId, vo.getId()) // 头程单IDs
            .betweenIfPresent(TmsFirstMileDO::getCreateTime, vo.getCreateTime()) // 创建时间范围
            .likeIfPresent(TmsFirstMileDO::getCode, vo.getCode()) // 单据编号
            .betweenIfPresent(TmsFirstMileDO::getBillTime, vo.getBillTime()) // 单据日期范围
            .eqIfPresent(TmsFirstMileDO::getCarrierId, vo.getCarrierId()) // 承运商ID
            .betweenIfPresent(TmsFirstMileDO::getSettlementDate, vo.getSettlementDate()) // 结算日期范围
            .eqIfPresent(TmsFirstMileDO::getBalance, vo.getBalance()) // 结算状态
            .eqIfPresent(TmsFirstMileDO::getAuditorId, vo.getAuditorId()) // 审核人ID
            .betweenIfPresent(TmsFirstMileDO::getAuditTime, vo.getAuditTime()) // 审核时间范围
            .eqIfPresent(TmsFirstMileDO::getAuditStatus, vo.getAuditStatus()) // 审核状态
            .eqIfPresent(TmsFirstMileDO::getToWarehouseId, vo.getToWarehouseId()) // 目的仓库ID
            .likeIfPresent(TmsFirstMileDO::getLadingNo, vo.getLadingNo()) // 提单号
            .eqIfPresent(TmsFirstMileDO::getCabinetType, vo.getCabinetType()) // 柜型
            .betweenIfPresent(TmsFirstMileDO::getPackTime, vo.getPackTime()) // 装箱时间范围
            .betweenIfPresent(TmsFirstMileDO::getArrivePlanTime, vo.getArrivePlanTime()) // 预计到港时间范围
            .betweenIfPresent(TmsFirstMileDO::getDeliveryEstimateTime, vo.getDeliveryEstimateTime()) // 预计提货时间范围
            .betweenIfPresent(TmsFirstMileDO::getDeliveryActualTime, vo.getDeliveryActualTime()) // 实际提货时间范围
            .betweenIfPresent(TmsFirstMileDO::getTotalVolume, vo.getTotalVolume()) // 总体积范围
            .betweenIfPresent(TmsFirstMileDO::getTotalWeight, vo.getTotalWeight()) // 总重量范围
            .betweenIfPresent(TmsFirstMileDO::getNetWeight, vo.getNetWeight()) // 净重范围
            .betweenIfPresent(TmsFirstMileDO::getTotalValue, vo.getTotalValue()) // 总价值范围
            .betweenIfPresent(TmsFirstMileDO::getTotalQty, vo.getTotalQty()) // 总数量范围
            .likeIfPresent(TmsFirstMileDO::getRemark, vo.getRemark()) // 备注
            .eqIfPresent(TmsFirstMileDO::getOutboundStatus, vo.getOutboundStatus()) // 出库状态
            .betweenIfPresent(TmsFirstMileDO::getOutboundTime, vo.getOutboundTime()) // 出库时间范围
            .eqIfPresent(TmsFirstMileDO::getInboundStatus, vo.getInboundStatus()) // 入库状态
            .betweenIfPresent(TmsFirstMileDO::getInboundTime, vo.getInboundTime()) // 入库时间范围
            .orderByDesc(TmsFirstMileDO::getCreateTime)
            //关联船运
            .leftJoin(TmsVesselTrackingDO.class, TmsVesselTrackingDO::getUpstreamId, TmsFirstMileItemDO::getId, on -> {
                on.eqIfPresent(TmsVesselTrackingDO::getUpstreamType, SourceTypeEnum.FIRST_MILE.getType());
            })
            // 时间
            .betweenIfPresent(TmsVesselTrackingDO::getArriveEstimateTime, vo.getTrackingQueryVO().getArriveEstimateTime()) // 预计到达时间
            .betweenIfPresent(TmsVesselTrackingDO::getDepartEstimateTime, vo.getTrackingQueryVO().getDepartEstimateTime()) // 预计离开时间
            .betweenIfPresent(TmsVesselTrackingDO::getArriveActualTime, vo.getTrackingQueryVO().getArriveActualTime()) // 实际到达时间
            .betweenIfPresent(TmsVesselTrackingDO::getDepartActualTime, vo.getTrackingQueryVO().getDepartActualTime()) // 实际离开时间
            .betweenIfPresent(TmsVesselTrackingDO::getPickupTime, vo.getTrackingQueryVO().getPickupTime()) // 提货时间
            .betweenIfPresent(TmsVesselTrackingDO::getReturnTime, vo.getTrackingQueryVO().getReturnTime()) // 还柜时间
            // 同步
            .eqIfPresent(TmsVesselTrackingDO::getApiSource, vo.getTrackingQueryVO().getApiSource()) // API来源
            .betweenIfPresent(TmsVesselTrackingDO::getLastSyncTime, vo.getTrackingQueryVO().getLastSyncTime()) // 最后同步时间
            .betweenIfPresent(TmsVesselTrackingDO::getCreateTime, vo.getCreateTime()) // 创建时间
            // 港口
            .eqIfPresent(TmsVesselTrackingDO::getTransitPort, vo.getTrackingQueryVO().getTransitPort()) // 中转港
            .eqIfPresent(TmsVesselTrackingDO::getToPort, vo.getTrackingQueryVO().getToPort()) // 目的港
            .eqIfPresent(TmsVesselTrackingDO::getFromPort, vo.getTrackingQueryVO().getFromPort()) // 起运港
            // 承运
            .eqIfPresent(TmsVesselTrackingDO::getCarrierCompanyId, vo.getTrackingQueryVO().getCarrierCompanyId()) // 承运公司ID
            .eqIfPresent(TmsVesselTrackingDO::getVessel, vo.getTrackingQueryVO().getVessel()) // 船名
            .eqIfPresent(TmsVesselTrackingDO::getVoyage, vo.getTrackingQueryVO().getVoyage()) // 航次
            // 货代
            .eqIfPresent(TmsVesselTrackingDO::getForwarderCompanyId, vo.getTrackingQueryVO().getForwarderCompanyId()) // 货代公司ID
            .eqIfPresent(TmsVesselTrackingDO::getContainerNo, vo.getTrackingQueryVO().getContainerNo()) // 集装箱号
            // 排序
            .orderByDesc(TmsVesselTrackingDO::getCreateTime)

            ;
    }

    default PageResult<TmsFirstMileItemBO> selectPageBO(TmsFirstMilePageReqVO vo) {
        if (vo == null) {
            vo = new TmsFirstMilePageReqVO();
        }
        return selectJoinPage(vo, TmsFirstMileItemBO.class, buildBOWrapper(vo)
            .selectAssociation(TmsFirstMileDO.class, TmsFirstMileItemBO::getTmsFirstMileDO)
            .selectAssociation(TmsVesselTrackingDO.class, TmsFirstMileItemBO::getTmsVesselTrackingDO)
        );
    }

    //获得BO一个
    default TmsFirstMileItemBO selectBOById(Long id) {
        return selectJoinOne(TmsFirstMileItemBO.class, buildBOWrapper(new TmsFirstMilePageReqVO().setId(id)));
    }

    default List<TmsFirstMileItemDO> selectListByFirstMileId(Long firstMileId) {
        return selectList(TmsFirstMileItemDO::getFirstMileId, firstMileId);
    }

    default int deleteByFirstMileId(Long firstMileId) {
        return delete(TmsFirstMileItemDO::getFirstMileId, firstMileId);
    }

    default void selectListByRequestItemId(Long id) {
        selectList(TmsFirstMileItemDO::getRequestItemId, id);
    }
}