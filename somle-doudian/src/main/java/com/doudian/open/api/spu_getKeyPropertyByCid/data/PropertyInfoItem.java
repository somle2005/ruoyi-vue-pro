package com.doudian.open.api.spu_getKeyPropertyByCid.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PropertyInfoItem {


	@SerializedName("rel_value_id")
	@OpField(desc = "关联属性值id，例如手机类目，型号关联属性值id就是品牌的品牌id", example = "1001")
	private Long relValueId;

	@SerializedName("property_id")
	@OpField(desc = "属性id", example = "1487")
	private Long propertyId;

	@SerializedName("property_name")
	@OpField(desc = "属性名", example = "型号")
	private String propertyName;

	@SerializedName("value_id")
	@OpField(desc = "属性值id", example = "1001")
	private Long valueId;

	@SerializedName("value_name")
	@OpField(desc = "属性值名称", example = "iphone11")
	private String valueName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRelValueId(Long relValueId){
		this.relValueId = relValueId;
	}

	
	public Long getRelValueId(){
		return this.relValueId;
	}

	
	public void setPropertyId(Long propertyId){
		this.propertyId = propertyId;
	}

	
	public Long getPropertyId(){
		return this.propertyId;
	}

	
	public void setPropertyName(String propertyName){
		this.propertyName = propertyName;
	}

	
	public String getPropertyName(){
		return this.propertyName;
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