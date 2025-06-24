package com.doudian.open.msg.trade_TradePartlySellerShip.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsMsg {


	@SerializedName("express_company_id")
	@OpField(required = false , desc = "发货快递公司", example= "gdkd")
	private String expressCompanyId;

	@SerializedName("logistics_code")
	@OpField(required = false , desc = "发货物流单号", example= "111111111111111")
	private String logisticsCode;

	@SerializedName("pack_id")
	@OpField(required = false , desc = "包裹ID", example= "4705288465508532862")
	private String packId;

	@SerializedName("shipped_order_info")
	@OpField(required = false , desc = "已发货子订单信息", example= "")
	private List<ShippedOrderInfoItem> shippedOrderInfo;


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

	
	public void setPackId(String packId){
		this.packId = packId;
	}

	
	public String getPackId(){
		return this.packId;
	}

	
	public void setShippedOrderInfo(List<ShippedOrderInfoItem> shippedOrderInfo){
		this.shippedOrderInfo = shippedOrderInfo;
	}

	
	public List<ShippedOrderInfoItem> getShippedOrderInfo(){
		return this.shippedOrderInfo;
	}

}