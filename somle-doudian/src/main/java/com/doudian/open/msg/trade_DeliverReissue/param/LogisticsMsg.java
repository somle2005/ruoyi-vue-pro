package com.doudian.open.msg.trade_DeliverReissue.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class LogisticsMsg {


	@SerializedName("express_company_id")
	@OpField(required = false , desc = "物流公司Code", example= "yunda")
	private String expressCompanyId;

	@SerializedName("logistics_code")
	@OpField(required = false , desc = "物流单号", example= "318948638261142")
	private String logisticsCode;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setExpressCompanyId(String expressCompanyId){
		this.expressCompanyId = expressCompanyId;
	}

	
	public String getExpressCompanyId(){
		return this.expressCompanyId;
	}

	
	public void setLogisticsCode(String logisticsCode){
		this.logisticsCode = logisticsCode;
	}

	
	public String getLogisticsCode(){
		return this.logisticsCode;
	}

}