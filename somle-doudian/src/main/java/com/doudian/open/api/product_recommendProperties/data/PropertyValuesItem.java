package com.doudian.open.api.product_recommendProperties.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PropertyValuesItem {


	@SerializedName("value_id")
	@OpField(desc = "属性值ID", example = "195685")
	private Long valueId;

	@SerializedName("value_name")
	@OpField(desc = "属性值名称", example = "厚款")
	private String valueName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setValueId(Long valueId){
		this.valueId = valueId;
	}

	
	public Long getValueId(){
		return this.valueId;
	}

	
	public void setValueName(String valueName){
		this.valueName = valueName;
	}

	
	public String getValueName(){
		return this.valueName;
	}

}