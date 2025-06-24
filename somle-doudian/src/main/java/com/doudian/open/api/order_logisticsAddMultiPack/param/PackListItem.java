package com.doudian.open.api.order_logisticsAddMultiPack.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class PackListItem {


	@SerializedName("shipped_order_info")
	@OpField(required = true , desc = "需要发货的子订单信息列表", example= "")
	private List<ShippedOrderInfoItem> shippedOrderInfo;

	@SerializedName("logistics_code")
	@OpField(required = true , desc = "运单号", example= "9595123123")
	private String logisticsCode;

	@SerializedName("company")
	@OpField(required = false , desc = "物流公司名称", example= "顺丰")
	private String company;

	@SerializedName("company_code")
	@OpField(required = false , desc = "物流公司code，字段必传。可从/order/logisticsCompanyList接口获取。", example= "shunfeng")
	private String companyCode;

	@SerializedName("logistics_id")
	@OpField(required = false , desc = "已废弃。物流公司ID。请使用company_code字段。", example= "12")
	private String logisticsId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setShippedOrderInfo(List<ShippedOrderInfoItem> shippedOrderInfo){
		this.shippedOrderInfo = shippedOrderInfo;
	}

	
	public List<ShippedOrderInfoItem> getShippedOrderInfo(){
		return this.shippedOrderInfo;
	}

	
	public void setLogisticsCode(String logisticsCode){
		this.logisticsCode = logisticsCode;
	}

	
	public String getLogisticsCode(){
		return this.logisticsCode;
	}

	
	public void setCompany(String company){
		this.company = company;
	}

	
	public String getCompany(){
		return this.company;
	}

	
	public void setCompanyCode(String companyCode){
		this.companyCode = companyCode;
	}

	
	public String getCompanyCode(){
		return this.companyCode;
	}

	
	public void setLogisticsId(String logisticsId){
		this.logisticsId = logisticsId;
	}

	
	public String getLogisticsId(){
		return this.logisticsId;
	}

}