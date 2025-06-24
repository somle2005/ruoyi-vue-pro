package com.doudian.open.api.order_uploadextrapackage.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderUploadextrapackageData {


	@SerializedName("deliver_id")
	@OpField(desc = "此次发货行为对应的包裹ID", example = "6919571420622558781")
	private String deliverId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDeliverId(String deliverId){
		this.deliverId = deliverId;
	}

	
	public String getDeliverId(){
		return this.deliverId;
	}

}