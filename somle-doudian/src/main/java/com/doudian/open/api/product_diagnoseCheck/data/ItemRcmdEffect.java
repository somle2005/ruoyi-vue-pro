package com.doudian.open.api.product_diagnoseCheck.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ItemRcmdEffect {


	@SerializedName("peer_usage_rate")
	@OpField(desc = "同行使用率", example = "无")
	private String peerUsageRate;

	@SerializedName("improve_value_upper_bound")
	@OpField(desc = "提升比例上限", example = "无")
	private String improveValueUpperBound;

	@SerializedName("improve_value_lower_bound")
	@OpField(desc = "提升比例下限", example = "无")
	private String improveValueLowerBound;

	@SerializedName("effct_desc")
	@OpField(desc = "指标描述", example = "无")
	private String effctDesc;

	@SerializedName("optimization_info")
	@OpField(desc = "指标效果", example = "")
	private OptimizationInfo optimizationInfo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPeerUsageRate(String peerUsageRate){
		this.peerUsageRate = peerUsageRate;
	}

	
	public String getPeerUsageRate(){
		return this.peerUsageRate;
	}

	
	public void setImproveValueUpperBound(String improveValueUpperBound){
		this.improveValueUpperBound = improveValueUpperBound;
	}

	
	public String getImproveValueUpperBound(){
		return this.improveValueUpperBound;
	}

	
	public void setImproveValueLowerBound(String improveValueLowerBound){
		this.improveValueLowerBound = improveValueLowerBound;
	}

	
	public String getImproveValueLowerBound(){
		return this.improveValueLowerBound;
	}

	
	public void setEffctDesc(String effctDesc){
		this.effctDesc = effctDesc;
	}

	
	public String getEffctDesc(){
		return this.effctDesc;
	}

	
	public void setOptimizationInfo(OptimizationInfo optimizationInfo){
		this.optimizationInfo = optimizationInfo;
	}

	
	public OptimizationInfo getOptimizationInfo(){
		return this.optimizationInfo;
	}

}