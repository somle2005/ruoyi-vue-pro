package com.doudian.open.api.product_addChannelProduct.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ChannelBuyLimit {


	@SerializedName("total_buy_num")
	@OpField(required = false , desc = "单用户累计购买上限数", example= "10")
	private Long totalBuyNum;

	@SerializedName("max_buy_num")
	@OpField(required = false , desc = "每次购买上限数", example= "5")
	private Long maxBuyNum;

	@SerializedName("min_buy_num")
	@OpField(required = false , desc = "每次至少购买数", example= "1")
	private Long minBuyNum;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTotalBuyNum(Long totalBuyNum){
		this.totalBuyNum = totalBuyNum;
	}

	
	public Long getTotalBuyNum(){
		return this.totalBuyNum;
	}

	
	public void setMaxBuyNum(Long maxBuyNum){
		this.maxBuyNum = maxBuyNum;
	}

	
	public Long getMaxBuyNum(){
		return this.maxBuyNum;
	}

	
	public void setMinBuyNum(Long minBuyNum){
		this.minBuyNum = minBuyNum;
	}

	
	public Long getMinBuyNum(){
		return this.minBuyNum;
	}

}