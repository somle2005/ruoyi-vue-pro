package com.doudian.open.api.order_getSettleBillDetail;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_getSettleBillDetail.param.*;

//auto generated, do not edit

public class OrderGetSettleBillDetailRequest extends DoudianOpRequest<OrderGetSettleBillDetailParam> {



	@Override
	public String getUrlPath(){
		return "/order/getSettleBillDetail";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderGetSettleBillDetailResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}