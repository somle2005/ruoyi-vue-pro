package com.doudian.open.api.product_listV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ShopCategory {


	@SerializedName("leaf_category_ids")
	@OpField(desc = "店铺装修分类id", example = "[123]")
	private List<Long> leafCategoryIds;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setLeafCategoryIds(List<Long> leafCategoryIds){
		this.leafCategoryIds = leafCategoryIds;
	}

	
	public List<Long> getLeafCategoryIds(){
		return this.leafCategoryIds;
	}

}