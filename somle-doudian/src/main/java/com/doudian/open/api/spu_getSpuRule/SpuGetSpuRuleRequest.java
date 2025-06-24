package com.doudian.open.api.spu_getSpuRule;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.spu_getSpuRule.param.*;

//auto generated, do not edit

public class SpuGetSpuRuleRequest extends DoudianOpRequest<SpuGetSpuRuleParam> {



	@Override
	public String getUrlPath(){
		return "/spu/getSpuRule";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SpuGetSpuRuleResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}