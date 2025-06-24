package com.doudian.open.msg.trade_TradeSellerShip.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class LogisticsMsg {


	@SerializedName("express_company_id")
	@OpField(required = false , desc = "发货快递公司", example= "yunda")
	private String expressCompanyId;

	@SerializedName("logistics_code")
	@OpField(required = false , desc = "发货物流单号", example= "431******408")
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