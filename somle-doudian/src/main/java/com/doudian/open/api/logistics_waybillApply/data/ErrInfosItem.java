package com.doudian.open.api.logistics_waybillApply.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ErrInfosItem {


	@SerializedName("track_no")
	@OpField(desc = "运单号", example = "1")
	private String trackNo;

	@SerializedName("order_id")
	@OpField(desc = "订单号", example = "1")
	private String orderId;

	@SerializedName("err_code")
	@OpField(desc = "错误码", example = "1")
	private Integer errCode;

	@SerializedName("err_msg")
	@OpField(desc = "错误信息", example = "1")
	private String errMsg;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTrackNo(String trackNo){
		this.trackNo = trackNo;
	}

	
	public String getTrackNo(){
		return this.trackNo;
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

	
	public void setErrCode(Integer errCode){
		this.errCode = errCode;
	}

	
	public Integer getErrCode(){
		return this.errCode;
	}

	
	public void setErrMsg(String errMsg){
		this.errMsg = errMsg;
	}

	
	public String getErrMsg(){
		return this.errMsg;
	}

}