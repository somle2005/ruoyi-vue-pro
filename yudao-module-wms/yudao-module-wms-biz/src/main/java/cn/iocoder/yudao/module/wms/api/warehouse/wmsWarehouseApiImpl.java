package cn.iocoder.yudao.module.wms.api.warehouse;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.wms.dal.dataobject.warehouse.WmsWarehouseDO;
import cn.iocoder.yudao.module.wms.enums.api.warehouse.WmsWarehouseApi;
import cn.iocoder.yudao.module.wms.enums.api.warehouse.dto.WmsWarehouseDTO;
import cn.iocoder.yudao.module.wms.service.warehouse.WmsWarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class wmsWarehouseApiImpl implements WmsWarehouseApi {

    @Autowired
    WmsWarehouseService wmsWarehouseService;

    @Override
    public Map<Long, WmsWarehouseDTO> getWarehouseMap(Collection<Long> ids) {
        Map<Long, WmsWarehouseDO> warehouseMap = wmsWarehouseService.getWarehouseMap(new HashSet<>(ids));
        return warehouseMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> BeanUtils.toBean(entry.getValue(), WmsWarehouseDTO.class)));
    }


    @Override
    public void validWarehouseList(Set<Long> longs) {
        //TODO 待优化
        for (Long aLong : longs) {
            wmsWarehouseService.validateWarehouseExists(aLong);
        }
    }
}
