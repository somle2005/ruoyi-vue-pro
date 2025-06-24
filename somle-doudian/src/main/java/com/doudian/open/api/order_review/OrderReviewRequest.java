package com.doudian.open.api.order_review;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_review.param.*;

//auto generated, do not edit

public class OrderReviewRequest extends DoudianOpRequest<OrderReviewParam> {



	@Override
	public String getUrlPath(){
		return "/order/review";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderReviewResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}