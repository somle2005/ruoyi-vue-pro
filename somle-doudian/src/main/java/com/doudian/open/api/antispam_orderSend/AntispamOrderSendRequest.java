package com.doudian.open.api.antispam_orderSend;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.antispam_orderSend.param.*;

//auto generated, do not edit

public class AntispamOrderSendRequest extends DoudianOpRequest<AntispamOrderSendParam> {



	@Override
	public String getUrlPath(){
		return "/antispam/orderSend";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AntispamOrderSendResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}