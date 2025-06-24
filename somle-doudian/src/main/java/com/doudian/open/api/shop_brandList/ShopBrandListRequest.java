package com.doudian.open.api.shop_brandList;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.shop_brandList.param.*;

//auto generated, do not edit

public class ShopBrandListRequest extends DoudianOpRequest<ShopBrandListParam> {



	@Override
	public String getUrlPath(){
		return "/shop/brandList";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ShopBrandListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}