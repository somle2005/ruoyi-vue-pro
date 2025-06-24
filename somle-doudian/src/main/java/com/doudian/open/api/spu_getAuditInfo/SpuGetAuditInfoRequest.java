package com.doudian.open.api.spu_getAuditInfo;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.spu_getAuditInfo.param.*;

//auto generated, do not edit

public class SpuGetAuditInfoRequest extends DoudianOpRequest<SpuGetAuditInfoParam> {



	@Override
	public String getUrlPath(){
		return "/spu/getAuditInfo";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SpuGetAuditInfoResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}