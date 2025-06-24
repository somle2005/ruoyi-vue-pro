package com.doudian.open.api.warehouse_create.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class WarehouseCreateData {


	@SerializedName("data")
	@OpField(desc = "仓库id", example = "6853386941874864391")
	private Long data;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setData(Long data){
		this.data = data;
	}

	
	public Long getData(){
		return this.data;
	}

}