package com.doudian.open.api.spu_createSpu;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.spu_createSpu.param.*;

//auto generated, do not edit

public class SpuCreateSpuRequest extends DoudianOpRequest<SpuCreateSpuParam> {



	@Override
	public String getUrlPath(){
		return "/spu/createSpu";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SpuCreateSpuResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}