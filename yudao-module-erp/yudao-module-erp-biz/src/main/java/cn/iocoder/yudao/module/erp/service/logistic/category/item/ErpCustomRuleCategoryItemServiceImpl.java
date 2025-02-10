package cn.iocoder.yudao.module.erp.service.logistic.category.item;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.item.vo.ErpCustomRuleCategoryItemPageReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.item.vo.ErpCustomRuleCategoryItemSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.item.ErpCustomRuleCategoryItemDO;
import cn.iocoder.yudao.module.erp.dal.mysql.logistic.category.item.ErpCustomRuleCategoryItemMapper;
import cn.iocoder.yudao.module.system.api.dict.DictDataApi;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.Collection;
import java.util.List;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.erp.enums.ErrorCodeConstants.CUSTOM_RULE_CATEGORY_ITEM_NOT_EXISTS;

/**
 * 海关品类子表 Service 实现类
 *
 * @author 王岽宇
 */
@Service
@Validated
public class ErpCustomRuleCategoryItemServiceImpl implements ErpCustomRuleCategoryItemService {
    @Autowired
    private DictDataApi dictDataApi;

    @Resource
    private ErpCustomRuleCategoryItemMapper customRuleCategoryItemMapper;

    @Override
    public Long createCustomRuleCategoryItem(ErpCustomRuleCategoryItemSaveReqVO createReqVO) {
        dictDataApi.validateDictDataList("country_code", List.of(String.valueOf(createReqVO.getCountryCode())));
        // 插入
        ErpCustomRuleCategoryItemDO customRuleCategoryItem = BeanUtils.toBean(createReqVO, ErpCustomRuleCategoryItemDO.class);
        customRuleCategoryItemMapper.insert(customRuleCategoryItem);
        // 返回
        return customRuleCategoryItem.getId();
    }

    @Override
    public void createCustomRuleCategoryItemList(Long categoryId, List<ErpCustomRuleCategoryItemDO> list) {
        list.forEach(o -> o.setCategoryId(categoryId));
        customRuleCategoryItemMapper.insertBatch(list);
    }

    @Override
    public void updateCustomRuleCategoryItem(ErpCustomRuleCategoryItemSaveReqVO updateReqVO) {
        dictDataApi.validateDictDataList("country_code", List.of(String.valueOf(updateReqVO.getCountryCode())));
        // 校验存在
        validateCustomRuleCategoryItemExists(updateReqVO.getId());
        // 更新
        ErpCustomRuleCategoryItemDO updateObj = BeanUtils.toBean(updateReqVO, ErpCustomRuleCategoryItemDO.class);
        customRuleCategoryItemMapper.updateById(updateObj);
    }

    @Override
    public void updateCustomRuleCategoryItemList(Long categoryId, List<ErpCustomRuleCategoryItemDO> list) {
        deleteCustomRuleCategoryItemByCategoryId(categoryId);
        list.forEach(o -> o.setId(null).setUpdater(null).setUpdateTime(null)); // 解决更新情况下：1）id 冲突；2）updateTime 不更新
        createCustomRuleCategoryItemList(categoryId, list);
    }

    @Override
    public void deleteCustomRuleCategoryItem(Long id) {
        // 校验存在
        validateCustomRuleCategoryItemExists(id);
        // 删除
        customRuleCategoryItemMapper.deleteById(id);
    }

    private void validateCustomRuleCategoryItemExists(Long id) {
        if (customRuleCategoryItemMapper.selectById(id) == null) {
            throw exception(CUSTOM_RULE_CATEGORY_ITEM_NOT_EXISTS);
        }
    }

    @Override
    public ErpCustomRuleCategoryItemDO getCustomRuleCategoryItem(Long id) {
        return customRuleCategoryItemMapper.selectById(id);
    }

    @Override
    public PageResult<ErpCustomRuleCategoryItemDO> getCustomRuleCategoryItemPage(ErpCustomRuleCategoryItemPageReqVO pageReqVO) {
        return customRuleCategoryItemMapper.selectPage(pageReqVO);
    }


    public void deleteCustomRuleCategoryItemByCategoryId(Long categoryId) {
        customRuleCategoryItemMapper.deleteByCategoryId(categoryId);
    }

    /**
     * 根据分类id查询
     *
     * @param categoryIds 分类id
     * @return 海关品类子表列表
     */
    @Override
    public List<ErpCustomRuleCategoryItemDO> getCustomRuleCategoryItemListByCategoryId(Collection<Long> categoryIds) {
        return customRuleCategoryItemMapper.selectListByCategoryId(categoryIds);
    }
}