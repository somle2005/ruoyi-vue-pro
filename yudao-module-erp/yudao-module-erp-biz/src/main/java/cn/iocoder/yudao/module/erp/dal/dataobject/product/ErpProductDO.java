package cn.iocoder.yudao.module.erp.dal.dataobject.product;

import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * ERP 产品 DO
 *
 * @author 索迈管理员
 */
@TableName("erp_product")
@KeySequence("erp_product_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErpProductDO extends BaseDO {

    /**
     * 产品编号
     */
    @TableId
    private Long id;
    /**
     * 产品名称
     */
    private String name;
    /**
     * 部门id
     */
    private Long deptId;

    /**
     * 产品分类编号
     */
    private Long categoryId;
    /**
     * 单位编号
     */
    private Long unitId;
    /**
     * 产品备注
     */
    private String remark;
    /**
     * 产品编码(SKU)
     */
    private String barCode;
    /**
     * 材料（中文）
     */
    private String material;
    /**
     * 产品状态（1启用，0禁用）
     */
    private Boolean status;
    /**
     * 基础重量（kg）
     */
    private BigDecimal weight;
    /**
     * 系列
     */
    private String series;
    /**
     * 型号
     */
    private String model;
    /**
     * 流水号
     */
    private Integer serial;
    /**
     * 生产编号
     */
    private String productionNo;
    /**
     * 基础宽度（mm）
     */
    private BigDecimal width;
    /**
     * 基础长度（mm）
     */
    private BigDecimal length;
    /**
     * 基础高度（mm）
     */
    private BigDecimal height;
    /**
     * 图片URL，json格式
     */
    private String imageUrl;
    /**
     * 指导价，json格式
     */
    private String guidePrice;
    /**
     * 专利
     */
    private String patent;
    /**
     * PO产品经理id
     */
    private Long poId;
    /**
     * ID工业设计id
     */
    private Long idId;
    /**
     * RD研发工程师id
     */
    private Long rdId;
    /**
     * 维护工程师id
     */
    private Long meId;

}