package com.doudian.open.api.product_setOffline;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_setOffline.param.*;

//auto generated, do not edit

public class ProductSetOfflineRequest extends DoudianOpRequest<ProductSetOfflineParam> {



	@Override
	public String getUrlPath(){
		return "/product/setOffline";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductSetOfflineResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}