package com.doudian.open.api.buyin_promotionStrategyList.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CosRangeFilter {


	@SerializedName("type")
	@OpField(required = true , desc = "0：区间；1：大于上限；2：小于下限；3：不限", example= "0")
	private Long type;

	@SerializedName("low")
	@OpField(required = true , desc = "20%传20", example= "50")
	private Long low;

	@SerializedName("up")
	@OpField(required = true , desc = "20%传20", example= "45")
	private Long up;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setType(Long type){
		this.type = type;
	}

	
	public Long getType(){
		return this.type;
	}

	
	public void setLow(Long low){
		this.low = low;
	}

	
	public Long getLow(){
		return this.low;
	}

	
	public void setUp(Long up){
		this.up = up;
	}

	
	public Long getUp(){
		return this.up;
	}

}