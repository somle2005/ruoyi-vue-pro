package com.doudian.open.api.warehouse_createV2;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.warehouse_createV2.param.*;

//auto generated, do not edit

public class WarehouseCreateV2Request extends DoudianOpRequest<WarehouseCreateV2Param> {



	@Override
	public String getUrlPath(){
		return "/warehouse/createV2";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return WarehouseCreateV2Response.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}