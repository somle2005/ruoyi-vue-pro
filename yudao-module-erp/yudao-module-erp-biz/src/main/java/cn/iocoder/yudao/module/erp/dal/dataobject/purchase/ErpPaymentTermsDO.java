package cn.iocoder.yudao.module.erp.dal.dataobject.purchase;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 付款条款管理 DO
 *
 * @author 王奇辉
 */
@TableName("erp_payment_terms")
@KeySequence("erp_payment_terms_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErpPaymentTermsDO extends BaseDO {

    /**
     * 付款条款id
     */
    @TableId
    private Long id;
    /**
     * 付款条款编码
     */
    private String code;
    /**
     * 描述
     */
    private String description;
    /**
     * 1代表国内，0代表国外（默认国内）
     */
    private Boolean isDomestic;
    /**
     * 描述（英文）
     */
    private String descriptionEn;

}