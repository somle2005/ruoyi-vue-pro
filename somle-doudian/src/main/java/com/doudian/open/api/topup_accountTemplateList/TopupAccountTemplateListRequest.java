package com.doudian.open.api.topup_accountTemplateList;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.topup_accountTemplateList.param.*;

//auto generated, do not edit

public class TopupAccountTemplateListRequest extends DoudianOpRequest<TopupAccountTemplateListParam> {



	@Override
	public String getUrlPath(){
		return "/topup/accountTemplateList";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return TopupAccountTemplateListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}