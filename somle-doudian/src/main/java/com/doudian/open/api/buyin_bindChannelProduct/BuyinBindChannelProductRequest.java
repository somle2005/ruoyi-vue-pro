package com.doudian.open.api.buyin_bindChannelProduct;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.buyin_bindChannelProduct.param.*;

//auto generated, do not edit

public class BuyinBindChannelProductRequest extends DoudianOpRequest<BuyinBindChannelProductParam> {



	@Override
	public String getUrlPath(){
		return "/buyin/bindChannelProduct";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return BuyinBindChannelProductResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}