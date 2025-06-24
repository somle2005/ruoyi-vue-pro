package com.doudian.open.api.afterSale_timeExtend;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.afterSale_timeExtend.param.*;

//auto generated, do not edit

public class AfterSaleTimeExtendRequest extends DoudianOpRequest<AfterSaleTimeExtendParam> {



	@Override
	public String getUrlPath(){
		return "/afterSale/timeExtend";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AfterSaleTimeExtendResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}