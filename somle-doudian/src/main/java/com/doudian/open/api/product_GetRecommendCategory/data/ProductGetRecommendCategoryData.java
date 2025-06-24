package com.doudian.open.api.product_GetRecommendCategory.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductGetRecommendCategoryData {


	@SerializedName("categoryDetails")
	@OpField(desc = "推荐类目结果", example = "")
	private List<CategoryDetailsItem> categoryDetails;

	@SerializedName("recommend_id")
	@OpField(desc = "类目预测记录id", example = "qwertyui123456")
	private String recommendId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCategoryDetails(List<CategoryDetailsItem> categoryDetails){
		this.categoryDetails = categoryDetails;
	}

	
	public List<CategoryDetailsItem> getCategoryDetails(){
		return this.categoryDetails;
	}

	
	public void setRecommendId(String recommendId){
		this.recommendId = recommendId;
	}

	
	public String getRecommendId(){
		return this.recommendId;
	}

}