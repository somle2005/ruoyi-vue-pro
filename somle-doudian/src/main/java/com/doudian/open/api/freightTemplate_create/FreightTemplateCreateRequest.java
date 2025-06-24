package com.doudian.open.api.freightTemplate_create;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.freightTemplate_create.param.*;

//auto generated, do not edit

public class FreightTemplateCreateRequest extends DoudianOpRequest<FreightTemplateCreateParam> {



	@Override
	public String getUrlPath(){
		return "/freightTemplate/create";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return FreightTemplateCreateResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}