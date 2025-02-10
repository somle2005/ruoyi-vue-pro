package cn.iocoder.yudao.module.erp.service.logistic.category.item;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.item.vo.ErpCustomRuleCategoryItemPageReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.item.vo.ErpCustomRuleCategoryItemSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.item.ErpCustomRuleCategoryItemDO;
import jakarta.validation.Valid;

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
     * 更新海关品类子表
     *
     * @param updateReqVO 更新信息
     */
    void updateCustomRuleCategoryItem(@Valid ErpCustomRuleCategoryItemSaveReqVO updateReqVO);

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

}