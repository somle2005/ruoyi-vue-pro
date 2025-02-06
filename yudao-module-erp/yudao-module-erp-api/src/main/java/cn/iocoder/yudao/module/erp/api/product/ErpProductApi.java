package cn.iocoder.yudao.module.erp.api.product;

import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ErpProductApi {
    /**
     * 获得所有产品DTO，根据ids，如果ids为null返回所有
     */
    List<ErpProductDTO> listProductDTOs(List<Long> ids);
}
