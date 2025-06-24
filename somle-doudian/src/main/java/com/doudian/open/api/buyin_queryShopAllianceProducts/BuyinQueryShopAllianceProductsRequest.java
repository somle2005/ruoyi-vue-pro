package com.doudian.open.api.buyin_queryShopAllianceProducts;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.buyin_queryShopAllianceProducts.param.*;

//auto generated, do not edit

public class BuyinQueryShopAllianceProductsRequest extends DoudianOpRequest<BuyinQueryShopAllianceProductsParam> {



	@Override
	public String getUrlPath(){
		return "/buyin/queryShopAllianceProducts";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return BuyinQueryShopAllianceProductsResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}