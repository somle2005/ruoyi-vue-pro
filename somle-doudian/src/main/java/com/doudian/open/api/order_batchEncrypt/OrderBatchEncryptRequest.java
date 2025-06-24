package com.doudian.open.api.order_batchEncrypt;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_batchEncrypt.param.*;

//auto generated, do not edit

public class OrderBatchEncryptRequest extends DoudianOpRequest<OrderBatchEncryptParam> {



	@Override
	public String getUrlPath(){
		return "/order/batchEncrypt";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderBatchEncryptResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}