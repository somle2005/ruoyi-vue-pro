package com.somle.shopify.dal;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.somle.shopify.model.ShopAndTokenInfo;
import com.somle.shopify.model.ShopifyToken;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ShopifyTokenMapper extends BaseMapper<ShopifyToken> {

    List<ShopAndTokenInfo> getShopAndTokenInfo();

}