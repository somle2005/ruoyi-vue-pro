package com.doudian.open.api.product_getRecommendName.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductGetRecommendNameData {


	@SerializedName("recommend_name")
	@OpField(desc = "商品标题推荐结果，当返回值为空时，使用【/product/getProductUpdateRule】接口查询类目id查看recommend_name_rule.satisfy_prefix是否=true", example = "")
	private List<RecommendNameItem> recommendName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRecommendName(List<RecommendNameItem> recommendName){
		this.recommendName = recommendName;
	}

	
	public List<RecommendNameItem> getRecommendName(){
		return this.recommendName;
	}

}