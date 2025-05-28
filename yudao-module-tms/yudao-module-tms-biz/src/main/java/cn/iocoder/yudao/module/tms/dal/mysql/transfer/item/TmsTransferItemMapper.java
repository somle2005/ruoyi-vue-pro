package cn.iocoder.yudao.module.tms.dal.mysql.transfer.item;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.module.tms.controller.admin.transfer.item.vo.TmsTransferItemPageReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.transfer.item.TmsTransferItemDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 调拨单明细 Mapper
 *
 * @author wdy
 */
@Mapper
public interface TmsTransferItemMapper extends BaseMapperX<TmsTransferItemDO> {

    default PageResult<TmsTransferItemDO> selectPage(TmsTransferItemPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<TmsTransferItemDO>()
            .eqIfPresent(TmsTransferItemDO::getCreator, reqVO.getCreator())
            .betweenIfPresent(TmsTransferItemDO::getCreateTime, reqVO.getCreateTime())
            .eqIfPresent(TmsTransferItemDO::getUpdater, reqVO.getUpdater())
            .betweenIfPresent(TmsTransferItemDO::getUpdateTime, reqVO.getUpdateTime())
            .eqIfPresent(TmsTransferItemDO::getProductId, reqVO.getProductId())
            .eqIfPresent(TmsTransferItemDO::getQty, reqVO.getQty())
            .eqIfPresent(TmsTransferItemDO::getBoxQty, reqVO.getBoxQty())
            .eqIfPresent(TmsTransferItemDO::getPackageWeight, reqVO.getPackageWeight())
            .eqIfPresent(TmsTransferItemDO::getPackageVolume, reqVO.getPackageVolume())
            .eqIfPresent(TmsTransferItemDO::getStockCompanyId, reqVO.getStockCompanyId())
            .eqIfPresent(TmsTransferItemDO::getRemark, reqVO.getRemark())
            .eqIfPresent(TmsTransferItemDO::getOutboundClosedQty, reqVO.getOutboundClosedQty())
            .eqIfPresent(TmsTransferItemDO::getInboundClosedQty, reqVO.getInboundClosedQty())
            .orderByDesc(TmsTransferItemDO::getId));
    }

    default List<TmsTransferItemDO> selectListByTransferId(Long transferId) {
        return selectList(new LambdaQueryWrapperX<TmsTransferItemDO>()
            .eq(TmsTransferItemDO::getTransferId, transferId)
            .orderByDesc(TmsTransferItemDO::getId));
    }

    default void deleteByTransferId(Long transferId) {
        delete(new LambdaQueryWrapperX<TmsTransferItemDO>()
            .eq(TmsTransferItemDO::getTransferId, transferId));
    }

}