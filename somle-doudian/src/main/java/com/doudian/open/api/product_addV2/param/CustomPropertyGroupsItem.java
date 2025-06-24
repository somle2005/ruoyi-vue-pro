package com.doudian.open.api.product_addV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class CustomPropertyGroupsItem {


	@SerializedName("propertyDetail")
	@OpField(required = false , desc = "定制属性信息，如：宰杀，不宰杀", example= "")
	private List<PropertyDetailItem> propertyDetail;

	@SerializedName("name")
	@OpField(required = false , desc = "定制属性组名称", example= "加工服务")
	private String name;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPropertyDetail(List<PropertyDetailItem> propertyDetail){
		this.propertyDetail = propertyDetail;
	}

	
	public List<PropertyDetailItem> getPropertyDetail(){
		return this.propertyDetail;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

}