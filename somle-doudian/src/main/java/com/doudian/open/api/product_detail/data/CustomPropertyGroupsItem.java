package com.doudian.open.api.product_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class CustomPropertyGroupsItem {


	@SerializedName("propertyDetail")
	@OpField(desc = "属性详细信息", example = "")
	private List<PropertyDetailItem> propertyDetail;

	@SerializedName("name")
	@OpField(desc = "属性组名称", example = "加工方式")
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