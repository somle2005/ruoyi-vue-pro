package cn.iocoder.yudao.module.erp.service.purchase;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjUtil;
import cn.iocoder.yudao.framework.common.enums.CommonStatusEnum;
import cn.iocoder.yudao.framework.common.exception.util.ThrowUtil;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.erp.controller.admin.purchase.vo.supplier.ErpSupplierPageReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.purchase.vo.supplier.ErpSupplierSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.purchase.ErpSupplierDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.purchase.ErpSupplierProductDO;
import cn.iocoder.yudao.module.erp.dal.mysql.purchase.ErpSupplierMapper;
import cn.iocoder.yudao.module.erp.dal.mysql.purchase.ErpSupplierProductMapper;
import jakarta.annotation.Resource;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.Collection;
import java.util.List;

import static cn.iocoder.yudao.framework.common.exception.enums.GlobalErrorCodeConstants.*;
import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.erp.enums.ErrorCodeConstants.*;

/**
 * ERP 供应商 Service 实现类
 *
 * @author 芋道源码
 */
@Service
@Validated
public class ErpSupplierServiceImpl implements ErpSupplierService {

    @Resource
    private ErpSupplierMapper supplierMapper;
    @Resource
    private ErpSupplierProductMapper supplierProductMapper;

    @Override
    public Long createSupplier(ErpSupplierSaveReqVO createReqVO) {
        //校验是否存在相同的供应商名称
        validateSupplierUnique(null,createReqVO.getName());
        ErpSupplierDO supplier = BeanUtils.toBean(createReqVO, ErpSupplierDO.class);
        ThrowUtil.ifSqlThrow(supplierMapper.insert(supplier),DB_INSERT_ERROR);
        return supplier.getId();
    }

    private void validateSupplierUnique(Long id, String name) {
        ErpSupplierDO supplierDO = supplierMapper.selectByName(name);
        if (ObjUtil.isEmpty(supplierDO)){
            return;
        }
        // 如果 id 为空，说明不用比较是否为相同 id
        if (id == null){
            throw exception(SUPPLIER_NAME_DUPLICATE);
        }
        if (!supplierDO.getId().equals(id)) {
            throw exception(SUPPLIER_NAME_DUPLICATE);
        }
    }

    @Override
    public void updateSupplier(ErpSupplierSaveReqVO updateReqVO) {
        // 校验存在
        validateSupplierExists(updateReqVO.getId());
        //校验是否存在相同的供应商名称
        validateSupplierUnique(updateReqVO.getId(),updateReqVO.getName());
        // 更新
        ErpSupplierDO updateObj = BeanUtils.toBean(updateReqVO, ErpSupplierDO.class);
        ThrowUtil.ifSqlThrow(supplierMapper.updateById(updateObj),DB_UPDATE_ERROR);
    }

    @Override
    public void deleteSupplier(Long id) {
        // 校验存在
        validateSupplierExists(id);
        //判断该供应商是否已被关联
        List<ErpSupplierProductDO> erpSupplierProducts = supplierProductMapper.selectBySupplierId(id);
        ThrowUtil.ifThrow(CollUtil.isNotEmpty(erpSupplierProducts),SUPPLIER_DELETE_FAIL_EXISTS_RELATION);
        // 删除
        ThrowUtil.ifSqlThrow(supplierMapper.deleteById(id),DB_DELETE_ERROR);
    }

    private void validateSupplierExists(Long id) {
        if (supplierMapper.selectById(id) == null) {
            throw exception(SUPPLIER_NOT_EXISTS);
        }
    }

    @Override
    public ErpSupplierDO getSupplier(Long id) {
        return supplierMapper.selectById(id);
    }

    @Override
    public ErpSupplierDO validateSupplier(Long id) {
        ErpSupplierDO supplier = supplierMapper.selectById(id);
        if (supplier == null) {
            throw exception(SUPPLIER_NOT_EXISTS);
        }
        if (CommonStatusEnum.isDisable(supplier.getStatus())) {
            throw exception(SUPPLIER_NOT_ENABLE, supplier.getName());
        }
        return supplier;
    }

    @Override
    public List<ErpSupplierDO> getSupplierList(Collection<Long> ids) {
        return supplierMapper.selectBatchIds(ids);
    }

    @Override
    public PageResult<ErpSupplierDO> getSupplierPage(ErpSupplierPageReqVO pageReqVO) {
        return supplierMapper.selectPage(pageReqVO);
    }

    @Override
    public List<ErpSupplierDO> getSupplierListByStatus(Integer status) {
        return supplierMapper.selectListByStatus(status);
    }

}