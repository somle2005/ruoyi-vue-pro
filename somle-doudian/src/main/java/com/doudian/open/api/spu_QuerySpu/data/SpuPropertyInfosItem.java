package com.doudian.open.api.spu_QuerySpu.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SpuPropertyInfosItem {


	@SerializedName("propertyId")
	@OpField(desc = "属性项ID", example = "1479")
	private Long propertyId;

	@SerializedName("propertyName")
	@OpField(desc = "属性项名称", example = "产品名称")
	private String propertyName;

	@SerializedName("propertyValues")
	@OpField(desc = "属性值信息", example = "")
	private List<PropertyValuesItem> propertyValues;

	@SerializedName("propertyType")
	@OpField(desc = "属性类型：0-绑定属性 1-关键属性 2-销售属性", example = "1")
	private Long propertyType;


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

	
	public void setPropertyName(String propertyName){
		this.propertyName = propertyName;
	}

	
	public String getPropertyName(){
		return this.propertyName;
	}

	
	public void setPropertyValues(List<PropertyValuesItem> propertyValues){
		this.propertyValues = propertyValues;
	}

	
	public List<PropertyValuesItem> getPropertyValues(){
		return this.propertyValues;
	}

	
	public void setPropertyType(Long propertyType){
		this.propertyType = propertyType;
	}

	
	public Long getPropertyType(){
		return this.propertyType;
	}

}