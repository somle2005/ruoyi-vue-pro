package cn.iocoder.yudao.module.erp.config;

import cn.iocoder.yudao.module.erp.dal.dataobject.product.tvstand.ErpProductTvStandDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.xxxx.ErpProductXxxxDO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className: MyBatisDOConfig
 * @author: Wqh
 * @date: 2024/11/15 13:50
 * @Version: 1.0
 * @description: 将实体类注册到IOC容器中交给spring管理
 */
@Configuration
public class MyBatisDOConfig {

    @Bean
    public ErpProductXxxxDO productXxxx() {
        return new ErpProductXxxxDO();
    }

    @Bean
    public ErpProductTvStandDO productTvStandDO() {
        return new ErpProductTvStandDO();
    }
}
