package com.somle.shopify.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.somle.shopify.domain.ShopifyToken;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ShopifyTokenMapper extends BaseMapper<ShopifyToken> {

    String getHeaders(@Param("storeName") String storeName);

}