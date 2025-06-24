package com.doudian.open.api.warehouse_createBatch;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.warehouse_createBatch.param.*;

//auto generated, do not edit

public class WarehouseCreateBatchRequest extends DoudianOpRequest<WarehouseCreateBatchParam> {



	@Override
	public String getUrlPath(){
		return "/warehouse/createBatch";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return WarehouseCreateBatchResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}