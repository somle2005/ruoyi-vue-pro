package cn.iocoder.yudao.module.wms.api.warehouse;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.wms.api.warehouse.dto.WmsWarehouseDTO;
import cn.iocoder.yudao.module.wms.api.warehouse.dto.vo.WmsWarehouseListReqDTO;
import cn.iocoder.yudao.module.wms.dal.dataobject.warehouse.WmsWarehouseDO;
import cn.iocoder.yudao.module.wms.service.warehouse.WmsWarehouseService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.annotation.Validated;

import java.util.*;
import java.util.stream.Collectors;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.wms.enums.WmsErrorCodeConstants.WAREHOUSE_NOT_EXISTS;

/**
 * 仓库 API 实现类
 *
 * @author 李方捷
 */
@Service
@Validated
public class wmsWarehouseApiImpl implements WmsWarehouseApi {

    @Resource
    private WmsWarehouseService warehouseService;

    @Override
    public Map<Long, WmsWarehouseDTO> getWarehouseMap(Collection<Long> ids) {
        Map<Long, WmsWarehouseDO> warehouseMap = warehouseService.getWarehouseMap(new HashSet<>(ids));
        return warehouseMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> BeanUtils.toBean(entry.getValue(), WmsWarehouseDTO.class)));
    }

    @Override
    public void validWarehouseList(Set<Long> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return;
        }
        // 批量查询仓库
        Map<Long, WmsWarehouseDO> warehouseMap = warehouseService.getWarehouseMap(ids);
        // 校验是否都存在
        for (Long id : ids) {
            if (!warehouseMap.containsKey(id)) {
                throw exception(WAREHOUSE_NOT_EXISTS);
            }
        }
    }

    @Override
    public List<WmsWarehouseDTO> selectList(WmsWarehouseListReqDTO reqDTO) {
        List<WmsWarehouseDO> list = warehouseService.selectList(reqDTO);
        return BeanUtils.toBean(list, WmsWarehouseDTO.class);
    }
}
