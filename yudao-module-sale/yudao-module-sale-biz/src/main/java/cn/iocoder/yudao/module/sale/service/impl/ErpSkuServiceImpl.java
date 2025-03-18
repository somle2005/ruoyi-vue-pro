package cn.iocoder.yudao.module.sale.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.iocoder.yudao.module.sale.mapper.ErpSkuMapper;
import cn.iocoder.yudao.module.sale.domain.entity.ErpSku;
import cn.iocoder.yudao.module.sale.service.ErpSkuService;
@Service
public class ErpSkuServiceImpl extends ServiceImpl<ErpSkuMapper, ErpSku> implements ErpSkuService{

}
