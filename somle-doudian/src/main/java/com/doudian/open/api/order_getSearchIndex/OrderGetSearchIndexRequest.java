package com.doudian.open.api.order_getSearchIndex;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_getSearchIndex.param.*;

//auto generated, do not edit

public class OrderGetSearchIndexRequest extends DoudianOpRequest<OrderGetSearchIndexParam> {



	@Override
	public String getUrlPath(){
		return "/order/getSearchIndex";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderGetSearchIndexResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}