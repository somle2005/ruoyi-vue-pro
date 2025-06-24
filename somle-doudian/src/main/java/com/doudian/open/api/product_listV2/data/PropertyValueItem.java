package com.doudian.open.api.product_listV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PropertyValueItem {


	@SerializedName("value_id")
	@OpField(desc = "属性值id", example = "0")
	private Long valueId;

	@SerializedName("value_name")
	@OpField(desc = "属性值名称", example = "123456")
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