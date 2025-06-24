package com.doudian.open.api.order_BatchSearchIndex;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_BatchSearchIndex.param.*;

//auto generated, do not edit

public class OrderBatchSearchIndexRequest extends DoudianOpRequest<OrderBatchSearchIndexParam> {



	@Override
	public String getUrlPath(){
		return "/order/BatchSearchIndex";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderBatchSearchIndexResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}