package com.somle.esb.handler;

import cn.hutool.core.util.ObjUtil;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.framework.common.util.object.ObjectUtils;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpCustomRuleDTO;
import cn.iocoder.yudao.module.erp.controller.admin.purchase.vo.ErpSupplierProductPageReqVO;
import cn.iocoder.yudao.module.erp.service.purchase.ErpSupplierProductService;
import com.somle.eccang.model.EccangProduct;
import com.somle.eccang.service.EccangService;
import com.somle.esb.converter.ErpToEccangConverter;
import com.somle.esb.converter.ErpToKingdeeConverter;
import com.somle.esb.util.ConstantConvertUtils;
import com.somle.kingdee.model.KingdeeProduct;
import com.somle.kingdee.service.KingdeeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Description: $
 * @Author: c-tao
 * @Date: 2025/1/13$
 */
@Slf4j
@Component
public class ErpCustomRuleHandler {

    @Autowired
    KingdeeService kingdeeService;

    @Autowired
    EccangService eccangService;

    @Autowired
    ErpSupplierProductService erpSupplierProductService;
    @Autowired
    ErpToEccangConverter erpToEccangConverter;

    @Autowired
    ErpToKingdeeConverter erpToKingdeeConverter;

    /**
     * @return void
     * @Author Wqh
     * @Description 上传eccang产品信息
     * @Date 11:18 2024/11/5
     * @Param [message]
     **/
    @ServiceActivator(inputChannel = "erpCustomRuleChannel")
    public void syncCustomRulesToEccang(@Payload List<ErpCustomRuleDTO> customRules) {
        log.info("syncCustomRuleToEccang");
        List<EccangProduct> eccangProducts = erpToEccangConverter.customRuleDTOToProduct(customRules);
        for (EccangProduct eccangProduct : eccangProducts) {
            eccangProduct.setActionType("ADD");
            EccangProduct eccangServiceProduct = eccangService.getProduct(eccangProduct.getProductSku());
            //根据sku从eccang中获取产品，如果产品不为空，则表示已存在，操作则变为修改
            if (ObjUtil.isNotEmpty(eccangServiceProduct)) {
                eccangProduct.setActionType("EDIT");
                //如果是修改就要上传默认采购单价
                //TODO 后续有变更，请修改
                eccangProduct.setProductPurchaseValue(0.001F);
            }
            log.debug(eccangProduct.toString());
            //用product_id在供应商产品里面查，使用查到的第一个价格
            // 1. 设置默认值
            eccangProduct.setCurrencyCode(
                ObjectUtils.defaultIfNull(eccangProduct.getCurrencyCode(), "1") // 默认 CNY
            );
            eccangProduct.setProductPrice(
                ObjectUtils.defaultIfNull(eccangProduct.getProductPrice(), 0f) // 默认价格为 0.0
            );

            // 2. 获取产品并处理价格
            erpSupplierProductService.getSupplierProductPage(
                    new ErpSupplierProductPageReqVO().setProductId(Long.valueOf(eccangProduct.getDesc()))
                )
                .getList().stream()
                .findFirst()
                .ifPresent(erpSupplierProductDO -> {
                    // 设置货币单位
                    Optional.ofNullable(erpSupplierProductDO.getPurchasePriceCurrencyCode())
                        .map(String::valueOf) // 将 Integer 转换为字符串
                        .filter(StringUtils::isNotBlank)
                        .ifPresent(eccangProduct::setCurrencyCode);

                    // 设置价格，并确保价格为 BigDecimal 类型，避免转换不一致
                    Optional.ofNullable(erpSupplierProductDO.getPurchasePrice())
                        .map(BigDecimal::valueOf)
                        .map(price -> price.setScale(2, RoundingMode.HALF_UP).floatValue())
                        .ifPresent(eccangProduct::setProductPrice);
                });
        }
        List<EccangProduct> products = addOriginalProducts(eccangProducts);
        eccangService.addBatchProduct(products);
        log.info("syncCustomRuleToEccang end ,sku={{}}", products.stream().map(EccangProduct::getProductSku).toList());
    }

    /**
     * @return void
     * @Author Wqh
     * @Description 上传金蝶产品信息
     * @Date 11:18 2024/11/5
     * @Param [message]
     **/
    @ServiceActivator(inputChannel = "erpCustomRuleChannel")
    public void syncCustomRulesToKingdee(@Payload List<ErpCustomRuleDTO> customRules) {
        log.info("syncCustomRuleToKingdee");
        List<KingdeeProduct> kingdee = erpToKingdeeConverter.customRuleDTOToProduct(customRules);
        List<KingdeeProduct> kingdeeProducts = addOriginalKingdeeProducts(kingdee);
        for (KingdeeProduct kingdeeProduct : kingdeeProducts) {
            kingdeeService.addProduct(kingdeeProduct);
        }
        log.info("syncCustomRuleToKingdee end,skus={{}}}", kingdeeProducts.stream().map(KingdeeProduct::getNumber).toList());
    }

    /**
     * 添加默认产品（无国别），在CN中触发。
     * <p>
     * 如果集合 EccangProduct 中 productSku 后缀是 "-CHN"，那么在集合中添加去掉后缀的产品。
     *
     * @param eccangProducts 产品集合
     * @return 合并后的产品集合
     */
    private List<EccangProduct> addOriginalProducts(List<EccangProduct> eccangProducts) {
        String suffix = "-" + ConstantConvertUtils.getCountrySuffix("CN");
        List<EccangProduct> additionalProducts = eccangProducts.parallelStream()
            .filter(eccangProduct ->
                StringUtils.isNotBlank(eccangProduct.getProductSku()) &&
                    eccangProduct.getProductSku().endsWith(suffix)
            )
            .map(eccangProduct -> {
                EccangProduct bean = BeanUtils.toBean(eccangProduct, EccangProduct.class);
                bean.setProductSku(ConstantConvertUtils.removeSuffix(eccangProduct.getProductSku(), suffix));
                bean.setProductTitle(ConstantConvertUtils.removeSuffix(eccangProduct.getProductTitle(), suffix));
                bean.setProductTitleEn(ConstantConvertUtils.removeSuffix(eccangProduct.getProductTitleEn(), suffix));
                bean.setParentProductId(null);//1、如果产品有父级，则父级为空
                return bean;
            })
            .toList();
        // 合并原集合与新增集合。多线程安全
        CopyOnWriteArrayList<EccangProduct> mergedList = new CopyOnWriteArrayList<>(eccangProducts);
        mergedList.addAll(additionalProducts);
        return mergedList;
    }

    /**
     * 添加默认产品（无后缀），在集合 KingdeeProduct 中处理。
     * 如果集合中 productSku 后缀是 "-CHN"，那么在集合中添加去掉后缀的产品。
     *
     * @param kingdeeProducts 产品集合
     * @return 合并后的产品集合
     */
    private List<KingdeeProduct> addOriginalKingdeeProducts(List<KingdeeProduct> kingdeeProducts) {
        String suffix = "-" + ConstantConvertUtils.getCountrySuffix("CN");
        List<KingdeeProduct> additionalProducts = kingdeeProducts.parallelStream()
            .filter(kingdeeProduct ->
                StringUtils.isNotBlank(kingdeeProduct.getNumber()) &&
                    kingdeeProduct.getNumber().endsWith(suffix)
            )
            .map(kingdeeProduct -> {
                KingdeeProduct bean = BeanUtils.toBean(kingdeeProduct, KingdeeProduct.class);
                bean.setNumber(ConstantConvertUtils.removeSuffix(kingdeeProduct.getNumber(), suffix));
                bean.setName(ConstantConvertUtils.removeSuffix(kingdeeProduct.getName(), suffix));
                bean.setParentId(null); // 清除上级物品编号
                return bean;
            })
            .toList();
        // 合并原集合与新增集合，多线程安全
        CopyOnWriteArrayList<KingdeeProduct> mergedList = new CopyOnWriteArrayList<>(kingdeeProducts);
        mergedList.addAll(additionalProducts);
        return mergedList;
    }

}
