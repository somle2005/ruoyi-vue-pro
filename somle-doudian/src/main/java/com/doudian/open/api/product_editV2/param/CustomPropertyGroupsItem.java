package com.doudian.open.api.product_editV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class CustomPropertyGroupsItem {


	@SerializedName("name")
	@OpField(required = false , desc = "商品定制属性组名称", example= "加工服务")
	private String name;

	@SerializedName("propertyDetail")
	@OpField(required = false , desc = "商品定制属性明细", example= "")
	private List<PropertyDetailItem> propertyDetail;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setPropertyDetail(List<PropertyDetailItem> propertyDetail){
		this.propertyDetail = propertyDetail;
	}

	
	public List<PropertyDetailItem> getPropertyDetail(){
		return this.propertyDetail;
	}

}