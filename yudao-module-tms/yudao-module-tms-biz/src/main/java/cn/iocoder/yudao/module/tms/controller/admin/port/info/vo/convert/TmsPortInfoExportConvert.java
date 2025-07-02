package cn.iocoder.yudao.module.tms.controller.admin.port.info.vo.convert;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.tms.controller.admin.port.info.vo.TmsPortInfoExcelRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.port.info.vo.TmsPortInfoRespVO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TmsPortInfoExportConvert {
    public static List<TmsPortInfoExcelRespVO> buildExcelList(List<TmsPortInfoRespVO> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        List<TmsPortInfoExcelRespVO> result = new ArrayList<>();
        for (TmsPortInfoRespVO main : list) {
            // 复制主表字段
            TmsPortInfoExcelRespVO vo = BeanUtils.toBean(main, TmsPortInfoExcelRespVO.class);
            result.add(vo);
        }
        return result;
    }
} 