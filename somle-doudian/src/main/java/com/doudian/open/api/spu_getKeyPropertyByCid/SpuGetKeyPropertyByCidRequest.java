package com.doudian.open.api.spu_getKeyPropertyByCid;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.spu_getKeyPropertyByCid.param.*;

//auto generated, do not edit

public class SpuGetKeyPropertyByCidRequest extends DoudianOpRequest<SpuGetKeyPropertyByCidParam> {



	@Override
	public String getUrlPath(){
		return "/spu/getKeyPropertyByCid";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SpuGetKeyPropertyByCidResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}