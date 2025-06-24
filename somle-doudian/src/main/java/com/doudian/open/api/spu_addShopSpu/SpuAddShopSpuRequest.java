package com.doudian.open.api.spu_addShopSpu;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.spu_addShopSpu.param.*;

//auto generated, do not edit

public class SpuAddShopSpuRequest extends DoudianOpRequest<SpuAddShopSpuParam> {



	@Override
	public String getUrlPath(){
		return "/spu/addShopSpu";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SpuAddShopSpuResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}