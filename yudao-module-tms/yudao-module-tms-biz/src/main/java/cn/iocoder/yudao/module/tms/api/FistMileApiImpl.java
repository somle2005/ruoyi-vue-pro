package cn.iocoder.yudao.module.tms.api;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.tms.api.first.FistMileDTO;
import cn.iocoder.yudao.module.tms.api.first.mile.FistMileApi;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.TmsFirstMileDO;
import cn.iocoder.yudao.module.tms.service.first.mile.TmsFirstMileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class FistMileApiImpl implements FistMileApi {
    @Autowired
    @Lazy
    private TmsFirstMileService tmsFirstMileService;


    @Override
    public FistMileDTO getFirstMile(Long id) {
        TmsFirstMileDO firstMile = tmsFirstMileService.getFirstMile(id);
        return BeanUtils.toBean(firstMile, FistMileDTO.class);
    }

    @Override
    public void updateFirstMileStatus(FistMileDTO fistMileDTO) {
        tmsFirstMileService.updateFirstMileStatus(fistMileDTO);
    }

}
