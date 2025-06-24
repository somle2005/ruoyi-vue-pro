package com.doudian.open.api.warehouse_setPriority;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.warehouse_setPriority.param.*;

//auto generated, do not edit

public class WarehouseSetPriorityRequest extends DoudianOpRequest<WarehouseSetPriorityParam> {



	@Override
	public String getUrlPath(){
		return "/warehouse/setPriority";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return WarehouseSetPriorityResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}