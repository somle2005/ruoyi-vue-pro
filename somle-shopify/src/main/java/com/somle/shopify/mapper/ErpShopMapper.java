package com.somle.shopify.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.somle.shopify.domain.ErpShop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ErpShopMapper extends BaseMapper<ErpShop> {

    List<String> getShopAndTokenInfo();

}