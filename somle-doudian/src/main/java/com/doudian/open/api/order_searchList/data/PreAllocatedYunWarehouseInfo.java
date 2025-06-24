package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PreAllocatedYunWarehouseInfo {


	@SerializedName("yun_warehouse_code")
	@OpField(desc = "云仓code", example = "001")
	private String yunWarehouseCode;

	@SerializedName("yun_warehouse_name")
	@OpField(desc = "云仓名称", example = "仓名称")
	private String yunWarehouseName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setYunWarehouseCode(String yunWarehouseCode){
		this.yunWarehouseCode = yunWarehouseCode;
	}

	
	public String getYunWarehouseCode(){
		return this.yunWarehouseCode;
	}

	
	public void setYunWarehouseName(String yunWarehouseName){
		this.yunWarehouseName = yunWarehouseName;
	}

	
	public String getYunWarehouseName(){
		return this.yunWarehouseName;
	}

}