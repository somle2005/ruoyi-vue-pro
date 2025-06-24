package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class GivenProductActivityInfo {


	@SerializedName("given_product_activity_type")
	@OpField(desc = "NORMAL-普通的买赠，AMOUNT-满件赠，PRICE-满元赠", example = "NORMAL")
	private String givenProductActivityType;

	@SerializedName("given_product_activity_value")
	@OpField(desc = "满几件赠或满几元赠，满元赠场景单位是分", example = "200")
	private String givenProductActivityValue;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setGivenProductActivityType(String givenProductActivityType){
		this.givenProductActivityType = givenProductActivityType;
	}

	
	public String getGivenProductActivityType(){
		return this.givenProductActivityType;
	}

	
	public void setGivenProductActivityValue(String givenProductActivityValue){
		this.givenProductActivityValue = givenProductActivityValue;
	}

	
	public String getGivenProductActivityValue(){
		return this.givenProductActivityValue;
	}

}