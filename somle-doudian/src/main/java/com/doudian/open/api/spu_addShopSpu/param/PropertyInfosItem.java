package com.doudian.open.api.spu_addShopSpu.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PropertyInfosItem {


	@SerializedName("property_id")
	@OpField(required = true , desc = "属性id", example= "1493")
	private Long propertyId;

	@SerializedName("value_id")
	@OpField(required = true , desc = "属性值id,可输入类型的属性valueId为0", example= "10001")
	private Long valueId;

	@SerializedName("parent_value_id")
	@OpField(required = false , desc = "父属性值id", example= "0")
	private Long parentValueId;

	@SerializedName("level")
	@OpField(required = false , desc = "属性层级", example= "1")
	private Long level;

	@SerializedName("value_name")
	@OpField(required = false , desc = "属性值名称，非可输入类型时不用传", example= "")
	private String valueName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPropertyId(Long propertyId){
		this.propertyId = propertyId;
	}

	
	public Long getPropertyId(){
		return this.propertyId;
	}

	
	public void setValueId(Long valueId){
		this.valueId = valueId;
	}

	
	public Long getValueId(){
		return this.valueId;
	}

	
	public void setParentValueId(Long parentValueId){
		this.parentValueId = parentValueId;
	}

	
	public Long getParentValueId(){
		return this.parentValueId;
	}

	
	public void setLevel(Long level){
		this.level = level;
	}

	
	public Long getLevel(){
		return this.level;
	}

	
	public void setValueName(String valueName){
		this.valueName = valueName;
	}

	
	public String getValueName(){
		return this.valueName;
	}

}