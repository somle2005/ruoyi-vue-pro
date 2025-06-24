package com.doudian.open.api.logistics_getRecommendedAndDeliveryExpressByOrder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CollectSignInfo {


	@SerializedName("avg_cost_hours")
	@OpField(desc = "揽签时长,单位小时", example = "60.10")
	private String avgCostHours;

	@SerializedName("level_percent")
	@OpField(desc = "该线路商超过其他物流公司23.86%", example = "23.86")
	private String levelPercent;

	@SerializedName("optimized_percent")
	@OpField(desc = "优化百分比，时长下降6.1%", example = "6.1")
	private String optimizedPercent;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAvgCostHours(String avgCostHours){
		this.avgCostHours = avgCostHours;
	}

	
	public String getAvgCostHours(){
		return this.avgCostHours;
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

}