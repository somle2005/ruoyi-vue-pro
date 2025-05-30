package cn.iocoder.yudao.module.tms.api;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.tms.api.first.TmsFistMileDTO;
import cn.iocoder.yudao.module.tms.api.first.mile.TmsFistMileApi;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.TmsFirstMileDO;
import cn.iocoder.yudao.module.tms.service.first.mile.TmsFirstMileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TmsFistMileApiImpl implements TmsFistMileApi {
    @Autowired
    @Lazy
    private TmsFirstMileService tmsFirstMileService;


    @Override
    public TmsFistMileDTO getFirstMile(Long id) {
        TmsFirstMileDO firstMile = tmsFirstMileService.getFirstMile(id);
        return BeanUtils.toBean(firstMile, TmsFistMileDTO.class);
    }

    @Override
    public void updateFirstMileStatus(TmsFistMileDTO tmsFistMileDTO) {
        tmsFirstMileService.updateFirstMileStatus(tmsFistMileDTO);
    }

}
