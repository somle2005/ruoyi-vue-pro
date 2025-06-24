package com.doudian.open.api.order_getShopAccountItemFile;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_getShopAccountItemFile.param.*;

//auto generated, do not edit

public class OrderGetShopAccountItemFileRequest extends DoudianOpRequest<OrderGetShopAccountItemFileParam> {



	@Override
	public String getUrlPath(){
		return "/order/getShopAccountItemFile";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderGetShopAccountItemFileResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}