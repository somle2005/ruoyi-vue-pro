package com.doudian.open.api.product_applyMainPicVideo;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_applyMainPicVideo.param.*;

//auto generated, do not edit

public class ProductApplyMainPicVideoRequest extends DoudianOpRequest<ProductApplyMainPicVideoParam> {



	@Override
	public String getUrlPath(){
		return "/product/applyMainPicVideo";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductApplyMainPicVideoResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}