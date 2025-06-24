package com.doudian.open.api.sku_syncStockBatchMultiProducts;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.sku_syncStockBatchMultiProducts.param.*;

//auto generated, do not edit

public class SkuSyncStockBatchMultiProductsRequest extends DoudianOpRequest<SkuSyncStockBatchMultiProductsParam> {



	@Override
	public String getUrlPath(){
		return "/sku/syncStockBatchMultiProducts";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SkuSyncStockBatchMultiProductsResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}