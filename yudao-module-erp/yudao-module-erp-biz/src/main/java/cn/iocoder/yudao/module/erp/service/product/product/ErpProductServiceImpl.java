package cn.iocoder.yudao.module.erp.service.product.product;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.ObjUtil;
import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.framework.common.enums.CommonStatusEnum;
import cn.iocoder.yudao.framework.common.exception.util.ThrowUtil;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import cn.iocoder.yudao.framework.common.util.collection.MapUtils;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.category.ErpProductCategoryFieldRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.category.ErpProductCategoryRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.ErpProductPageReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.ErpProductRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.ErpProductSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductCategoryDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductUnitDO;
import cn.iocoder.yudao.module.erp.dal.mysql.product.ErpProductMapper;
import cn.iocoder.yudao.module.erp.service.product.unit.ErpProductUnitService;
import cn.iocoder.yudao.module.erp.service.product.category.ErpProductCategoryService;
import cn.iocoder.yudao.module.system.api.value.SystemValueApi;
import cn.iocoder.yudao.module.system.api.value.dto.SystemValueDTO;
import cn.iocoder.yudao.module.system.api.value.vo.SystemValueSaveReqVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

import static cn.iocoder.yudao.framework.common.exception.enums.GlobalErrorCodeConstants.*;
import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.*;
import static cn.iocoder.yudao.module.erp.enums.ErrorCodeConstants.*;

/**
 * ERP 产品 Service 实现类
 *
 * @author 芋道源码
 */
@Service
@Validated
public class ErpProductServiceImpl implements ErpProductService {

    @Resource
    private ErpProductMapper productMapper;

    @Resource
    private ErpProductCategoryService productCategoryService;
    @Resource
    private ErpProductUnitService productUnitService;

    @Resource
    private SystemValueApi systemValueApi;

    private static final String TABLE_NAME = "erp_product";

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
        //字段必填校验以及数据类类型的合法性校验
        validateFieldAndValue(createReqVO.getCategoryId(),createReqVO.getValues());
        // 插入
        ErpProductDO product = BeanUtils.toBean(createReqVO, ErpProductDO.class);
        //将图片的实体和指导价的实体转为json字符串
        product.setImageUrl(JSONUtil.toJsonStr(createReqVO.getImageUrl()));
        product.setGuidePrice(JSONUtil.toJsonStr(createReqVO.getGuidePrice()));
        ThrowUtil.ifSqlThrow(productMapper.insert(product),DB_INSERT_ERROR);
        Long productId = product.getId();
        //将自定义字段进行保存
        ThrowUtil.ifThrow(systemValueApi.createValue(createReqVO.getValues(),productId,TABLE_NAME),DB_INSERT_ERROR);
        // 返回
        return productId;
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateProduct(ErpProductSaveReqVO updateReqVO) {
        String barCode = updateReqVO.getBarCode();
        //校验不同的id下是否存在相同的产品编码
        Boolean codeUnique = validateProductCodeUnique(updateReqVO.getId(), updateReqVO.getBarCode());
        //如果产品的编码已经存在
        if (codeUnique){
            //获取递增后流水号
            Integer serial = increaseSerial(barCode);
            updateReqVO.setSerial(serial);
        }
        // 校验存在
        validateProductExists(updateReqVO.getId());
        //字段必填校验以及数据类类型的合法性校验
        validateFieldAndValue(updateReqVO.getCategoryId(),updateReqVO.getValues());
        // 更新
        ErpProductDO updateObj = BeanUtils.toBean(updateReqVO, ErpProductDO.class);
        //将图片的实体和指导价的实体转为json字符串
        updateObj.setImageUrl(JSONUtil.toJsonStr(updateReqVO.getImageUrl()));
        updateObj.setGuidePrice(JSONUtil.toJsonStr(updateReqVO.getGuidePrice()));
        ThrowUtil.ifSqlThrow(productMapper.updateById(updateObj),DB_UPDATE_ERROR);
        //校验自定义字段值的存在性
        ThrowUtil.ifThrow(systemValueApi.validateValuesExists(convertList(updateReqVO.getValues(), SystemValueSaveReqVO::getId)),PRODUCT_VALUE_ID_NOT_EXISTS);
        //修改属性值表中的数据
        ThrowUtil.ifThrow(systemValueApi.updateValue(updateReqVO.getValues(),updateReqVO.getId(),TABLE_NAME),DB_UPDATE_ERROR);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteProduct(Long id) {
        // 校验存在
        validateProductExists(id);
        // 删除
        ThrowUtil.ifSqlThrow(productMapper.deleteById(id),DB_DELETE_ERROR);
        //删除属性值表中的数据
        List<Long> valueIds = systemValueApi.selectValueIdsByClassIdAndTableName(id, TABLE_NAME);
        if (valueIds != null){
            //删除
            ThrowUtil.ifSqlThrow(systemValueApi.deleteValueBatch(valueIds),DB_DELETE_ERROR);
        }
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
            /*if (CommonStatusEnum.isDisable(product.getStatus())) {
                throw exception(PRODUCT_NOT_ENABLE, product.getName());
            }*/
        }
        return list;
    }

    private void validateFieldAndValue(Long categoryId, List<SystemValueSaveReqVO> values) {
        //获取分类中的自定义字段信息
        ErpProductCategoryRespVO productCategory = productCategoryService.getProductCategory(categoryId);
        List<ErpProductCategoryFieldRespVO> fields = productCategory.getFields();
        if (CollUtil.isNotEmpty(fields)){
            //如果该分类存在自定义字段
            //1.1判断是否传入自定义字段值
            //1.2如果传入的自定义字段是null或者size=0，抛出异常
            ThrowUtil.ifThrow(CollUtil.isEmpty(values), PRODUCT_VALUE_NOT_NULL);
            //1.3比较两个集合中filedId是否完全相同
            ThrowUtil.ifThrow(!compare(convertList(fields, ErpProductCategoryFieldRespVO::getFieldId),
                    convertList(values, SystemValueSaveReqVO::getFieldId)),PRODUCT_VALUE_NOT_EXISTS);
            //1.4判断必填字段是否没有正确填写以及数据类型是否正确
            for (ErpProductCategoryFieldRespVO field : fields){
                for (SystemValueSaveReqVO value : values){
                    if (ObjUtil.equals(field.getFieldId(),value.getFieldId())){
                        //判断是否为必填字段
                        ThrowUtil.ifThrow(field.getRequire() && ObjUtil.isEmpty(value.getValue()),PRODUCT_VALUE_NOT_NULL2,field.getAttribute());
                        //判断数据类型是否正确
                        ThrowUtil.ifThrow(!isTypeValid(field.getType(),value.getValue()),PRODUCT_VALUE_TYPE_ERROR,field.getAttribute());
                    }
                }
            }
        }
    }

    private boolean isTypeValid(Integer type, Object value) {
        return switch (type) {
            case 3 -> value instanceof String;
            case 1 -> value instanceof Integer;
            case 5 -> isDateTimeValid((String) value);
            case 4 -> isDecimalValid((String) value);
            default -> false;
        };
    }
    private boolean isDateTimeValid(String value) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DatePattern.NORM_DATE_PATTERN);
            LocalDateTime.parse(value, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    private boolean isDecimalValid(String value) {
        try {
            new BigDecimal(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private Integer increaseSerial(String barCode) {
        //根据编码查询出最大的流水号
        Integer serial = productMapper.selectMaxSerialByBarCode(barCode);
        return ++serial;
    }



    private void validateProductExists(Long id) {
        if (productMapper.selectById(id) == null) {
            throw exception(PRODUCT_NOT_EXISTS);
        }
    }

    private Boolean validateProductCodeUnique(Long id, String code) {
        ErpProductDO product = productMapper.selectByCode(code);
        if (ObjUtil.isEmpty(product)){
            return false;
        }
        // 如果 id 为空，说明不用比较是否为相同 id 的产品
        if (id == null){
            return true;
        }
        return !product.getId().equals(id);
    }

    @Override
    public ErpProductRespVO getProduct(Long id) {
        ErpProductDO erpProductDO = productMapper.selectById(id);
        //根据类id和表名查询出属性值
        List<SystemValueDTO> systemValueDtos = systemValueApi.selectValueByClassIdAndTableName(id, TABLE_NAME);
        //拷贝
        ErpProductRespVO erpProductRespVO = BeanUtils.toBean(erpProductDO, ErpProductRespVO.class);
        //封装属性值
        erpProductRespVO.setValues(systemValueDtos);
        return erpProductRespVO;
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

}