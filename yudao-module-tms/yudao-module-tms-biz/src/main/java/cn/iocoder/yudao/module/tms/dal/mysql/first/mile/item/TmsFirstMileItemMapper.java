package cn.iocoder.yudao.module.tms.dal.mysql.first.mile.item;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.MPJLambdaWrapperX;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.item.vo.TmsFirstMileItemPageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.TmsFirstMilePageReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.TmsFirstMileDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.item.TmsFirstMileItemDO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileItemBO;
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
    default MPJLambdaWrapperX<TmsFirstMileItemDO> buildBOWrapper(TmsFirstMilePageReqVO vo) {
        if (vo == null) {
            vo = new TmsFirstMilePageReqVO();
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
            .orderByDesc(TmsFirstMileDO::getCreateTime);
    }

    default PageResult<TmsFirstMileItemBO> selectPageBO(TmsFirstMilePageReqVO vo) {
        if (vo == null) {
            vo = new TmsFirstMilePageReqVO();
        }
        return selectJoinPage(vo, TmsFirstMileItemBO.class, buildBOWrapper(vo).selectAssociation(TmsFirstMileDO.class, TmsFirstMileItemBO::getTmsFirstMileDO));
    }

    default List<TmsFirstMileItemDO> selectListByFirstMileId(Long firstMileId) {
        return selectList(TmsFirstMileItemDO::getFirstMileId, firstMileId);
    }

    default int deleteByFirstMileId(Long firstMileId) {
        return delete(TmsFirstMileItemDO::getFirstMileId, firstMileId);
    }

}