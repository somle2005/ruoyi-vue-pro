package cn.iocoder.yudao.module.erp.service.logistic.category;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.vo.ErpCustomRuleCategoryPageReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.vo.ErpCustomRuleCategorySaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.ErpCustomRuleCategoryDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.item.ErpCustomRuleCategoryItemDO;
import cn.iocoder.yudao.module.erp.dal.mysql.logistic.category.ErpCustomRuleCategoryMapper;
import cn.iocoder.yudao.module.erp.dal.mysql.logistic.category.item.ErpCustomRuleCategoryItemMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.List;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.erp.enums.ErrorCodeConstants.CUSTOM_RULE_CATEGORY_NOT_EXISTS;

/**
 * 海关品类 Service 实现类
 *
 * @author 王岽宇
 */
@Service
@Validated
public class ErpCustomRuleCategoryServiceImpl implements ErpCustomRuleCategoryService {

    @Resource
    private ErpCustomRuleCategoryMapper customRuleCategoryMapper;
    @Resource
    private ErpCustomRuleCategoryItemMapper customRuleCategoryItemMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Long createCustomRuleCategory(ErpCustomRuleCategorySaveReqVO createReqVO) {
        // 插入
        ErpCustomRuleCategoryDO customRuleCategory = BeanUtils.toBean(createReqVO, ErpCustomRuleCategoryDO.class);
        customRuleCategoryMapper.insert(customRuleCategory);

        // 插入子表
        createCustomRuleCategoryItemList(customRuleCategory.getId(), createReqVO.getCustomRuleCategoryItems());
        // 返回
        return customRuleCategory.getId();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateCustomRuleCategory(ErpCustomRuleCategorySaveReqVO updateReqVO) {
        // 校验存在
        validateCustomRuleCategoryExists(updateReqVO.getId());
        // 更新
        ErpCustomRuleCategoryDO updateObj = BeanUtils.toBean(updateReqVO, ErpCustomRuleCategoryDO.class);
        customRuleCategoryMapper.updateById(updateObj);

        // 更新子表
        updateCustomRuleCategoryItemList(updateReqVO.getId(), updateReqVO.getCustomRuleCategoryItems());
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
        return customRuleCategoryMapper.selectPage(pageReqVO);
    }

    // ==================== 子表（海关品类子表） ====================

    @Override
    public List<ErpCustomRuleCategoryItemDO> getCustomRuleCategoryItemListByCategoryId(Integer categoryId) {
        return customRuleCategoryItemMapper.selectListByCategoryId(categoryId);
    }

    private void createCustomRuleCategoryItemList(Long categoryId, List<ErpCustomRuleCategoryItemDO> list) {
        list.forEach(o -> o.setCategoryId(categoryId));
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