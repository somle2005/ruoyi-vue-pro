package cn.iocoder.yudao.module.erp.service.logistic.category.item;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.item.vo.ErpCustomRuleCategoryItemPageReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.item.vo.ErpCustomRuleCategoryItemSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.item.ErpCustomRuleCategoryItemDO;
import jakarta.validation.Valid;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 海关品类子表 Service 接口
 *
 * @author 王岽宇
 */
public interface ErpCustomRuleCategoryItemService {

    /**
     * 创建海关品类子表
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createCustomRuleCategoryItem(@Valid ErpCustomRuleCategoryItemSaveReqVO createReqVO);

    /**
     * 创建海关品类子表
     *
     * @param categoryId 海关品类id
     * @param list       海关品类子表列表
     */
    void createCustomRuleCategoryItemList(Long categoryId, List<ErpCustomRuleCategoryItemDO> list);

    /**
     * 更新海关品类子表
     *
     * @param updateReqVO 更新信息
     */
    void updateCustomRuleCategoryItem(@Valid ErpCustomRuleCategoryItemSaveReqVO updateReqVO);

    /**
     * 更新海关品类子表
     *
     * @param categoryId 海关品类id
     * @param list       海关品类子表列表
     */
    void updateCustomRuleCategoryItemList(Long categoryId, List<ErpCustomRuleCategoryItemDO> list);

    /**
     * 删除海关品类子表
     *
     * @param id 编号
     */
    void deleteCustomRuleCategoryItem(Long id);

    /**
     * 获得海关品类子表
     *
     * @param id 编号
     * @return 海关品类子表
     */
    ErpCustomRuleCategoryItemDO getCustomRuleCategoryItem(Long id);

    /**
     * 获得海关品类子表分页
     *
     * @param pageReqVO 分页查询
     * @return 海关品类子表分页
     */
    PageResult<ErpCustomRuleCategoryItemDO> getCustomRuleCategoryItemPage(ErpCustomRuleCategoryItemPageReqVO pageReqVO);

    /**
     * 构造categoryId对应的Map
     * <p>
     * categoryId : list
     *
     * @param categoryIds 分类id
     * @return Map<Long, List < ErpCustomRuleCategoryItemDO>>
     */
    default Map<Long, List<ErpCustomRuleCategoryItemDO>> getCustomRuleCategoryItemMap(Collection<Long> categoryIds) {
        List<ErpCustomRuleCategoryItemDO> list = getCustomRuleCategoryItemListByCategoryId(categoryIds);
        return list.stream().collect(Collectors.groupingBy(ErpCustomRuleCategoryItemDO::getCategoryId));
    }

    /**
     * 根据分类id查询
     *
     * @param categoryIds 分类id
     * @return 海关品类子表列表
     */
    List<ErpCustomRuleCategoryItemDO> getCustomRuleCategoryItemListByCategoryId(Collection<Long> categoryIds);
}