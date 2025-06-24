package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.supplier.convert;

import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.supplier.SrmSupplierExcelRespVO;
import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.supplier.SrmSupplierRespVO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SrmSupplierExportConvert {
    public static List<SrmSupplierExcelRespVO> buildExcelList(List<SrmSupplierRespVO> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        List<SrmSupplierExcelRespVO> result = new ArrayList<>();
        for (SrmSupplierRespVO vo : list) {
            SrmSupplierExcelRespVO excel = new SrmSupplierExcelRespVO();
            excel.setId(vo.getId());
            excel.setName(vo.getName());
            excel.setShortName(vo.getName());
            excel.setContact(vo.getContact());
            excel.setContactPhone(vo.getTelephone());
            excel.setEmail(vo.getEmail());
            excel.setAddress(vo.getCompanyAddress());
            excel.setBankName(vo.getBankName());
            excel.setBankAccount(vo.getBankAccount());
            excel.setTaxNo(vo.getTaxNo());
            excel.setStatus(vo.getOpenStatus());
            excel.setCreateTime(vo.getCreateTime());
            excel.setRemark(vo.getRemark());
            if (vo.getSrmPaymentTermsResp() != null) {
                excel.setPaymentTermCreateTime(vo.getSrmPaymentTermsResp().getCreateTime());
                excel.setPaymentTermZh(vo.getSrmPaymentTermsResp().getPaymentTermZh());
                excel.setPaymentTermZhForeign(vo.getSrmPaymentTermsResp().getPaymentTermZhForeign());
                excel.setPaymentTermEnForeign(vo.getSrmPaymentTermsResp().getPaymentTermEnForeign());
                excel.setPaymentTermRemark(vo.getSrmPaymentTermsResp().getRemark());
            }
            result.add(excel);
        }
        return result;
    }
} 