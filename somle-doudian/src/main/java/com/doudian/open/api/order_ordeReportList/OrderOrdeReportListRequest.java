package com.doudian.open.api.order_ordeReportList;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_ordeReportList.param.*;

//auto generated, do not edit

public class OrderOrdeReportListRequest extends DoudianOpRequest<OrderOrdeReportListParam> {



	@Override
	public String getUrlPath(){
		return "/order/ordeReportList";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderOrdeReportListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}