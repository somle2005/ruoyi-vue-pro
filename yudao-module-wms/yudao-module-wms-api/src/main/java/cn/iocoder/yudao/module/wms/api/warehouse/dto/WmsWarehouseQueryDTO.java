package cn.iocoder.yudao.module.wms.api.warehouse.dto;

import lombok.Data;

import java.util.List;

@Data
public class WmsWarehouseQueryDTO {

    List<WmsWarehouseSimpleDTO> warehouses;
}
