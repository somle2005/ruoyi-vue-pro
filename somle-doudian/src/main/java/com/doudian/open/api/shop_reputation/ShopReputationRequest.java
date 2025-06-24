package com.doudian.open.api.shop_reputation;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.shop_reputation.param.*;

//auto generated, do not edit

public class ShopReputationRequest extends DoudianOpRequest<ShopReputationParam> {



	@Override
	public String getUrlPath(){
		return "/shop/reputation";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ShopReputationResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}