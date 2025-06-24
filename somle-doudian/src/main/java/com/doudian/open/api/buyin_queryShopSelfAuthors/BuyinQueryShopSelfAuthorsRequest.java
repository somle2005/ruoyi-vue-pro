package com.doudian.open.api.buyin_queryShopSelfAuthors;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.buyin_queryShopSelfAuthors.param.*;

//auto generated, do not edit

public class BuyinQueryShopSelfAuthorsRequest extends DoudianOpRequest<BuyinQueryShopSelfAuthorsParam> {



	@Override
	public String getUrlPath(){
		return "/buyin/queryShopSelfAuthors";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return BuyinQueryShopSelfAuthorsResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}