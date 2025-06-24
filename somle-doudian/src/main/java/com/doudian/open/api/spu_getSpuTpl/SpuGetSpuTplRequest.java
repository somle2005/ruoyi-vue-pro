package com.doudian.open.api.spu_getSpuTpl;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.spu_getSpuTpl.param.*;

//auto generated, do not edit

public class SpuGetSpuTplRequest extends DoudianOpRequest<SpuGetSpuTplParam> {



	@Override
	public String getUrlPath(){
		return "/spu/getSpuTpl";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SpuGetSpuTplResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}