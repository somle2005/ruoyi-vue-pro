package com.somle.esb.converter;

import cn.hutool.core.text.CharSequenceUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDTO;
import cn.iocoder.yudao.module.srm.api.supplier.dto.SrmSupplierDTO;
import cn.iocoder.yudao.module.system.api.dept.DeptApi;
import cn.iocoder.yudao.module.system.api.dept.dto.DeptRespDTO;
import cn.iocoder.yudao.module.system.api.dict.DictDataApi;
import cn.iocoder.yudao.module.system.api.dict.dto.DictDataRespDTO;
import cn.iocoder.yudao.module.tms.api.logistic.customrule.dto.TmsCustomRuleDTO;
import cn.iocoder.yudao.module.tms.enums.TmsDictTypeConstants;
import com.somle.kingdee.model.KingdeeAuxInfoDetail;
import com.somle.kingdee.model.KingdeeProductSaveReqVO;
import com.somle.kingdee.model.supplier.KingdeeSupplierSaveVO;
import com.somle.kingdee.model.supplier.SupplierBomentity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static cn.iocoder.yudao.framework.common.util.number.LengthUtils.mmToCmAsFloat;
import static com.somle.esb.util.ConstantConvertUtils.getCountrySuffix;
import static com.somle.esb.util.EsbTimeUtils.getUtc8Now;

/**
 * 动态转换组件，根据第三方系统返回的数据，转换为XX格式。
 */
@Slf4j
@Service
public class ErpToKingdeeConverter {

    @Autowired
    private DeptApi deptApi;
    @Autowired
    private DictDataApi dictDataApi;


    /**
     * 将ERP产品列表转换为完整的Kingdee产品列表。
     *
     * @param customRuleDTOs ERP产品列表
     * @return 转换后的Kingdee产品列表
     */
    public List<KingdeeProductSaveReqVO> convert(List<TmsCustomRuleDTO> customRuleDTOs) {
        log.debug("Converting ERP products to full Kingdee products");
        return customRuleDTOs.stream()
            .map(this::convert)
            .collect(Collectors.toList());
    }

    /**
     * 将ERP产品列表转换为简化的Kingdee产品列表。
     *
     * @param productDTOs ERP产品列表
     * @return 转换后的简化版Kingdee产品列表
     */
    public List<KingdeeProductSaveReqVO> toKingdeeProducts(List<ErpProductDTO> productDTOs) {
        log.debug("Converting ERP products to simple Kingdee products");
        return productDTOs.stream()
            .map(this::toKingdeeProduct)
            .collect(Collectors.toList());
    }

    /**
     * 将单个ERP产品转换为Kingdee产品。
     *
     * @param customRuleDTO ERP产品对象
     * @return 转换后的Kingdee产品对象
     */
    private KingdeeProductSaveReqVO convert(TmsCustomRuleDTO customRuleDTO) {
        ErpProductDTO productDTO = customRuleDTO.getProductDTO();
        KingdeeProductSaveReqVO reqVO = new KingdeeProductSaveReqVO();
        //普通
        reqVO.setCheckType("1");
        // 获取国家编码
        Integer countryCode = customRuleDTO.getCountryCode();
        // 获取产品名称
        String productName = productDTO.getName();
        // 获取产品条码
        String productCode = productDTO.getCode();
        // 如果国家编码不为空，且产品条码不为空，设置SKU
        if (ObjectUtil.isNotEmpty(countryCode)) {
            DictDataRespDTO dictData = dictDataApi.getDictData(TmsDictTypeConstants.COUNTRY_CODE, String.valueOf(countryCode));
            if (CharSequenceUtil.isNotBlank(productCode)) {
                String countrySuffix = getCountrySuffix(dictData.getLabel());
                reqVO.setNumber(productCode + "-" + countrySuffix);
                reqVO.setName(productName + "-" + countrySuffix);
            }
        }
        // 如果国家编码为空，且产品名称不为空，设置SKU
        else if (ObjectUtil.isNotEmpty(productName) && ObjectUtil.isNotEmpty(productCode)) {
            reqVO.setNumber(productCode);
            reqVO.setName(productName);
        }
        reqVO.setBarcode(productDTO.getCode());
        // 报关品名
        reqVO.setProducingPace(customRuleDTO.getDeclaredType());
        reqVO.setDeclaredTypeEn(customRuleDTO.getDeclaredTypeEn());
        // HS编码
        reqVO.setHelpCode(customRuleDTO.getHscode());
        reqVO.setCostMethod("2");
        //给金蝶-包装属性
        reqVO.setGrossWeight(String.valueOf(productDTO.getPackageWeight()));
        //给金蝶-净重
        reqVO.setNetWeight(String.valueOf(productDTO.getWeight()));
        Float pdNetLength = mmToCmAsFloat(productDTO.getPackageLength());
        Float pdNetWidth = mmToCmAsFloat(productDTO.getPackageWidth());
        Float pdNetHeight = mmToCmAsFloat(productDTO.getPackageHeight());
        reqVO.setLength(String.valueOf(pdNetLength));
        reqVO.setWide(String.valueOf(pdNetWidth));
        reqVO.setHigh(String.valueOf(pdNetHeight));

        if (pdNetLength != null && pdNetWidth != null && pdNetHeight != null) {
            reqVO.setVolume(String.valueOf(pdNetLength * pdNetWidth * pdNetHeight));
        }
        //部门id，映射到金蝶自定义字段中
        //在金蝶中辅助资料对应的就是erp中的部门，非树形结构，在辅助资料中，由一个辅助分类是部门/报关品名（部门公司）
        reqVO.setSaleDepartmentId(productDTO.getDeptId());
        reqVO.setDeclaredTypeZh(customRuleDTO.getDeclaredType());
        //将报关规则的id存到这里面去
        reqVO.setMaxInventoryQty(String.valueOf(customRuleDTO.getId()));
        return reqVO;
    }


    /**
     * 将单个ERP产品转换为Kingdee产品。
     *
     * @param productDTO ERP产品对象
     * @return 转换后的Kingdee产品对象
     */
    private KingdeeProductSaveReqVO toKingdeeProduct(ErpProductDTO productDTO) {
        KingdeeProductSaveReqVO reqVO = new KingdeeProductSaveReqVO();
        //普通
        reqVO.setCheckType("1");
        reqVO.setNumber(productDTO.getCode());
        reqVO.setName(productDTO.getName());
        reqVO.setBarcode(productDTO.getCode());
        reqVO.setCostMethod("2");

        reqVO.setGrossWeight(String.valueOf(productDTO.getPackageWeight()));
        //给金蝶-净重
        reqVO.setNetWeight(String.valueOf(productDTO.getWeight()));
        Float pdNetLength = mmToCmAsFloat(productDTO.getPackageLength());
        Float pdNetWidth = mmToCmAsFloat(productDTO.getPackageWidth());
        Float pdNetHeight = mmToCmAsFloat(productDTO.getPackageHeight());
        reqVO.setLength(String.valueOf(pdNetLength));
        reqVO.setWide(String.valueOf(pdNetWidth));
        reqVO.setHigh(String.valueOf(pdNetHeight));
        //部门id，映射到金蝶自定义字段中
        //在金蝶中辅助资料对应的就是erp中的部门，非树形结构，在辅助资料中，由一个辅助分类是部门/报关品名（部门公司）
        reqVO.setSaleDepartmentId(productDTO.getDeptId());
        return reqVO;
    }


    public KingdeeSupplierSaveVO toKingdee(SrmSupplierDTO erpSupplierDTO) {
        KingdeeSupplierSaveVO kingdeeSupplierSaveVO = new KingdeeSupplierSaveVO();
        kingdeeSupplierSaveVO.setName(erpSupplierDTO.getName());
        kingdeeSupplierSaveVO.setAccountOpenAddr(erpSupplierDTO.getBankAddress());
        kingdeeSupplierSaveVO.setBank(erpSupplierDTO.getBankName());
        kingdeeSupplierSaveVO.setBankAccount(erpSupplierDTO.getBankAccount());
        kingdeeSupplierSaveVO.setRemark(erpSupplierDTO.getRemark());
        kingdeeSupplierSaveVO.setRate(String.valueOf(erpSupplierDTO.getTaxRate()));
        kingdeeSupplierSaveVO.setTaxpayerNo(erpSupplierDTO.getTaxNo());
        List<SupplierBomentity> bomEntityList = new ArrayList<>();
        SupplierBomentity bomEntity = new SupplierBomentity();
        bomEntity.setContactPerson(erpSupplierDTO.getContact());
        bomEntity.setMobile(erpSupplierDTO.getMobile());
        bomEntity.setEmail(erpSupplierDTO.getEmail());
        kingdeeSupplierSaveVO.setBomEntity(bomEntityList);
        return kingdeeSupplierSaveVO;
    }

    public KingdeeAuxInfoDetail toKingdee(String deptId) {
        //这里erp的部门id对应金蝶的部门number
        //从erp中获取部门信息
        DeptRespDTO dept = deptApi.getDept(Long.valueOf(deptId));
        KingdeeAuxInfoDetail department = new KingdeeAuxInfoDetail();
        department.setName(dept.getName());
        department.setNumber(deptId);
        // 将当前UTC时间转换为东八区时间
        department.setRemark(getUtc8Now().toString());
        return department;
    }

    public KingdeeAuxInfoDetail toKingdee(DeptRespDTO erpDepartment) {
        KingdeeAuxInfoDetail department = new KingdeeAuxInfoDetail();
        String number = String.valueOf(erpDepartment.getId());
        String name = String.valueOf(erpDepartment.getName());

        department.setName(name);
        department.setNumber(number);
        // 将当前UTC时间转换为东八区时间
        department.setRemark(getUtc8Now().toString());

        return department;
    }

    /**
     * 将 SRM 供应商转换为金蝶供应商
     *
     * @param supplier SRM供应商
     * @return 金蝶供应商
     */
    public KingdeeSupplierSaveVO convertSupplierDTO(SrmSupplierDTO supplier) {
        if (supplier == null) {
            return null;
        }
        KingdeeSupplierSaveVO kingdeeSupplierSaveVO = new KingdeeSupplierSaveVO();
        // 基本信息
        convertBasicInfo(kingdeeSupplierSaveVO, supplier);
        // 银行信息
        convertBankInfo(kingdeeSupplierSaveVO, supplier);
        // 税务信息
        convertTaxInfo(kingdeeSupplierSaveVO, supplier);
        // 地址信息
        convertAddressInfo(kingdeeSupplierSaveVO, supplier);
        // 联系人信息
        kingdeeSupplierSaveVO.setBomEntity(convertToBomEntity(supplier));
        return kingdeeSupplierSaveVO;
    }

    /**
     * 将 SRM 供应商列表转换为金蝶供应商列表
     *
     * @param suppliers SRM供应商列表
     * @return 金蝶供应商列表
     */
    public List<KingdeeSupplierSaveVO> convertSupplierDTOList(List<SrmSupplierDTO> suppliers) {
        if (suppliers == null) {
            return Collections.emptyList();
        }
        return suppliers.stream()
            .filter(Objects::nonNull)
            .map(this::convertSupplierDTO)
            .filter(Objects::nonNull)
            .toList();
    }

    /**
     * 转换基本信息
     */
    void convertBasicInfo(KingdeeSupplierSaveVO target, SrmSupplierDTO source) {
        if (source.getId() != null) {
            //把供应商ID作为金蝶的供应商编码
            target.setNumber(String.valueOf(source.getId()));
        }
        target.setName(StrUtil.trimToNull(source.getName()));
        target.setRemark(StrUtil.trimToNull(source.getRemark()));
        // 设置开票名称，默认与供应商名称一致
        target.setInvoiceName(StrUtil.trimToNull(source.getName()));
    }

    /**
     * 转换银行信息
     */
    void convertBankInfo(KingdeeSupplierSaveVO target, SrmSupplierDTO source) {
        target.setAccountOpenAddr(StrUtil.trimToNull(source.getBankAddress()));
        target.setBank(StrUtil.trimToNull(source.getBankName()));
        target.setBankAccount(StrUtil.trimToNull(source.getBankAccount()));
    }

    /**
     * 转换税务信息
     */
    void convertTaxInfo(KingdeeSupplierSaveVO target, SrmSupplierDTO source) {
        if (source.getTaxRate() != null) {
            target.setRate(String.valueOf(source.getTaxRate()));
        }
        target.setTaxpayerNo(StrUtil.trimToNull(source.getTaxNo()));
    }

    /**
     * 转换地址信息
     */
    void convertAddressInfo(KingdeeSupplierSaveVO target, SrmSupplierDTO source) {
        // 设置详细地址
        target.setAddr(StrUtil.trimToNull(source.getCompanyAddress()));
        // 设置送达地址
        if (StrUtil.isNotBlank(source.getDeliveryAddress())) {
            target.setAddr(StrUtil.trimToNull(source.getDeliveryAddress()));
        }
    }

    /**
     * 转换为联系人信息(金蝶可以是复数联系人)
     */
    List<SupplierBomentity> convertToBomEntity(SrmSupplierDTO supplier) {
        if (supplier == null) {
            return Collections.emptyList();
        }
        SupplierBomentity bomEntity = new SupplierBomentity();
        bomEntity.setContactPerson(StrUtil.trimToNull(supplier.getContact()));
        bomEntity.setMobile(StrUtil.trimToNull(supplier.getMobile()));
        bomEntity.setPhone(StrUtil.trimToNull(supplier.getTelephone()));
        bomEntity.setEmail(StrUtil.trimToNull(supplier.getEmail()));
        // 设置为首要联系人
        bomEntity.setIsDefaultLinkman(true);
        return Collections.singletonList(bomEntity);
    }
}
