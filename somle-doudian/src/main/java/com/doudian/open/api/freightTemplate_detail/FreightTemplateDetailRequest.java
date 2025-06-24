package com.doudian.open.api.freightTemplate_detail;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.freightTemplate_detail.param.*;

//auto generated, do not edit

public class FreightTemplateDetailRequest extends DoudianOpRequest<FreightTemplateDetailParam> {



	@Override
	public String getUrlPath(){
		return "/freightTemplate/detail";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return FreightTemplateDetailResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}