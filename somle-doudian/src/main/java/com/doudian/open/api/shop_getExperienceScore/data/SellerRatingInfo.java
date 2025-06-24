package com.doudian.open.api.shop_getExperienceScore.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SellerRatingInfo {


	@SerializedName("score")
	@OpField(desc = "分数", example = "4416981.0")
	private Double score;

	@SerializedName("score_weight")
	@OpField(desc = "权重后分数", example = "2607639.0")
	private Double scoreWeight;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setScore(Double score){
		this.score = score;
	}

	
	public Double getScore(){
		return this.score;
	}

	
	public void setScoreWeight(Double scoreWeight){
		this.scoreWeight = scoreWeight;
	}

	
	public Double getScoreWeight(){
		return this.scoreWeight;
	}

}