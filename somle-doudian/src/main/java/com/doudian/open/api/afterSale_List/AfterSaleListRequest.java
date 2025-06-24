package com.doudian.open.api.afterSale_List;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.afterSale_List.param.*;

//auto generated, do not edit

public class AfterSaleListRequest extends DoudianOpRequest<AfterSaleListParam> {



	@Override
	public String getUrlPath(){
		return "/afterSale/List";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AfterSaleListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}