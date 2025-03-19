package cn.iocoder.yudao.module.oms.controller;

import cn.iocoder.yudao.module.oms.domain.entity.ErpSku;
import cn.iocoder.yudao.module.oms.mapper.ErpSkuMapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

/**
 * ERP平台sku表(erp_sku)表控制层
 *
 * @author xxxxx
 */
@Tag(name = "erpSku")
@RestController
@RequestMapping("/erpSku/")
public class ErpSkuController {
    /**
     * 服务对象
     */
    @Autowired
    private ErpSkuMapper erpSkuMapper;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */

    @GetMapping("selectOne")
    public ErpSku selectOne(Integer id) {
        return erpSkuMapper.selectById(id);
    }

}
