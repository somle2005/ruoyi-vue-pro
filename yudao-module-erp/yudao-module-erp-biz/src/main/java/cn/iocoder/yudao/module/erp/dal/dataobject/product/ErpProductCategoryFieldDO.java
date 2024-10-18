package cn.iocoder.yudao.module.erp.dal.dataobject.product;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 产品分类自定义字段中间 DO
 *
 * @author 索迈管理员
 */
@TableName("erp_product_category_field")
@KeySequence("erp_product_category_field_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErpProductCategoryFieldDO extends BaseDO {

    /**
     * ID
     */
    @TableId
    private Long id;
    /**
     * 分类id
     */
    private Long categoryId;
    /**
     * 字段id
     */
    private Long fieldId;

}