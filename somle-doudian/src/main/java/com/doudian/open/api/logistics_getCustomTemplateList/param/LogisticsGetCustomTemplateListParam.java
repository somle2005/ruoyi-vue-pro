package com.doudian.open.api.logistics_getCustomTemplateList.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class LogisticsGetCustomTemplateListParam {


	@SerializedName("logistics_code")
	@OpField(required = false , desc = "物流服务商编码（若为空代表查询全部）", example= "shunfeng")
	private String logisticsCode;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setLogisticsCode(String logisticsCode){
		this.logisticsCode = logisticsCode;
	}

	
	public String getLogisticsCode(){
		return this.logisticsCode;
	}

}