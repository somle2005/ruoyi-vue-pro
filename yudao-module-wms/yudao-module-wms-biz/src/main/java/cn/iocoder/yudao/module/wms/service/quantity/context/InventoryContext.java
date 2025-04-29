package cn.iocoder.yudao.module.wms.service.quantity.context;

import cn.iocoder.yudao.module.wms.dal.dataobject.inventory.WmsInventoryDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inventory.bin.WmsInventoryBinDO;
import lombok.Data;

import java.util.List;

/**
 * @author: LeeFJ
 * @date: 2025/3/25 8:57
 * @description:
 */
@Data
public class InventoryContext {

    private WmsInventoryDO inventoryDO;
    private List<WmsInventoryBinDO> wmsInventoryBinDOList;

}
