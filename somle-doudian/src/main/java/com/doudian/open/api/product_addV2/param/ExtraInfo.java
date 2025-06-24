package com.doudian.open.api.product_addV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ExtraInfo {


	@SerializedName("process_time")
	@OpField(required = false , desc = "属性处理时长，单位秒", example= "60")
	private Long processTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProcessTime(Long processTime){
		this.processTime = processTime;
	}

	
	public Long getProcessTime(){
		return this.processTime;
	}

}