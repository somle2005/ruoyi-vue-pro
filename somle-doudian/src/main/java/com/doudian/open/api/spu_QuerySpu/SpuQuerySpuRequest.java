package com.doudian.open.api.spu_QuerySpu;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.spu_QuerySpu.param.*;

//auto generated, do not edit

public class SpuQuerySpuRequest extends DoudianOpRequest<SpuQuerySpuParam> {



	@Override
	public String getUrlPath(){
		return "/spu/QuerySpu";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SpuQuerySpuResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}