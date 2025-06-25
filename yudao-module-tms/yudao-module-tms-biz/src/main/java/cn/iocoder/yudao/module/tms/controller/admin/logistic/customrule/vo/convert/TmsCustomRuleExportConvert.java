package cn.iocoder.yudao.module.tms.controller.admin.logistic.customrule.vo.convert;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.tms.controller.admin.logistic.customrule.vo.TmsCustomRuleExcelRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.logistic.customrule.vo.TmsCustomRuleRespVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.logistic.category.item.TmsCustomCategoryItemDO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TmsCustomRuleExportConvert {
    public static List<TmsCustomRuleExcelRespVO> buildExcelList(List<TmsCustomRuleRespVO> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        List<TmsCustomRuleExcelRespVO> result = new ArrayList<>();
        for (TmsCustomRuleRespVO main : list) {
            // 先复制主表字段
            TmsCustomRuleExcelRespVO vo = BeanUtils.toBean(main, TmsCustomRuleExcelRespVO.class);
            // 设置产品信息
            if (main.getProduct() != null) {
                vo.setProductName(main.getProduct().getName());
                vo.setProductCode(main.getProduct().getCode());
            }
            result.add(vo);
        }
        return result;
    }

    public static List<TmsCustomRuleExcelRespVO> buildExcelList(List<TmsCustomRuleRespVO> list,
                                                                List<TmsCustomCategoryItemDO> categoryItems) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        List<TmsCustomRuleExcelRespVO> result = new ArrayList<>();
        for (TmsCustomRuleRespVO main : list) {
            if (categoryItems == null || categoryItems.isEmpty()) {
                // 没有子表数据，只导出主表信息
                TmsCustomRuleExcelRespVO vo = BeanUtils.toBean(main, TmsCustomRuleExcelRespVO.class);
                if (main.getProduct() != null) {
                    vo.setProductName(main.getProduct().getName());
                    vo.setProductCode(main.getProduct().getCode());
                }
                result.add(vo);
            } else {
                // 有子表数据，每个子表项都包含完整的主表信息
                for (TmsCustomCategoryItemDO item : categoryItems) {
                    // 先复制主表字段
                    TmsCustomRuleExcelRespVO vo = BeanUtils.toBean(main, TmsCustomRuleExcelRespVO.class);
                    // 设置产品信息
                    if (main.getProduct() != null) {
                        vo.setProductName(main.getProduct().getName());
                        vo.setProductCode(main.getProduct().getCode());
                    }
                    // 手动设置子表特有字段，避免覆盖主表字段
                    vo.setCategoryItemId(item.getId());
                    vo.setHscode(item.getHscode());
                    vo.setTaxRate(item.getTaxRate());
                    result.add(vo);
                }
            }
        }
        return result;
    }
} 