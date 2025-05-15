package cn.iocoder.yudao.module.wms.api.stock.ownership;

import cn.iocoder.yudao.module.wms.api.stock.ownership.dto.WmsStockOwnershipDTO;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.Map;

/**
 * 库存所有权 API 接口
 *
 * @author wdy
 */
public interface WmsStockOwnershipApi {

    /**
     * 获取某一部门在指定国别下的产品集合的库存归属
     *
     * @param deptId     部门ID
     * @param productIds 产品IDs
     * @param country    国家字典值
     * @return 库存归属 Map，key 为产品ID
     */
    Map<Long, WmsStockOwnershipDTO> selectByDeptIdAndProductIdAndCountryIdMap(Long deptId, @NotNull List<Long> productIds, @NotNull String country);

} 