package com.doudian.open.api.product_getCascadeValue.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CascadeInfoItem {


	@SerializedName("value_id")
	@OpField(required = true , desc = "属性值id", example= "111")
	private Long valueId;

	@SerializedName("value_name")
	@OpField(required = true , desc = "属性值名称", example= "华为")
	private String valueName;

	@SerializedName("cascade_id")
	@OpField(required = true , desc = "级联id，第一次传0，后续查询使用上一次的查询结果中的cascade_id", example= "122")
	private Long cascadeId;


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

	
	public void setCascadeId(Long cascadeId){
		this.cascadeId = cascadeId;
	}

	
	public Long getCascadeId(){
		return this.cascadeId;
	}

}