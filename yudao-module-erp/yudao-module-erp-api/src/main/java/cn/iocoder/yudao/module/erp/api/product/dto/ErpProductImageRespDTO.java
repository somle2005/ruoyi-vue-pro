package cn.iocoder.yudao.module.erp.api.product.dto;

import lombok.Data;

/**
 * @author wdy
 */
@Data
public class ErpProductImageRespDTO {
    //图片
    byte[] img;
    //附图
    byte[][] img2;
    //产品ID
    private Long productId;
    //产品code
    private String code;
}
