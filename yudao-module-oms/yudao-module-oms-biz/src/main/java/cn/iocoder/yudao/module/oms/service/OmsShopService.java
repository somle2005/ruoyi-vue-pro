package cn.iocoder.yudao.module.oms.service;

import cn.iocoder.yudao.module.oms.dal.dataobject.OmsShopDO;
import com.baomidou.mybatisplus.extension.service.IService;
public interface OmsShopService extends IService<OmsShopDO>{

    OmsShopDO getByPlatformShopUid(String platformShopUid);

}
