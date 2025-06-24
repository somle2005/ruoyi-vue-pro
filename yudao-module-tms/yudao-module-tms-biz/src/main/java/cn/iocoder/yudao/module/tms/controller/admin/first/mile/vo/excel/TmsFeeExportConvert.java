package cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.excel;

import cn.iocoder.yudao.module.tms.controller.admin.fee.vo.TmsFeeExcelRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.fee.vo.TmsFeeRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.resp.TmsFirstMileRespVO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
                    vo.setId(fee.getId());
                    vo.setUpstreamType(fee.getUpstreamType());
                    vo.setUpstreamId(fee.getUpstreamId());
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