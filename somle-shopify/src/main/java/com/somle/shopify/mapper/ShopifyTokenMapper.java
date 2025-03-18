package com.somle.shopify.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.somle.shopify.domain.*;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ShopifyTokenMapper extends BaseMapper<ShopifyToken> {

    HeaderDto getHeaders(@Param("storeName") String storeName);

}