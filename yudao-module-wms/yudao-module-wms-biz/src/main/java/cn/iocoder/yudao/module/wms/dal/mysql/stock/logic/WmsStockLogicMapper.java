package cn.iocoder.yudao.module.wms.dal.mysql.stock.logic;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.MPJLambdaWrapperX;
import cn.iocoder.yudao.module.wms.controller.admin.stock.logic.vo.WmsStockLogicPageReqVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.product.WmsProductDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.stock.logic.WmsStockLogicDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.warehouse.WmsWarehouseDO;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import jakarta.validation.constraints.NotNull;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.baomidou.mybatisplus.core.toolkit.Wrappers.lambdaUpdate;

/**
 * 逻辑库存 Mapper
 *
 * @author 李方捷
 */
@Mapper
public interface WmsStockLogicMapper extends BaseMapperX<WmsStockLogicDO> {

    default PageResult<WmsStockLogicDO> selectPage(WmsStockLogicPageReqVO reqVO) {
        MPJLambdaWrapperX<WmsStockLogicDO> wrapper = new MPJLambdaWrapperX();
        // 连接产品视图
        wrapper.innerJoin(WmsProductDO.class, WmsProductDO::getId, WmsStockLogicDO::getProductId).likeIfExists(WmsProductDO::getCode, reqVO.getProductCode());
        // 按仓库
        // 按产品ID
        wrapper.eqIfPresent(WmsStockLogicDO::getWarehouseId, reqVO.getWarehouseId());
        wrapper.eqIfPresent(WmsStockLogicDO::getProductId, reqVO.getProductId());
        wrapper.eqIfPresent(WmsStockLogicDO::getCompanyId, reqVO.getCompanyId());
        wrapper.eqIfPresent(WmsStockLogicDO::getDeptId, reqVO.getDeptId());
        wrapper.betweenIfPresent(WmsStockLogicDO::getCreateTime, reqVO.getCreateTime());
        wrapper.betweenIfPresent(WmsStockLogicDO::getAvailableQty, reqVO.getAvailableQty());
        wrapper.betweenIfPresent(WmsStockLogicDO::getOutboundPendingQty, reqVO.getOutboundPendingQty());
        wrapper.betweenIfPresent(WmsStockLogicDO::getShelvePendingQty, reqVO.getShelvingPendingQty());
//        wrapper.ne(WmsStockLogicDO::getAvailableQty, 0);
        return selectPage(reqVO, wrapper);
    }

    /**
     * 按 warehouse_id,dept_id,product_id 查询唯一的 WmsStockLogicDO
     */
    default WmsStockLogicDO getByUkProductOwner(Long warehouseId, Long companyId, Long deptId, Long productId) {
        LambdaQueryWrapperX<WmsStockLogicDO> wrapper = new LambdaQueryWrapperX<>();
        wrapper.eq(WmsStockLogicDO::getWarehouseId, warehouseId);
        wrapper.eq(WmsStockLogicDO::getCompanyId, companyId);
        wrapper.eqIfPresent(WmsStockLogicDO::getDeptId, deptId);
        wrapper.eq(WmsStockLogicDO::getProductId, productId);
        wrapper.orderByAsc(WmsStockLogicDO::getCreateTime);
        wrapper.last("limit 1");
        return selectOne(wrapper);
    }

    default List<WmsStockLogicDO> selectStockLogic(Long warehouseId, Long productId, Long companyId, Long deptId) {
        LambdaQueryWrapperX<WmsStockLogicDO> wrapper = new LambdaQueryWrapperX<>();
        wrapper.eq(WmsStockLogicDO::getWarehouseId, warehouseId);
        wrapper.eqIfPresent(WmsStockLogicDO::getProductId, productId);
        wrapper.eqIfPresent(WmsStockLogicDO::getCompanyId, companyId);
        wrapper.eqIfPresent(WmsStockLogicDO::getDeptId, deptId);
        return selectList(wrapper);
    }

    default List<WmsStockLogicDO> selectStockLogic(Long warehouseId, List<Long> productIdList) {
        LambdaQueryWrapperX<WmsStockLogicDO> wrapper = new LambdaQueryWrapperX<>();
        wrapper.eq(WmsStockLogicDO::getWarehouseId, warehouseId);
        wrapper.in(WmsStockLogicDO::getProductId, productIdList);
        return selectList(wrapper);
    }

    default List<WmsStockLogicDO> selectByDeptIdAndProductIdAndCountryId(Long deptId, @NotNull List<Long> productIds, @NotNull String country) {
        MPJLambdaWrapperX<WmsStockLogicDO> wrapper = new MPJLambdaWrapperX<>();
        // 连接仓库表
        wrapper.innerJoin(WmsWarehouseDO.class, WmsWarehouseDO::getId, WmsStockLogicDO::getWarehouseId)
            // 限定国家
            .eqIfPresent(WmsWarehouseDO::getCountry, country)
            // 按部门ID和产品ID查询
            // 指定部门
            .eqIfPresent(WmsStockLogicDO::getDeptId, deptId)
            // 指定产品集合
            .in(WmsStockLogicDO::getProductId, productIds);
        return selectList(wrapper);
    }

    default List<WmsStockLogicDO> selectByWarehouseIdAndProductId(Long warehouseId, Long productId) {
        MPJLambdaWrapperX<WmsStockLogicDO> wrapper = new MPJLambdaWrapperX<>();
        // 连接仓库表
        wrapper.innerJoin(WmsWarehouseDO.class, WmsWarehouseDO::getId, WmsStockLogicDO::getWarehouseId)
            //指定产品集合
            .eq(WmsStockLogicDO::getProductId, productId)
            //指定仓库
            .eq(WmsStockLogicDO::getWarehouseId, warehouseId)
            //默认先进先出
            .orderByAsc(WmsStockLogicDO::getCreateTime);
        return selectList(wrapper);
    }

    /**
     * 更新逻辑库存
     * 数据校验
     *
     * @param stockLogicDO 逻辑库存
     */
    @Transactional(rollbackFor = Exception.class)
    default void updateStockLogic(WmsStockLogicDO stockLogicDO) {
        LambdaUpdateWrapper<WmsStockLogicDO> wrapper = lambdaUpdate(WmsStockLogicDO.class)
            .eq(WmsStockLogicDO::getId, stockLogicDO.getId());

        if (isValidQuantity(stockLogicDO.getAvailableQty())) {
            wrapper.set(WmsStockLogicDO::getAvailableQty, stockLogicDO.getAvailableQty());
        }

        if (isValidQuantity(stockLogicDO.getShelvePendingQty())) {
            wrapper.set(WmsStockLogicDO::getShelvePendingQty, stockLogicDO.getShelvePendingQty());
        }

        if (isValidQuantity(stockLogicDO.getOutboundPendingQty())) {
            wrapper.set(WmsStockLogicDO::getOutboundPendingQty, stockLogicDO.getOutboundPendingQty());
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