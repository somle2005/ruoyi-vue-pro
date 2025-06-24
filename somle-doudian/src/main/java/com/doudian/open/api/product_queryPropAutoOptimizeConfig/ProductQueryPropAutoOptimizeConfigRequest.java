package com.doudian.open.api.product_queryPropAutoOptimizeConfig;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_queryPropAutoOptimizeConfig.param.*;

//auto generated, do not edit

public class ProductQueryPropAutoOptimizeConfigRequest extends DoudianOpRequest<ProductQueryPropAutoOptimizeConfigParam> {



	@Override
	public String getUrlPath(){
		return "/product/queryPropAutoOptimizeConfig";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductQueryPropAutoOptimizeConfigResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}