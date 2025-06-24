package com.doudian.open.api.security_batchReportOrderSecurityEvent.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SecurityBatchReportOrderSecurityEventParam {


	@SerializedName("event_type")
	@OpField(required = true , desc = "订单事件类型 1:订单访问事件, 2:订单流出事件", example= "1")
	private Integer eventType;

	@SerializedName("events")
	@OpField(required = true , desc = "订单事件列表", example= "")
	private List<EventsItem> events;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setEventType(Integer eventType){
		this.eventType = eventType;
	}

	
	public Integer getEventType(){
		return this.eventType;
	}

	
	public void setEvents(List<EventsItem> events){
		this.events = events;
	}

	
	public List<EventsItem> getEvents(){
		return this.events;
	}

}