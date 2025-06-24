package com.doudian.open.api.sku_list.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ShipRuleMapItem {


	@SerializedName("presell_type")
	@OpField(desc = "0 现货模式  1 全款预售模式", example = "0")
	private Long presellType;

	@SerializedName("delay_day")
	@OpField(desc = "发货延迟时间；0表示当天发货；", example = "0")
	private Long delayDay;

	@SerializedName("presell_end_time")
	@OpField(desc = "全款预售截止时间  presell_type = 1时有用", example = "0")
	private Long presellEndTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPresellType(Long presellType){
		this.presellType = presellType;
	}

	
	public Long getPresellType(){
		return this.presellType;
	}

	
	public void setDelayDay(Long delayDay){
		this.delayDay = delayDay;
	}

	
	public Long getDelayDay(){
		return this.delayDay;
	}

	
	public void setPresellEndTime(Long presellEndTime){
		this.presellEndTime = presellEndTime;
	}

	
	public Long getPresellEndTime(){
		return this.presellEndTime;
	}

}