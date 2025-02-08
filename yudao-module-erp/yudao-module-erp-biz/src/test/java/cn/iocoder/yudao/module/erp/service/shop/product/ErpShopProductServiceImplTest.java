package cn.iocoder.yudao.module.erp.service.shop.product;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import jakarta.annotation.Resource;

import cn.iocoder.yudao.framework.test.core.ut.BaseDbUnitTest;

import cn.iocoder.yudao.module.erp.controller.admin.shop.product.vo.*;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.ErpShopProductDO;
import cn.iocoder.yudao.module.erp.dal.mysql.shop.product.ErpShopProductMapper;
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
 * {@link ErpShopProductServiceImpl} 的单元测试类
 *
 * @author 索迈管理员
 */
@Import(ErpShopProductServiceImpl.class)
public class ErpShopProductServiceImplTest extends BaseDbUnitTest {

    @Resource
    private ErpShopProductServiceImpl shopProductService;

    @Resource
    private ErpShopProductMapper shopProductMapper;

    @Test
    public void testCreateShopProduct_success() {
        // 准备参数
        ErpShopProductSaveReqVO createReqVO = randomPojo(ErpShopProductSaveReqVO.class).setId(null);

        // 调用
        Long shopProductId = shopProductService.createShopProduct(createReqVO);
        // 断言
        assertNotNull(shopProductId);
        // 校验记录的属性是否正确
        ErpShopProductDO shopProduct = shopProductMapper.selectById(shopProductId);
        assertPojoEquals(createReqVO, shopProduct, "id");
    }

    @Test
    public void testUpdateShopProduct_success() {
        // mock 数据
        ErpShopProductDO dbShopProduct = randomPojo(ErpShopProductDO.class);
        shopProductMapper.insert(dbShopProduct);// @Sql: 先插入出一条存在的数据
        // 准备参数
        ErpShopProductSaveReqVO updateReqVO = randomPojo(ErpShopProductSaveReqVO.class, o -> {
            o.setId(dbShopProduct.getId()); // 设置更新的 ID
        });

        // 调用
        shopProductService.updateShopProduct(updateReqVO);
        // 校验是否更新正确
        ErpShopProductDO shopProduct = shopProductMapper.selectById(updateReqVO.getId()); // 获取最新的
        assertPojoEquals(updateReqVO, shopProduct);
    }

    @Test
    public void testUpdateShopProduct_notExists() {
        // 准备参数
        ErpShopProductSaveReqVO updateReqVO = randomPojo(ErpShopProductSaveReqVO.class);

        // 调用, 并断言异常
        assertServiceException(() -> shopProductService.updateShopProduct(updateReqVO), SHOP_PRODUCT_NOT_EXISTS);
    }

    @Test
    public void testDeleteShopProduct_success() {
        // mock 数据
        ErpShopProductDO dbShopProduct = randomPojo(ErpShopProductDO.class);
        shopProductMapper.insert(dbShopProduct);// @Sql: 先插入出一条存在的数据
        // 准备参数
        Long id = dbShopProduct.getId();

        // 调用
        shopProductService.deleteShopProduct(id);
       // 校验数据不存在了
       assertNull(shopProductMapper.selectById(id));
    }

    @Test
    public void testDeleteShopProduct_notExists() {
        // 准备参数
        Long id = randomLongId();

        // 调用, 并断言异常
        assertServiceException(() -> shopProductService.deleteShopProduct(id), SHOP_PRODUCT_NOT_EXISTS);
    }

    @Test
    @Disabled  // TODO 请修改 null 为需要的值，然后删除 @Disabled 注解
    public void testGetShopProductPage() {
       // mock 数据
       ErpShopProductDO dbShopProduct = randomPojo(ErpShopProductDO.class, o -> { // 等会查询到
           o.setName(null);
           o.setCode(null);
           o.setRemark(null);
           o.setStatus(null);
           o.setCreateTime(null);
           o.setUrl(null);
       });
       shopProductMapper.insert(dbShopProduct);
       // 测试 name 不匹配
       shopProductMapper.insert(cloneIgnoreId(dbShopProduct, o -> o.setName(null)));
       // 测试 code 不匹配
       shopProductMapper.insert(cloneIgnoreId(dbShopProduct, o -> o.setCode(null)));
       // 测试 remark 不匹配
       shopProductMapper.insert(cloneIgnoreId(dbShopProduct, o -> o.setRemark(null)));
       // 测试 status 不匹配
       shopProductMapper.insert(cloneIgnoreId(dbShopProduct, o -> o.setStatus(null)));
       // 测试 createTime 不匹配
       shopProductMapper.insert(cloneIgnoreId(dbShopProduct, o -> o.setCreateTime(null)));
       // 测试 url 不匹配
       shopProductMapper.insert(cloneIgnoreId(dbShopProduct, o -> o.setUrl(null)));
       // 准备参数
       ErpShopProductPageReqVO reqVO = new ErpShopProductPageReqVO();
       reqVO.setName(null);
       reqVO.setCode(null);
       reqVO.setRemark(null);
       reqVO.setStatus(null);
       reqVO.setCreateTime(buildBetweenTime(2023, 2, 1, 2023, 2, 28));
       reqVO.setUrl(null);

       // 调用
       PageResult<ErpShopProductDO> pageResult = shopProductService.getShopProductPage(reqVO);
       // 断言
       assertEquals(1, pageResult.getTotal());
       assertEquals(1, pageResult.getList().size());
       assertPojoEquals(dbShopProduct, pageResult.getList().get(0));
    }

}