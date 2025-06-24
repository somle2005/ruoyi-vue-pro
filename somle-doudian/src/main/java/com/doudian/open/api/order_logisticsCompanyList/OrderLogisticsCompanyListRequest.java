package com.doudian.open.api.order_logisticsCompanyList;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_logisticsCompanyList.param.*;

//auto generated, do not edit

public class OrderLogisticsCompanyListRequest extends DoudianOpRequest<OrderLogisticsCompanyListParam> {



	@Override
	public String getUrlPath(){
		return "/order/logisticsCompanyList";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderLogisticsCompanyListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}