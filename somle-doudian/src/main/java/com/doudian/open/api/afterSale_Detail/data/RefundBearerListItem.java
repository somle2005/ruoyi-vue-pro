package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class RefundBearerListItem {


	@SerializedName("price_text")
	@OpField(desc = "文案", example = "商家实退差价")
	private String priceText;

	@SerializedName("amount")
	@OpField(desc = "金额", example = "124")
	private Long amount;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPriceText(String priceText){
		this.priceText = priceText;
	}

	
	public String getPriceText(){
		return this.priceText;
	}

	
	public void setAmount(Long amount){
		this.amount = amount;
	}

	
	public Long getAmount(){
		return this.amount;
	}

}