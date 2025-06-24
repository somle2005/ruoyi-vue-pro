package com.doudian.open.api.topup_accountTemplateList.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TopupAccountTemplateListParam {


	@SerializedName("category_id")
	@OpField(required = true , desc = "叶子类目id", example= "21597")
	private Long categoryId;


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

}