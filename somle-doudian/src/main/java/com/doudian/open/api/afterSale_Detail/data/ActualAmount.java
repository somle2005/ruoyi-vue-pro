package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ActualAmount {


	@SerializedName("price_text")
	@OpField(desc = "金额明细", example = "原订单商品总价（非实付价）")
	private String priceText;

	@SerializedName("amount")
	@OpField(desc = "金额", example = "894")
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