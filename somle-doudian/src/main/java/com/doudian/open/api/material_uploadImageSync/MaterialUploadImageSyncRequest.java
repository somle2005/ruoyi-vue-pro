package com.doudian.open.api.material_uploadImageSync;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.material_uploadImageSync.param.*;

//auto generated, do not edit

public class MaterialUploadImageSyncRequest extends DoudianOpRequest<MaterialUploadImageSyncParam> {



	@Override
	public String getUrlPath(){
		return "/material/uploadImageSync";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return MaterialUploadImageSyncResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}