package com.doudian.open.api.spu_getSpuRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SpuActualImagesRule {


	@SerializedName("is_required")
	@OpField(desc = "是否必填", example = "1")
	private Long isRequired;

	@SerializedName("max_num")
	@OpField(desc = "最大数量", example = "5")
	private Long maxNum;

	@SerializedName("min_num")
	@OpField(desc = "最小数量", example = "1")
	private Long minNum;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setIsRequired(Long isRequired){
		this.isRequired = isRequired;
	}

	
	public Long getIsRequired(){
		return this.isRequired;
	}

	
	public void setMaxNum(Long maxNum){
		this.maxNum = maxNum;
	}

	
	public Long getMaxNum(){
		return this.maxNum;
	}

	
	public void setMinNum(Long minNum){
		this.minNum = minNum;
	}

	
	public Long getMinNum(){
		return this.minNum;
	}

}