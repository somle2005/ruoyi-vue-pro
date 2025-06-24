package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class CustomPropertyListItem {


	@SerializedName("property_details")
	@OpField(desc = "属性详情列表", example = "")
	private List<PropertyDetailsItem> propertyDetails;

	@SerializedName("group_name")
	@OpField(desc = "属性组名称", example = "温度")
	private String groupName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPropertyDetails(List<PropertyDetailsItem> propertyDetails){
		this.propertyDetails = propertyDetails;
	}

	
	public List<PropertyDetailsItem> getPropertyDetails(){
		return this.propertyDetails;
	}

	
	public void setGroupName(String groupName){
		this.groupName = groupName;
	}

	
	public String getGroupName(){
		return this.groupName;
	}

}