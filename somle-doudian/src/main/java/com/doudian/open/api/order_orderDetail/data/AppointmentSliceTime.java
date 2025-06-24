package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AppointmentSliceTime {


	@SerializedName("update_time")
	@OpField(desc = "更新时间", example = "1707190091")
	private Long updateTime;

	@SerializedName("end_time")
	@OpField(desc = "结束时间", example = "1707191091")
	private Long endTime;

	@SerializedName("start_time")
	@OpField(desc = "起始时间", example = "1707190091")
	private Long startTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setUpdateTime(Long updateTime){
		this.updateTime = updateTime;
	}

	
	public Long getUpdateTime(){
		return this.updateTime;
	}

	
	public void setEndTime(Long endTime){
		this.endTime = endTime;
	}

	
	public Long getEndTime(){
		return this.endTime;
	}

	
	public void setStartTime(Long startTime){
		this.startTime = startTime;
	}

	
	public Long getStartTime(){
		return this.startTime;
	}

}