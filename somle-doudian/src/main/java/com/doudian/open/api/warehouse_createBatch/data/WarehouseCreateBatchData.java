package com.doudian.open.api.warehouse_createBatch.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.Map;

//auto generated, do not edit

public class WarehouseCreateBatchData {


	@SerializedName("data")
	@OpField(desc = "key是outWarehouseId,value代表成功/失败", example = "{         qwb: true, // key是outWarehouseId         qwb1: true // value代表成功/失败     },")
	private Map<String,Boolean> data;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setData(Map<String,Boolean> data){
		this.data = data;
	}

	
	public Map<String,Boolean> getData(){
		return this.data;
	}

}