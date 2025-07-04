package cn.iocoder.yudao.module.wms.service.warehouse.bin;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.wms.controller.admin.warehouse.bin.vo.WmsWarehouseBinPageReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.warehouse.bin.vo.WmsWarehouseBinSaveReqVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.warehouse.WmsWarehouseDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.warehouse.bin.WmsWarehouseBinDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.warehouse.zone.WmsWarehouseZoneDO;
import cn.iocoder.yudao.module.wms.dal.mysql.warehouse.bin.WmsWarehouseBinMapper;
import cn.iocoder.yudao.module.wms.service.warehouse.WmsWarehouseService;
import cn.iocoder.yudao.module.wms.service.warehouse.zone.WmsWarehouseZoneService;
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
import static com.fhs.common.constant.Constant.ONE;
import static com.fhs.common.constant.Constant.ZERO;

/**
 * 库位 Service 实现类
 *
 * @author 李方捷
 */
@Service
@Validated
@Slf4j
public class WmsWarehouseBinServiceImpl implements WmsWarehouseBinService {

    @Resource
    @Lazy
    private WmsWarehouseZoneService warehouseZoneService;

    @Resource
    @Lazy
    private WmsWarehouseService warehouseService;

    @Resource
    private WmsWarehouseBinMapper warehouseBinMapper;

    /**
     * @sign : 7C7A5946A6985FD8
     */
    @Override
    @LogRecord(type = WMS_WAREHOUSE_BIN_TYPE,
        subType = WMS_WAREHOUSE_BIN_CREATE_SUB_TYPE,
        bizNo = "{{#id}}",
        extra = "{{#createReqVO.code}}",
        success = "创建了库位【{{#createReqVO.code}}】")
    @Transactional(rollbackFor = Exception.class)
    public WmsWarehouseBinDO createWarehouseBin(WmsWarehouseBinSaveReqVO createReqVO) {
        if (warehouseBinMapper.getByCode(createReqVO.getCode()) != null) {
            throw exception(WAREHOUSE_BIN_CODE_DUPLICATE);
        }
        // 按 wms_warehouse_bin.warehouse_id -> wms_warehouse.id 的引用关系，校验存在性
        if (createReqVO.getWarehouseId() != null) {
            WmsWarehouseDO warehouse = warehouseService.getWarehouse(createReqVO.getWarehouseId());
            if (warehouse == null) {
                throw exception(WAREHOUSE_NOT_EXISTS);
            }
        }
        // 按 wms_warehouse_bin.zone_id -> wms_warehouse_zone.id 的引用关系，校验存在性
        if (createReqVO.getZoneId() != null) {
            WmsWarehouseZoneDO warehouseZone = warehouseZoneService.getWarehouseZone(createReqVO.getZoneId());
            if (warehouseZone == null) {
                throw exception(WAREHOUSE_ZONE_NOT_EXISTS);
            }
        }
        // 插入
        WmsWarehouseBinDO warehouseBin = BeanUtils.toBean(createReqVO, WmsWarehouseBinDO.class);
        warehouseBinMapper.insert(warehouseBin);
        //回填log记录
        LogRecordContext.putVariable("id", warehouseBin.getId());
        // 返回
        return warehouseBin;
    }

    /**
     * @sign : 7061C64B648E5252
     */
    @Override
    @LogRecord(type = WMS_WAREHOUSE_BIN_TYPE,
        subType = WMS_WAREHOUSE_BIN_UPDATE_SUB_TYPE,
        bizNo = "{{#updateReqVO.id}}",
        extra = "{{#updateReqVO.code}}",
        success = "更新了库位 【{{#updateReqVO.code}}】: {_DIFF{#updateReqVO}}")
    @Transactional(rollbackFor = Exception.class)
    public void updateWarehouseBin(WmsWarehouseBinSaveReqVO updateReqVO) {
        // 校验存在
        WmsWarehouseBinDO exists = validateWarehouseBinExists(updateReqVO.getId());
        if (!Objects.equals(updateReqVO.getId(), exists.getId()) && Objects.equals(updateReqVO.getCode(), exists.getCode())) {
            throw exception(WAREHOUSE_BIN_CODE_DUPLICATE);
        }
        // 按 wms_warehouse_bin.warehouse_id -> wms_warehouse.id 的引用关系，校验存在性
        if (updateReqVO.getWarehouseId() != null) {
            WmsWarehouseDO warehouse = warehouseService.getWarehouse(updateReqVO.getWarehouseId());
            if (warehouse == null) {
                throw exception(WAREHOUSE_NOT_EXISTS);
            }
        }
        // 按 wms_warehouse_bin.zone_id -> wms_warehouse_zone.id 的引用关系，校验存在性
        if (updateReqVO.getZoneId() != null) {
            WmsWarehouseZoneDO warehouseZone = warehouseZoneService.getWarehouseZone(updateReqVO.getZoneId());
            if (warehouseZone == null) {
                throw exception(WAREHOUSE_ZONE_NOT_EXISTS);
            }
        }
        // 更新
        WmsWarehouseBinDO warehouseBin = BeanUtils.toBean(updateReqVO, WmsWarehouseBinDO.class);
        warehouseBinMapper.updateById(warehouseBin);
        // 返回
    }

    /**
     * @sign : 7C20460B6C4953A7
     */
    @Override
    @LogRecord(type = WMS_WAREHOUSE_BIN_TYPE,
        subType = WMS_WAREHOUSE_BIN_DELETE_SUB_TYPE,
        bizNo = "{{#id}}",
        extra = "{{#code}}",
        success = "删除了库位 【{{#code}}】")
    @Transactional(rollbackFor = Exception.class)
    public void deleteWarehouseBin(Long id) {
        // 校验存在
        WmsWarehouseBinDO warehouseBin = validateWarehouseBinExists(id);
        //回填log记录
        LogRecordContext.putVariable("code", warehouseBin.getCode());
        // 唯一索引去重
        warehouseBin.setCode(warehouseBinMapper.flagUKeyAsLogicDelete(warehouseBin.getCode()));
        warehouseBinMapper.updateById(warehouseBin);
        // 删除
        warehouseBinMapper.deleteById(id);
    }

    /**
     * @sign : B03B72B6D2D098BC
     */
    private WmsWarehouseBinDO validateWarehouseBinExists(Long id) {
        WmsWarehouseBinDO warehouseBin = warehouseBinMapper.selectById(id);
        if (warehouseBin == null) {
            throw exception(WAREHOUSE_BIN_NOT_EXISTS);
        }
        return warehouseBin;
    }

    @Override
    public WmsWarehouseBinDO getWarehouseBin(Long id) {
        return warehouseBinMapper.selectById(id);
    }

    @Override
    public PageResult<WmsWarehouseBinDO> getWarehouseBinPage(WmsWarehouseBinPageReqVO pageReqVO) {
        return warehouseBinMapper.selectPage(pageReqVO);
    }

    /**
     * 按 warehouseId 查询 WmsWarehouseBinDO
     */
    @Override
    public List<WmsWarehouseBinDO> selectByWarehouseId(Long warehouseId, int limit) {
        return warehouseBinMapper.selectByWarehouseId(warehouseId, limit);
    }

    /**
     * 按 zoneId 查询 WmsWarehouseBinDO
     */
    @Override
    public List<WmsWarehouseBinDO> selectByZoneId(Long zoneId, int limit) {
        return warehouseBinMapper.selectByZoneId(zoneId, limit);
    }

    @Override
    public List<WmsWarehouseBinDO> selectByIds(Set<Long> ids) {
        if(CollectionUtils.isEmpty(ids)) {
            return List.of();
        }
        return warehouseBinMapper.selectByIds(ids);
    }

    @Override
    public List<WmsWarehouseBinDO> getSimpleList(WmsWarehouseBinPageReqVO pageReqVO) {
        return warehouseBinMapper.getSimpleList(pageReqVO);
    }

    @Override
    public List<WmsWarehouseBinDO> selectByCodes(Set<String> codes) {
        if(CollectionUtils.isEmpty(codes)) {
            return List.of();
        }
        return warehouseBinMapper.selectByCodes(codes);
    }

    @Override
    public List<WmsWarehouseBinDO> getSimpleListForExchange(WmsWarehouseBinPageReqVO pageReqVO) {
        return warehouseBinMapper.getSimpleListForExchange(pageReqVO);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void batchUpdateWarehouseBin(List<WmsWarehouseBinSaveReqVO> updateReqVoList) {
        for (WmsWarehouseBinSaveReqVO updateReqVO : updateReqVoList) {
            this.updateWarehouseBin(updateReqVO);
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    @LogRecord(type = WMS_WAREHOUSE_BIN_TYPE,
        subType = WMS_WAREHOUSE_BIN_SIWTCH_SUB_TYPE,
        bizNo = "{{#warehouseBin.ids}}",
        extra = "{{#codes}}",
        success = "开启了库位【{{#enableCodes}}】, 禁用了库位【{{#disableCodes}}】")
    public void enableWarehouseBin(List<Long> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return;
        }
        // 校验存在
        List<WmsWarehouseBinDO> warehouseBinList = warehouseBinMapper.selectByIds(ids);
        if (CollectionUtils.isEmpty(warehouseBinList)) {
            throw exception(WAREHOUSE_BIN_NOT_EXISTS);
        }
        StringBuilder enableCodes = new StringBuilder();
        StringBuilder disableCodes = new StringBuilder();
        // 更新状态
        for (WmsWarehouseBinDO warehouseBin : warehouseBinList) {
            if (warehouseBin.getStatus() == ZERO) {
                //启用
                warehouseBin.setStatus(ONE);
                enableCodes.append(warehouseBin.getCode()).append(",");
            }
            if (warehouseBin.getStatus() == ONE) {
                //禁用
                warehouseBin.setStatus(ZERO);
                disableCodes.append(warehouseBin.getCode()).append(",");
            }
        }
        warehouseBinMapper.updateBatch(warehouseBinList);
        //回填log记录
        LogRecordContext.putVariable("codes", enableCodes.append(disableCodes));
        LogRecordContext.putVariable("disableCodes", disableCodes);
        LogRecordContext.putVariable("enableCodes", enableCodes);

    }


}
