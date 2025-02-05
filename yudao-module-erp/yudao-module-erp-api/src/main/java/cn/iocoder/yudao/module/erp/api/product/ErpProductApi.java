package cn.iocoder.yudao.module.erp.api.product;

import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ErpProductApi {
    /**
     * 获取所有产品
     */
    List<ErpProductDTO> listProducts();
}
