package com.doudian.open.api.afterSale_applyLogisticsIntercept;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.afterSale_applyLogisticsIntercept.param.*;

//auto generated, do not edit

public class AfterSaleApplyLogisticsInterceptRequest extends DoudianOpRequest<AfterSaleApplyLogisticsInterceptParam> {



	@Override
	public String getUrlPath(){
		return "/afterSale/applyLogisticsIntercept";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AfterSaleApplyLogisticsInterceptResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}