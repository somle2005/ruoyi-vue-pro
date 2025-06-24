package com.doudian.open.api.address_listStrategyBindProducts;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.address_listStrategyBindProducts.param.*;

//auto generated, do not edit

public class AddressListStrategyBindProductsRequest extends DoudianOpRequest<AddressListStrategyBindProductsParam> {



	@Override
	public String getUrlPath(){
		return "/address/listStrategyBindProducts";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AddressListStrategyBindProductsResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}