package com.doudian.open.api.product_recommendProperties.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CheckResultItem {


	@SerializedName("property_id")
	@OpField(desc = "属性id", example = "1")
	private Long propertyId;

	@SerializedName("is_right")
	@OpField(desc = "判准正确", example = "false")
	private Boolean isRight;


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

	
	public void setIsRight(Boolean isRight){
		this.isRight = isRight;
	}

	
	public Boolean getIsRight(){
		return this.isRight;
	}

}