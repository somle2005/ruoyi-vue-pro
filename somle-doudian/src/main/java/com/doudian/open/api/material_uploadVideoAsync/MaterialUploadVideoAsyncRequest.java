package com.doudian.open.api.material_uploadVideoAsync;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.material_uploadVideoAsync.param.*;

//auto generated, do not edit

public class MaterialUploadVideoAsyncRequest extends DoudianOpRequest<MaterialUploadVideoAsyncParam> {



	@Override
	public String getUrlPath(){
		return "/material/uploadVideoAsync";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return MaterialUploadVideoAsyncResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}