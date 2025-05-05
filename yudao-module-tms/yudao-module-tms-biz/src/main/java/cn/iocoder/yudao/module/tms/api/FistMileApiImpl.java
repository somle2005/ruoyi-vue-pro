package cn.iocoder.yudao.module.tms.api;

import cn.iocoder.yudao.module.tms.api.first.FistMileDTO;
import cn.iocoder.yudao.module.tms.api.first.mile.FistMileApi;
import cn.iocoder.yudao.module.tms.convert.first.mile.TmsFirstMileConvert;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.TmsFirstMileDO;
import cn.iocoder.yudao.module.tms.service.first.mile.TmsFirstMileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FistMileApiImpl implements FistMileApi {
    @Autowired
    private TmsFirstMileService tmsFirstMileService;


    @Override
    public FistMileDTO getFirstMile(Long id) {
        TmsFirstMileDO firstMile = tmsFirstMileService.getFirstMile(id);
        return TmsFirstMileConvert.convertDTO(firstMile);
    }

    @Override
    public void updateFirstMileStatus(FistMileDTO fistMileDTO) {
        tmsFirstMileService.updateFirstMileStatus(fistMileDTO);
    }

}
