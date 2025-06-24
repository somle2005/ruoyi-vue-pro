package com.doudian.open.api.sku_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ShipRuleMapItem {


	@SerializedName("presell_end_time")
	@OpField(desc = "全款预售截止时间  presell_type = 1时有用", example = "1")
	private Long presellEndTime;

	@SerializedName("delay_day")
	@OpField(desc = "发货延迟时间   0表示当天发货", example = "0")
	private Long delayDay;

	@SerializedName("presell_type")
	@OpField(desc = "0 现货模式  1 全款预售模式", example = "1")
	private Long presellType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPresellEndTime(Long presellEndTime){
		this.presellEndTime = presellEndTime;
	}

	
	public Long getPresellEndTime(){
		return this.presellEndTime;
	}

	
	public void setDelayDay(Long delayDay){
		this.delayDay = delayDay;
	}

	
	public Long getDelayDay(){
		return this.delayDay;
	}

	
	public void setPresellType(Long presellType){
		this.presellType = presellType;
	}

	
	public Long getPresellType(){
		return this.presellType;
	}

}