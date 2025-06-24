package com.doudian.open.api.product_previewChannelProduct;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_previewChannelProduct.param.*;

//auto generated, do not edit

public class ProductPreviewChannelProductRequest extends DoudianOpRequest<ProductPreviewChannelProductParam> {



	@Override
	public String getUrlPath(){
		return "/product/previewChannelProduct";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductPreviewChannelProductResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}