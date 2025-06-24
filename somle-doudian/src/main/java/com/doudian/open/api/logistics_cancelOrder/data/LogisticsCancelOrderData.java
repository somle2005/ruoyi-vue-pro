package com.doudian.open.api.logistics_cancelOrder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class LogisticsCancelOrderData {


	@SerializedName("cancel_result")
	@OpField(desc = "取消状态", example = "")
	private CancelResult cancelResult;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCancelResult(CancelResult cancelResult){
		this.cancelResult = cancelResult;
	}

	
	public CancelResult getCancelResult(){
		return this.cancelResult;
	}

}