package cn.iocoder.yudao.module.wms.api.warehouse;

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
}
