package com.doudian.open.api.warehouse_setAddrBatch;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.warehouse_setAddrBatch.param.*;

//auto generated, do not edit

public class WarehouseSetAddrBatchRequest extends DoudianOpRequest<WarehouseSetAddrBatchParam> {



	@Override
	public String getUrlPath(){
		return "/warehouse/setAddrBatch";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return WarehouseSetAddrBatchResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}