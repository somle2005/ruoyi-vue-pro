package com.doudian.open.api.product_delProductMainPicVideo;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_delProductMainPicVideo.param.*;

//auto generated, do not edit

public class ProductDelProductMainPicVideoRequest extends DoudianOpRequest<ProductDelProductMainPicVideoParam> {



	@Override
	public String getUrlPath(){
		return "/product/delProductMainPicVideo";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductDelProductMainPicVideoResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}