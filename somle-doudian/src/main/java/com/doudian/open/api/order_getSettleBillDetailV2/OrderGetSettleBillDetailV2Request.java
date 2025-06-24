package com.doudian.open.api.order_getSettleBillDetailV2;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_getSettleBillDetailV2.param.*;

//auto generated, do not edit

public class OrderGetSettleBillDetailV2Request extends DoudianOpRequest<OrderGetSettleBillDetailV2Param> {



	@Override
	public String getUrlPath(){
		return "/order/getSettleBillDetailV2";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderGetSettleBillDetailV2Response.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}