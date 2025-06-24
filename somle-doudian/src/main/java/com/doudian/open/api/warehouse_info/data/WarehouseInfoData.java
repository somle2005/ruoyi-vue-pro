package com.doudian.open.api.warehouse_info.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class WarehouseInfoData {


	@SerializedName("data")
	@OpField(desc = "仓库信息", example = "-")
	private Data data;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setData(Data data){
		this.data = data;
	}

	
	public Data getData(){
		return this.data;
	}

}