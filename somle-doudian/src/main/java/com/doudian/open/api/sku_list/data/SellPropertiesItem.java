package com.doudian.open.api.sku_list.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SellPropertiesItem {


	@SerializedName("value_spec_detail_id")
	@OpField(desc = "规格值id", example = "111")
	private Long valueSpecDetailId;

	@SerializedName("value_name")
	@OpField(desc = "规格值名称", example = "红色")
	private String valueName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setValueSpecDetailId(Long valueSpecDetailId){
		this.valueSpecDetailId = valueSpecDetailId;
	}

	
	public Long getValueSpecDetailId(){
		return this.valueSpecDetailId;
	}

	
	public void setValueName(String valueName){
		this.valueName = valueName;
	}

	
	public String getValueName(){
		return this.valueName;
	}

}