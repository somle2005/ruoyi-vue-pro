package com.doudian.open.api.logistics_getRecommendedAndDeliveryExpressByOrder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderPrivilegeInfoListItem {


	@SerializedName("reason")
	@OpField(desc = "订单打标原因", example = "用户负反馈率高")
	private String reason;

	@SerializedName("label")
	@OpField(desc = "订单标签描述", example = "优先发货")
	private String label;

	@SerializedName("code")
	@OpField(desc = "订单标签code", example = "priority_delivery")
	private String code;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setReason(String reason){
		this.reason = reason;
	}

	
	public String getReason(){
		return this.reason;
	}

	
	public void setLabel(String label){
		this.label = label;
	}

	
	public String getLabel(){
		return this.label;
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

}