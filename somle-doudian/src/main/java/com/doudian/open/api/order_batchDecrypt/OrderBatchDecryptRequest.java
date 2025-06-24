package com.doudian.open.api.order_batchDecrypt;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_batchDecrypt.param.*;

//auto generated, do not edit

public class OrderBatchDecryptRequest extends DoudianOpRequest<OrderBatchDecryptParam> {



	@Override
	public String getUrlPath(){
		return "/order/batchDecrypt";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderBatchDecryptResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}