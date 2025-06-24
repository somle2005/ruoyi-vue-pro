package com.doudian.open.api.product_qualityDetail.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductQualityDetailParam {


	@SerializedName("product_id")
	@OpField(required = true , desc = "商品ID", example= "3502384918913228300")
	private Long productId;

	@SerializedName("quality_score_version")
	@OpField(required = false , desc = "质量分版本", example= "middle_score")
	private String qualityScoreVersion;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setQualityScoreVersion(String qualityScoreVersion){
		this.qualityScoreVersion = qualityScoreVersion;
	}

	
	public String getQualityScoreVersion(){
		return this.qualityScoreVersion;
	}

}