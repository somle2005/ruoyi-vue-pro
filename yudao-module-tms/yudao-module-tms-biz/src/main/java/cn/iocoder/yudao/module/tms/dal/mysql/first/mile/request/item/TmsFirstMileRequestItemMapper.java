package cn.iocoder.yudao.module.tms.dal.mysql.first.mile.request.item;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.MPJLambdaWrapperX;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.item.vo.TmsFirstMileRequestItemPageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestPageReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.item.TmsFirstMileRequestItemDO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileRequestItemBO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 头程申请表明细 Mapper
 *
 * @author wdy
 */
@Mapper
public interface TmsFirstMileRequestItemMapper extends BaseMapperX<TmsFirstMileRequestItemDO> {

    default MPJLambdaWrapperX<TmsFirstMileRequestItemDO> buildWrapper(TmsFirstMileRequestItemPageReqVO vo) {
        return new MPJLambdaWrapperX<TmsFirstMileRequestItemDO>()
            .eqIfPresent(TmsFirstMileRequestItemDO::getId, vo.getId())
            .betweenIfPresent(TmsFirstMileRequestItemDO::getCreateTime, vo.getCreateTime())
            .eqIfPresent(TmsFirstMileRequestItemDO::getProductId, vo.getProductId())
            .likeIfPresent(TmsFirstMileRequestItemDO::getFbaBarCode, vo.getFbaBarCode())
            .eqIfPresent(TmsFirstMileRequestItemDO::getQty, vo.getQty())
            .betweenIfPresent(TmsFirstMileRequestItemDO::getPackageLength, vo.getPackageLength())
            .betweenIfPresent(TmsFirstMileRequestItemDO::getPackageWidth, vo.getPackageWidth())
            .betweenIfPresent(TmsFirstMileRequestItemDO::getPackageHeight, vo.getPackageHeight())
            .betweenIfPresent(TmsFirstMileRequestItemDO::getPackageWeight, vo.getPackageWeight())
            .betweenIfPresent(TmsFirstMileRequestItemDO::getVolume, vo.getVolume())
            .eqIfPresent(TmsFirstMileRequestItemDO::getOrderStatus, vo.getOrderStatus())
            .eqIfPresent(TmsFirstMileRequestItemDO::getOffStatus, vo.getOffStatus())
            .eqIfPresent(TmsFirstMileRequestItemDO::getOrderClosedQty, vo.getOrderClosedQty())
            .orderByDesc(TmsFirstMileRequestItemDO::getId);
    }

    //buildBOWrapper(vo)
    default MPJLambdaWrapperX<TmsFirstMileRequestItemDO> buildBOWrapper(TmsFirstMileRequestPageReqVO vo) {
        return buildWrapper(vo.getItem())
            .leftJoin(TmsFirstMileRequestDO.class, TmsFirstMileRequestDO::getId, TmsFirstMileRequestItemDO::getRequestId)
            .betweenIfPresent(TmsFirstMileRequestDO::getCreateTime, vo.getCreateTime())
            .betweenIfPresent(TmsFirstMileRequestDO::getTotalWeight, vo.getTotalWeight())
            .betweenIfPresent(TmsFirstMileRequestDO::getTotalVolume, vo.getTotalVolume())
//            .between(isValidBetween(vo.getTotalWeight()), TmsFirstMileRequestDO::getTotalWeight, vo.getTotalWeight()[0], vo.getTotalWeight()[1])
//            .between(isValidBetween(vo.getTotalVolume()), TmsFirstMileRequestDO::getTotalVolume, vo.getTotalVolume()[0], vo.getTotalVolume()[1])
//            .between(isValidBetween(vo.getCreateTime()), TmsFirstMileRequestDO::getCreateTime, vo.getCreateTime()[0], vo.getCreateTime()[1])
            .eqIfPresent(TmsFirstMileRequestDO::getId, vo.getId())
            .likeIfPresent(TmsFirstMileRequestDO::getCode, vo.getCode())
            .eqIfPresent(TmsFirstMileRequestDO::getRequestUserId, vo.getRequestUserId())
            .eqIfPresent(TmsFirstMileRequestDO::getRequestDeptId, vo.getRequestDeptId())
            .eqIfPresent(TmsFirstMileRequestDO::getToWarehouseId, vo.getToWarehouseId())
            .eqIfPresent(TmsFirstMileRequestDO::getAuditStatus, vo.getAuditStatus())
            .eqIfPresent(TmsFirstMileRequestDO::getOrderStatus, vo.getOrderStatus())
            .eqIfPresent(TmsFirstMileRequestDO::getOffStatus, vo.getOffStatus())
            .orderByDesc(TmsFirstMileRequestDO::getId);
    }

    default PageResult<TmsFirstMileRequestItemDO> selectPage(TmsFirstMileRequestItemPageReqVO reqVO) {
        return selectPage(reqVO, buildWrapper(reqVO));
    }

    default List<TmsFirstMileRequestItemDO> selectListByRequestId(Long requestId) {
        return selectList(TmsFirstMileRequestItemDO::getRequestId, requestId);
    }


    default PageResult<TmsFirstMileRequestItemBO> selectPageBO(TmsFirstMileRequestPageReqVO pageReqVO) {
        return selectJoinPage(pageReqVO, TmsFirstMileRequestItemBO.class, buildBOWrapper(pageReqVO).selectAssociation(TmsFirstMileRequestDO.class, TmsFirstMileRequestItemBO::getTmsFirstMileRequestDO));
    }
}