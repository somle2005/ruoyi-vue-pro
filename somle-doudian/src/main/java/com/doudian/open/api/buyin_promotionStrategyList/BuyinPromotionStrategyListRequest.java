package com.doudian.open.api.buyin_promotionStrategyList;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.buyin_promotionStrategyList.param.*;

//auto generated, do not edit

public class BuyinPromotionStrategyListRequest extends DoudianOpRequest<BuyinPromotionStrategyListParam> {



	@Override
	public String getUrlPath(){
		return "/buyin/promotionStrategyList";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return BuyinPromotionStrategyListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}