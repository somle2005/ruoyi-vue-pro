package com.doudian.open.api.afterSale_openOutAfterSale;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.afterSale_openOutAfterSale.param.*;

//auto generated, do not edit

public class AfterSaleOpenOutAfterSaleRequest extends DoudianOpRequest<AfterSaleOpenOutAfterSaleParam> {



	@Override
	public String getUrlPath(){
		return "/afterSale/openOutAfterSale";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AfterSaleOpenOutAfterSaleResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}