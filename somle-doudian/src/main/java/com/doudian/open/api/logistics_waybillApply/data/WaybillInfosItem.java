package com.doudian.open.api.logistics_waybillApply.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class WaybillInfosItem {


	@SerializedName("order_id")
	@OpField(desc = "订单号", example = "1")
	private String orderId;

	@SerializedName("track_no")
	@OpField(desc = "运单号", example = "1")
	private String trackNo;

	@SerializedName("print_data")
	@OpField(desc = "加密的面单数据", example = "1")
	private String printData;

	@SerializedName("sign")
	@OpField(desc = "签名信息", example = "1")
	private String sign;


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

	
	public void setTrackNo(String trackNo){
		this.trackNo = trackNo;
	}

	
	public String getTrackNo(){
		return this.trackNo;
	}

	
	public void setPrintData(String printData){
		this.printData = printData;
	}

	
	public String getPrintData(){
		return this.printData;
	}

	
	public void setSign(String sign){
		this.sign = sign;
	}

	
	public String getSign(){
		return this.sign;
	}

}