package cn.iocoder.yudao.module.wms.api.stock.ownership;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.wms.api.stock.ownership.dto.WmsStockOwnershipDTO;
import cn.iocoder.yudao.module.wms.dal.dataobject.stock.ownership.WmsStockOwnershipDO;
import cn.iocoder.yudao.module.wms.service.stock.ownership.WmsStockOwnershipService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;

/**
 * 库存所有权 API 实现类
 *
 * @author wdy
 */
@Service
@Validated
public class WmsStockOwnershipApiImpl implements WmsStockOwnershipApi {

    @Resource
    private WmsStockOwnershipService stockOwnershipService;

    @Override
    public Map<Long, WmsStockOwnershipDTO> selectByDeptIdAndProductIdAndCountryIdMap(Long deptId, List<Long> productIds, String country) {
        Map<Long, WmsStockOwnershipDO> map = stockOwnershipService.selectByDeptIdAndProductIdAndCountryIdMap(deptId, productIds, country);
        return BeanUtils.toBean(map, WmsStockOwnershipDTO.class);
    }

} 