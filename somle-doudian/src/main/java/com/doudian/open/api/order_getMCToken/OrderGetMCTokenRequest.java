package com.doudian.open.api.order_getMCToken;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_getMCToken.param.*;

//auto generated, do not edit

public class OrderGetMCTokenRequest extends DoudianOpRequest<OrderGetMCTokenParam> {



	@Override
	public String getUrlPath(){
		return "/order/getMCToken";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderGetMCTokenResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}