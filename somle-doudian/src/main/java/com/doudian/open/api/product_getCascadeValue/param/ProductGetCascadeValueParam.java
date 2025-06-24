package com.doudian.open.api.product_getCascadeValue.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductGetCascadeValueParam {


	@SerializedName("category_id")
	@OpField(required = true , desc = "类目id", example= "31860")
	private Long categoryId;

	@SerializedName("property_id")
	@OpField(required = true , desc = "属性id", example= "123")
	private Long propertyId;

	@SerializedName("cascade_info")
	@OpField(required = true , desc = "级联参数，传当前属性属性值", example= "")
	private List<CascadeInfoItem> cascadeInfo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCategoryId(Long categoryId){
		this.categoryId = categoryId;
	}

	
	public Long getCategoryId(){
		return this.categoryId;
	}

	
	public void setPropertyId(Long propertyId){
		this.propertyId = propertyId;
	}

	
	public Long getPropertyId(){
		return this.propertyId;
	}

	
	public void setCascadeInfo(List<CascadeInfoItem> cascadeInfo){
		this.cascadeInfo = cascadeInfo;
	}

	
	public List<CascadeInfoItem> getCascadeInfo(){
		return this.cascadeInfo;
	}

}