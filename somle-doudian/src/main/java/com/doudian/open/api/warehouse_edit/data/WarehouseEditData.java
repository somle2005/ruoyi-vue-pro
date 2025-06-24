package com.doudian.open.api.warehouse_edit.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class WarehouseEditData {


	@SerializedName("data")
	@OpField(desc = "修改结果", example = "true")
	private Boolean data;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setData(Boolean data){
		this.data = data;
	}

	
	public Boolean getData(){
		return this.data;
	}

}