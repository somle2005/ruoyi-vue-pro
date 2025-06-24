package com.doudian.open.api.logistics_getRecommendedAndDeliveryExpressByOrder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TailInfo {


	@SerializedName("level_percent")
	@OpField(desc = "超长单占比超过百分之多少商家", example = "0.34")
	private String levelPercent;

	@SerializedName("optimized_percent")
	@OpField(desc = "超长单占比优化百分比", example = "0.2")
	private String optimizedPercent;

	@SerializedName("tail_rate")
	@OpField(desc = "超长单占比", example = "0.001")
	private String tailRate;


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

	
	public void setTailRate(String tailRate){
		this.tailRate = tailRate;
	}

	
	public String getTailRate(){
		return this.tailRate;
	}

}