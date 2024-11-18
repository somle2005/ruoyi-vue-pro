package cn.iocoder.yudao.module.erp.dal.dataobject.product.tvstand;

import lombok.*;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * ERP yyyy产品 DO
 *
 * @author 王奇辉
 */
@TableName("erp_product_tv_stand")
@KeySequence("erp_product_tv_stand_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErpProductTvStandDO extends BaseDO {

    /**
     * 编号
     */
    @TableId
    private Long id;
    /**
     * 产品主表id
     */
    private Long productId;
    /**
     * 层板承重
     */
    private String shelfLoadCapacity;
    /**
     * 层板数量
     */
    private Integer shelvesCount;
    /**
     * 电视调节方式
     */
    private String tvAdjustmentMethod;
    /**
     * 层板调节方式
     */
    private String shelfAdjustmentMethod;
    /**
     * 设计说明
     */
    private String description;
    /**
     * 宽度最大值
     */
    private BigDecimal widthMax;
    /**
     * 宽度最小值
     */
    private BigDecimal widthMin;
    /**
     * 长度最大值
     */
    private BigDecimal lengthMax;
    /**
     * 长度最小值
     */
    private BigDecimal lengthMin;

}