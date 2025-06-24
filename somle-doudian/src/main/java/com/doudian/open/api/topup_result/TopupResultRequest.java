package com.doudian.open.api.topup_result;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.topup_result.param.*;

//auto generated, do not edit

public class TopupResultRequest extends DoudianOpRequest<TopupResultParam> {



	@Override
	public String getUrlPath(){
		return "/topup/result";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return TopupResultResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}