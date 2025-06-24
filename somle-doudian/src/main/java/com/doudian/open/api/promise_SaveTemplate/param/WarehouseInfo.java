package com.doudian.open.api.promise_SaveTemplate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class WarehouseInfo {


	@SerializedName("warehouse_id")
	@OpField(required = false , desc = "仓id", example= "736029680619")
	private String warehouseId;

	@SerializedName("warehouse_name")
	@OpField(required = false , desc = "仓名称", example= "杭州测试仓")
	private String warehouseName;


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

	
	public void setWarehouseName(String warehouseName){
		this.warehouseName = warehouseName;
	}

	
	public String getWarehouseName(){
		return this.warehouseName;
	}

}