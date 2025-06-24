package com.doudian.open.api.warehouse_createV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class WarehouseCreateV2Data {


	@SerializedName("warehouse_id")
	@OpField(desc = "内部仓id", example = "7020436784400253228")
	private String warehouseId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setWarehouseId(String warehouseId){
		this.warehouseId = warehouseId;
	}

	
	public String getWarehouseId(){
		return this.warehouseId;
	}

}