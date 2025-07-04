package cn.iocoder.yudao.module.wms.service.warehouse;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import cn.iocoder.yudao.framework.common.util.collection.StreamX;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.wms.api.warehouse.dto.vo.WmsWarehouseListReqDTO;
import cn.iocoder.yudao.module.wms.controller.admin.warehouse.vo.WmsWarehousePageReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.warehouse.vo.WmsWarehouseSaveReqVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.external.storage.WmsExternalStorageDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.WmsInboundDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.warehouse.WmsWarehouseDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.warehouse.bin.WmsWarehouseBinDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.warehouse.zone.WmsWarehouseZoneDO;
import cn.iocoder.yudao.module.wms.dal.mysql.warehouse.WmsWarehouseMapper;
import cn.iocoder.yudao.module.wms.enums.WmsLogRecordConstants;
import cn.iocoder.yudao.module.wms.service.external.storage.WmsExternalStorageService;
import cn.iocoder.yudao.module.wms.service.inbound.WmsInboundService;
import cn.iocoder.yudao.module.wms.service.warehouse.bin.WmsWarehouseBinService;
import cn.iocoder.yudao.module.wms.service.warehouse.zone.WmsWarehouseZoneService;
import com.mzt.logapi.context.LogRecordContext;
import com.mzt.logapi.starter.annotation.LogRecord;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.*;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.wms.enums.WmsErrorCodeConstants.*;
import static cn.iocoder.yudao.module.wms.enums.WmsLogRecordConstants.*;

/**
 * 仓库 Service 实现类
 *
 * @author 李方捷
 */
@Service
@Validated
@Slf4j
public class WmsWarehouseServiceImpl implements WmsWarehouseService {

    @Resource
    @Lazy
    private WmsInboundService inboundService;

    @Resource
    @Lazy
    private WmsWarehouseBinService warehouseBinService;

    @Resource
    @Lazy
    private WmsWarehouseZoneService warehouseZoneService;

    @Resource
    @Lazy
    private WmsExternalStorageService externalStorageService;

    @Resource
    private WmsWarehouseMapper warehouseMapper;

    /**
     * @sign : 6A1033E3C48B0B9A
     */
    @Override
    @LogRecord(type = WMS_WAREHOUSE_REQUEST_TYPE,
        subType = WMS_WAREHOUSE_REQUEST_CREATE_SUB_TYPE,
        bizNo = "{{#id}}",
        extra = "{{#createReqVO.code}}",
        success = "创建了仓库【{{#createReqVO.code}}】")
    @Transactional(rollbackFor = Exception.class)
    public WmsWarehouseDO createWarehouse(WmsWarehouseSaveReqVO createReqVO) {
        if (warehouseMapper.getByName(createReqVO.getName()) != null) {
            throw exception(WAREHOUSE_NAME_DUPLICATE);
        }
        if (warehouseMapper.getByCode(createReqVO.getCode()) != null) {
            throw exception(WAREHOUSE_CODE_DUPLICATE);
        }
        // 按 wms_warehouse.external_storage_id -> wms_external_storage.id 的引用关系，校验存在性
        if (createReqVO.getExternalStorageId() != null) {
            WmsExternalStorageDO externalStorage = externalStorageService.getExternalStorage(createReqVO.getExternalStorageId());
            if (externalStorage == null) {
                throw exception(EXTERNAL_STORAGE_NOT_EXISTS);
            }
        }
        // 插入
        WmsWarehouseDO warehouse = BeanUtils.toBean(createReqVO, WmsWarehouseDO.class);
        warehouseMapper.insert(warehouse);
        //回填log记录
        LogRecordContext.putVariable("id", warehouse.getId());
        // 返回
        return warehouse;
    }

    /**
     * @sign : 38B6A9D0484E56C4
     */
    @Override
    @LogRecord(type = WMS_WAREHOUSE_REQUEST_TYPE,
        subType = WMS_WAREHOUSE_REQUEST_UPDATE_SUB_TYPE,
        bizNo = "{{#updateReqVO.id}}",
        extra = "{{#updateReqVO.code}}",
        success = "更新了仓库【{{#updateReqVO.code}}】: {_DIFF{#updateReqVO}}")
    @Transactional(rollbackFor = Exception.class)
    public WmsWarehouseDO updateWarehouse(@Validated WmsWarehouseSaveReqVO updateReqVO) {
        // 校验存在
        WmsWarehouseDO exists = validateWarehouseExists(updateReqVO.getId());
        if (!Objects.equals(updateReqVO.getId(), exists.getId()) && Objects.equals(updateReqVO.getName(), exists.getName())) {
            throw exception(WAREHOUSE_NAME_DUPLICATE);
        }
        if (!Objects.equals(updateReqVO.getId(), exists.getId()) && Objects.equals(updateReqVO.getCode(), exists.getCode())) {
            throw exception(WAREHOUSE_CODE_DUPLICATE);
        }
        // 按 wms_warehouse.external_storage_id -> wms_external_storage.id 的引用关系，校验存在性
        if (updateReqVO.getExternalStorageId() != null) {
            WmsExternalStorageDO externalStorage = externalStorageService.getExternalStorage(updateReqVO.getExternalStorageId());
            if (externalStorage == null) {
                throw exception(EXTERNAL_STORAGE_NOT_EXISTS);
            }
        }
        // 更新
        WmsWarehouseDO warehouse = BeanUtils.toBean(updateReqVO, WmsWarehouseDO.class);
        warehouseMapper.updateById(warehouse);
        // 返回
        return warehouse;
    }

    /**
     * @sign : 0F9BF04D1552020A
     */
    @Override
    @LogRecord(type = WMS_WAREHOUSE_REQUEST_TYPE,
        subType = WmsLogRecordConstants.WMS_WAREHOUSE_REQUEST_DELETE_SUB_TYPE,
        bizNo = "{{#id}}",
        extra = "{{#code}}",
        success = "删除了仓库【{{#code}}】")
    @Transactional(rollbackFor = Exception.class)
    public void deleteWarehouse(Long id) {
        // 校验存在
        WmsWarehouseDO warehouse = validateWarehouseExists(id);
        // 校验是否被库区表引用
        List<WmsWarehouseZoneDO> warehouseZoneList = warehouseZoneService.selectByWarehouseId(id, 1);
        if (!CollectionUtils.isEmpty(warehouseZoneList)) {
            throw exception(WAREHOUSE_BE_REFERRED);
        }
        // 校验是否被库位表引用
        List<WmsWarehouseBinDO> warehouseBinList = warehouseBinService.selectByWarehouseId(id, 1);
        if (!CollectionUtils.isEmpty(warehouseBinList)) {
            throw exception(WAREHOUSE_BE_REFERRED);
        }
        // 校验是否被入库单引用
        List<WmsInboundDO> inboundList = inboundService.selectByWarehouseId(id, 1);
        if (!CollectionUtils.isEmpty(inboundList)) {
            throw exception(WAREHOUSE_BE_REFERRED);
        }
        //回填log记录
        LogRecordContext.putVariable("code", warehouse.getCode());
        // 唯一索引去重
        warehouse.setName(warehouseMapper.flagUKeyAsLogicDelete(warehouse.getName()));
        warehouse.setCode(warehouseMapper.flagUKeyAsLogicDelete(warehouse.getCode()));
        warehouseMapper.updateById(warehouse);
        // 删除
        warehouseMapper.deleteById(id);
    }

    /**
     * @sign : 8F00B204E9800998
     */
    @Override
    public WmsWarehouseDO validateWarehouseExists(Long id) {
        WmsWarehouseDO warehouse = warehouseMapper.selectById(id);
        if (warehouse == null) {
            throw exception(WAREHOUSE_NOT_EXISTS);
        }
        return warehouse;
    }

    @Override
    public WmsWarehouseDO getWarehouse(Long id) {
        return warehouseMapper.selectById(id);
    }

    @Override
    public PageResult<WmsWarehouseDO> getWarehousePage(WmsWarehousePageReqVO pageReqVO) {
        return warehouseMapper.selectPage(pageReqVO);
    }

    /**
     * 按 externalStorageId 查询 WmsWarehouseDO
     */
    @Override
    public List<WmsWarehouseDO> selectByExternalStorageId(Long externalStorageId, int limit) {
        return warehouseMapper.selectByExternalStorageId(externalStorageId, limit);
    }

    @Override
    public Map<Long, WmsWarehouseDO> getWarehouseMap(Set<Long> ids) {
        if(CollectionUtils.isEmpty(ids)) {
            return new HashMap<>();
        }
        List<WmsWarehouseDO> wmsWarehouseDOList = warehouseMapper.selectByIds(ids);
        return StreamX.from(wmsWarehouseDOList).toMap(WmsWarehouseDO::getId);
    }

    @Override
    public List<WmsWarehouseDO> getSimpleList(WmsWarehousePageReqVO pageReqVO) {
        return warehouseMapper.getSimpleList(pageReqVO);
    }

    @Override
    public List<WmsWarehouseDO> selectByIds(List<Long> ids) {
        if(CollectionUtils.isEmpty(ids)) {
            return List.of();
        }
        return warehouseMapper.selectByIds(ids);
    }

    @Override
    public Map<String, WmsWarehouseDO> getWarehouseMapByCode(Set<String> codes) {
        if(CollectionUtils.isEmpty(codes)) {
            return Map.of();
        }
        List<WmsWarehouseDO> wmsWarehouseDOList = warehouseMapper.selectByCodes(codes);
        return StreamX.from(wmsWarehouseDOList).toMap(WmsWarehouseDO::getCode);
    }

    @Override
    public List<WmsWarehouseDO> selectList(WmsWarehouseListReqDTO reqDTO) {
        return warehouseMapper.selectList(reqDTO);
    }

    /**
     * 获得转换单仓库列表
     */
    @Override
    public List<WmsWarehouseDO> getSimpleListForExchange(Integer exchange) {
        return warehouseMapper.getSimpleListForExchange(exchange);
    }
}
