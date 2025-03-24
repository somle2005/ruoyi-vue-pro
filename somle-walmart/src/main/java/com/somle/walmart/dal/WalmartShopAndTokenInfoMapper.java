package com.somle.walmart.dal;

import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import com.somle.walmart.model.WalmartShopAndTokenInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface WalmartShopAndTokenInfoMapper extends BaseMapperX<WalmartShopAndTokenInfo> {


    @Select("""
          SELECT
              walmart_token.id as tokenId,
              `name` as shopName,
              client_id,
              client_secret,
              correlation_id,
              svc_name,
              domain
          FROM
              oms_shop
                  JOIN walmart_token ON oms_shop.auth_id = walmart_token.id
          WHERE
              oms_shop.deleted = 0
          AND oms_shop.plat_name = 'Walmart'
            """)
    List<WalmartShopAndTokenInfo> getShopAndTokenInfo() ;

}
