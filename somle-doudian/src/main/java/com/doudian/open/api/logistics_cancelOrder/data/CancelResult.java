package com.doudian.open.api.logistics_cancelOrder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CancelResult {


	@SerializedName("success")
	@OpField(desc = "true：取消成功 false 取消失败", example = "true")
	private Boolean success;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSuccess(Boolean success){
		this.success = success;
	}

	
	public Boolean getSuccess(){
		return this.success;
	}

}