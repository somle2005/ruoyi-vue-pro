package cn.iocoder.yudao.module.wms.api.warehouse;

import cn.iocoder.yudao.module.wms.api.inbound.dto.WmsStockWarehouseSimpleDTO;
import cn.iocoder.yudao.module.wms.api.warehouse.dto.WmsWareHouseUpdateReqDTO;
import cn.iocoder.yudao.module.wms.api.warehouse.dto.WmsWarehouseDTO;
import cn.iocoder.yudao.module.wms.api.warehouse.dto.vo.WmsWarehouseListReqDTO;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 仓库API 接口
 */
public interface WmsWarehouseApi {


    Map<Long, WmsWarehouseDTO> getWarehouseMap(Collection<Long> ids);

    void validWarehouseList(Set<Long> longs);

    /**
     * 根据条件查询仓库列表
     *
     * @param reqDTO 查询条件
     * @return 仓库列表
     */
    List<WmsWarehouseDTO> selectList(WmsWarehouseListReqDTO reqDTO);

    /**
     * 更新仓库库存
     *
     * @param updateReqVO 更新信息
     * @return 仓库库存
     */
    Boolean updateStockWarehouse(WmsWareHouseUpdateReqDTO updateReqVO);

    /**
     * 查询可售库存
     *
     * @param warehouseId 仓库编号
     * @param productId   产品编号
     * @return 可售库存列表
     */
    List<WmsStockWarehouseSimpleDTO> selectSellableQty(Long warehouseId, Long productId);

}
