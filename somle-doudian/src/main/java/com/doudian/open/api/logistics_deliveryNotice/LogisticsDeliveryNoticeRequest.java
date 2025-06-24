package com.doudian.open.api.logistics_deliveryNotice;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.logistics_deliveryNotice.param.*;

//auto generated, do not edit

public class LogisticsDeliveryNoticeRequest extends DoudianOpRequest<LogisticsDeliveryNoticeParam> {



	@Override
	public String getUrlPath(){
		return "/logistics/deliveryNotice";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return LogisticsDeliveryNoticeResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}