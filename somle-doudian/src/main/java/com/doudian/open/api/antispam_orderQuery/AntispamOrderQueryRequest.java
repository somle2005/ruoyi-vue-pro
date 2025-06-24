package com.doudian.open.api.antispam_orderQuery;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.antispam_orderQuery.param.*;

//auto generated, do not edit

public class AntispamOrderQueryRequest extends DoudianOpRequest<AntispamOrderQueryParam> {



	@Override
	public String getUrlPath(){
		return "/antispam/orderQuery";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AntispamOrderQueryResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}