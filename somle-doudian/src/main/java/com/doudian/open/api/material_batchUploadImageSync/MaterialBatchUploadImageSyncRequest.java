package com.doudian.open.api.material_batchUploadImageSync;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.material_batchUploadImageSync.param.*;

//auto generated, do not edit

public class MaterialBatchUploadImageSyncRequest extends DoudianOpRequest<MaterialBatchUploadImageSyncParam> {



	@Override
	public String getUrlPath(){
		return "/material/batchUploadImageSync";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return MaterialBatchUploadImageSyncResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}