package com.doudian.open.api.product_previewChannelProduct.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ChannelBuyLimit {


	@SerializedName("total_buy_num")
	@OpField(desc = "每用户总限购数", example = "5")
	private Long totalBuyNum;

	@SerializedName("max_buy_num")
	@OpField(desc = "单次购买上限", example = "2")
	private Long maxBuyNum;

	@SerializedName("min_buy_num")
	@OpField(desc = "单次限购下限", example = "1")
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