package com.doudian.open.api.afterSale_fillLogistics;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.afterSale_fillLogistics.param.*;

//auto generated, do not edit

public class AfterSaleFillLogisticsRequest extends DoudianOpRequest<AfterSaleFillLogisticsParam> {



	@Override
	public String getUrlPath(){
		return "/afterSale/fillLogistics";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AfterSaleFillLogisticsResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}