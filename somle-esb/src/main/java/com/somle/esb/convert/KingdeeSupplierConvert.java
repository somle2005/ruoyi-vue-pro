package com.somle.esb.convert;

import cn.hutool.core.util.StrUtil;
import cn.iocoder.yudao.module.srm.api.supplier.dto.SrmSupplierDTO;
import com.somle.kingdee.model.supplier.KingdeeSupplier;
import com.somle.kingdee.model.supplier.SupplierBomentity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * 金蝶供应商转换
 */
@Mapper
public interface KingdeeSupplierConvert {

    KingdeeSupplierConvert INSTANCE = Mappers.getMapper(KingdeeSupplierConvert.class);

    /**
     * 将 SRM 供应商转换为金蝶供应商
     *
     * @param supplier SRM供应商
     * @return 金蝶供应商
     */
    default KingdeeSupplier convert(SrmSupplierDTO supplier) {
        if (supplier == null) {
            return null;
        }
        KingdeeSupplier kingdeeSupplier = new KingdeeSupplier();
        // 基本信息
        convertBasicInfo(kingdeeSupplier, supplier);
        // 银行信息
        convertBankInfo(kingdeeSupplier, supplier);
        // 税务信息
        convertTaxInfo(kingdeeSupplier, supplier);
        // 地址信息
        convertAddressInfo(kingdeeSupplier, supplier);
        // 联系人信息
        kingdeeSupplier.setBomEntity(convertToBomEntity(supplier));
        return kingdeeSupplier;
    }

    /**
     * 将 SRM 供应商列表转换为金蝶供应商列表
     *
     * @param suppliers SRM供应商列表
     * @return 金蝶供应商列表
     */
    default List<KingdeeSupplier> convertList(List<SrmSupplierDTO> suppliers) {
        if (suppliers == null) {
            return Collections.emptyList();
        }
        return suppliers.stream()
                .filter(Objects::nonNull)
                .map(this::convert)
                .filter(Objects::nonNull)
                .toList();
    }

    /**
     * 转换基本信息
     */
    default void convertBasicInfo(KingdeeSupplier target, SrmSupplierDTO source) {
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
    default void convertBankInfo(KingdeeSupplier target, SrmSupplierDTO source) {
        target.setAccountOpenAddr(StrUtil.trimToNull(source.getBankAddress()));
        target.setBank(StrUtil.trimToNull(source.getBankName()));
        target.setBankAccount(StrUtil.trimToNull(source.getBankAccount()));
    }

    /**
     * 转换税务信息
     */
    default void convertTaxInfo(KingdeeSupplier target, SrmSupplierDTO source) {
        if (source.getTaxPercent() != null) {
            target.setRate(String.valueOf(source.getTaxPercent()));
        }
        target.setTaxpayerNo(StrUtil.trimToNull(source.getTaxNo()));
    }

    /**
     * 转换地址信息
     */
    default void convertAddressInfo(KingdeeSupplier target, SrmSupplierDTO source) {
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
    default List<SupplierBomentity> convertToBomEntity(SrmSupplierDTO supplier) {
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