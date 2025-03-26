package cn.iocoder.yudao.module.oms.service.impl;


import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.module.oms.dal.dataobject.ErpShopProductDO;
import cn.iocoder.yudao.module.oms.dal.mysql.ErpShopProductMapper;
import cn.iocoder.yudao.module.oms.service.ErpShopProductService;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import java.util.*;

/**
 * ERP 店铺产品 Service 实现类
 *
 * @author 索迈管理员
 */
@Service
@Validated
public class ErpShopProductServiceImpl implements ErpShopProductService {


    @Resource
    MessageChannel eccangSkuRelationOutputChannel;



    @Resource
    private ErpShopProductMapper shopProductMapper;



    @Override
    public void batchCreate(List<ErpShopProductDO> listToCreate) {
        shopProductMapper.insertBatch(listToCreate);
    }

    @Override
    public void batchUpdate(List<ErpShopProductDO> listToUpdate) {
        shopProductMapper.updateBatch(listToUpdate);
    }

    @Override
    public List<ErpShopProductDO> selectByShopId(Long id) {
        return shopProductMapper.selectList(new LambdaQueryWrapperX<ErpShopProductDO>()
                .eq(ErpShopProductDO::getShopId, id));
    }



}