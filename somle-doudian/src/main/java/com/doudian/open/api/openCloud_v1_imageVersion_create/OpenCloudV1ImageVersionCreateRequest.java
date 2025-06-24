package com.doudian.open.api.openCloud_v1_imageVersion_create;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.openCloud_v1_imageVersion_create.param.*;

//auto generated, do not edit

public class OpenCloudV1ImageVersionCreateRequest extends DoudianOpRequest<OpenCloudV1ImageVersionCreateParam> {



	@Override
	public String getUrlPath(){
		return "/openCloud/v1/imageVersion/create";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OpenCloudV1ImageVersionCreateResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}