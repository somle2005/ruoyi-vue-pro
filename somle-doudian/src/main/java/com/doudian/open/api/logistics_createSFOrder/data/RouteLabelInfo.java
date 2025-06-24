package com.doudian.open.api.logistics_createSFOrder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class RouteLabelInfo {


	@SerializedName("code")
	@OpField(desc = "返回调用结果，1000：调用成功；其他调用失败", example = "1000")
	private String code;

	@SerializedName("route_label_data")
	@OpField(desc = "路由标签数据详细数据", example = "-")
	private RouteLabelData routeLabelData;

	@SerializedName("message")
	@OpField(desc = "失败异常描述", example = "单号不存在")
	private String message;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

	
	public void setRouteLabelData(RouteLabelData routeLabelData){
		this.routeLabelData = routeLabelData;
	}

	
	public RouteLabelData getRouteLabelData(){
		return this.routeLabelData;
	}

	
	public void setMessage(String message){
		this.message = message;
	}

	
	public String getMessage(){
		return this.message;
	}

}