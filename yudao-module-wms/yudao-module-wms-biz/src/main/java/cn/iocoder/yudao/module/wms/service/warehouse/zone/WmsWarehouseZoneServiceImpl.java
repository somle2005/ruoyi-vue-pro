package cn.iocoder.yudao.module.wms.service.warehouse.zone;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.wms.controller.admin.warehouse.zone.vo.WmsWarehouseZonePageReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.warehouse.zone.vo.WmsWarehouseZoneSaveReqVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.warehouse.WmsWarehouseDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.warehouse.bin.WmsWarehouseBinDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.warehouse.zone.WmsWarehouseZoneDO;
import cn.iocoder.yudao.module.wms.dal.mysql.warehouse.zone.WmsWarehouseZoneMapper;
import cn.iocoder.yudao.module.wms.enums.WmsLogRecordConstants;
import cn.iocoder.yudao.module.wms.service.warehouse.WmsWarehouseService;
import cn.iocoder.yudao.module.wms.service.warehouse.bin.WmsWarehouseBinService;
import com.mzt.logapi.context.LogRecordContext;
import com.mzt.logapi.starter.annotation.LogRecord;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Objects;
import java.util.Set;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.wms.enums.WmsErrorCodeConstants.*;
import static cn.iocoder.yudao.module.wms.enums.WmsLogRecordConstants.*;

/**
 * 库区 Service 实现类
 *
 * @author 李方捷
 */
@Service
@Validated
@Slf4j
public class WmsWarehouseZoneServiceImpl implements WmsWarehouseZoneService {

    @Resource
    @Lazy
    private WmsWarehouseBinService warehouseBinService;

    @Resource
    @Lazy
    private WmsWarehouseService warehouseService;

    @Resource
    private WmsWarehouseZoneMapper warehouseZoneMapper;

    /**
     * @sign : 5AC23C53D5DDB335
     */
    @Override
    @LogRecord(type = WMS_WAREHOUSE_ZONE_TYPE,
        subType = WMS_WAREHOUSE_ZONE_CREATE_SUB_TYPE,
        bizNo = "{{#id}}",
        extra = "{{#createReqVO.code}}",
        success = "创建了库区【{{#createReqVO.code}}】")
    @Transactional(rollbackFor = Exception.class)
    public WmsWarehouseZoneDO createWarehouseZone(WmsWarehouseZoneSaveReqVO createReqVO) {
        if (warehouseZoneMapper.getByCode(createReqVO.getCode()) != null) {
            throw exception(WAREHOUSE_ZONE_CODE_DUPLICATE);
        }
        // 按 wms_warehouse_zone.warehouse_id -> wms_warehouse.id 的引用关系，校验存在性
        if (createReqVO.getWarehouseId() != null) {
            WmsWarehouseDO warehouse = warehouseService.getWarehouse(createReqVO.getWarehouseId());
            if (warehouse == null) {
                throw exception(WAREHOUSE_NOT_EXISTS);
            }
        }
        createReqVO.setPriority(createReqVO.getPriority() == null ? 0 : createReqVO.getPriority());
        // 插入
        WmsWarehouseZoneDO warehouseZone = BeanUtils.toBean(createReqVO, WmsWarehouseZoneDO.class);
        warehouseZoneMapper.insert(warehouseZone);

        //回填log记录
        LogRecordContext.putVariable("id", warehouseZone.getId());
        // 返回
        return warehouseZone;
    }

    /**
     * @sign : 8E7151DE2560A3C7
     */
    @Override
    @LogRecord(type = WMS_WAREHOUSE_ZONE_TYPE,
        subType = WMS_WAREHOUSE_ZONE_UPDATE_SUB_TYPE,
        bizNo = "{{#updateReqVO.id}}",
        extra = "{{#updateReqVO.code}}",
        success = "更新了库区【{{#updateReqVO.code}}】: {_DIFF{#updateReqVO}}")
    @Transactional(rollbackFor = Exception.class)
    public WmsWarehouseZoneDO updateWarehouseZone(@Validated WmsWarehouseZoneSaveReqVO updateReqVO) {
        // 校验存在
        WmsWarehouseZoneDO exists = validateWarehouseZoneExists(updateReqVO.getId());
        if (!Objects.equals(updateReqVO.getId(), exists.getId()) && Objects.equals(updateReqVO.getCode(), exists.getCode())) {
            throw exception(WAREHOUSE_ZONE_CODE_DUPLICATE);
        }
        // 按 wms_warehouse_zone.warehouse_id -> wms_warehouse.id 的引用关系，校验存在性
        if (updateReqVO.getWarehouseId() != null) {
            WmsWarehouseDO warehouse = warehouseService.getWarehouse(updateReqVO.getWarehouseId());
            if (warehouse == null) {
                throw exception(WAREHOUSE_NOT_EXISTS);
            }
        }
        // 更新
        WmsWarehouseZoneDO warehouseZone = BeanUtils.toBean(updateReqVO, WmsWarehouseZoneDO.class);
        warehouseZoneMapper.updateById(warehouseZone);
        // 返回
        return warehouseZone;
    }

    /**
     * @sign : 3F9D59820F6C2838
     */
    @Override
    @LogRecord(type = WMS_WAREHOUSE_ZONE_TYPE,
        subType = WmsLogRecordConstants.WMS_WAREHOUSE_ZONE_DELETE_SUB_TYPE,
        bizNo = "{{#id}}",
        extra = "{{#code}}",
        success = "删除了仓库【{{#code}}】")
    @Transactional(rollbackFor = Exception.class)
    public void deleteWarehouseZone(Long id) {
        // 校验存在
        WmsWarehouseZoneDO warehouseZone = validateWarehouseZoneExists(id);
        // 校验是否被库位表引用
        List<WmsWarehouseBinDO> warehouseBinList = warehouseBinService.selectByZoneId(id, 1);
        if (!CollectionUtils.isEmpty(warehouseBinList)) {
            throw exception(WAREHOUSE_ZONE_BE_REFERRED);
        }
        //回填log记录
        LogRecordContext.putVariable("code", warehouseZone.getCode());
        // 唯一索引去重
        warehouseZone.setCode(warehouseZoneMapper.flagUKeyAsLogicDelete(warehouseZone.getCode()));
        warehouseZoneMapper.updateById(warehouseZone);
        // 删除
        warehouseZoneMapper.deleteById(id);
    }

    /**
     * @sign : AD849554AB4E57E7
     */
    private WmsWarehouseZoneDO validateWarehouseZoneExists(Long id) {
        WmsWarehouseZoneDO warehouseZone = warehouseZoneMapper.selectById(id);
        if (warehouseZone == null) {
            throw exception(WAREHOUSE_ZONE_NOT_EXISTS);
        }
        return warehouseZone;
    }

    @Override
    public WmsWarehouseZoneDO getWarehouseZone(Long id) {
        return warehouseZoneMapper.selectById(id);
    }

    @Override
    public PageResult<WmsWarehouseZoneDO> getWarehouseZonePage(WmsWarehouseZonePageReqVO pageReqVO) {
        return warehouseZoneMapper.selectPage(pageReqVO);
    }

    /**
     * 按 warehouseId 查询 WmsWarehouseZoneDO
     */
    @Override
    public List<WmsWarehouseZoneDO> selectByWarehouseId(Long warehouseId, int limit) {
        return warehouseZoneMapper.selectByWarehouseId(warehouseId, limit);
    }

    @Override
    public List<WmsWarehouseZoneDO> getSimpleList(WmsWarehouseZonePageReqVO pageReqVO) {
        return warehouseZoneMapper.getSimpleList(pageReqVO);
    }

    @Override
    public List<WmsWarehouseZoneDO> selectByIds(Set<Long> ids) {
        if(CollectionUtils.isEmpty(ids)) {
            return List.of();
        }
        return warehouseZoneMapper.selectByIds(ids);
    }
}
