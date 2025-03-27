package com.somle.esb.job;

import cn.iocoder.yudao.framework.mybatis.config.YudaoMybatisAutoConfiguration;
import cn.iocoder.yudao.framework.security.config.YudaoSecurityAutoConfiguration;
import cn.iocoder.yudao.module.infra.api.config.ConfigApi;
import cn.iocoder.yudao.module.infra.api.file.FileApi;
import cn.iocoder.yudao.module.system.dal.mysql.dept.DeptMapper;
import cn.iocoder.yudao.module.system.service.dept.DeptService;
import cn.iocoder.yudao.module.system.service.dept.PostService;
import cn.iocoder.yudao.module.system.service.permission.PermissionService;
import cn.iocoder.yudao.module.system.service.tenant.TenantService;
import cn.iocoder.yudao.module.system.service.user.AdminUserService;
import com.baomidou.mybatisplus.autoconfigure.MybatisPlusAutoConfiguration;
import com.github.yulichang.autoconfigure.MybatisPlusJoinAutoConfiguration;
import com.somle.ai.service.AiService;
import com.somle.amazon.service.AmazonService;
import com.somle.dingtalk.service.DingTalkService;
import com.somle.eccang.service.EccangService;
import com.somle.esb.config.IntegrationConfig;
import com.somle.esb.converter.DingTalkToErpConverter;
import com.somle.esb.converter.EccangToErpConverter;
import com.somle.esb.converter.ErpToEccangConverter;
import com.somle.esb.converter.ErpToKingdeeConverter;
import com.somle.esb.job.common.SyncShopProductsJob;
import com.somle.esb.service.AliyunService;
import com.somle.esb.service.EsbMappingService;
import com.somle.esb.service.EsbService;
import cn.iocoder.yudao.framework.test.core.ut.SomleBaseSpringTest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

@Disabled
@Import({
    // MyBatis 配置类
    DataSourceAutoConfiguration.class,
    YudaoMybatisAutoConfiguration.class, //Enable DefaultDBFieldHandler
    MybatisPlusAutoConfiguration.class, // MyBatis 的自动配置类
    MybatisPlusJoinAutoConfiguration.class, // MyBatis 的Join配置类
})
//@MapperScan("cn.iocoder.yudao.module.system.dal.mysql.dept")
class EsbJobTest extends SomleBaseSpringTest {



    @Test
    void testDataJob() throws Exception {

    }
}