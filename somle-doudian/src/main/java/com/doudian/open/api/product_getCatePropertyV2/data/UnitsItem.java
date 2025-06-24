package com.doudian.open.api.product_getCatePropertyV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class UnitsItem {


	@SerializedName("unit_name")
	@OpField(desc = "单位名称", example = "克")
	private String unitName;

	@SerializedName("unit_id")
	@OpField(desc = "单位id", example = "1")
	private Long unitId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setUnitName(String unitName){
		this.unitName = unitName;
	}

	
	public String getUnitName(){
		return this.unitName;
	}

	
	public void setUnitId(Long unitId){
		this.unitId = unitId;
	}

	
	public Long getUnitId(){
		return this.unitId;
	}

}