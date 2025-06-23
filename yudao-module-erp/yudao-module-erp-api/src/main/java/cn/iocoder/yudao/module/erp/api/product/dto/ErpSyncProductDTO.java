package cn.iocoder.yudao.module.erp.api.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * @author: wdy
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErpSyncProductDTO {
    Set<Long> productId;
    //同步的更新的人的用户ID
    Long updateUserId;
}
