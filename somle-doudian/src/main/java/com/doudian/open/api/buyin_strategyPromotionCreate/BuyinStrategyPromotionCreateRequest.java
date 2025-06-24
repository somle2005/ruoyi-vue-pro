package com.doudian.open.api.buyin_strategyPromotionCreate;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.buyin_strategyPromotionCreate.param.*;

//auto generated, do not edit

public class BuyinStrategyPromotionCreateRequest extends DoudianOpRequest<BuyinStrategyPromotionCreateParam> {



	@Override
	public String getUrlPath(){
		return "/buyin/strategyPromotionCreate";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return BuyinStrategyPromotionCreateResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}