package com.doudian.open.api.order_getShopAccountItem;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_getShopAccountItem.param.*;

//auto generated, do not edit

public class OrderGetShopAccountItemRequest extends DoudianOpRequest<OrderGetShopAccountItemParam> {



	@Override
	public String getUrlPath(){
		return "/order/getShopAccountItem";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderGetShopAccountItemResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}