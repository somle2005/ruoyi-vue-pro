package com.doudian.open.api.buyin_promotionStrategyList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.Map;

//auto generated, do not edit

public class CosInfo {


	@SerializedName("cos_type")
	@OpField(desc = "佣金规则 1：固定佣金 2：阶梯佣金", example = "1")
	private Integer cosType;

	@SerializedName("cos_ratio")
	@OpField(desc = "生效佣金率", example = "")
	private CosRatio cosRatio;

	@SerializedName("cos_ratio_sug")
	@OpField(desc = "商品建议佣金率", example = "60")
	private String cosRatioSug;

	@SerializedName("similar_prd_count")
	@OpField(desc = "同叶子类目同品牌等级商品个数", example = "5")
	private String similarPrdCount;

	@SerializedName("feature_cos_ratio")
	@OpField(desc = "修改佣金率未来佣金率", example = "")
	private FeatureCosRatio featureCosRatio;

	@SerializedName("cos_valid_time")
	@OpField(desc = "修改佣金率未来佣金率生效时间", example = "2020-05-19 00:00:00")
	private String cosValidTime;

	@SerializedName("higer_priority_cos_ratio")
	@OpField(desc = "更高优佣金率", example = "70")
	private Double higerPriorityCosRatio;

	@SerializedName("cos_ratio_level")
	@OpField(desc = "商品佣金率及所处竞争力百分位，key为佣金率", example = "{30:5}")
	private Map<String,String> cosRatioLevel;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCosType(Integer cosType){
		this.cosType = cosType;
	}

	
	public Integer getCosType(){
		return this.cosType;
	}

	
	public void setCosRatio(CosRatio cosRatio){
		this.cosRatio = cosRatio;
	}

	
	public CosRatio getCosRatio(){
		return this.cosRatio;
	}

	
	public void setCosRatioSug(String cosRatioSug){
		this.cosRatioSug = cosRatioSug;
	}

	
	public String getCosRatioSug(){
		return this.cosRatioSug;
	}

	
	public void setSimilarPrdCount(String similarPrdCount){
		this.similarPrdCount = similarPrdCount;
	}

	
	public String getSimilarPrdCount(){
		return this.similarPrdCount;
	}

	
	public void setFeatureCosRatio(FeatureCosRatio featureCosRatio){
		this.featureCosRatio = featureCosRatio;
	}

	
	public FeatureCosRatio getFeatureCosRatio(){
		return this.featureCosRatio;
	}

	
	public void setCosValidTime(String cosValidTime){
		this.cosValidTime = cosValidTime;
	}

	
	public String getCosValidTime(){
		return this.cosValidTime;
	}

	
	public void setHigerPriorityCosRatio(Double higerPriorityCosRatio){
		this.higerPriorityCosRatio = higerPriorityCosRatio;
	}

	
	public Double getHigerPriorityCosRatio(){
		return this.higerPriorityCosRatio;
	}

	
	public void setCosRatioLevel(Map<String,String> cosRatioLevel){
		this.cosRatioLevel = cosRatioLevel;
	}

	
	public Map<String,String> getCosRatioLevel(){
		return this.cosRatioLevel;
	}

}