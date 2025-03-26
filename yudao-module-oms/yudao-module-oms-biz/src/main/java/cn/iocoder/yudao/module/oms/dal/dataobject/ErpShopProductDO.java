package cn.iocoder.yudao.module.oms.dal.dataobject;

import cn.iocoder.yudao.framework.tenant.core.db.TenantBaseDO;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;

/**
 * ERP 店铺产品 DO
 *
 * @author 索迈管理员
 */
@TableName("erp_shop_product_maomao")
@KeySequence("erp_shop_product_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErpShopProductDO extends TenantBaseDO {

    /**
     * 店铺产品编号
     */
    @TableId
    private Long id;

    /**
    * 店铺ID
    **/
    private Long shopId;
    /**
     * 店铺产品名称
     */
    private String name;

    /**
     * 上架时间
     **/
    private LocalDateTime listingTime;
    /**
     * 价格
     **/
    private BigDecimal price;

    /**
     * 币种
     **/
    private String currency;
    /**
     * 主图链接
     **/
    private String image;
    /**
     * 店铺产品编码
     */
    private String code;
    /**
     * 备注
     */
    private String remark;
    /**
     * 开启状态
     */
    private Integer status;
    /**
     * 链接
     */
    private String url;

    /**
     * 产品唯一ID
     */
    private String platformProductUid;

    /**
     * 部门ID
     */
    private Long deptId;

}