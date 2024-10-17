package cn.iocoder.yudao.module.erp.service.product;

import cn.hutool.core.collection.CollUtil;
import cn.iocoder.yudao.framework.common.enums.CommonStatusEnum;
import cn.iocoder.yudao.framework.common.exception.util.ThrowUtil;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.category.ErpProductCategoryListReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.category.ErpProductCategorySaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductCategoryDO;
import cn.iocoder.yudao.module.erp.dal.mysql.product.ErpProductCategoryMapper;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import static cn.iocoder.yudao.framework.common.exception.enums.GlobalErrorCodeConstants.DB_UPDATE_ERROR;
import static cn.iocoder.yudao.module.erp.enums.ErrorCodeConstants.*;

/**
 * ERP 产品分类 Service 实现类
 *
 * @author 芋道源码
 */
@Service
@Validated
public class ErpProductCategoryServiceImpl implements ErpProductCategoryService {

    @Resource
    private ErpProductCategoryMapper erpProductCategoryMapper;

    @Resource
    @Lazy // 延迟加载，避免循环依赖
    private ErpProductService productService;

    @Override
    public Long createProductCategory(ErpProductCategorySaveReqVO createReqVO) {
        // 校验父分类编号的有效性
        validateParentProductCategory(null, createReqVO.getParentId());
        // 校验分类名称的唯一性
        validateProductCategoryNameUnique(null, createReqVO.getParentId(), createReqVO.getName());
        // 插入
        ErpProductCategoryDO category = BeanUtils.toBean(createReqVO, ErpProductCategoryDO.class);
        erpProductCategoryMapper.insert(category);
        // 返回
        return category.getId();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateProductCategory(ErpProductCategorySaveReqVO updateReqVO) {
        //获取需要修改的id
        Long id = updateReqVO.getId();
        // 校验存在
        ErpProductCategoryDO erpProductCategoryDO = validateProductCategoryExists(id);
        // 校验父分类编号的有效性
        validateParentProductCategory(updateReqVO.getId(), updateReqVO.getParentId());
        // 校验分类名称的唯一性
        validateProductCategoryNameUnique(updateReqVO.getId(), updateReqVO.getParentId(), updateReqVO.getName());
        // 更新
        ErpProductCategoryDO updateObj = BeanUtils.toBean(updateReqVO, ErpProductCategoryDO.class);
        //1.1获取原状态
        Integer oldStatus = erpProductCategoryDO.getStatus();
        //1.2获取现状态
        Integer newStatus = updateReqVO.getStatus();
        //如果状态需要开启，则需要查看父分类是否关闭，如果父分类是关闭的情况，则无法进行开启
        if (CommonStatusEnum.ENABLE.getStatus().equals(newStatus)){
            //获取父分类id
            Long parentId = erpProductCategoryDO.getParentId();
            //如果是顶级分类，则不进行校验
            if (!Objects.equals(parentId, ErpProductCategoryDO.PARENT_ID_ROOT)){
                ThrowUtil.ifThrow(Objects.equals(erpProductCategoryMapper.selectParentStatus(erpProductCategoryDO.getParentId()),CommonStatusEnum.DISABLE.getStatus()),PRODUCT_CATEGORY_DISABLE);
            }
        }
        //当状态发生改变是，该分类下的子分类全部同步状态
        if (!Objects.equals(oldStatus,newStatus)){
            //获取所有子孙分类
            List<ErpProductCategoryDO> childrenList = getChildrenList(id, new ArrayList<>());
            childrenList.forEach(c->c.setStatus(newStatus));
            if (CollUtil.isNotEmpty(childrenList)){
                //修改所有的子孙类状态
                erpProductCategoryMapper.updateBatch(childrenList);
            }
        }
        ThrowUtil.ifSqlThrow(erpProductCategoryMapper.updateById(updateObj), DB_UPDATE_ERROR);
    }
    /**
    * @Author Wqh
    * @Description 递归查询出该id的所有子孙分类
    * @Date 15:56 2024/10/17
    * @Param [id]
    * @return java.util.List<cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductCategoryDO>
    **/
    private List<ErpProductCategoryDO> getChildrenList(Long id,List<ErpProductCategoryDO> childrenList){
        List<ErpProductCategoryDO> children = erpProductCategoryMapper.selectChildrenList(id);
        if (CollUtil.isNotEmpty(children)){
            childrenList.addAll(children);
            for (ErpProductCategoryDO child : children) {
                getChildrenList(child.getId(),childrenList);
            }
        }
        return childrenList;
    }

    @Override
    public void deleteProductCategory(Long id) {
        // 1.1 校验存在
        validateProductCategoryExists(id);
        // 1.2 校验是否有子产品分类
        ThrowUtil.ifThrow(erpProductCategoryMapper.selectCountByParentId(id) > 0,PRODUCT_CATEGORY_EXITS_CHILDREN);
        // 1.3 校验是否有产品
        ThrowUtil.ifThrow(productService.getProductCountByCategoryId(id) > 0,PRODUCT_CATEGORY_EXITS_PRODUCT);
        // 2. 删除
        erpProductCategoryMapper.deleteById(id);
    }

    private ErpProductCategoryDO validateProductCategoryExists(Long id) {
        ErpProductCategoryDO erpProductCategoryDO = erpProductCategoryMapper.selectById(id);
        ThrowUtil.ifEmptyThrow(erpProductCategoryDO,PRODUCT_CATEGORY_NOT_EXISTS);
        return erpProductCategoryDO;
    }

    private void validateParentProductCategory(Long id, Long parentId) {
        if (parentId == null || ErpProductCategoryDO.PARENT_ID_ROOT.equals(parentId)) {
            return;
        }
        // 1. 不能设置自己为父产品分类
        ThrowUtil.ifThrow(Objects.equals(id, parentId),PRODUCT_CATEGORY_PARENT_ERROR);
        // 2. 父产品分类不存在
        ErpProductCategoryDO parentCategory = erpProductCategoryMapper.selectById(parentId);
        ThrowUtil.ifEmptyThrow(parentCategory, PRODUCT_CATEGORY_PARENT_NOT_EXITS);
        // 3. 递归校验父产品分类，如果父产品分类是自己的子产品分类，则报错，避免形成环路
        // id 为空，说明新增，不需要考虑环路
        if (id == null) {
            //校验父分类是否被禁用，禁用情况下不允许创建子分类
            ThrowUtil.ifThrow(Objects.equals(parentCategory.getStatus(), CommonStatusEnum.DISABLE.getStatus()),PRODUCT_CATEGORY_PARENT_DISABLE);
            return;
        }
        for (int i = 0; i < Short.MAX_VALUE; i++) {
            // 3.1 校验环路
            parentId = parentCategory.getParentId();
            ThrowUtil.ifThrow(Objects.equals(id, parentId),PRODUCT_CATEGORY_PARENT_IS_CHILD);
            // 3.2 继续递归下一级父产品分类
            if (parentId == null || ErpProductCategoryDO.PARENT_ID_ROOT.equals(parentId)) {
                break;
            }
            parentCategory = erpProductCategoryMapper.selectById(parentId);
            if (parentCategory == null) {
                break;
            }
        }
    }

    private void validateProductCategoryNameUnique(Long id, Long parentId, String name) {
        ErpProductCategoryDO productCategory = erpProductCategoryMapper.selectByParentIdAndName(parentId, name);
        if (productCategory == null) {
            return;
        }
        // 如果 id 为空，说明不用比较是否为相同 id 的产品分类
        ThrowUtil.ifEmptyThrow(id,PRODUCT_CATEGORY_NAME_DUPLICATE);
        ThrowUtil.ifThrow(!Objects.equals(productCategory.getId(), id),PRODUCT_CATEGORY_NAME_DUPLICATE);
    }

    @Override
    public ErpProductCategoryDO getProductCategory(Long id) {
        return erpProductCategoryMapper.selectById(id);
    }

    @Override
    public List<ErpProductCategoryDO> getProductCategoryList(ErpProductCategoryListReqVO listReqVO) {
        return erpProductCategoryMapper.selectList(listReqVO);
    }

    @Override
    public List<ErpProductCategoryDO> getProductCategoryList(Collection<Long> ids) {
        return erpProductCategoryMapper.selectBatchIds(ids);
    }

}