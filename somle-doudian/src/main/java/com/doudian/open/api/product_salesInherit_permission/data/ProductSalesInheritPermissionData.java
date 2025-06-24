package com.doudian.open.api.product_salesInherit_permission.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductSalesInheritPermissionData {


	@SerializedName("success")
	@OpField(desc = "true-有权限；false-无权限", example = "false")
	private Boolean success;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSuccess(Boolean success){
		this.success = success;
	}

	
	public Boolean getSuccess(){
		return this.success;
	}

}