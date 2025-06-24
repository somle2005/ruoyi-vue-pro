package com.doudian.open.api.freightTemplate_list;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.freightTemplate_list.param.*;

//auto generated, do not edit

public class FreightTemplateListRequest extends DoudianOpRequest<FreightTemplateListParam> {



	@Override
	public String getUrlPath(){
		return "/freightTemplate/list";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return FreightTemplateListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}