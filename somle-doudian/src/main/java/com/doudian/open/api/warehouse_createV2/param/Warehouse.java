package com.doudian.open.api.warehouse_createV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Warehouse {


	@SerializedName("warehouse_location")
	@OpField(required = true , desc = "仓的地址编码", example= "")
	private WarehouseLocation warehouseLocation;

	@SerializedName("address_detail")
	@OpField(required = true , desc = "仓的地址详情", example= "朝阳区东风乡将台洼村铁道路口西北")
	private String addressDetail;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setWarehouseLocation(WarehouseLocation warehouseLocation){
		this.warehouseLocation = warehouseLocation;
	}

	
	public WarehouseLocation getWarehouseLocation(){
		return this.warehouseLocation;
	}

	
	public void setAddressDetail(String addressDetail){
		this.addressDetail = addressDetail;
	}

	
	public String getAddressDetail(){
		return this.addressDetail;
	}

}