package cn.iocoder.yudao.module.sale.job;


import cn.iocoder.yudao.framework.common.util.custom.MyExceptionUtil;
import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import cn.iocoder.yudao.framework.quartz.core.handler.JobHandler;
import cn.iocoder.yudao.module.sale.domain.entity.ErpShop;
import cn.iocoder.yudao.module.sale.mapper.ErpShopMapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.somle.shopify.domain.RetrieveAListOfProductsDto;
import com.somle.shopify.domain.RetrieveAListOfProductsVo;
import com.somle.walmart.model.WalmartToken;
import com.somle.walmart.repository.WalmartTokenRepository;
import com.somle.walmart.service.WalmartClient;
import com.somle.walmart.service.WalmartService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

//Walmart sku拉取
@Slf4j
@Component
public class WalmartListingJob implements JobHandler {

    @Resource
    private WalmartService walmartService;

    @Resource
    private WalmartTokenRepository walmartTokenRepository;

    @Resource
    private ErpShopMapper erpShopMapper;
    @Override
    public String execute(String param) throws Exception {
        if (!StringUtils.hasText(param)) {
            throw new RuntimeException("请输入店铺数组");
        }
        List<String> storeNames = Arrays.asList(param.split(","));
        String errorMsg = "";
        if (!CollectionUtils.isEmpty(storeNames)) {
            LambdaQueryWrapper<ErpShop> inWrapper = new LambdaQueryWrapper<ErpShop>().eq(ErpShop::getDeleted, 0).in(ErpShop::getName, storeNames);
            List<ErpShop> erpShops = erpShopMapper.selectList(inWrapper);
            Map<String, ErpShop> nameMap = erpShops.stream().collect(Collectors.toMap(ErpShop::getName, e -> e));
            for (String storeName : storeNames) {
                try {
                    ErpShop erpShop = nameMap.get(storeName);
                    if (erpShop == null) {
                        throw new RuntimeException("当前店铺名称不存在");
                    }
                    Long lastId = 1L;
                    while (true) {

                        Optional<WalmartToken> walmartToken = walmartTokenRepository.findById(erpShop.getAuthId());
                        WalmartClient walmartClient = walmartService.getClient(walmartToken.get());
                        JSONObject allItems = walmartClient.getAllItems();
                        System.out.println(allItems);

//                        RetrieveAListOfProductsDto dto = new RetrieveAListOfProductsDto();
//                        dto.setSuccessCode(200);
//                        dto.setLimit(250L);
//                        dto.setSince_id(lastId);
//                        dto.setShopName(storeName);
//                        RetrieveAListOfProductsVo retrieveAListOfProductsVo = shopifyClient.retrieveAListOfProducts(dto);
//                        List<RetrieveAListOfProductsVo.ProductsDTO> items = retrieveAListOfProductsVo.getProducts();
//                        if (CollectionUtils.isEmpty(items)) {
//                            break;
//                        }
//                        //操作db，新增或者更新
//                        saveOrUpdateSku(items, erpShop);
//                        lastId = items.get(items.size() - 1).getId();
//                        //防止限流
//                        TimeUnit.MILLISECONDS.sleep(200L);
                    }
                } catch (Exception e) {
                    log.error("店铺名称{},出现异常", storeName, e);
                    errorMsg = errorMsg + storeName + MyExceptionUtil.getExceptionDetail(e);
                }
            }
        }
        if (StringUtils.hasText(errorMsg)) {
            throw new RuntimeException(errorMsg);
        }
        return "success";
    }
}
