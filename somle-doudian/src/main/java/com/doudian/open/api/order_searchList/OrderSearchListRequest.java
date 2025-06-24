package com.doudian.open.api.order_searchList;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_searchList.param.*;

//auto generated, do not edit

public class OrderSearchListRequest extends DoudianOpRequest<OrderSearchListParam> {



	@Override
	public String getUrlPath(){
		return "/order/searchList";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderSearchListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}