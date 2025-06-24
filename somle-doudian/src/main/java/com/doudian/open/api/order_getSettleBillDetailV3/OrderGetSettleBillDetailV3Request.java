package com.doudian.open.api.order_getSettleBillDetailV3;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_getSettleBillDetailV3.param.*;

//auto generated, do not edit

public class OrderGetSettleBillDetailV3Request extends DoudianOpRequest<OrderGetSettleBillDetailV3Param> {



	@Override
	public String getUrlPath(){
		return "/order/getSettleBillDetailV3";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderGetSettleBillDetailV3Response.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}