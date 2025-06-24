package com.doudian.open.api.warehouse_list;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.warehouse_list.param.*;

//auto generated, do not edit

public class WarehouseListRequest extends DoudianOpRequest<WarehouseListParam> {



	@Override
	public String getUrlPath(){
		return "/warehouse/list";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return WarehouseListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}