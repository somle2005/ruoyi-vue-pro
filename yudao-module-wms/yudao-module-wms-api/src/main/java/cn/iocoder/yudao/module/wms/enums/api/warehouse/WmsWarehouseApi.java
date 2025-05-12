package cn.iocoder.yudao.module.wms.enums.api.warehouse;

import cn.iocoder.yudao.module.wms.enums.api.warehouse.dto.WmsWarehouseDTO;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public interface WmsWarehouseApi {


    Map<Long, WmsWarehouseDTO> getWarehouseMap(Collection<Long> ids);

    void validWarehouseList(Set<Long> longs);
}
