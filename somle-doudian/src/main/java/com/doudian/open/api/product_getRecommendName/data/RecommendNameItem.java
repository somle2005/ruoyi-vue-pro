package com.doudian.open.api.product_getRecommendName.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class RecommendNameItem {


	@SerializedName("recommend_scene")
	@OpField(desc = "推荐场景：1. product_name_prefix 前缀场景，需要将返回的recommend_value拼接在name标题自动的最前面2. product_name_suffix 后缀场景，需要将返回的recommend_value拼接在name标题自动的最后面", example = "product_name_prefix")
	private String recommendScene;

	@SerializedName("recommend_value")
	@OpField(desc = "推荐结果，推荐结果需要根据recommend_scene判断前缀或者后缀，拼接在name字段的最前面或者最后面", example = "钛钢耳饰")
	private String recommendValue;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRecommendScene(String recommendScene){
		this.recommendScene = recommendScene;
	}

	
	public String getRecommendScene(){
		return this.recommendScene;
	}

	
	public void setRecommendValue(String recommendValue){
		this.recommendValue = recommendValue;
	}

	
	public String getRecommendValue(){
		return this.recommendValue;
	}

}