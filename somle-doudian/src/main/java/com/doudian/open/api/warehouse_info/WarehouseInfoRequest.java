package com.doudian.open.api.warehouse_info;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.warehouse_info.param.*;

//auto generated, do not edit

public class WarehouseInfoRequest extends DoudianOpRequest<WarehouseInfoParam> {



	@Override
	public String getUrlPath(){
		return "/warehouse/info";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return WarehouseInfoResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}