package com.doudian.open.api.promise_SaveTemplate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CapacityItem {


	@SerializedName("date")
	@OpField(required = false , desc = "日期", example= "2024-07-17")
	private String date;

	@SerializedName("capacity")
	@OpField(required = false , desc = "容量", example= "111")
	private Long capacity;

	@SerializedName("is_default")
	@OpField(required = false , desc = "指定日期还是default", example= "false")
	private Boolean isDefault;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDate(String date){
		this.date = date;
	}

	
	public String getDate(){
		return this.date;
	}

	
	public void setCapacity(Long capacity){
		this.capacity = capacity;
	}

	
	public Long getCapacity(){
		return this.capacity;
	}

	
	public void setIsDefault(Boolean isDefault){
		this.isDefault = isDefault;
	}

	
	public Boolean getIsDefault(){
		return this.isDefault;
	}

}