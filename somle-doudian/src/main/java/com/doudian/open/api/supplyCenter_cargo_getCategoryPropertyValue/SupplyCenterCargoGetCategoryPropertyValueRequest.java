package com.doudian.open.api.supplyCenter_cargo_getCategoryPropertyValue;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.supplyCenter_cargo_getCategoryPropertyValue.param.*;

//auto generated, do not edit

public class SupplyCenterCargoGetCategoryPropertyValueRequest extends DoudianOpRequest<SupplyCenterCargoGetCategoryPropertyValueParam> {



	@Override
	public String getUrlPath(){
		return "/supplyCenter/cargo/getCategoryPropertyValue";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SupplyCenterCargoGetCategoryPropertyValueResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}