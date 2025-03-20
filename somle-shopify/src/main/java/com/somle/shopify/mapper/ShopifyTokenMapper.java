package com.somle.shopify.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.somle.shopify.domain.ShopAndTokenInfo;
import com.somle.shopify.domain.ShopifyToken;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ShopifyTokenMapper extends BaseMapper<ShopifyToken> {

    List<ShopAndTokenInfo> getShopAndTokenInfo();

}