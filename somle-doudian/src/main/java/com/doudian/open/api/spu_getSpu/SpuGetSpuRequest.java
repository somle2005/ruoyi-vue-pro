package com.doudian.open.api.spu_getSpu;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.spu_getSpu.param.*;

//auto generated, do not edit

public class SpuGetSpuRequest extends DoudianOpRequest<SpuGetSpuParam> {



	@Override
	public String getUrlPath(){
		return "/spu/getSpu";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SpuGetSpuResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}