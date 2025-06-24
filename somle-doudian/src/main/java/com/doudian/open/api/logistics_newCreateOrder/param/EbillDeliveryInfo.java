package com.doudian.open.api.logistics_newCreateOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class EbillDeliveryInfo {


	@SerializedName("scene")
	@OpField(required = false , desc = "枚举（OnlineShip）", example= "场景")
	private String scene;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setScene(String scene){
		this.scene = scene;
	}

	
	public String getScene(){
		return this.scene;
	}

}