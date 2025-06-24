package com.doudian.open.api.warehouse_setAddr;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.warehouse_setAddr.param.*;

//auto generated, do not edit

public class WarehouseSetAddrRequest extends DoudianOpRequest<WarehouseSetAddrParam> {



	@Override
	public String getUrlPath(){
		return "/warehouse/setAddr";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return WarehouseSetAddrResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}