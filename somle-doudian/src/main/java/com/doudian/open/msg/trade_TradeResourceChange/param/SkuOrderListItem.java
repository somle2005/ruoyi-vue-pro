package com.doudian.open.msg.trade_TradeResourceChange.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SkuOrderListItem {


	@SerializedName("s_id")
	@OpField(required = false , desc = "商品单ID", example= "6935570127038846867")
	private String sId;

	@SerializedName("appointment_ship_time")
	@OpField(required = false , desc = "变更后的预约送达时间，0表示非预约送达单", example= "0")
	private String appointmentShipTime;

	@SerializedName("latest_receipt_time")
	@OpField(required = false , desc = "变更后的预约发货时间，0表示非预约发货单", example= "1732204799")
	private String latestReceiptTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSId(String sId){
		this.sId = sId;
	}

	
	public String getSId(){
		return this.sId;
	}

	
	public void setAppointmentShipTime(String appointmentShipTime){
		this.appointmentShipTime = appointmentShipTime;
	}

	
	public String getAppointmentShipTime(){
		return this.appointmentShipTime;
	}

	
	public void setLatestReceiptTime(String latestReceiptTime){
		this.latestReceiptTime = latestReceiptTime;
	}

	
	public String getLatestReceiptTime(){
		return this.latestReceiptTime;
	}

}