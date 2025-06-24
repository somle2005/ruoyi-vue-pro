package com.doudian.open.api.product_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TaxExemptionSkuInfo {


	@SerializedName("is_suit")
	@OpField(desc = "是否套装（0 否 1 是）", example = "1")
	private Integer isSuit;

	@SerializedName("suit_num")
	@OpField(desc = "套装数量", example = "10")
	private Long suitNum;

	@SerializedName("volume")
	@OpField(desc = "净含量", example = "100")
	private Long volume;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setIsSuit(Integer isSuit){
		this.isSuit = isSuit;
	}

	
	public Integer getIsSuit(){
		return this.isSuit;
	}

	
	public void setSuitNum(Long suitNum){
		this.suitNum = suitNum;
	}

	
	public Long getSuitNum(){
		return this.suitNum;
	}

	
	public void setVolume(Long volume){
		this.volume = volume;
	}

	
	public Long getVolume(){
		return this.volume;
	}

}