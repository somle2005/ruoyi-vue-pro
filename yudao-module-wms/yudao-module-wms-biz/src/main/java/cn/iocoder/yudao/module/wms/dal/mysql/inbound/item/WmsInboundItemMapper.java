package cn.iocoder.yudao.module.wms.dal.mysql.inbound.item;

import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.MPJLambdaWrapperX;
import cn.iocoder.yudao.module.wms.controller.admin.inbound.item.vo.WmsInboundItemPageReqVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.WmsInboundDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.item.WmsInboundItemDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.item.WmsInboundItemQueryDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.stock.bin.WmsStockBinDO;
import cn.iocoder.yudao.module.wms.enums.inbound.WmsInboundStatus;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

import static cn.iocoder.yudao.module.wms.dal.mysql.inbound.item.WmsInboundItemQueryMapper.AGE_COL_EXPR;
import static com.baomidou.mybatisplus.core.toolkit.Wrappers.lambdaUpdate;

/**
 * 入库单详情 Mapper
 *
 * @author 李方捷
 */
@Mapper
public interface WmsInboundItemMapper extends BaseMapperX<WmsInboundItemDO> {

    /**
     * 按 inbound_id,product_id 查询唯一的 WmsInboundItemDO
     */
    default WmsInboundItemDO getByInboundIdAndProductId(Long inboundId, Long productId) {
        LambdaQueryWrapperX<WmsInboundItemDO> wrapper = new LambdaQueryWrapperX<>();
        wrapper.eq(WmsInboundItemDO::getInboundId, inboundId);
        wrapper.eq(WmsInboundItemDO::getProductId, productId);
        return selectOne(wrapper);
    }

    /**
     * 按 inboundId 查询 WmsInboundItemDO
     */
    default List<WmsInboundItemDO> selectByInboundId(Long inboundId, int limit) {
        WmsInboundItemPageReqVO reqVO = new WmsInboundItemPageReqVO();
        reqVO.setPageSize(limit);
        reqVO.setPageNo(1);
        LambdaQueryWrapperX<WmsInboundItemDO> wrapper = new LambdaQueryWrapperX<>();
        wrapper.eq(WmsInboundItemDO::getInboundId, inboundId);
        return selectPage(reqVO, wrapper).getList();
    }

    default List<WmsInboundItemDO> selectItemListHasAvailableQty(Long warehouseId, Long productId, Long companyId, Long deptId, Boolean olderFirst) {
        MPJLambdaWrapperX<WmsInboundItemDO> query = new MPJLambdaWrapperX<>();
//        query.select(WmsInboundItemDO::getId, WmsInboundItemDO::getInboundId, WmsInboundItemDO::getProductId);
        query.selectAll(WmsInboundItemDO.class);
        query.innerJoin(WmsInboundDO.class, WmsInboundDO::getId, WmsInboundItemDO::getInboundId);
        query.in(WmsInboundDO::getInboundStatus, Arrays.asList(WmsInboundStatus.ALL.getValue(), WmsInboundStatus.PART.getValue()));
        query.eqIfExists(WmsInboundItemDO::getCompanyId, companyId);
        query.eqIfExists(WmsInboundItemDO::getDeptId, deptId);
        query.eq(WmsInboundDO::getWarehouseId, warehouseId).eq(WmsInboundItemDO::getProductId, productId).last("ORDER BY DATEDIFF(t1.inbound_time, now())+t1.init_age desc");
        query.selectAll(WmsInboundItemDO.class);
        // 控制顺序
        if (olderFirst) {
            query.orderByAsc(WmsInboundDO::getCreateTime);
        } else {
            query.orderByDesc(WmsInboundDO::getCreateTime);
        }
        return selectList(query);
    }

    // default PageResult<WmsInboundItemLogicDO> selectInboundItemLogicList(Long productId) {
    // 
    // 
    // MPJLambdaWrapperX<WmsInboundItemLogicDO> wrapper = new MPJLambdaWrapperX();
    // //
    // wrapper.selectAll(WmsInboundItemDO.class);
    // wrapper.select(WmsInboundDO::getWarehouseId);
    // wrapper.select(WmsPickupItemDO::getBinId);
    // wrapper.select(AGE_EXPR+" as age");
    // 
    // //
    // wrapper.innerJoin(WmsInboundDO.class,WmsInboundDO::getId, WmsInboundItemQueryDO::getInboundId);
    // 
    // 
    // 
    // PageResult<WmsInboundItemLogicDO> pageResult =selectPage(new PageParam(),wrapper);
    // 
    // List<WmsInboundItemLogicDO> list= selectList(wrapper);
    // 
    // return selectPage(new PageParam(), wrapper);
    // 
    // 
    // 
    // }
    /**
     * 按 inbound_id,product_id 查询 WmsInboundItemDO 清单
     */
    default List<WmsInboundItemDO> selectByInboundIdAndProductId(Long inboundId, Long productId) {
        return selectList(new LambdaQueryWrapperX<WmsInboundItemDO>().eq(WmsInboundItemDO::getInboundId, inboundId).eq(WmsInboundItemDO::getProductId, productId));
    }

    /**
     * 查询批次库存详情
     *
     * @param warehouseId 仓库编号
     * @param productId   产品编号
     * @param deptId      部门编号
     * @param companyId   公司编号
     * @param binId       库位编号
     * @param olderFirst  是否按入库时间升序
     * @return 入库批次列表
     */
    default List<WmsInboundItemDO> getInboundItemLogicList(Long warehouseId, Long productId, Long deptId, Long companyId, Long binId, boolean olderFirst) {
        // 主表
        MPJLambdaWrapperX<WmsInboundItemDO> wrapper = new MPJLambdaWrapperX();
        // 主表条件
        wrapper.eq(WmsInboundItemQueryDO::getProductId, productId)
            .in(WmsInboundItemQueryDO::getInboundStatus, WmsInboundStatus.ALL.getValue(), WmsInboundStatus.PART.getValue())
            .eqIfExists(WmsInboundItemQueryDO::getDeptId, deptId)
            .eqIfExists(WmsInboundItemQueryDO::getCompanyId, companyId)
            .gt(WmsInboundItemQueryDO::getOutboundAvailableQty, 0)
        ;
        // 查询主表字段
        wrapper.selectAll(WmsInboundItemDO.class);
        // 查询子表字段
        wrapper.innerJoin(WmsInboundDO.class, WmsInboundDO::getId, WmsInboundItemQueryDO::getInboundId).
            select(WmsInboundDO::getWarehouseId).
            select(WmsInboundDO::getInboundTime).
            select(AGE_COL_EXPR).
            eq(WmsInboundDO::getWarehouseId, warehouseId);

        wrapper.innerJoin(WmsStockBinDO.class, WmsStockBinDO::getWarehouseId, WmsInboundDO::getWarehouseId).
            eq(WmsStockBinDO::getProductId, productId).
            eq(WmsStockBinDO::getBinId, binId).
            ge(WmsStockBinDO::getSellableQty, 0).
            select(WmsStockBinDO::getBinId).
            select(WmsStockBinDO::getSellableQty).
            select(WmsStockBinDO::getOutboundPendingQty);

        // 控制顺序
        if (olderFirst) {
            wrapper.orderByAsc(WmsInboundDO::getInboundTime);
        } else {
            wrapper.orderByDesc(WmsInboundDO::getInboundTime);
        }

        return selectList(wrapper);
    }

    /**
     * 更新入库单明细
     * 对数据进行校验
     *
     * @param inboundItem 入库单明细
     */
    @Transactional(rollbackFor = Exception.class)
    default void updateInboundItem(WmsInboundItemDO inboundItem) {
        LambdaUpdateWrapper<WmsInboundItemDO> wrapper = lambdaUpdate(WmsInboundItemDO.class)
            .eq(WmsInboundItemDO::getId, inboundItem.getId());

        if (isValidQuantity(inboundItem.getActualQty())) {
            wrapper.set(WmsInboundItemDO::getActualQty, inboundItem.getActualQty());
        }

        if (isValidQuantity(inboundItem.getPlanQty())) {
            wrapper.set(WmsInboundItemDO::getPlanQty, inboundItem.getPlanQty());
        }

        if (isValidQuantity(inboundItem.getOutboundAvailableQty())) {
            wrapper.set(WmsInboundItemDO::getOutboundAvailableQty, inboundItem.getOutboundAvailableQty());
        }

        if (isValidQuantity(inboundItem.getShelveClosedQty())) {
            wrapper.set(WmsInboundItemDO::getShelveClosedQty, inboundItem.getShelveClosedQty());
        }

        //后续如果有其他字段需要更新，可以在这里添加。。。

        if (wrapper.getSqlSet() == null) {
            // 保证SQL语法正确
            wrapper.setSql("1=1");
        }

        this.update(wrapper);
    }

    private boolean isValidQuantity(Integer qty) {
        // 检查数量是否为 null 或不小于 0
        return qty != null && qty >= 0;
    }
}
