package com.doudian.open.api.product_addV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class CustomProperty {


	@SerializedName("customPropertyGroups")
	@OpField(required = false , desc = "定制属性组信息，如：加工服务", example= "")
	private List<CustomPropertyGroupsItem> customPropertyGroups;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCustomPropertyGroups(List<CustomPropertyGroupsItem> customPropertyGroups){
		this.customPropertyGroups = customPropertyGroups;
	}

	
	public List<CustomPropertyGroupsItem> getCustomPropertyGroups(){
		return this.customPropertyGroups;
	}

}