package com.doudian.open.spi.topup_CreateOrderPreCheck;

import com.doudian.open.core.DoudianOpSpiRequest;
import com.doudian.open.core.DoudianOpSpiResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.spi.topup_CreateOrderPreCheck.param.*;

//auto generated, do not edit

public class TopupCreateOrderPreCheckRequest extends DoudianOpSpiRequest<TopupCreateOrderPreCheckParam> {



	@Override
	public  Class<? extends DoudianOpSpiResponse<?>> getResponseClass(){
		return TopupCreateOrderPreCheckResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public static TopupCreateOrderPreCheckRequest wrap(Object config){
		TopupCreateOrderPreCheckRequest ret = new TopupCreateOrderPreCheckRequest();
		ret.initWithConfig(config);
		return ret;
	}

}