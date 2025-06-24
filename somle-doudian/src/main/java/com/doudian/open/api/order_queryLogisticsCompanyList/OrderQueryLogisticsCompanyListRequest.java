package com.doudian.open.api.order_queryLogisticsCompanyList;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_queryLogisticsCompanyList.param.*;

//auto generated, do not edit

public class OrderQueryLogisticsCompanyListRequest extends DoudianOpRequest<OrderQueryLogisticsCompanyListParam> {



	@Override
	public String getUrlPath(){
		return "/order/queryLogisticsCompanyList";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderQueryLogisticsCompanyListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}