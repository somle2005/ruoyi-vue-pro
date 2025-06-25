package cn.iocoder.yudao.module.tms.controller.admin.logistic.category.product.vo.convert;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.tms.controller.admin.logistic.category.product.vo.TmsCustomProductExcelRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.logistic.category.product.vo.TmsCustomProductRespVO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TmsCustomProductExportConvert {
    public static List<TmsCustomProductExcelRespVO> buildExcelList(List<TmsCustomProductRespVO> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        List<TmsCustomProductExcelRespVO> result = new ArrayList<>();
        for (TmsCustomProductRespVO main : list) {
            // 复制主表字段
            TmsCustomProductExcelRespVO vo = BeanUtils.toBean(main, TmsCustomProductExcelRespVO.class);
            // 设置产品信息
            if (main.getProduct() != null) {
                vo.setProductName(main.getProduct().getName());
                vo.setProductCode(main.getProduct().getCode());
            }
            // 设置海关分类信息
            if (main.getCustomCategory() != null) {
                vo.setMaterial(main.getCustomCategory().getMaterial());
                vo.setDeclaredType(main.getCustomCategory().getDeclaredType());
                vo.setDeclaredTypeEn(main.getCustomCategory().getDeclaredTypeEn());
                vo.setCustomsPurpose(main.getCustomCategory().getCustomsPurpose());
                vo.setCustomsMaterial(main.getCustomCategory().getCustomsMaterial());
            }
            result.add(vo);
        }
        return result;
    }
} 