package com.doudian.open.api.product_getCascadeValue.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductGetCascadeValueData {


	@SerializedName("properties")
	@OpField(desc = "级联属性", example = "")
	private List<PropertiesItem> properties;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProperties(List<PropertiesItem> properties){
		this.properties = properties;
	}

	
	public List<PropertiesItem> getProperties(){
		return this.properties;
	}

}