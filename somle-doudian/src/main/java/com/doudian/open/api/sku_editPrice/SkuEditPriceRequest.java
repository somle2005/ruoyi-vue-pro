package com.doudian.open.api.sku_editPrice;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.sku_editPrice.param.*;

//auto generated, do not edit

public class SkuEditPriceRequest extends DoudianOpRequest<SkuEditPriceParam> {



	@Override
	public String getUrlPath(){
		return "/sku/editPrice";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SkuEditPriceResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}