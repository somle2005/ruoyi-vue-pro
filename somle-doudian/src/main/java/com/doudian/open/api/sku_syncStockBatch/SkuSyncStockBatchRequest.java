package com.doudian.open.api.sku_syncStockBatch;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.sku_syncStockBatch.param.*;

//auto generated, do not edit

public class SkuSyncStockBatchRequest extends DoudianOpRequest<SkuSyncStockBatchParam> {



	@Override
	public String getUrlPath(){
		return "/sku/syncStockBatch";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SkuSyncStockBatchResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}