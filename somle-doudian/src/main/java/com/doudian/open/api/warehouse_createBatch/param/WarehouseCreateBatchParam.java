package com.doudian.open.api.warehouse_createBatch.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class WarehouseCreateBatchParam {


	@SerializedName("out_warehouse_list")
	@OpField(required = true , desc = "外部仓信息列表", example= "-")
	private List<OutWarehouseListItem> outWarehouseList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOutWarehouseList(List<OutWarehouseListItem> outWarehouseList){
		this.outWarehouseList = outWarehouseList;
	}

	
	public List<OutWarehouseListItem> getOutWarehouseList(){
		return this.outWarehouseList;
	}

}