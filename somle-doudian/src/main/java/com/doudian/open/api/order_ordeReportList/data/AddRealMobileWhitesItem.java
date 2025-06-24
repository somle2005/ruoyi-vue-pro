package com.doudian.open.api.order_ordeReportList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddRealMobileWhitesItem {


	@SerializedName("order_id")
	@OpField(desc = "订单号", example = "4878621053383018305")
	private String orderId;

	@SerializedName("after_sale_id")
	@OpField(desc = "售后单号", example = "7043704348588900652")
	private String afterSaleId;

	@SerializedName("msg")
	@OpField(desc = "报备失败原因", example = "请输入正确的申请原因编码")
	private String msg;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

	
	public void setAfterSaleId(String afterSaleId){
		this.afterSaleId = afterSaleId;
	}

	
	public String getAfterSaleId(){
		return this.afterSaleId;
	}

	
	public void setMsg(String msg){
		this.msg = msg;
	}

	
	public String getMsg(){
		return this.msg;
	}

}