package com.doudian.open.api.sku_stockNum;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.sku_stockNum.param.*;

//auto generated, do not edit

public class SkuStockNumRequest extends DoudianOpRequest<SkuStockNumParam> {



	@Override
	public String getUrlPath(){
		return "/sku/stockNum";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SkuStockNumResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}