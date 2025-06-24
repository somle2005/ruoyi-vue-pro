package com.doudian.open.api.promise_setSkuShipTime;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.promise_setSkuShipTime.param.*;

//auto generated, do not edit

public class PromiseSetSkuShipTimeRequest extends DoudianOpRequest<PromiseSetSkuShipTimeParam> {



	@Override
	public String getUrlPath(){
		return "/promise/setSkuShipTime";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return PromiseSetSkuShipTimeResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}