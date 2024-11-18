package cn.iocoder.yudao.module.erp.dal.dataobject.product.xxxx;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * ERP xxxx产品 DO
 *
 * @author 王奇辉
 */
@TableName("erp_product_xxxx")
@KeySequence("erp_product_xxxx_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErpProductXxxxDO extends BaseDO {

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
     * 大小
     */
    private Double size;
    /**
     * 地址
     */
    private String address;

}