package com.somle.walmart.dal;

import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import com.github.yulichang.wrapper.MPJLambdaWrapper;
import com.somle.walmart.model.WalmartOmsShop;
import com.somle.walmart.model.WalmartShopAndTokenInfo;
import com.somle.walmart.model.WalmartToken;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WalmartShopAndTokenInfoMapper extends BaseMapperX<WalmartShopAndTokenInfo> {

    default List<WalmartShopAndTokenInfo> getShopAndTokenInfo() {
        MPJLambdaWrapper<WalmartShopAndTokenInfo> wrapper = new MPJLambdaWrapper<>();
        wrapper.selectAs(WalmartToken::getId, WalmartShopAndTokenInfo::getTokenId)
            .selectAs(WalmartOmsShop::getName, WalmartShopAndTokenInfo::getShopName)
            .select(WalmartToken::getClientId)
            .select(WalmartToken::getClientSecret)
            .select(WalmartToken::getCorrelationId)
            .select(WalmartToken::getSvcName)
            .select(WalmartToken::getDomain)
            .innerJoin(WalmartOmsShop.class, WalmartOmsShop::getAuthId, WalmartToken::getId)
            .eq(WalmartOmsShop::getDeleted, 0)
            .eq(WalmartOmsShop::getPlatName, "Walmart");
        List<WalmartShopAndTokenInfo> walmartShopAndTokenInfos = selectJoinList(WalmartShopAndTokenInfo.class, wrapper);
        return walmartShopAndTokenInfos;
    }

}
