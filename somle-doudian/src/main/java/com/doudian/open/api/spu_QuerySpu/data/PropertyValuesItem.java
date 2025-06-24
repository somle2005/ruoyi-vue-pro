package com.doudian.open.api.spu_QuerySpu.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PropertyValuesItem {


	@SerializedName("valueId")
	@OpField(desc = "属性值ID", example = "0")
	private Long valueId;

	@SerializedName("valueName")
	@OpField(desc = "属性值名称", example = "神经酰胺修护霜")
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