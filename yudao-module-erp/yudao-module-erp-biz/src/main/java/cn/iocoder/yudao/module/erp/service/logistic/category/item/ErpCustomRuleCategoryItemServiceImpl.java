package cn.iocoder.yudao.module.erp.service.logistic.category.item;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.item.vo.ErpCustomRuleCategoryItemPageReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.item.vo.ErpCustomRuleCategoryItemSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.item.ErpCustomRuleCategoryItemDO;
import cn.iocoder.yudao.module.erp.dal.mysql.logistic.category.item.ErpCustomRuleCategoryItemMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

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

    @Resource
    private ErpCustomRuleCategoryItemMapper customRuleCategoryItemMapper;

    @Override
    public Long createCustomRuleCategoryItem(ErpCustomRuleCategoryItemSaveReqVO createReqVO) {
        // 插入
        ErpCustomRuleCategoryItemDO customRuleCategoryItem = BeanUtils.toBean(createReqVO, ErpCustomRuleCategoryItemDO.class);
        customRuleCategoryItemMapper.insert(customRuleCategoryItem);
        // 返回
        return customRuleCategoryItem.getId();
    }

    @Override
    public void updateCustomRuleCategoryItem(ErpCustomRuleCategoryItemSaveReqVO updateReqVO) {
        // 校验存在
        validateCustomRuleCategoryItemExists(updateReqVO.getId());
        // 更新
        ErpCustomRuleCategoryItemDO updateObj = BeanUtils.toBean(updateReqVO, ErpCustomRuleCategoryItemDO.class);
        customRuleCategoryItemMapper.updateById(updateObj);
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

}