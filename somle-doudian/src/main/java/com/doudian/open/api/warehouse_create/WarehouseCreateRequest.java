package com.doudian.open.api.warehouse_create;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.warehouse_create.param.*;

//auto generated, do not edit

public class WarehouseCreateRequest extends DoudianOpRequest<WarehouseCreateParam> {



	@Override
	public String getUrlPath(){
		return "/warehouse/create";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return WarehouseCreateResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}