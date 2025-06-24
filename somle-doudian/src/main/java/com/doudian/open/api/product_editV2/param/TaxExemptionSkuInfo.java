package com.doudian.open.api.product_editV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TaxExemptionSkuInfo {


	@SerializedName("volume")
	@OpField(required = false , desc = "净含量", example= "1")
	private Long volume;

	@SerializedName("suit_num")
	@OpField(required = false , desc = "套装数量", example= "1")
	private Long suitNum;

	@SerializedName("is_suit")
	@OpField(required = false , desc = "是否套装（0 否 1 是）", example= "1")
	private Integer isSuit;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setVolume(Long volume){
		this.volume = volume;
	}

	
	public Long getVolume(){
		return this.volume;
	}

	
	public void setSuitNum(Long suitNum){
		this.suitNum = suitNum;
	}

	
	public Long getSuitNum(){
		return this.suitNum;
	}

	
	public void setIsSuit(Integer isSuit){
		this.isSuit = isSuit;
	}

	
	public Integer getIsSuit(){
		return this.isSuit;
	}

}