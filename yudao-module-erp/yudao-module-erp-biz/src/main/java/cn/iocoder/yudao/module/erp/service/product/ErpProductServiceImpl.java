package cn.iocoder.yudao.module.erp.service.product;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjUtil;
import cn.hutool.core.util.ReflectUtil;
import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.framework.common.exception.util.ThrowUtil;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.collection.MapUtils;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.ErpProductPageReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.ErpProductRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.ErpProductSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.supporting.TableAssociationInitialization;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductCategoryDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductUnitDO;
import cn.iocoder.yudao.module.erp.dal.mysql.logistic.customrule.ErpCustomRuleMapper;
import cn.iocoder.yudao.module.erp.dal.mysql.product.ErpProductMapper;
import cn.iocoder.yudao.module.erp.service.supporting.MyBatisDOService;
import cn.iocoder.yudao.module.system.api.dept.DeptApi;
import cn.iocoder.yudao.module.system.api.user.AdminUserApi;
import jakarta.annotation.Resource;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;
import static cn.iocoder.yudao.framework.common.exception.enums.GlobalErrorCodeConstants.*;
import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.*;
import static cn.iocoder.yudao.module.erp.enums.ErrorCodeConstants.*;
import static cn.iocoder.yudao.module.erp.service.supporting.MyBatisDOService.PRODUCT_ADDITIONAL_ID;
import static cn.iocoder.yudao.module.erp.service.supporting.MyBatisDOService.PRODUCT_ID;
import static cn.iocoder.yudao.module.system.enums.ErrorCodeConstants.USER_NOT_EXISTS;

/**
 * ERP 产品 Service 实现类
 *
 * @author 芋道源码
 */
@Service
@Validated
@RequiredArgsConstructor
public class ErpProductServiceImpl implements ErpProductService {
    @Resource
    MessageChannel erpProductChannel;
    private final ErpProductMapper productMapper;
    private final ErpProductCategoryService productCategoryService;
    private final ErpProductUnitService productUnitService;
    private final DeptApi deptApi;
    private final ErpCustomRuleMapper customRuleMapper;
    private static final ReentrantLock LOCK = new ReentrantLock();
    private final MyBatisDOService myBatisDOService;
    private final AdminUserApi userApi;




    @Override
    @Transactional(rollbackFor = Exception.class)
    public Long createProduct(ErpProductSaveReqVO createReqVO) {
        //TODO 暂时编号不是系统自动生成，后续添加生成规则，流水号的递增由编号来判断，编号相同流水号便自增
        //获取编码
        String barCode = createReqVO.getBarCode();
        //校验是否存在相同的产品编码
        Boolean codeUnique = validateProductCodeUnique(null, barCode);
        //如果产品的编码已经存在
        if (codeUnique){
            //获取递增后流水号
            Integer serial = increaseSerial(barCode);
            createReqVO.setSerial(serial);
        }
        //校验部门id的合法性
        validateDept(createReqVO.getDeptId());
        //获取分类id
        Long categoryId = createReqVO.getCategoryId();
        //校验产品分类是否存在
        validateProductCategory(categoryId);
        //校验人员id是否存在
        validatePerson(createReqVO.getPoId(), createReqVO.getIdId(), createReqVO.getRdId(), createReqVO.getMeId());
        // 处理额外字段
        Object additionalDO = handleAdditionalFields(createReqVO, categoryId);
        // 插入产品
        ErpProductDO product = BeanUtils.toBean(createReqVO, ErpProductDO.class);
        //将图片的实体和指导价的实体转为json字符串
        product.setImageUrl(JSONUtil.toJsonStr(createReqVO.getImageUrl()));
        product.setGuidePrice(JSONUtil.toJsonStr(createReqVO.getGuidePrice()));
        ThrowUtil.ifSqlThrow(productMapper.insert(product),DB_INSERT_ERROR);
        //获取产品id
        Long productId = product.getId();
        if (additionalDO != null){
            // 利用反射将productId设置到additionalDO中
            setProductIdInAdditionalDO(additionalDO, productId);
            // 插入额外的数据
            myBatisDOService.insertAdditionalData(additionalDO);
        }
        // 返回
        return productId;
    }




    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateProduct(ErpProductSaveReqVO updateReqVO) {
        Long id = updateReqVO.getId();
        // 校验存在
        validateProductExists(id);
        String barCode = updateReqVO.getBarCode();
        //校验不同的id下是否存在相同的产品编码
        Boolean codeUnique = validateProductCodeUnique(updateReqVO.getId(), updateReqVO.getBarCode());
        //如果产品的编码已经存在
        if (codeUnique){
            //获取递增后流水号
            Integer serial = increaseSerial(barCode);
            updateReqVO.setSerial(serial);
        }
        //校验部门有效性
        this.validateDept(updateReqVO.getDeptId());
        //获取分类id
        //TODO 分类被切换问题（暂不支持切换分类，前端暂时限定）
        Long categoryId = updateReqVO.getCategoryId();
        //校验产品分类是否存在
        validateProductCategory(categoryId);
        //校验人员id是否存在
        validatePerson(updateReqVO.getPoId(), updateReqVO.getIdId(), updateReqVO.getRdId(), updateReqVO.getMeId());
        // 处理额外字段
        Object additionalDO = handleAdditionalFields(updateReqVO, categoryId);
        // 更新
        ErpProductDO updateObj = BeanUtils.toBean(updateReqVO, ErpProductDO.class);
        //将图片的实体和指导价的实体转为json字符串
        updateObj.setImageUrl(JSONUtil.toJsonStr(updateReqVO.getImageUrl()));
        updateObj.setGuidePrice(JSONUtil.toJsonStr(updateReqVO.getGuidePrice()));
        ThrowUtil.ifSqlThrow(productMapper.updateById(updateObj),DB_UPDATE_ERROR);
        if (additionalDO != null) {
            // 利用反射获取additionalDO的id
            Long additionalId = getAdditionalId(additionalDO);
            // 校验additionalId的存在
            ThrowUtil.ifEmptyThrow(additionalId, AUX_INFO_ID_NOT_EXISTS);
            // 利用反射将productId设置到additionalDO中
            setProductIdInAdditionalDO(additionalDO, id);
            // 更新额外的数据
            myBatisDOService.updateAdditionalData(additionalDO);
        }
        //同步数据
        var dtos = customRuleMapper.selectProductAllInfoListByCustomRuleId(id);
        erpProductChannel.send(MessageBuilder.withPayload(dtos).build());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteProduct(Long id) {
        // 校验存在
        ErpProductDO erpProductDO = validateProductExists(id);
        // 获取分类ID
        Long categoryId = erpProductDO.getCategoryId();
        // 删除额外数据
        myBatisDOService.deleteAdditionalData(categoryId, id);
        // 删除产品
        productMapper.deleteById(id);
    }


    @Override
    public ErpProductRespVO getProduct(Long id) {
        // 校验存在
        ErpProductDO erpProductDO = validateProductExists(id);
        // 获取分类ID
        Long categoryId = erpProductDO.getCategoryId();
        // 获取额外数据
        Object additionalData = myBatisDOService.getAdditionalData(categoryId, id);
        // 构建响应对象
        ErpProductRespVO productRespVO = BeanUtils.toBean(erpProductDO, ErpProductRespVO.class);
        productRespVO.setAdditional(additionalData);
        return productRespVO;
    }

    @Override
    public List<ErpProductRespVO> getProductVOListByStatus(Integer status) {
        List<ErpProductDO> list = productMapper.selectListByStatus(status);
        return buildProductVOList(list);
    }

    @Override
    public List<ErpProductRespVO> getProductVOList(Collection<Long> ids) {
        if (CollUtil.isEmpty(ids)) {
            return Collections.emptyList();
        }
        List<ErpProductDO> list = productMapper.selectBatchIds(ids);
        return buildProductVOList(list);
    }

    @Override
    public PageResult<ErpProductRespVO> getProductVOPage(ErpProductPageReqVO pageReqVO) {
        PageResult<ErpProductDO> pageResult = productMapper.selectPage(pageReqVO);
        return new PageResult<>(buildProductVOList(pageResult.getList()), pageResult.getTotal());
    }

    @Override
    public List<ErpProductDO> validProductList(Collection<Long> ids) {
        if (CollUtil.isEmpty(ids)) {
            return Collections.emptyList();
        }
        List<ErpProductDO> list = productMapper.selectBatchIds(ids);
        Map<Long, ErpProductDO> productMap = convertMap(list, ErpProductDO::getId);
        for (Long id : ids) {
            ErpProductDO product = productMap.get(id);
            if (productMap.get(id) == null) {
                throw exception(PRODUCT_NOT_EXISTS);
            }
            if (!product.getStatus()) {
                throw exception(PRODUCT_NOT_ENABLE, product.getName());
            }
        }
        return list;
    }
    private Long getAdditionalId(Object additionalDO) {
        Class<?> additionalType = additionalDO.getClass();
        Field additionalIdField = ReflectUtil.getField(additionalType, PRODUCT_ADDITIONAL_ID);
        return (Long) ReflectUtil.getFieldValue(additionalDO, additionalIdField);
    }

    private Object handleAdditionalFields(ErpProductSaveReqVO reqVO, Long categoryId) {
        // 获取额外的字段
        Map<String, Object> additionalMap = reqVO.getAdditionalMap();
        if (additionalMap == null) {
            return null;
        }

        // map中获取表名
        String tableName = TableAssociationInitialization.getTableMap().get(categoryId);
        Class<?> additionalType = myBatisDOService.getEntityClassByTableName(tableName);
        // 拷贝属性
        Object additionalDO = BeanUtil.copyProperties(additionalMap, additionalType);
        // 校验实体是否符合
        validateDO(additionalDO);

        return additionalDO;
    }

    private void setProductIdInAdditionalDO(Object additionalDO, Long productId) {
        Class<?> additionalType = additionalDO.getClass();
        Field productIdField = ReflectUtil.getField(additionalType, PRODUCT_ID);
        ReflectUtil.setFieldValue(additionalDO, productIdField, productId);
    }


    private ErpProductDO validateProductExists(Long id) {
        ErpProductDO erpProductDO = productMapper.selectById(id);
        ThrowUtil.ifEmptyThrow(erpProductDO,PRODUCT_NOT_EXISTS);
        return erpProductDO;
    }

    private Boolean validateProductCodeUnique(Long id, String code) {
        List<ErpProductDO> products = productMapper.selectByCode(code);
        if (CollUtil.isEmpty(products)){
            return false;
        }
        // 如果 id 为空，说明不用比较是否为相同 id 的产品
        if (id == null){
            return true;
        }
        return !products.stream().map(ErpProductDO::getId).toList().contains(id);
    }

    private List<ErpProductRespVO> buildProductVOList(List<ErpProductDO> list) {
        if (CollUtil.isEmpty(list)) {
            return Collections.emptyList();
        }
        Map<Long, ErpProductCategoryDO> categoryMap = productCategoryService.getProductCategoryMap(
                convertSet(list, ErpProductDO::getCategoryId));
        Map<Long, ErpProductUnitDO> unitMap = productUnitService.getProductUnitMap(
                convertSet(list, ErpProductDO::getUnitId));
        return BeanUtils.toBean(list, ErpProductRespVO.class, product -> {
            MapUtils.findAndThen(categoryMap, product.getCategoryId(),
                    category -> product.setCategoryName(category.getName()));
            MapUtils.findAndThen(unitMap, product.getUnitId(),
                    unit -> product.setUnitName(unit.getName()));
        });
    }

    @Override
    public Long getProductCountByCategoryId(Long categoryId) {
        return productMapper.selectCountByCategoryId(categoryId);
    }

    @Override
    public Long getProductCountByUnitId(Long unitId) {
        return productMapper.selectCountByUnitId(unitId);
    }
    /**
     * @Author Wqh
     * @Description 根据编码查询出最大的流水号
     * @Date 10:06 2024/10/22
     * @Param [barCode]
     * @return java.lang.Integer
     **/
    private Integer increaseSerial(String barCode) {
        try {
            LOCK.lock();
            Integer serial = productMapper.selectMaxSerialByBarCode(barCode);
            return ++serial;
        } finally {
            LOCK.unlock();
        }
    }

    /**
     * @Author Wqh
     * @Description 手动校验实体是否合法
     * @Date 15:29 2024/11/15
     * @Param [object]
     **/
    private void validateDO(Object object) {
        try (ValidatorFactory factory = Validation.buildDefaultValidatorFactory()) {
            //工厂获取校验器
            Validator validator = factory.getValidator();
            Set<ConstraintViolation<Object>> violations = validator.validate(object);
            Optional<ConstraintViolation<Object>> first = violations.stream().findFirst();
            boolean present = first.isPresent();
            ThrowUtil.ifThrow(present, BAD_PARAMETER, present ? first.get().getMessage() : null);
        }
    }

    /**
     * @Author Wqh
     * @Description 校验传入的分类是否存在
     * @Date 17:15 2024/11/15
     * @Param [categoryId]
     * @return void
     **/
    private void validateProductCategory(Long categoryId) {
        ErpProductCategoryDO productCategory = productCategoryService.getProductCategory(categoryId);
        ThrowUtil.ifEmptyThrow(productCategory,PRODUCT_CATEGORY_NOT_EXISTS);
    }

    /**
     * @Author Wqh
     * @Description 校验部门的合法性
    {当前只允许二级部门和三级部门上传}
     * @Date 14:51 2024/10/30
     * @Param [deptId]
     **/
    private void validateDept(Long deptId) {
        List<Integer> levels = Arrays.asList(2, 3);
        //获取部门等级
        Integer level = deptApi.getDeptLevel(deptId);
        //判断登记是否符合要求
        ThrowUtil.ifThrow(!levels.contains(level), DEPT_LEVEL_NOT_MATCH);
    }

    /**
    * @Author Wqh
    * @Description 产品相关人员id在系统中是否能查到
    * @Date 9:18 2024/11/18
    * @Param [userIds]
    **/
    private void validatePerson(Long ... userIds) {
        ThrowUtil.ifThrow(Arrays.stream(userIds)
                .filter(Objects::nonNull)
                .anyMatch(userId -> ObjUtil
                        .isEmpty(userApi.getUser(userId))), USER_NOT_EXISTS);
    }
}