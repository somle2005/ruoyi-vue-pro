package com.doudian.open.api.order_downloadToShop;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_downloadToShop.param.*;

//auto generated, do not edit

public class OrderDownloadToShopRequest extends DoudianOpRequest<OrderDownloadToShopParam> {



	@Override
	public String getUrlPath(){
		return "/order/downloadToShop";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderDownloadToShopResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}