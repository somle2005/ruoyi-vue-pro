package com.doudian.open.api.buyin_simplePlan;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.buyin_simplePlan.param.*;

//auto generated, do not edit

public class BuyinSimplePlanRequest extends DoudianOpRequest<BuyinSimplePlanParam> {



	@Override
	public String getUrlPath(){
		return "/buyin/simplePlan";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return BuyinSimplePlanResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}