package com.doudian.open.api.order_downloadShopAccountItem;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_downloadShopAccountItem.param.*;

//auto generated, do not edit

public class OrderDownloadShopAccountItemRequest extends DoudianOpRequest<OrderDownloadShopAccountItemParam> {



	@Override
	public String getUrlPath(){
		return "/order/downloadShopAccountItem";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderDownloadShopAccountItemResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}