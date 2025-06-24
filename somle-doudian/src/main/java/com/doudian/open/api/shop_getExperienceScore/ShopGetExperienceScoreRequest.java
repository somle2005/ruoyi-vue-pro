package com.doudian.open.api.shop_getExperienceScore;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.shop_getExperienceScore.param.*;

//auto generated, do not edit

public class ShopGetExperienceScoreRequest extends DoudianOpRequest<ShopGetExperienceScoreParam> {



	@Override
	public String getUrlPath(){
		return "/shop/getExperienceScore";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ShopGetExperienceScoreResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}