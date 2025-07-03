package cn.iocoder.yudao.module.srm.controller.admin.purchase.payment.term.vo.convert;

import cn.iocoder.yudao.module.srm.controller.admin.purchase.payment.term.vo.SrmPaymentTermExcelRespVO;
import cn.iocoder.yudao.module.srm.controller.admin.purchase.payment.term.vo.SrmPaymentTermRespVO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SrmPaymentTermExportConvert {
    public static List<SrmPaymentTermExcelRespVO> buildExcelList(List<SrmPaymentTermRespVO> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        List<SrmPaymentTermExcelRespVO> result = new ArrayList<>();
        for (SrmPaymentTermRespVO vo : list) {
            SrmPaymentTermExcelRespVO excel = new SrmPaymentTermExcelRespVO();
            excel.setId(vo.getId());
            excel.setCreateTime(vo.getCreateTime());
            excel.setPaymentTermZh(vo.getPaymentTermZh());
            excel.setPaymentTermZhForeign(vo.getPaymentTermZhForeign());
            excel.setPaymentTermEnForeign(vo.getPaymentTermEnForeign());
            excel.setRemark(vo.getRemark());
            result.add(excel);
        }
        return result;
    }
} 