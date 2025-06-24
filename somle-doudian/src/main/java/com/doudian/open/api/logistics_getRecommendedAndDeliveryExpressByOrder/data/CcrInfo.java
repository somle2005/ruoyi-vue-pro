package com.doudian.open.api.logistics_getRecommendedAndDeliveryExpressByOrder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CcrInfo {


	@SerializedName("level_percent")
	@OpField(desc = "物流负向反馈率（狭义）超过百分之多少商家", example = "0.2")
	private String levelPercent;

	@SerializedName("optimized_percent")
	@OpField(desc = "物流负向反馈率（狭义）优化百分比", example = "0.34")
	private String optimizedPercent;

	@SerializedName("ccr_rate")
	@OpField(desc = "物流负向反馈率（狭义）", example = "0.001")
	private String ccrRate;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setLevelPercent(String levelPercent){
		this.levelPercent = levelPercent;
	}

	
	public String getLevelPercent(){
		return this.levelPercent;
	}

	
	public void setOptimizedPercent(String optimizedPercent){
		this.optimizedPercent = optimizedPercent;
	}

	
	public String getOptimizedPercent(){
		return this.optimizedPercent;
	}

	
	public void setCcrRate(String ccrRate){
		this.ccrRate = ccrRate;
	}

	
	public String getCcrRate(){
		return this.ccrRate;
	}

}