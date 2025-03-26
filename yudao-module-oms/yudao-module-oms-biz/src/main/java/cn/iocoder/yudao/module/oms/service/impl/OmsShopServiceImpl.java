package cn.iocoder.yudao.module.oms.service.impl;

import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.module.oms.dal.dataobject.OmsShopDO;
import cn.iocoder.yudao.module.oms.dal.mysql.OmsShopMapper;
import cn.iocoder.yudao.module.oms.service.OmsShopService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
@Service
public class OmsShopServiceImpl extends ServiceImpl<OmsShopMapper, OmsShopDO> implements OmsShopService {

    @Resource
    private OmsShopMapper omsShopMapper;


    @Override
    public OmsShopDO getByPlatformShopUid(String platformShopUid) {
        OmsShopDO omsShopDO = omsShopMapper.selectOne(new QueryWrapper<OmsShopDO>().eq("platform_shop_uid", platformShopUid));
        return omsShopDO;
    }
}
