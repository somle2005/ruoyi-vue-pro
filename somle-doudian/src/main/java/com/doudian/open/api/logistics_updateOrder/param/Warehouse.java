package com.doudian.open.api.logistics_updateOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Warehouse {


	@SerializedName("is_sum_up")
	@OpField(required = true , desc = "目前该字段无效，统一传false", example= "true")
	private Boolean isSumUp;

	@SerializedName("wh_order_no")
	@OpField(required = false , desc = "仓库订单号(丹鸟等仓发链路使用)", example= "8837383")
	private String whOrderNo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setIsSumUp(Boolean isSumUp){
		this.isSumUp = isSumUp;
	}

	
	public Boolean getIsSumUp(){
		return this.isSumUp;
	}

	
	public void setWhOrderNo(String whOrderNo){
		this.whOrderNo = whOrderNo;
	}

	
	public String getWhOrderNo(){
		return this.whOrderNo;
	}

}