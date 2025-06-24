package com.doudian.open.api.order_merge;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_merge.param.*;

//auto generated, do not edit

public class OrderMergeRequest extends DoudianOpRequest<OrderMergeParam> {



	@Override
	public String getUrlPath(){
		return "/order/merge";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderMergeResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}