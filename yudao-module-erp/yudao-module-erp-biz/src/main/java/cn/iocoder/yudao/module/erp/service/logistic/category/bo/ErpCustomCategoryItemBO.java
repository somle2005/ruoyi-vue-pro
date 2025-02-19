package cn.iocoder.yudao.module.erp.service.logistic.category.bo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ErpCustomCategoryItemBO {

    private Long id;

    private Integer countryCode;

    private String hsCode;

    private BigDecimal taxRate;
}
