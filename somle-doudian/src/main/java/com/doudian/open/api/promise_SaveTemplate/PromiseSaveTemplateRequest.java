package com.doudian.open.api.promise_SaveTemplate;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.promise_SaveTemplate.param.*;

//auto generated, do not edit

public class PromiseSaveTemplateRequest extends DoudianOpRequest<PromiseSaveTemplateParam> {



	@Override
	public String getUrlPath(){
		return "/promise/SaveTemplate";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return PromiseSaveTemplateResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}