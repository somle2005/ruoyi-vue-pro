package cn.iocoder.yudao.module.system.service.field;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjUtil;
import cn.iocoder.yudao.framework.common.exception.util.ThrowUtil;
import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import cn.iocoder.yudao.module.erp.api.product.ProductCategoryFieldApi;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductCategoryFieldDTO;
import cn.iocoder.yudao.module.system.controller.admin.field.vo.SystemFieldPageReqVO;
import cn.iocoder.yudao.module.system.controller.admin.field.vo.SystemFieldSaveReqVO;
import cn.iocoder.yudao.module.system.dal.dataobject.field.SystemFieldDO;
import cn.iocoder.yudao.module.system.dal.mysql.field.SystemFieldMapper;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import java.util.*;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import static cn.iocoder.yudao.framework.common.exception.enums.GlobalErrorCodeConstants.DB_DELETE_ERROR;
import static cn.iocoder.yudao.framework.common.exception.enums.GlobalErrorCodeConstants.DB_INSERT_ERROR;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.anyMatch;
import static cn.iocoder.yudao.module.system.enums.ErrorCodeConstants.*;

/**
 * 字段属性 Service 实现类
 *
 * @author 索迈管理员
 */
@Service
@Validated
public class SystemFieldServiceImpl implements SystemFieldService {

    @Resource
    private SystemFieldMapper fieldMapper;
    @Resource
    private ProductCategoryFieldApi productCategoryFieldApi;

    @Override
    public Long createField(SystemFieldSaveReqVO createReqVO) {
        //校验键和属性的唯一性
        validateKeyAndAttributeUnique(null, createReqVO.getKey(), createReqVO.getAttribute());
        SystemFieldDO field = BeanUtils.toBean(createReqVO, SystemFieldDO.class);
        // 插入
        ThrowUtil.ifSqlThrow(fieldMapper.insert(field),DB_INSERT_ERROR);
        // 返回
        return field.getId();
    }

    @Override
    public void updateField(SystemFieldSaveReqVO updateReqVO) {
        //获取id
        Long id = updateReqVO.getId();
        // 校验存在
        validateFieldExists(id);
        //校验键和属性的唯一性
        validateKeyAndAttributeUnique(id, updateReqVO.getKey(), updateReqVO.getAttribute());
        // 更新
        SystemFieldDO updateObj = BeanUtils.toBean(updateReqVO, SystemFieldDO.class);
        fieldMapper.updateById(updateObj);
    }

    @Override
    public void deleteField(Long id) {
        // 校验存在
        validateFieldExists(id);
        //校验是否存在关联
        List<ErpProductCategoryFieldDTO> productCategoryFieldList = productCategoryFieldApi.getProductCategoryFieldList(id);
        ThrowUtil.ifCollectionNotEmptyThrow(productCategoryFieldList, FIELD_RELATED);
        //TODO 后续如果还存在其他关联，继续抛出异常

        // 删除
        ThrowUtil.ifSqlThrow(fieldMapper.deleteById(id), DB_DELETE_ERROR);
    }

    @Override
    public SystemFieldDO getField(Long id) {
        return fieldMapper.selectById(id);
    }

    @Override
    public PageResult<SystemFieldDO> getFieldPage(SystemFieldPageReqVO pageReqVO) {
        return fieldMapper.selectPage(pageReqVO);
    }

    @Override
    public List<SystemFieldDO> getFieldList() {
        return fieldMapper.selectList();
    }

    /**
    * @Author Wqh
    * @Description 校验存在
    * @Date 9:43 2024/10/18
    * @Param [id]
    **/
    private void validateFieldExists(Long id) {
        ThrowUtil.ifEmptyThrow(fieldMapper.selectById(id),FIELD_NOT_EXISTS);
    }

    /**
     * @Author Wqh
     * @Description 校验键和属性的唯一性
     * @Date 9:15 2024/10/18
     * @Param [id, key, attribute]
     **/
    private void validateKeyAndAttributeUnique(Long id, String key, String attribute) {
        List<SystemFieldDO> systemFieldDos = fieldMapper.selectKeyAndAttribute(key, attribute);
        // 如果 id 为空，说明不用比较是否为相同 id 的产品分类
        if (ObjUtil.isEmpty(id)){
            ThrowUtil.ifCollectionNotEmptyThrow(systemFieldDos,FIELD_DUPLICATE);
            return;
        }
        ThrowUtil.ifThrow(anyMatch(systemFieldDos, i->!Objects.equals(i.getId(),id)),FIELD_DUPLICATE);
    }

}