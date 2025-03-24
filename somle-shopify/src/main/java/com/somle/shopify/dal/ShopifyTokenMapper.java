package com.somle.shopify.dal;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.somle.shopify.model.ShopifyShopAndTokenInfo;
import com.somle.shopify.model.ShopifyToken;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface ShopifyTokenMapper extends BaseMapper<ShopifyToken> {

    @Select("""
              select `name` as shopName,
                     access_token,
                     domain
              from oms_shop
                       join shopify_token on oms_shop.auth_id = shopify_token.id
              where oms_shop.deleted = 0
              and oms_shop.plat_name = 'Shopify'
        """)
    List<ShopifyShopAndTokenInfo> getShopAndTokenInfo();
}