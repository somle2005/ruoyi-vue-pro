package cn.iocoder.yudao.module.wms.dal.mysql.inbound.item;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.MPJLambdaWrapperX;
import cn.iocoder.yudao.module.wms.controller.admin.inbound.item.vo.WmsInboundItemPageReqVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.WmsInboundDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.item.WmsInboundItemBinQueryDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.item.WmsInboundItemDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.item.WmsInboundItemQueryDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.pickup.WmsPickupDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.pickup.item.WmsPickupItemDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.product.WmsProductDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.stock.bin.WmsStockBinDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.stock.warehouse.WmsStockWarehouseDO;
import cn.iocoder.yudao.module.wms.enums.inbound.WmsInboundStatus;
import org.apache.ibatis.annotations.Mapper;

import static cn.iocoder.yudao.module.wms.dal.mysql.inbound.item.WmsInboundItemQueryMapper.AGE_COL_EXPR;
import static cn.iocoder.yudao.module.wms.dal.mysql.inbound.item.WmsInboundItemQueryMapper.AGE_EXPR;

/**
 * 入库单详情 Mapper
 *
 * @author 李方捷
 */
@Mapper
public interface WmsInboundItemBinQueryMapper extends BaseMapperX<WmsInboundItemBinQueryDO> {


    default PageResult<WmsInboundItemBinQueryDO> selectPage(WmsInboundItemPageReqVO reqVO) {

        // 入库单明细
        MPJLambdaWrapperX<WmsInboundItemBinQueryDO> wrapper = new MPJLambdaWrapperX();
        //
        wrapper.in(WmsInboundItemQueryDO::getInboundStatus, WmsInboundStatus.ALL.getValue(),WmsInboundStatus.PART.getValue());

        // 连接入库单
        wrapper.innerJoin(WmsInboundDO.class,WmsInboundDO::getId, WmsInboundItemBinQueryDO::getInboundId)
            .in(WmsInboundDO::getInboundStatus, WmsInboundStatus.ALL.getValue(),WmsInboundStatus.PART.getValue())
            .likeIfExists(WmsInboundDO::getCode, reqVO.getInboundNo())
            .eqIfExists(WmsInboundDO::getWarehouseId, reqVO.getWarehouseId())
        ;

        // 连接上架明细
        wrapper.innerJoin(WmsPickupItemDO.class,WmsPickupItemDO::getInboundItemId, WmsInboundItemQueryDO::getId);

        // 连接上架单
        wrapper.innerJoin(WmsPickupDO.class,WmsPickupDO::getId,WmsPickupItemDO::getPickupId);

        // 连接仓位库存
        wrapper.innerJoin(WmsStockBinDO.class, WmsStockBinDO::getBinId, WmsPickupItemDO::getBinId);


        // 连接产品视图
        if(reqVO.getProductCode()!=null) {
            wrapper.innerJoin(WmsProductDO.class, WmsProductDO::getId, WmsStockWarehouseDO::getProductId)
                .likeIfExists(WmsProductDO::getBarCode, reqVO.getProductCode());
        }

        wrapper.eqIfPresent(WmsInboundItemDO::getInboundId, reqVO.getInboundId());
        wrapper.eqIfPresent(WmsInboundItemDO::getInboundStatus, reqVO.getInboundStatus());
        wrapper.eqIfPresent(WmsInboundItemDO::getProductId, reqVO.getProductId());

        wrapper.betweenIfPresent(WmsInboundItemDO::getCreateTime, reqVO.getCreateTime());

        // 范围查询
        wrapper.eqIfPresent(WmsInboundItemDO::getInboundCompanyId, reqVO.getInboundCompanyId());
        wrapper.eqIfPresent(WmsInboundItemDO::getInboundDeptId, reqVO.getInboundDeptId());
        wrapper.betweenIfPresent(WmsInboundItemDO::getActualQty,reqVO.getActualQty());
        wrapper.betweenIfPresent(WmsInboundItemDO::getOutboundAvailableQty,reqVO.getOutboundAvailableQty());
        wrapper.betweenIfPresent(WmsInboundItemDO::getPlanQty,reqVO.getPlanQty());
        wrapper.betweenIfPresent(WmsInboundItemDO::getShelvedQty,reqVO.getShelvedQty());

        wrapper.betweenIfPresent(AGE_EXPR, reqVO.getAge());

        wrapper.eqIfExists(WmsStockBinDO::getBinId, reqVO.getBinId());
        wrapper.eqIfExists(WmsStockBinDO::getWarehouseId, reqVO.getWarehouseId());


        // 添加字段
        wrapper.selectAll(WmsInboundItemDO.class);
        wrapper.select(WmsInboundDO::getWarehouseId);
        wrapper.selectAs(WmsInboundDO::getCode,WmsInboundItemBinQueryDO::getInboundCode);
        wrapper.select(WmsPickupItemDO::getBinId);
        wrapper.selectAs(WmsStockBinDO::getAvailableQty,WmsInboundItemBinQueryDO::getBinAvailableQty);
        wrapper.selectAs(WmsStockBinDO::getOutboundPendingQty,WmsInboundItemBinQueryDO::getBinOutboundPendingQty);
        wrapper.selectAs(WmsStockBinDO::getSellableQty,WmsInboundItemBinQueryDO::getBinSellableQty);
        //
        wrapper.selectAs(WmsPickupItemDO::getPickupId,WmsInboundItemBinQueryDO::getPickupId);
        wrapper.selectAs(WmsPickupDO::getCode,WmsInboundItemBinQueryDO::getPickupCode);
        wrapper.selectAs(WmsPickupItemDO::getQty,WmsInboundItemBinQueryDO::getPickupQty);
        wrapper.select(AGE_COL_EXPR);

        return selectPage(reqVO, wrapper);



    }




}
