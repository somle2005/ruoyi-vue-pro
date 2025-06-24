package com.doudian.open.api.material_batchUploadVideoAsync;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.material_batchUploadVideoAsync.param.*;

//auto generated, do not edit

public class MaterialBatchUploadVideoAsyncRequest extends DoudianOpRequest<MaterialBatchUploadVideoAsyncParam> {



	@Override
	public String getUrlPath(){
		return "/material/batchUploadVideoAsync";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return MaterialBatchUploadVideoAsyncResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}