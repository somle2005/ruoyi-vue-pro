package cn.iocoder.yudao.module.tms.dal.mysql.first.mile.request.item;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.MPJLambdaWrapperX;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.item.vo.TmsFirstMileRequestItemPageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestPageReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.item.TmsFirstMileRequesItemtDO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileRequesItemtItemBO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

/**
 * 头程申请表明细 Mapper
 *
 * @author wdy
 */
@Mapper
public interface TmsFirstMileRequestItemMapper extends BaseMapperX<TmsFirstMileRequesItemtDO> {

    default MPJLambdaWrapperX<TmsFirstMileRequesItemtDO> buildWrapper(TmsFirstMileRequestItemPageReqVO vo) {
        //vo == null
        if (vo == null) {
            vo = new TmsFirstMileRequestItemPageReqVO();
        }
        return new MPJLambdaWrapperX<TmsFirstMileRequesItemtDO>()
            .eqIfPresent(TmsFirstMileRequesItemtDO::getId, vo.getId())
            .betweenIfPresent(TmsFirstMileRequesItemtDO::getCreateTime, vo.getCreateTime())
            .eqIfPresent(TmsFirstMileRequesItemtDO::getProductId, vo.getProductId())
            .likeIfPresent(TmsFirstMileRequesItemtDO::getFbaBarCode, vo.getFbaBarCode())
            .eqIfPresent(TmsFirstMileRequesItemtDO::getQty, vo.getQty())
            .betweenIfPresent(TmsFirstMileRequesItemtDO::getPackageLength, vo.getPackageLength())
            .betweenIfPresent(TmsFirstMileRequesItemtDO::getPackageWidth, vo.getPackageWidth())
            .betweenIfPresent(TmsFirstMileRequesItemtDO::getPackageHeight, vo.getPackageHeight())
            .betweenIfPresent(TmsFirstMileRequesItemtDO::getPackageWeight, vo.getPackageWeight())
            .betweenIfPresent(TmsFirstMileRequesItemtDO::getVolume, vo.getVolume())
            .eqIfPresent(TmsFirstMileRequesItemtDO::getOrderStatus, vo.getOrderStatus())
            .eqIfPresent(TmsFirstMileRequesItemtDO::getOffStatus, vo.getOffStatus())
            .eqIfPresent(TmsFirstMileRequesItemtDO::getOrderClosedQty, vo.getOrderClosedQty())
            .orderByDesc(TmsFirstMileRequesItemtDO::getId);
    }

    //buildBOWrapper(vo)
    default MPJLambdaWrapperX<TmsFirstMileRequesItemtDO> buildBOWrapper(TmsFirstMileRequestPageReqVO vo) {
        return buildWrapper(vo.getItem())
            .leftJoin(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO.class, cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getId, TmsFirstMileRequesItemtDO::getRequestId)
            .betweenIfPresent(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getCreateTime, vo.getCreateTime())
            .betweenIfPresent(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getTotalWeight, vo.getTotalWeight())
            .betweenIfPresent(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getTotalVolume, vo.getTotalVolume())
            .eqIfPresent(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getId, vo.getId())
            .likeIfPresent(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getCode, vo.getCode())
            .eqIfPresent(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getRequestUserId, vo.getRequestUserId())
            .eqIfPresent(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getRequestDeptId, vo.getRequestDeptId())
            .eqIfPresent(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getToWarehouseId, vo.getToWarehouseId())
            .eqIfPresent(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getAuditStatus, vo.getAuditStatus())
            .eqIfPresent(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getOrderStatus, vo.getOrderStatus())
            .eqIfPresent(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getOffStatus, vo.getOffStatus())
            .orderByDesc(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO::getId);
    }

    default List<TmsFirstMileRequesItemtDO> selectListByRequestId(Long requestId) {
        return selectList(TmsFirstMileRequesItemtDO::getRequestId, requestId);
    }

    default List<TmsFirstMileRequesItemtDO> selectListByRequestIds(List<Long> requestIds) {
        if (requestIds == null || requestIds.isEmpty()) {
            return new ArrayList<>();
        }
        return selectList(TmsFirstMileRequesItemtDO::getRequestId, requestIds);
    }

    default PageResult<TmsFirstMileRequesItemtItemBO> selectPageBO(TmsFirstMileRequestPageReqVO pageReqVO) {
        return selectJoinPage(pageReqVO, TmsFirstMileRequesItemtItemBO.class, buildBOWrapper(pageReqVO).selectAssociation(cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO.class, TmsFirstMileRequesItemtItemBO::getTmsFirstMileRequestDO));
    }
}