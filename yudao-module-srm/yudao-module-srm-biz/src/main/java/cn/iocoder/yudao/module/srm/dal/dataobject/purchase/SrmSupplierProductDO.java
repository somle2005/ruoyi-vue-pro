package cn.iocoder.yudao.module.srm.dal.dataobject.purchase;

import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.*;
import org.apache.poi.hpsf.Decimal;

/**
 * ERP 供应商产品 DO
 *
 * @author 索迈管理员
 */
@TableName("srm_supplier_product")
@KeySequence("srm_supplier_product_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SrmSupplierProductDO extends BaseDO {

    /**
     * 供应商产品编号
     */
    @TableId
    private Long id;
    /**
     * 供应商产品编码
     */
    private String code;
    /**
     * 供应商编号
     */
    private Long supplierId;
    /**
     * 产品编号
     */
    private Long productId;
    /**
     * 包装高度
     */
    private Double packageHeight;
    /**
     * 包装长度
     */
    private Double packageLength;
    /**
     * 包装重量
     */
    private Double packageWeight;
    /**
     * 包装宽度
     */
    private Double packageWidth;
    /**
     * 采购价格
     */
    private Double purchasePrice;
    /**
     * 采购货币代码
     */
    private Integer purchasePriceCurrencyCode;

    /**
     * 上次采购价格
     */
    private Decimal lastPurchasePrice;
    /**
     * 税率
     */
    private Decimal taxRate;
    /**
     * 默认供应商
     */
    private Boolean defaultSupplier;

    @Version
    private Integer version;
}