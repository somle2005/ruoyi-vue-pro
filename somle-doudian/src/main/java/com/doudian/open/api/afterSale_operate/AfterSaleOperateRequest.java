package com.doudian.open.api.afterSale_operate;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.afterSale_operate.param.*;

//auto generated, do not edit

public class AfterSaleOperateRequest extends DoudianOpRequest<AfterSaleOperateParam> {



	@Override
	public String getUrlPath(){
		return "/afterSale/operate";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AfterSaleOperateResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}