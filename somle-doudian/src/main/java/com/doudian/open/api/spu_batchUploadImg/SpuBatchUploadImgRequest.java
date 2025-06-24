package com.doudian.open.api.spu_batchUploadImg;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.spu_batchUploadImg.param.*;

//auto generated, do not edit

public class SpuBatchUploadImgRequest extends DoudianOpRequest<SpuBatchUploadImgParam> {



	@Override
	public String getUrlPath(){
		return "/spu/batchUploadImg";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SpuBatchUploadImgResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}