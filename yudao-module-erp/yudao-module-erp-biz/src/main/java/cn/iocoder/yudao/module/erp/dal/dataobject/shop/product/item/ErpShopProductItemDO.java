package cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.item;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * ERP 店铺产品项 DO
 *
 * @author 索迈管理员
 */
@TableName("erp_shop_product_item")
@KeySequence("erp_shop_product_item_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErpShopProductItemDO extends BaseDO {

    /**
     * 店铺产品项编号
     */
    @TableId
    private Long id;
    /**
     * 产品编号
     */
    private Long productId;

    /**
     * 数量
     **/
    private Long quantity;

    /**
     * 店铺产品编号
     */
    private Long shopProductId;
    /**
     * 备注
     */
    private String remark;

}