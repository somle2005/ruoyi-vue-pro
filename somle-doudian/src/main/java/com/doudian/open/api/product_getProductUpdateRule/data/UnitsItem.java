package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class UnitsItem {


	@SerializedName("unit_id")
	@OpField(desc = "度量衡单位id", example = "2")
	private Long unitId;

	@SerializedName("unit_name")
	@OpField(desc = "度量衡单位名称", example = "g")
	private String unitName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setUnitId(Long unitId){
		this.unitId = unitId;
	}

	
	public Long getUnitId(){
		return this.unitId;
	}

	
	public void setUnitName(String unitName){
		this.unitName = unitName;
	}

	
	public String getUnitName(){
		return this.unitName;
	}

}