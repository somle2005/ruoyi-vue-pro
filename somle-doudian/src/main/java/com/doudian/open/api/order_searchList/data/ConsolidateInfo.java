package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ConsolidateInfo {


	@SerializedName("consolidate_type")
	@OpField(desc = "中转类型，1-新疆中转", example = "1")
	private Long consolidateType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setConsolidateType(Long consolidateType){
		this.consolidateType = consolidateType;
	}

	
	public Long getConsolidateType(){
		return this.consolidateType;
	}

}