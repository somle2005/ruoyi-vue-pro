package com.doudian.open.api.spu_getSpuInfoBySpuId;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.spu_getSpuInfoBySpuId.param.*;

//auto generated, do not edit

public class SpuGetSpuInfoBySpuIdRequest extends DoudianOpRequest<SpuGetSpuInfoBySpuIdParam> {



	@Override
	public String getUrlPath(){
		return "/spu/getSpuInfoBySpuId";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SpuGetSpuInfoBySpuIdResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}