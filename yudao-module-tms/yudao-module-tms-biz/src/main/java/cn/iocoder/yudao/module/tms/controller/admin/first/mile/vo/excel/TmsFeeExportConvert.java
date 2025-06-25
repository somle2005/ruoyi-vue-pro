package cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.excel;

import cn.iocoder.yudao.module.tms.controller.admin.fee.vo.TmsFeeExcelRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.fee.vo.TmsFeeRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.resp.TmsFirstMileRespVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.fee.TmsFeeDO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;


public class TmsFeeExportConvert {
    public static List<TmsFeeExcelRespVO> buildExcelList(List<TmsFirstMileRespVO> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        List<TmsFeeExcelRespVO> result = new ArrayList<>();
        for (TmsFirstMileRespVO main : list) {
            if (main.getFees() != null) {
                for (TmsFeeRespVO fee : main.getFees()) {
                    TmsFeeExcelRespVO vo = new TmsFeeExcelRespVO();
                    vo.setNo(main.getCode());
                    vo.setCostType(fee.getCostType());
                    vo.setAmount(fee.getAmount());
                    vo.setCurrencyType(fee.getCurrencyType());
                    vo.setRemark(fee.getRemark());
                    result.add(vo);
                }
            }
        }
        return result;
    }

    public static List<TmsFeeExcelRespVO> buildExcelList(List<TmsFirstMileRespVO> list, Map<Long, List<TmsFeeDO>> feeMap) {
        if (list == null || list.isEmpty() || feeMap == null || feeMap.isEmpty()) {
            return Collections.emptyList();
        }
        List<TmsFeeExcelRespVO> result = new ArrayList<>();
        for (TmsFirstMileRespVO main : list) {
            if (main.getId() == null) continue;
            List<TmsFeeDO> fees = feeMap.get(main.getId());
            if (fees != null) {
                for (TmsFeeDO fee : fees) {
                    TmsFeeExcelRespVO vo = new TmsFeeExcelRespVO();
                    vo.setNo(main.getCode());
                    vo.setCostType(fee.getCostType());
                    vo.setAmount(fee.getAmount());
                    vo.setCurrencyType(fee.getCurrencyType());
                    vo.setRemark(fee.getRemark());
                    result.add(vo);
                }
            }
        }
        return result;
    }
} 