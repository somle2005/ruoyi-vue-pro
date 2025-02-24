package cn.iocoder.yudao.module.erp.api.product;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpCustomRuleRespDTO;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDTO;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductRespDTO;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.ErpProductPageReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.ErpProductRespVO;
import cn.iocoder.yudao.module.erp.convert.product.ErpProductConvert;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductDO;
import cn.iocoder.yudao.module.erp.dal.mysql.product.ErpProductMapper;
import cn.iocoder.yudao.module.erp.service.logistic.customrule.ErpCustomRuleService;
import cn.iocoder.yudao.module.erp.service.product.ErpProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ErpProductApiImpl implements ErpProductApi {
    private final ErpProductMapper erpProductMapper;

    private final ErpProductService erpProductService;

    private final ErpCustomRuleService erpCustomRuleService;

    //获得所有产品DTO，根据ids，如果ids为null返回所有
    public List<ErpProductDTO> listProductDTOs(List<Long> ids) {
        List<ErpProductDO> dos;
        if (ids != null) {
            dos = erpProductMapper.selectBatchIds(ids);
        }else {
            dos = erpProductMapper.selectList();
        }
        return ErpProductConvert.INSTANCE.convert(dos);
    }

    @Override
    public List<ErpProductRespDTO> listProductRespDTOs() {
        List<ErpProductRespDTO> allProductVOInfo = erpProductService.getAllProductVOInfo();
        return allProductVOInfo;
    }
}
