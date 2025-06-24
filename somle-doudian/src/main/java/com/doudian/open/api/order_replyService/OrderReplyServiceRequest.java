package com.doudian.open.api.order_replyService;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_replyService.param.*;

//auto generated, do not edit

public class OrderReplyServiceRequest extends DoudianOpRequest<OrderReplyServiceParam> {



	@Override
	public String getUrlPath(){
		return "/order/replyService";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderReplyServiceResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}