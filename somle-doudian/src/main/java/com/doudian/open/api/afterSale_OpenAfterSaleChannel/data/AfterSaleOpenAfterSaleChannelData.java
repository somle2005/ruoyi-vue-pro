package com.doudian.open.api.afterSale_OpenAfterSaleChannel.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AfterSaleOpenAfterSaleChannelData {


	@SerializedName("conclusion")
	@OpField(desc = "打开售后通道结论", example = "")
	private Conclusion conclusion;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setConclusion(Conclusion conclusion){
		this.conclusion = conclusion;
	}

	
	public Conclusion getConclusion(){
		return this.conclusion;
	}

}