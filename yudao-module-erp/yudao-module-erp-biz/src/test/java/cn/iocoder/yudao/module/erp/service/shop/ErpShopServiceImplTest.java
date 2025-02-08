package cn.iocoder.yudao.module.erp.service.shop;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import jakarta.annotation.Resource;

import cn.iocoder.yudao.framework.test.core.ut.BaseDbUnitTest;

import cn.iocoder.yudao.module.erp.controller.admin.shop.vo.*;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.ErpShopDO;
import cn.iocoder.yudao.module.erp.dal.mysql.shop.ErpShopMapper;
import cn.iocoder.yudao.framework.common.pojo.PageResult;

import jakarta.annotation.Resource;
import org.springframework.context.annotation.Import;
import java.util.*;
import java.time.LocalDateTime;

import static cn.hutool.core.util.RandomUtil.*;
import static cn.iocoder.yudao.module.erp.enums.ErrorCodeConstants.*;
import static cn.iocoder.yudao.framework.test.core.util.AssertUtils.*;
import static cn.iocoder.yudao.framework.test.core.util.RandomUtils.*;
import static cn.iocoder.yudao.framework.common.util.date.LocalDateTimeUtils.*;
import static cn.iocoder.yudao.framework.common.util.object.ObjectUtils.*;
import static cn.iocoder.yudao.framework.common.util.date.DateUtils.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * {@link ErpShopServiceImpl} 的单元测试类
 *
 * @author c-tao
 */
@Import(ErpShopServiceImpl.class)
public class ErpShopServiceImplTest extends BaseDbUnitTest {

    @Resource
    private ErpShopServiceImpl shopService;

    @Resource
    private ErpShopMapper shopMapper;

    @Test
    public void testCreateShop_success() {
        // 准备参数
        ErpShopSaveReqVO createReqVO = randomPojo(ErpShopSaveReqVO.class).setId(null);

        // 调用
        Long shopId = shopService.createShop(createReqVO);
        // 断言
        assertNotNull(shopId);
        // 校验记录的属性是否正确
        ErpShopDO shop = shopMapper.selectById(shopId);
        assertPojoEquals(createReqVO, shop, "id");
    }

    @Test
    public void testUpdateShop_success() {
        // mock 数据
        ErpShopDO dbShop = randomPojo(ErpShopDO.class);
        shopMapper.insert(dbShop);// @Sql: 先插入出一条存在的数据
        // 准备参数
        ErpShopSaveReqVO updateReqVO = randomPojo(ErpShopSaveReqVO.class, o -> {
            o.setId(dbShop.getId()); // 设置更新的 ID
        });

        // 调用
        shopService.updateShop(updateReqVO);
        // 校验是否更新正确
        ErpShopDO shop = shopMapper.selectById(updateReqVO.getId()); // 获取最新的
        assertPojoEquals(updateReqVO, shop);
    }

    @Test
    public void testUpdateShop_notExists() {
        // 准备参数
        ErpShopSaveReqVO updateReqVO = randomPojo(ErpShopSaveReqVO.class);

        // 调用, 并断言异常
        assertServiceException(() -> shopService.updateShop(updateReqVO), SHOP_NOT_EXISTS);
    }

    @Test
    public void testDeleteShop_success() {
        // mock 数据
        ErpShopDO dbShop = randomPojo(ErpShopDO.class);
        shopMapper.insert(dbShop);// @Sql: 先插入出一条存在的数据
        // 准备参数
        Long id = dbShop.getId();

        // 调用
        shopService.deleteShop(id);
       // 校验数据不存在了
       assertNull(shopMapper.selectById(id));
    }

    @Test
    public void testDeleteShop_notExists() {
        // 准备参数
        Long id = randomLongId();

        // 调用, 并断言异常
        assertServiceException(() -> shopService.deleteShop(id), SHOP_NOT_EXISTS);
    }

    @Test
    @Disabled  // TODO 请修改 null 为需要的值，然后删除 @Disabled 注解
    public void testGetShopPage() {
       // mock 数据
       ErpShopDO dbShop = randomPojo(ErpShopDO.class, o -> { // 等会查询到
           o.setName(null);
           o.setCode(null);
           o.setStatus(null);
           o.setCreateTime(null);
           o.setType(null);
           o.setPlatform(null);
           o.setAccount(null);
       });
       shopMapper.insert(dbShop);
       // 测试 name 不匹配
       shopMapper.insert(cloneIgnoreId(dbShop, o -> o.setName(null)));
       // 测试 code 不匹配
       shopMapper.insert(cloneIgnoreId(dbShop, o -> o.setCode(null)));
       // 测试 status 不匹配
       shopMapper.insert(cloneIgnoreId(dbShop, o -> o.setStatus(null)));
       // 测试 createTime 不匹配
       shopMapper.insert(cloneIgnoreId(dbShop, o -> o.setCreateTime(null)));
       // 测试 type 不匹配
       shopMapper.insert(cloneIgnoreId(dbShop, o -> o.setType(null)));
       // 测试 platform 不匹配
       shopMapper.insert(cloneIgnoreId(dbShop, o -> o.setPlatform(null)));
       // 测试 account 不匹配
       shopMapper.insert(cloneIgnoreId(dbShop, o -> o.setAccount(null)));
       // 准备参数
       ErpShopPageReqVO reqVO = new ErpShopPageReqVO();
       reqVO.setName(null);
       reqVO.setCode(null);
       reqVO.setStatus(null);
       reqVO.setCreateTime(buildBetweenTime(2023, 2, 1, 2023, 2, 28));
       reqVO.setType(null);
       reqVO.setPlatform(null);
       reqVO.setAccount(null);

       // 调用
       PageResult<ErpShopDO> pageResult = shopService.getShopPage(reqVO);
       // 断言
       assertEquals(1, pageResult.getTotal());
       assertEquals(1, pageResult.getList().size());
       assertPojoEquals(dbShop, pageResult.getList().get(0));
    }

}