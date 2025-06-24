package com.doudian.open.api.spu_queryBookNameByISBN;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.spu_queryBookNameByISBN.param.*;

//auto generated, do not edit

public class SpuQueryBookNameByISBNRequest extends DoudianOpRequest<SpuQueryBookNameByISBNParam> {



	@Override
	public String getUrlPath(){
		return "/spu/queryBookNameByISBN";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SpuQueryBookNameByISBNResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}