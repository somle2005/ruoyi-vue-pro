package com.doudian.open.api.warehouse_edit;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.warehouse_edit.param.*;

//auto generated, do not edit

public class WarehouseEditRequest extends DoudianOpRequest<WarehouseEditParam> {



	@Override
	public String getUrlPath(){
		return "/warehouse/edit";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return WarehouseEditResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}