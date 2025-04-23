package cn.iocoder.yudao.module.tms.dal.mysql.first.mile.request.item;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.MPJLambdaWrapperX;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.item.vo.TmsFirstMileRequestItemPageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestPageReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.item.TmsFirstMileRequestItemDO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileRequestItemItemBO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

/**
 * 头程申请表明细 Mapper
 *
 * @author wdy
 */
@Mapper
public interface TmsFirstMileRequestItemMapper extends BaseMapperX<TmsFirstMileRequestItemDO> {

    default MPJLambdaWrapperX<TmsFirstMileRequestItemDO> buildWrapper(TmsFirstMileRequestItemPageReqVO vo) {
        //vo == null
        if (vo == null) {
            vo = new TmsFirstMileRequestItemPageReqVO();
        }
        return new MPJLambdaWrapperX<TmsFirstMileRequestItemDO>().eqIfPresent(TmsFirstMileRequestItemDO::getId, vo.getId())
            .betweenIfPresent(TmsFirstMileRequestItemDO::getCreateTime, vo.getCreateTime())
            .eqIfPresent(TmsFirstMileRequestItemDO::getProductId, vo.getProductId()).likeIfPresent(TmsFirstMileRequestItemDO::getFbaBarCode, vo.getFbaBarCode())
            .eqIfPresent(TmsFirstMileRequestItemDO::getQty, vo.getQty()).betweenIfPresent(TmsFirstMileRequestItemDO::getPackageLength, vo.getPackageLength())
            .betweenIfPresent(TmsFirstMileRequestItemDO::getPackageWidth, vo.getPackageWidth())
            .betweenIfPresent(TmsFirstMileRequestItemDO::getPackageHeight, vo.getPackageHeight())
            .betweenIfPresent(TmsFirstMileRequestItemDO::getPackageWeight, vo.getPackageWeight())
            .betweenIfPresent(TmsFirstMileRequestItemDO::getVolume, vo.getVolume()).eqIfPresent(TmsFirstMileRequestItemDO::getOrderStatus, vo.getOrderStatus())
            .eqIfPresent(TmsFirstMileRequestItemDO::getOffStatus, vo.getOffStatus())
            .eqIfPresent(TmsFirstMileRequestItemDO::getOrderClosedQty, vo.getOrderClosedQty()).orderByDesc(TmsFirstMileRequestItemDO::getId);
    }

    //buildBOWrapper(vo)
    default MPJLambdaWrapperX<TmsFirstMileRequestItemDO> buildBOWrapper(TmsFirstMileRequestPageReqVO vo) {
        return buildWrapper(vo.getItem()).leftJoin(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO.class,
                cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getId, TmsFirstMileRequestItemDO::getRequestId)
            .betweenIfPresent(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getCreateTime, vo.getCreateTime())
            .betweenIfPresent(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getTotalWeight, vo.getTotalWeight())
            .betweenIfPresent(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getTotalVolume, vo.getTotalVolume())
            .eqIfPresent(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getId, vo.getId())
            .likeIfPresent(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getCode, vo.getCode())
            .eqIfPresent(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getRequesterId, vo.getRequesterId())
            .eqIfPresent(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getRequestDeptId, vo.getRequestDeptId())
            .eqIfPresent(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getToWarehouseId, vo.getToWarehouseId())
            .eqIfPresent(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getAuditStatus, vo.getAuditStatus())
            .eqIfPresent(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getOrderStatus, vo.getOrderStatus())
            .eqIfPresent(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getOffStatus, vo.getOffStatus())
            .orderByDesc(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getId);
    }

    default List<TmsFirstMileRequestItemDO> selectListByRequestId(Long requestId) {
        return selectList(TmsFirstMileRequestItemDO::getRequestId, requestId);
    }

    default List<TmsFirstMileRequestItemDO> selectListByRequestIds(List<Long> requestIds) {
        if (requestIds == null || requestIds.isEmpty()) {
            return new ArrayList<>();
        }
        return selectList(TmsFirstMileRequestItemDO::getRequestId, requestIds);
    }

    default PageResult<TmsFirstMileRequestItemItemBO> selectPageBO(TmsFirstMileRequestPageReqVO pageReqVO) {
        return selectJoinPage(pageReqVO, TmsFirstMileRequestItemItemBO.class, buildBOWrapper(pageReqVO).selectAssociation(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO.class, TmsFirstMileRequestItemItemBO::getTmsFirstMileRequestDO));
    }

    default void deleteByRequestId(Long requestId) {
        LambdaQueryWrapperX<TmsFirstMileRequestItemDO> wrapperX = new LambdaQueryWrapperX<TmsFirstMileRequestItemDO>().eq(TmsFirstMileRequestItemDO::getRequestId, requestId);
        delete(wrapperX);
    }
}