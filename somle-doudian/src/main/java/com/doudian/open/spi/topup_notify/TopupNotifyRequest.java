package com.doudian.open.spi.topup_notify;

import com.doudian.open.core.DoudianOpSpiRequest;
import com.doudian.open.core.DoudianOpSpiResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.spi.topup_notify.param.*;

//auto generated, do not edit

public class TopupNotifyRequest extends DoudianOpSpiRequest<TopupNotifyParam> {



	@Override
	public  Class<? extends DoudianOpSpiResponse<?>> getResponseClass(){
		return TopupNotifyResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public static TopupNotifyRequest wrap(Object config){
		TopupNotifyRequest ret = new TopupNotifyRequest();
		ret.initWithConfig(config);
		return ret;
	}

}