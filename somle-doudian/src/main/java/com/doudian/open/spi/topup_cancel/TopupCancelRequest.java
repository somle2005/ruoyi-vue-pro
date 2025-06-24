package com.doudian.open.spi.topup_cancel;

import com.doudian.open.core.DoudianOpSpiRequest;
import com.doudian.open.core.DoudianOpSpiResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.spi.topup_cancel.param.*;

//auto generated, do not edit

public class TopupCancelRequest extends DoudianOpSpiRequest<TopupCancelParam> {



	@Override
	public  Class<? extends DoudianOpSpiResponse<?>> getResponseClass(){
		return TopupCancelResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public static TopupCancelRequest wrap(Object config){
		TopupCancelRequest ret = new TopupCancelRequest();
		ret.initWithConfig(config);
		return ret;
	}

}