package com.doudian.open.api.afterSale_Detail;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.afterSale_Detail.param.*;

//auto generated, do not edit

public class AfterSaleDetailRequest extends DoudianOpRequest<AfterSaleDetailParam> {



	@Override
	public String getUrlPath(){
		return "/afterSale/Detail";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AfterSaleDetailResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}