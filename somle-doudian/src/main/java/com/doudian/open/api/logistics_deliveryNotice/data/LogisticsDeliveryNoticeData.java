package com.doudian.open.api.logistics_deliveryNotice.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class LogisticsDeliveryNoticeData {


	@SerializedName("result")
	@OpField(desc = "是否成功", example = "true")
	private Boolean result;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setResult(Boolean result){
		this.result = result;
	}

	
	public Boolean getResult(){
		return this.result;
	}

}