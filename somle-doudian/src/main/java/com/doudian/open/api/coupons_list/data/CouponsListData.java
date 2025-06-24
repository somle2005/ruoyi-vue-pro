package com.doudian.open.api.coupons_list.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CouponsListData {


	@SerializedName("data")
	@OpField(desc = "列表", example = "1")
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