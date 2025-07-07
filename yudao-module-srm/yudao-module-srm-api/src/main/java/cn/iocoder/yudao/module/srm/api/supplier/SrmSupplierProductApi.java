package cn.iocoder.yudao.module.srm.api.supplier;

import cn.iocoder.yudao.module.srm.api.supplier.dto.SrmSupplierProductDTO;
import org.springframework.validation.annotation.Validated;

/**
 * @author wdy
 */
@Validated
public interface SrmSupplierProductApi {


    /**
     * 修改供应商产品
     *
     * @param dto dto
     */
    void updateSupplierProduct(SrmSupplierProductDTO dto);


}
