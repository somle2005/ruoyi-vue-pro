package cn.iocoder.yudao.module.erp.dal.dataobject.shop;

import cn.iocoder.yudao.framework.tenant.core.db.TenantBaseDO;
import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * ERP 店铺 DO
 *
 * @author c-tao
 */
@TableName("erp_shop")
@KeySequence("erp_shop_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErpShopDO extends TenantBaseDO {

    /**
     * 店铺编号
     */
    @TableId
    private Long id;
    /**
     * 店铺名称
     */
    private String name;
    /**
     * 店铺编码
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
     * 排序
     */
    private Integer sort;
    /**
     * 类型 0线上 1线上
     */
    private Integer type;
    /**
     * 销售平台
     */
    private String platform;

    /**
     * 店铺在销售平台的唯一ID
     */
    private String platformShopUid;
    /**
     * 账号
     */
    private String account;

}