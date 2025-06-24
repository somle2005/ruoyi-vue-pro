package com.doudian.open.api.order_mergeV2;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_mergeV2.param.*;

//auto generated, do not edit

public class OrderMergeV2Request extends DoudianOpRequest<OrderMergeV2Param> {



	@Override
	public String getUrlPath(){
		return "/order/mergeV2";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderMergeV2Response.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}