package com.doudian.open.api.warehouse_removeAddr;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.warehouse_removeAddr.param.*;

//auto generated, do not edit

public class WarehouseRemoveAddrRequest extends DoudianOpRequest<WarehouseRemoveAddrParam> {



	@Override
	public String getUrlPath(){
		return "/warehouse/removeAddr";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return WarehouseRemoveAddrResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}