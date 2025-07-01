package cn.iocoder.yudao.module.tms.dal.mysql.first.mile.request.item;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.MPJLambdaWrapperX;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.item.vo.TmsFirstMileRequestItemPageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestPageReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.item.TmsFirstMileRequestItemDO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileRequestItemItemBO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileRequestItemSummaryBO;
import com.github.yulichang.wrapper.MPJLambdaWrapper;
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
        return new MPJLambdaWrapperX<TmsFirstMileRequestItemDO>()
            .eqIfPresent(TmsFirstMileRequestItemDO::getId, vo.getId())
            .betweenIfPresent(TmsFirstMileRequestItemDO::getCreateTime, vo.getCreateTime())
            .inIfPresent(TmsFirstMileRequestItemDO::getProductId, vo.getProductIds())
            .likeIfPresent(TmsFirstMileRequestItemDO::getFbaBarCode, vo.getFbaBarCode())
            .eqIfPresent(TmsFirstMileRequestItemDO::getQty, vo.getQty())
            .betweenIfPresent(TmsFirstMileRequestItemDO::getPackageLength, vo.getPackageLength())
            .betweenIfPresent(TmsFirstMileRequestItemDO::getPackageWidth, vo.getPackageWidth())
            .betweenIfPresent(TmsFirstMileRequestItemDO::getPackageHeight, vo.getPackageHeight())
            .betweenIfPresent(TmsFirstMileRequestItemDO::getPackageWeight, vo.getPackageWeight())
            .eqIfPresent(TmsFirstMileRequestItemDO::getOrderStatus, vo.getOrderStatus())
            .eqIfPresent(TmsFirstMileRequestItemDO::getOffStatus, vo.getOffStatus())
            .eqIfPresent(TmsFirstMileRequestItemDO::getOrderClosedQty, vo.getOrderClosedQty())
            //fba
            .likeIfPresent(TmsFirstMileRequestItemDO::getFbaBarCode, vo.getFbaBarCode())
            .orderByDesc(TmsFirstMileRequestItemDO::getId);
    }

    //buildBOWrapper(vo)
    default MPJLambdaWrapperX<TmsFirstMileRequestItemDO> buildBOWrapper(TmsFirstMileRequestPageReqVO vo) {
        return buildWrapper(vo.getItem())
            .betweenIfPresent(TmsFirstMileRequestDO::getCreateTime, vo.getCreateTime())
            .eqIfPresent(TmsFirstMileRequestDO::getId, vo.getId())
            .likeIfPresent(TmsFirstMileRequestDO::getCode, vo.getCode())
            .eqIfPresent(TmsFirstMileRequestDO::getRequesterId, vo.getRequesterId())
            .inIfPresent(TmsFirstMileRequestDO::getRequestDeptId, vo.getRequestDeptIds())
            .eqIfPresent(TmsFirstMileRequestDO::getToWarehouseId, vo.getToWarehouseId())
            .eqIfPresent(TmsFirstMileRequestDO::getAuditStatus, vo.getAuditStatus())
            .eqIfPresent(TmsFirstMileRequestDO::getOrderStatus, vo.getOrderStatus())
            .eqIfPresent(TmsFirstMileRequestDO::getOffStatus, vo.getOffStatus())
            .orderByDesc(TmsFirstMileRequestDO::getId);
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
        MPJLambdaWrapper<TmsFirstMileRequestItemDO> wrapper = buildBOWrapper(pageReqVO).selectAssociation(TmsFirstMileRequestDO.class, TmsFirstMileRequestItemItemBO::getTmsFirstMileRequestDO);
        wrapper.leftJoin(TmsFirstMileRequestDO.class, TmsFirstMileRequestDO::getId, TmsFirstMileRequestItemDO::getRequestId);
        return selectJoinPage(pageReqVO, TmsFirstMileRequestItemItemBO.class, wrapper);
    }

    /**
     * @param id 头程申请单ID
     * @return 头程申请单明细
     */
    default TmsFirstMileRequestItemItemBO selectBOById(Long id) {
        MPJLambdaWrapperX<TmsFirstMileRequestItemDO> wrapperX = buildBOWrapper(new TmsFirstMileRequestPageReqVO().setId(id));
        wrapperX.leftJoin(TmsFirstMileRequestDO.class, TmsFirstMileRequestDO::getId, TmsFirstMileRequestItemDO::getRequestId);
        return selectJoinOne(TmsFirstMileRequestItemItemBO.class, wrapperX);
    }

    default void deleteByRequestId(Long requestId) {
        LambdaQueryWrapperX<TmsFirstMileRequestItemDO> wrapperX = new LambdaQueryWrapperX<TmsFirstMileRequestItemDO>().eq(TmsFirstMileRequestItemDO::getRequestId, requestId);
        delete(wrapperX);
    }

    //汇总
    default TmsFirstMileRequestItemSummaryBO selectTmsFirstMileRequestItemSummaryBO(TmsFirstMileRequestItemPageReqVO req) {
        if (req == null) {
            req = new TmsFirstMileRequestItemPageReqVO();
        }
        MPJLambdaWrapperX<TmsFirstMileRequestItemDO> wrapperX = new MPJLambdaWrapperX<TmsFirstMileRequestItemDO>()
            .selectSum(TmsFirstMileRequestItemDO::getQty, TmsFirstMileRequestItemSummaryBO::getSumQty)
            .selectSum(TmsFirstMileRequestItemDO::getOrderClosedQty, TmsFirstMileRequestItemSummaryBO::getSumOrderClosedQty)
            .selectSum(TmsFirstMileRequestItemDO::getPackageLength, TmsFirstMileRequestItemSummaryBO::getSumPackageLength)
            .selectSum(TmsFirstMileRequestItemDO::getPackageWidth, TmsFirstMileRequestItemSummaryBO::getSumPackageWidth)
            .selectSum(TmsFirstMileRequestItemDO::getPackageHeight, TmsFirstMileRequestItemSummaryBO::getSumPackageHeight)
            .selectSum(TmsFirstMileRequestItemDO::getPackageWeight, TmsFirstMileRequestItemSummaryBO::getSumPackageWeight)
            .selectSum(TmsFirstMileRequestItemDO::getWeight, TmsFirstMileRequestItemSummaryBO::getSumWeight);
        return selectJoinOne(TmsFirstMileRequestItemSummaryBO.class, wrapperX);
    }
}