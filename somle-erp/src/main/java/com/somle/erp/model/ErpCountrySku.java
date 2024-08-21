package com.somle.erp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


// @AllArgsConstructor
// @NoArgsConstructor
// class Sku implements Serializable {
//     protected String modelSku;
//     protected String styleCode;
//     protected String countryCode;
// }

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
// @IdClass(Sku.class)
public class ErpCountrySku {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "style_sku")
    ErpStyleSku styleSku;

    //物流属性
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private Long id;
    // @Id
    //@NotNull
    private String countryCode;
    @Id
    private String countrySku;
    //@NotNull
    private String logisticAttribute;
    //@NotNull
    private String hscode;
    //@NotNull
    private String declaredTypeZh;
    //@NotNull
    private String declaredTypeEn;
    //@NotNull
    private Float declaredValue;
    //@NotNull
    private String declaredValueCurrencyCode;
    //@NotNull
    private Float exportCustomTaxRate;
    //@NotNull
    private Float importCustomTaxRate;
 
    private Boolean synced;

    // public String getCountrySku() {
    //     return getStyleSku().getStyleSku() + "-" + getCountryCode();
    // }

    public void setCountrySku() {
        // countrySku = getCountrySku();
        countrySku = getStyleSku().getStyleSku() + "-" + getCountryCode();
    }

    // // @Override
    // @PrePersist
    // public void prePersist() {
    //     getStyleSku().setStyleSku();
    //     setCountrySku();
    // }
}



