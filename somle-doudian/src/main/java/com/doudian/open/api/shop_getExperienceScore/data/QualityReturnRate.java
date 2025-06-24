package com.doudian.open.api.shop_getExperienceScore.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class QualityReturnRate {


	@SerializedName("node_score")
	@OpField(desc = "指标分数", example = "9442669.0")
	private Double nodeScore;

	@SerializedName("node_score_weight")
	@OpField(desc = "加权指标分数", example = "3674114.0")
	private Double nodeScoreWeight;

	@SerializedName("score")
	@OpField(desc = "指标值", example = "377566.0")
	private Double score;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setNodeScore(Double nodeScore){
		this.nodeScore = nodeScore;
	}

	
	public Double getNodeScore(){
		return this.nodeScore;
	}

	
	public void setNodeScoreWeight(Double nodeScoreWeight){
		this.nodeScoreWeight = nodeScoreWeight;
	}

	
	public Double getNodeScoreWeight(){
		return this.nodeScoreWeight;
	}

	
	public void setScore(Double score){
		this.score = score;
	}

	
	public Double getScore(){
		return this.score;
	}

}