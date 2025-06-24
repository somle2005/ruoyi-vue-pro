package com.doudian.open.api.logistics_listShopNetsite.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class LogisticsListShopNetsiteParam {


	@SerializedName("logistics_code")
	@OpField(required = true , desc = "物流服务商编码（想获取全量物流，则传空字符串）", example= "1")
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