package com.somle.esb.converter;

import com.somle.eccang.model.EccangOrder;
import com.somle.eccang.model.EccangProduct;
import com.somle.eccang.service.EccangService;
import com.somle.erp.model.*;
import com.somle.erp.model.product.ErpCountrySku;
import com.somle.erp.model.product.ErpStyleSku;
import com.somle.erp.service.ErpDepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
@Service
public class EccangToErpConverter {
    @Autowired
    ErpDepartmentService esbService;

    @Autowired
    EccangService eccangService;

    public ErpAddress toEsb(EccangOrder.EccangAddress address) {
        log.debug(address.toString());
        ErpAddress erpAddress = ErpAddress.builder()
            .line1(address.getLine1())
            .line2(address.getLine2())
            .line3(address.getLine3())
            .postalCode(address.getPostalCode())
            .district(address.getDistrict())
            .cityName(address.getCityName())
            .state(address.getState())
            .countryCode(address.getCountryCode())
            .countryName(address.getCountryName())
            .build();
        log.debug(erpAddress.toString());
        return erpAddress;
        // return EsbAddress.builder()
        //     .line1(address.getLine1())
        //     .line2(address.getLine2())
        //     .line3(address.getLine3())
        //     .postalCode(address.getPostalCode())
        //     .district(address.getDistrict())
        //     .cityName(address.getCityName())
        //     .state(address.getState())
        //     .countryCode(address.getCountryCode())
        //     .countryName(address.getCountryName())
        //     .build();

    }

    public ErpSale toEsb(EccangOrder order) {
        ErpSale erpSale = new ErpSale();
        ErpCustomer erpCustomer = ErpCustomer.builder()
            .name(order.getBuyerName())
            .build();
        erpSale.setPlatformSku(order.getOrderDetail().getPlatformSku());
        erpSale.setCustomer(erpCustomer);
        erpSale.setAddress(toEsb(order.getOrderAddress()));
        return erpSale;
    }

    public ErpCountrySku toEsb(EccangProduct product) {
        ErpCountrySku erpCountrySku = new ErpCountrySku();
        ErpStyleSku erpStyleSku = new ErpStyleSku();

        // Split the string by the hyphen
        String[] parts = product.getProductSku().split("-");
        String modelSku = null;
        String styleCode = null;
        String styleSku = null;
        String countryCode = null;

        if (parts.length >= 2) {
            String lastPart = parts[parts.length-1];
            switch (lastPart) {
                case "AE": // United Arab Emirates
                case "CA": // Canada
                case "JP": // Japan
                case "US": // United States
                case "KR": // South Korea
                case "AU": // Australia
                case "CN": // China
                case "MX": // Mexico
                case "DE": // Germany
                case "FR": // France
                case "IN": // India
                case "SG": // Singapore
                case "UK": // United Kingdom
                    countryCode = lastPart;
                    break;
                case "USA":
                    countryCode = "US";
                    break;
                case "IND":
                    countryCode = "IN";
                    break;
                case "EU":
                    countryCode = "UK";
                    break;
                case "CHN":
                    countryCode = "CN";
                    break;
                case "KSA":
                    countryCode = "SA";
                default:
                    break;
            }
        }

        if (countryCode != null) {
            styleSku = Stream.of(parts).limit(parts.length-1).collect(Collectors.joining("-"));
        } else {
            styleSku = product.getProductSku();
        }

        modelSku = styleSku.substring(0, styleSku.length()-2);
        styleCode = styleSku.substring(styleSku.length()-2, styleSku.length());

        erpStyleSku.setStyleSku(styleSku);
        erpStyleSku.setModelSku(modelSku);
        erpStyleSku.setStyleCode(styleCode);

        erpStyleSku.setNameZh(product.getProductTitle());
        erpStyleSku.setNameEn(product.getProductTitleEn());

        erpStyleSku.setImageUrlList(product.getProductImgUrlList());

        erpStyleSku.setWeight(product.getPdNetWeight());
        erpStyleSku.setLength(product.getPdNetLength());
        erpStyleSku.setWidth(product.getPdNetWeight());
        erpStyleSku.setHeight(product.getPdNetHeight());
        erpStyleSku.setPackageWeight(product.getProductWeight());
        erpStyleSku.setPackageLength(product.getProductLength());
        erpStyleSku.setPackageWidth(product.getProductWidth());
        erpStyleSku.setPackageHeight(product.getProductHeight());
        erpStyleSku.setMaterialZh(product.getProductMaterial());
        erpStyleSku.setMaterialEn(product.getMaterialEn());
        erpStyleSku.setResearchDepartmentId(esbService.getDepartment(product.getProductCategoryName()).getId());

        erpStyleSku.setPurchasePrice(product.getProductPurchaseValue());
        erpStyleSku.setPurchasePriceCurrencyCode(product.getCurrencyCode());
        erpStyleSku.setDefaultSupplierCode(product.getDefaultSupplierCode());

        erpStyleSku.setSaleStatus(product.getSaleStatus());
        erpStyleSku.setSaleDepartmentId(esbService.getDepartment(product.getProductCategoryName()).getId());

        erpCountrySku.setCountrySku(product.getProductSku());
        erpCountrySku.setCountryCode(countryCode);
        erpCountrySku.setLogisticAttribute(product.getLogisticAttribute());
        erpCountrySku.setHscode(product.getHsCode());
        erpCountrySku.setDeclaredValue(product.getProductDeclaredValue());
        erpCountrySku.setDeclaredValueCurrencyCode(product.getPdDeclareCurrencyCode());
        erpCountrySku.setDeclaredTypeZh(product.getPdOverseaTypeCn());
        erpCountrySku.setDeclaredTypeEn(product.getPdOverseaTypeEn());
        erpCountrySku.setExportCustomTaxRate(product.getFboTaxRate());
        // esbCountrySku.setImportCustomTaxRate(Float.valueOf(product.getPdDeclarationStatement()));

        erpCountrySku.setStyleSku(erpStyleSku);

        return erpCountrySku;

    }
}
