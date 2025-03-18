package com.somle.shopify.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.somle.shopify.domain.HeaderDto;
import com.somle.shopify.domain.ShopifyToken;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface ShopifyTokenMapper extends BaseMapper<ShopifyToken> {

    HeaderDto getHeaders(@Param("storeName") String storeName);

}