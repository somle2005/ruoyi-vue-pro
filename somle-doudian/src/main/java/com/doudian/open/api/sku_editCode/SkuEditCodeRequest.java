package com.doudian.open.api.sku_editCode;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.sku_editCode.param.*;

//auto generated, do not edit

public class SkuEditCodeRequest extends DoudianOpRequest<SkuEditCodeParam> {



	@Override
	public String getUrlPath(){
		return "/sku/editCode";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SkuEditCodeResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}