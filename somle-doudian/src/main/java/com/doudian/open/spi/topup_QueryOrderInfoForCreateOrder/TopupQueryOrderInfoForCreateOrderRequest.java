package com.doudian.open.spi.topup_QueryOrderInfoForCreateOrder;

import com.doudian.open.core.DoudianOpSpiRequest;
import com.doudian.open.core.DoudianOpSpiResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.spi.topup_QueryOrderInfoForCreateOrder.param.*;

//auto generated, do not edit

public class TopupQueryOrderInfoForCreateOrderRequest extends DoudianOpSpiRequest<TopupQueryOrderInfoForCreateOrderParam> {



	@Override
	public  Class<? extends DoudianOpSpiResponse<?>> getResponseClass(){
		return TopupQueryOrderInfoForCreateOrderResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public static TopupQueryOrderInfoForCreateOrderRequest wrap(Object config){
		TopupQueryOrderInfoForCreateOrderRequest ret = new TopupQueryOrderInfoForCreateOrderRequest();
		ret.initWithConfig(config);
		return ret;
	}

}