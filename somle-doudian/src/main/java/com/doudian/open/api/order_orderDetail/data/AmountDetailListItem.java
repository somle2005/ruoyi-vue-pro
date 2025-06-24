package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AmountDetailListItem {


	@SerializedName("amount")
	@OpField(desc = "追缴金额，单位是“分”", example = "100")
	private Long amount;

	@SerializedName("type")
	@OpField(desc = "追缴类型，instant_discount-以旧换新下单立减，actual_deduction_amount-先享换新抵扣金额。", example = "instant_discount")
	private String type;

	@SerializedName("type_desc")
	@OpField(desc = "目前有先享换新抵扣金额和以旧换新下单立减两种", example = "先享换新抵扣金额")
	private String typeDesc;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAmount(Long amount){
		this.amount = amount;
	}

	
	public Long getAmount(){
		return this.amount;
	}

	
	public void setType(String type){
		this.type = type;
	}

	
	public String getType(){
		return this.type;
	}

	
	public void setTypeDesc(String typeDesc){
		this.typeDesc = typeDesc;
	}

	
	public String getTypeDesc(){
		return this.typeDesc;
	}

}