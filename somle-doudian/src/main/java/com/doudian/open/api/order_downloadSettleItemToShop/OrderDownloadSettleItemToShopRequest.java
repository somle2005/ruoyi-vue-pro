package com.doudian.open.api.order_downloadSettleItemToShop;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_downloadSettleItemToShop.param.*;

//auto generated, do not edit

public class OrderDownloadSettleItemToShopRequest extends DoudianOpRequest<OrderDownloadSettleItemToShopParam> {



	@Override
	public String getUrlPath(){
		return "/order/downloadSettleItemToShop";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderDownloadSettleItemToShopResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}