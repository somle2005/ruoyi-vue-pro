package com.doudian.open.api.product_getCatePropertyV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductGetCatePropertyV2Param {


	@SerializedName("category_leaf_id")
	@OpField(required = true , desc = "叶子类目id 1、传category_leaf_id ，则不需要传first_cid、second_cid、third_cid这三个字段 2、如果没传category_leaf_id，走之前的逻辑，需要传first_cid、second_cid、third_cid这三个字段", example= "1342353245")
	private Long categoryLeafId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCategoryLeafId(Long categoryLeafId){
		this.categoryLeafId = categoryLeafId;
	}

	
	public Long getCategoryLeafId(){
		return this.categoryLeafId;
	}

}