package com.doudian.open.api.product_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ShopCategory {


	@SerializedName("leaf_category_ids")
	@OpField(desc = "店铺装修分类叶子类目id", example = "123")
	private String leafCategoryIds;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setLeafCategoryIds(String leafCategoryIds){
		this.leafCategoryIds = leafCategoryIds;
	}

	
	public String getLeafCategoryIds(){
		return this.leafCategoryIds;
	}

}