package cn.iocoder.yudao.module.erp.service.product;

import cn.hutool.core.util.RandomUtil;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.test.core.ut.BaseDbUnitTest;
import cn.iocoder.yudao.module.erp.config.ErpIntegrationConfig;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.ErpProductPageReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.ErpProductRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.ErpProductSaveReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.json.GuidePriceJson;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.json.ImageUrlJson;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.tvstand.ErpProductTvStandSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.mysql.product.ErpProductMapper;
import cn.iocoder.yudao.module.infra.api.config.ConfigApi;
import cn.iocoder.yudao.module.infra.api.config.ConfigApiImpl;
import cn.iocoder.yudao.module.infra.api.file.FileApi;
import cn.iocoder.yudao.module.infra.api.file.FileApiImpl;
import cn.iocoder.yudao.module.system.api.dept.DeptApi;
import cn.iocoder.yudao.module.system.api.dept.DeptApiImpl;
import cn.iocoder.yudao.module.system.api.user.AdminUserApi;
import cn.iocoder.yudao.module.system.api.user.AdminUserApiImpl;
import cn.iocoder.yudao.module.system.service.dept.DeptServiceImpl;
import cn.iocoder.yudao.module.system.service.dept.PostServiceImpl;
import cn.iocoder.yudao.module.system.service.permission.PermissionService;
import cn.iocoder.yudao.module.system.service.permission.PermissionServiceImpl;
import cn.iocoder.yudao.module.system.service.permission.RoleServiceImpl;
import cn.iocoder.yudao.module.system.service.user.AdminUserServiceImpl;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @className: ErpProductServiceImplTest
 * @author: Wqh
 * @date: 2024/11/18 17:16
 * @Version: 1.0
 * @description:
 */
@Slf4j
@EnableIntegration
@Import({ErpProductServiceImpl.class,
        ErpProductCategoryServiceImpl.class,
        ErpProductUnitServiceImpl.class,
        DeptApiImpl.class,
        AdminUserApiImpl.class,
        AdminUserServiceImpl.class,
        MessageChannel.class,
        ApplicationContext.class,
        ErpIntegrationConfig.class,
        DeptServiceImpl.class,
        PostServiceImpl.class,
        PermissionServiceImpl.class,
        RoleServiceImpl.class,
        PasswordEncoder.class,
        FileApiImpl.class,
        ConfigApiImpl.class})
public class ErpProductServiceImplTest extends BaseDbUnitTest {
    @Resource
    private ErpProductServiceImpl productService;
    @Resource
    private ErpProductMapper productMapper;
    @Resource
    private ErpProductCategoryServiceImpl productCategoryService;
    @Resource
    private ErpProductUnitServiceImpl productUnitService;
    @Resource
    private DeptApi deptApi;
    @Resource
    private AdminUserApi userApi;
    @MockBean
    private PermissionService permissionService;
    @MockBean
    private PasswordEncoder passwordEncoder;
    @MockBean
    private FileApi fileApi;
    @MockBean
    private ConfigApi configApi;

    public static ErpProductSaveReqVO generateMock() {
        ErpProductSaveReqVO mock = new ErpProductSaveReqVO();

        mock.setId(731L); // 产品编号
        mock.setName("张三"); // 产品名称
        mock.setCategoryId(88L); // 产品分类编号
        mock.setDeptId(50005L); // 部门id
        mock.setBarCode(RandomUtil.randomNumbers(8)); // SKU（编码）
        mock.setUnitId(3L); // 单位编号
        mock.setMaterial("木材"); // 材料（中文）
        mock.setStatus(Boolean.TRUE); // 产品状态（1启用，0禁用）
        mock.setWeight(new BigDecimal("2.5")); // 基础重量（kg）
        mock.setSeries("A系列"); // 系列
        mock.setModel("型号2024"); // 型号
        mock.setSerial(1); // 流水号
        mock.setProductionNo("PRODUCTION001"); // 生产编号
        mock.setWidth(new BigDecimal("100")); // 基础宽度（mm）
        mock.setLength(new BigDecimal("200")); // 基础长度（mm）
        mock.setHeight(new BigDecimal("150")); // 基础高度（mm）

        // 图片URL列表
        List<ImageUrlJson> imageUrls = new ArrayList<>();
        ImageUrlJson imageUrl = new ImageUrlJson();
        imageUrl.setKey("左视图");
        imageUrl.setUrl("https://www.iocoder.cn/images/common/wechat_mp_2017_07_31_bak.jpg");
        imageUrls.add(imageUrl);
        mock.setImageUrl(imageUrls);

        // 指导价列表
        List<GuidePriceJson> guidePrices = new ArrayList<>();
        GuidePriceJson guidePrice = new GuidePriceJson();
        guidePrice.setKey("美国");
        guidePrice.setPrice(new BigDecimal("17"));
        guidePrices.add(guidePrice);
        mock.setGuidePrice(guidePrices);

        mock.setPatent("专利号2024123"); // 专利
        mock.setPoId(50004L); // PO产品经理id
        mock.setIdId(50004L); // ID工业设计id
        mock.setRdId(50004L); // RD研发工程师id
        mock.setMeId(50004L); // 维护工程师id
        mock.setRemark("随便"); // 备注
        mock.setColor("红色"); // 颜色

        var details = ErpProductTvStandSaveReqVO.builder()
            .shelfLoadCapacity("50")
            .build();
        mock.setAdditionalMap(details); // 额外字段
        return mock;
    }


    @Test
    public void testCreateProduct_success() {
        // 准备参数
        ErpProductSaveReqVO createReqVO = generateMock();
        createReqVO.setId(null);
        // 调用
        Long productId = productService.createProduct(createReqVO);
        log.debug("创建成功，productId：{}", productId);
    }

    @Test
    public void testUpdateProduct_success() {
        // 新增一条数据
        // 准备参数
        ErpProductSaveReqVO updateReqVO = generateMock();
        updateReqVO.setId(null);
        // 调用
        Long productId = productService.createProduct(updateReqVO);
        updateReqVO.setId(productId);
        updateReqVO.setRemark("更新成功的数据");
        // 调用
        productService.updateProduct(updateReqVO);
    }

    @Test
    public void testDeleteProduct_success() {
        // 新增一条数据
        ErpProductSaveReqVO updateReqVO = generateMock();
        updateReqVO.setId(null);
        // 调用
        Long id = productService.createProduct(updateReqVO);
        // 调用
        productService.deleteProduct(id);
    }

    @Test
    public void testPageProduct_success() {
        ErpProductPageReqVO erpProductPageReqVO = new ErpProductPageReqVO();
        PageResult<ErpProductRespVO> productVOPage = productService.getProductVOPage(erpProductPageReqVO);
        log.debug("查询成功，productVOPage：{}", productVOPage);
    }
}
