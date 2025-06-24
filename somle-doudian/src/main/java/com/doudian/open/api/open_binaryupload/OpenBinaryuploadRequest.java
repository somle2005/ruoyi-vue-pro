package com.doudian.open.api.open_binaryupload;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.open_binaryupload.param.*;

//auto generated, do not edit

public class OpenBinaryuploadRequest extends DoudianOpRequest<OpenBinaryuploadParam> {



	@Override
	public String getUrlPath(){
		return "/open/binaryupload";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OpenBinaryuploadResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}