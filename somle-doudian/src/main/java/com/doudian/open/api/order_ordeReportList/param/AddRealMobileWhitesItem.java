package com.doudian.open.api.order_ordeReportList.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddRealMobileWhitesItem {


	@SerializedName("order_id")
	@OpField(required = false , desc = "订单号，订单号和售后单号只需选择一个传入即可", example= "4878621053383018305")
	private String orderId;

	@SerializedName("after_sale_id")
	@OpField(required = false , desc = "售后单号，订单号和售后单号只需选择一个传入即可", example= "7043704348588900652")
	private String afterSaleId;

	@SerializedName("reason_no")
	@OpField(required = true , desc = "报备原因编码：1-无法发货，2-无法处理售后，3-无法处理客诉，4-无法处理物流包裹，5-其他原因", example= "1")
	private Long reasonNo;

	@SerializedName("remark")
	@OpField(required = false , desc = "报备备注", example= "需要联系买家")
	private String remark;


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

	
	public void setReasonNo(Long reasonNo){
		this.reasonNo = reasonNo;
	}

	
	public Long getReasonNo(){
		return this.reasonNo;
	}

	
	public void setRemark(String remark){
		this.remark = remark;
	}

	
	public String getRemark(){
		return this.remark;
	}

}