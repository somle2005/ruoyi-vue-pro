package com.doudian.open.api.warehouse_info.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class WarehouseInfoParam {


	@SerializedName("out_warehouse_id")
	@OpField(required = true , desc = "仓库编码", example= "ABC")
	private String outWarehouseId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOutWarehouseId(String outWarehouseId){
		this.outWarehouseId = outWarehouseId;
	}

	
	public String getOutWarehouseId(){
		return this.outWarehouseId;
	}

}