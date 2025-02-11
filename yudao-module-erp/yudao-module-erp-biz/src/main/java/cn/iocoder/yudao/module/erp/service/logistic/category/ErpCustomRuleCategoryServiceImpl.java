package cn.iocoder.yudao.module.erp.service.logistic.category;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.vo.ErpCustomRuleCategoryPageReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.vo.ErpCustomRuleCategorySaveReqVO;
import cn.iocoder.yudao.module.erp.convert.logistic.category.ErpCustomRuleCategoryConvert;
import cn.iocoder.yudao.module.erp.convert.logistic.category.item.ErpCustomRuleCategoryItemConvert;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.ErpCustomRuleCategoryDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.item.ErpCustomRuleCategoryItemDO;
import cn.iocoder.yudao.module.erp.dal.mysql.logistic.category.ErpCustomRuleCategoryMapper;
import cn.iocoder.yudao.module.erp.dal.mysql.logistic.category.item.ErpCustomRuleCategoryItemMapper;
import cn.iocoder.yudao.module.erp.service.logistic.category.item.ErpCustomRuleCategoryItemService;
import cn.iocoder.yudao.module.system.api.dict.DictDataApi;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.List;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.erp.enums.ErrorCodeConstants.CUSTOM_RULE_CATEGORY_NOT_EXISTS;

/**
 * 海关分类 Service 实现类
 *
 * @author 王岽宇
 */
@Service
@Validated
public class ErpCustomRuleCategoryServiceImpl implements ErpCustomRuleCategoryService {
    @Autowired
    private DictDataApi dictDataApi;
    @Resource
    private ErpCustomRuleCategoryMapper customRuleCategoryMapper;
    @Resource
    private ErpCustomRuleCategoryItemMapper customRuleCategoryItemMapper;
    @Autowired
    private ErpCustomRuleCategoryItemService itemService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Long createCustomRuleCategory(ErpCustomRuleCategorySaveReqVO createReqVO) {
        //材质-字典校验
        dictDataApi.validateDictDataList("erp_product_material", List.of(String.valueOf(createReqVO.getMaterial())));
        // 插入
        ErpCustomRuleCategoryDO customRuleCategory = ErpCustomRuleCategoryConvert.INSTANCE.convert(createReqVO);
         customRuleCategoryMapper.insert(customRuleCategory);

        // 插入子表
        List<ErpCustomRuleCategoryItemDO> itemDOS = ErpCustomRuleCategoryItemConvert.INSTANCE.convert(createReqVO.getCustomRuleCategoryItems());
        itemService.createCustomRuleCategoryItemList( customRuleCategory.getId(),itemDOS);
        // 返回
        return customRuleCategory.getId();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateCustomRuleCategory(ErpCustomRuleCategorySaveReqVO updateReqVO) {
        // 校验存在
        validateCustomRuleCategoryExists(updateReqVO.getId());
        //材质-字典校验
        dictDataApi.validateDictDataList("erp_product_material", List.of(String.valueOf(updateReqVO.getMaterial())));
        // 更新
        ErpCustomRuleCategoryDO updateObj = BeanUtils.toBean(updateReqVO, ErpCustomRuleCategoryDO.class);
        customRuleCategoryMapper.updateById(updateObj);

        // 更新子表
        List<ErpCustomRuleCategoryItemDO> itemDOS = ErpCustomRuleCategoryItemConvert.INSTANCE.convert(updateReqVO.getCustomRuleCategoryItems());
        updateCustomRuleCategoryItemList(updateReqVO.getId(), itemDOS);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteCustomRuleCategory(Long id) {
        // 校验存在
        validateCustomRuleCategoryExists(id);
        // 删除
        customRuleCategoryMapper.deleteById(id);

        // 删除子表
        deleteCustomRuleCategoryItemByCategoryId(id);
    }

    private void validateCustomRuleCategoryExists(Long id) {
        if (customRuleCategoryMapper.selectById(id) == null) {
            throw exception(CUSTOM_RULE_CATEGORY_NOT_EXISTS);
        }
    }

    @Override
    public ErpCustomRuleCategoryDO getCustomRuleCategory(Long id) {
        return customRuleCategoryMapper.selectById(id);
    }

    @Override
    public PageResult<ErpCustomRuleCategoryDO> getCustomRuleCategoryPage(ErpCustomRuleCategoryPageReqVO pageReqVO) {
        if (pageReqVO == null) {
            pageReqVO = new ErpCustomRuleCategoryPageReqVO();
        }
        return customRuleCategoryMapper.selectPage(pageReqVO);
    }

    // ==================== 子表（海关分类子表） ====================

    @Override
    public List<ErpCustomRuleCategoryItemDO> getCustomRuleCategoryItemListByCategoryId(Integer customCategoryId) {
        return customRuleCategoryItemMapper.selectListByCategoryId(customCategoryId);
    }

    private void createCustomRuleCategoryItemList(Long categoryId, List<ErpCustomRuleCategoryItemDO> list) {

        list.forEach(o -> o.setCustomCategoryId(categoryId));
        customRuleCategoryItemMapper.insertBatch(list);
    }

    private void updateCustomRuleCategoryItemList(Long categoryId, List<ErpCustomRuleCategoryItemDO> list) {
        deleteCustomRuleCategoryItemByCategoryId(categoryId);
        list.forEach(o -> o.setId(null).setUpdater(null).setUpdateTime(null)); // 解决更新情况下：1）id 冲突；2）updateTime 不更新
        createCustomRuleCategoryItemList(categoryId, list);
    }

    private void deleteCustomRuleCategoryItemByCategoryId(Long categoryId) {
        customRuleCategoryItemMapper.deleteByCategoryId(categoryId);
    }

}