package cn.iocoder.yudao.module.erp.service.shop.product.item;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import jakarta.annotation.Resource;

import cn.iocoder.yudao.framework.test.core.ut.BaseDbUnitTest;

import cn.iocoder.yudao.module.erp.controller.admin.shop.product.item.vo.*;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.item.ErpShopProductItemDO;
import cn.iocoder.yudao.module.erp.dal.mysql.shop.product.item.ErpShopProductItemMapper;
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
 * {@link ErpShopProductItemServiceImpl} 的单元测试类
 *
 * @author 索迈管理员
 */
@Import(ErpShopProductItemServiceImpl.class)
public class ErpShopProductItemServiceImplTest extends BaseDbUnitTest {

    @Resource
    private ErpShopProductItemServiceImpl shopProductItemService;

    @Resource
    private ErpShopProductItemMapper shopProductItemMapper;

    @Test
    public void testCreateShopProductItem_success() {
        // 准备参数
        ErpShopProductItemSaveReqVO createReqVO = randomPojo(ErpShopProductItemSaveReqVO.class).setId(null);

        // 调用
        Long shopProductItemId = shopProductItemService.createShopProductItem(createReqVO);
        // 断言
        assertNotNull(shopProductItemId);
        // 校验记录的属性是否正确
        ErpShopProductItemDO shopProductItem = shopProductItemMapper.selectById(shopProductItemId);
        assertPojoEquals(createReqVO, shopProductItem, "id");
    }

    @Test
    public void testUpdateShopProductItem_success() {
        // mock 数据
        ErpShopProductItemDO dbShopProductItem = randomPojo(ErpShopProductItemDO.class);
        shopProductItemMapper.insert(dbShopProductItem);// @Sql: 先插入出一条存在的数据
        // 准备参数
        ErpShopProductItemSaveReqVO updateReqVO = randomPojo(ErpShopProductItemSaveReqVO.class, o -> {
            o.setId(dbShopProductItem.getId()); // 设置更新的 ID
        });

        // 调用
        shopProductItemService.updateShopProductItem(updateReqVO);
        // 校验是否更新正确
        ErpShopProductItemDO shopProductItem = shopProductItemMapper.selectById(updateReqVO.getId()); // 获取最新的
        assertPojoEquals(updateReqVO, shopProductItem);
    }

    @Test
    public void testUpdateShopProductItem_notExists() {
        // 准备参数
        ErpShopProductItemSaveReqVO updateReqVO = randomPojo(ErpShopProductItemSaveReqVO.class);

        // 调用, 并断言异常
        assertServiceException(() -> shopProductItemService.updateShopProductItem(updateReqVO), SHOP_PRODUCT_ITEM_NOT_EXISTS);
    }

    @Test
    public void testDeleteShopProductItem_success() {
        // mock 数据
        ErpShopProductItemDO dbShopProductItem = randomPojo(ErpShopProductItemDO.class);
        shopProductItemMapper.insert(dbShopProductItem);// @Sql: 先插入出一条存在的数据
        // 准备参数
        Long id = dbShopProductItem.getId();

        // 调用
        shopProductItemService.deleteShopProductItem(id);
       // 校验数据不存在了
       assertNull(shopProductItemMapper.selectById(id));
    }

    @Test
    public void testDeleteShopProductItem_notExists() {
        // 准备参数
        Long id = randomLongId();

        // 调用, 并断言异常
        assertServiceException(() -> shopProductItemService.deleteShopProductItem(id), SHOP_PRODUCT_ITEM_NOT_EXISTS);
    }

    @Test
    @Disabled  // TODO 请修改 null 为需要的值，然后删除 @Disabled 注解
    public void testGetShopProductItemPage() {
       // mock 数据
       ErpShopProductItemDO dbShopProductItem = randomPojo(ErpShopProductItemDO.class, o -> { // 等会查询到
           o.setProductId(null);
           o.setRemark(null);
           o.setCreateTime(null);
       });
       shopProductItemMapper.insert(dbShopProductItem);
       // 测试 productId 不匹配
       shopProductItemMapper.insert(cloneIgnoreId(dbShopProductItem, o -> o.setProductId(null)));
       // 测试 remark 不匹配
       shopProductItemMapper.insert(cloneIgnoreId(dbShopProductItem, o -> o.setRemark(null)));
       // 测试 createTime 不匹配
       shopProductItemMapper.insert(cloneIgnoreId(dbShopProductItem, o -> o.setCreateTime(null)));
       // 准备参数
       ErpShopProductItemPageReqVO reqVO = new ErpShopProductItemPageReqVO();
       reqVO.setProductId(null);
       reqVO.setRemark(null);
       reqVO.setCreateTime(buildBetweenTime(2023, 2, 1, 2023, 2, 28));

       // 调用
       PageResult<ErpShopProductItemDO> pageResult = shopProductItemService.getShopProductItemPage(reqVO);
       // 断言
       assertEquals(1, pageResult.getTotal());
       assertEquals(1, pageResult.getList().size());
       assertPojoEquals(dbShopProductItem, pageResult.getList().get(0));
    }

}