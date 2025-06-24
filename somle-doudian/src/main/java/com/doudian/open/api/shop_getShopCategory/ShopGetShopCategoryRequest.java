package com.doudian.open.api.shop_getShopCategory;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.shop_getShopCategory.param.*;

//auto generated, do not edit

public class ShopGetShopCategoryRequest extends DoudianOpRequest<ShopGetShopCategoryParam> {



	@Override
	public String getUrlPath(){
		return "/shop/getShopCategory";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ShopGetShopCategoryResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}