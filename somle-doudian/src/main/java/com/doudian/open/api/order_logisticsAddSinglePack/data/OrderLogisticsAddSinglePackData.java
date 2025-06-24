package com.doudian.open.api.order_logisticsAddSinglePack.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderLogisticsAddSinglePackData {


	@SerializedName("pack_id")
	@OpField(desc = "包裹id", example = "7425745832857")
	private String packId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPackId(String packId){
		this.packId = packId;
	}

	
	public String getPackId(){
		return this.packId;
	}

}