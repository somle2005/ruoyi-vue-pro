package com.doudian.open.api.product_editV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ExtraInfo {


	@SerializedName("process_time")
	@OpField(required = false , desc = "属性维度的处理时长，单位：秒，不能超过24小时。", example= "60")
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