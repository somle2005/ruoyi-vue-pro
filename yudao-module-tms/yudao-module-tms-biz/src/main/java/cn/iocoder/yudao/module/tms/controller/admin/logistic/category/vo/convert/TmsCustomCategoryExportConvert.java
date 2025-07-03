package cn.iocoder.yudao.module.tms.controller.admin.logistic.category.vo.convert;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.tms.controller.admin.logistic.category.item.vo.TmsCustomCategoryItemRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.logistic.category.vo.TmsCustomCategoryExcelRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.logistic.category.vo.TmsCustomCategoryRespVO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TmsCustomCategoryExportConvert {
    public static List<TmsCustomCategoryExcelRespVO> buildExcelList(List<TmsCustomCategoryRespVO> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        List<TmsCustomCategoryExcelRespVO> result = new ArrayList<>();
        for (TmsCustomCategoryRespVO main : list) {
            if (main.getCustomRuleCategoryItems() == null || main.getCustomRuleCategoryItems().isEmpty()) {
                // 没有子表数据，只导出主表信息
                TmsCustomCategoryExcelRespVO vo = BeanUtils.toBean(main, TmsCustomCategoryExcelRespVO.class);
                result.add(vo);
            } else {
                // 有子表数据，每个子表项都包含完整的主表信息
                for (TmsCustomCategoryItemRespVO item : main.getCustomRuleCategoryItems()) {
                    // 先复制主表字段
                    TmsCustomCategoryExcelRespVO vo = BeanUtils.toBean(main, TmsCustomCategoryExcelRespVO.class);
                    // 手动设置子表特有字段，避免覆盖主表字段
                    vo.setCategoryItemId(item.getId());
                    vo.setCountryCode(item.getCountryCode());
                    vo.setHscode(item.getHscode());
                    vo.setTaxRate(item.getTaxRate());
                    result.add(vo);
                }
            }
        }
        return result;
    }
} 