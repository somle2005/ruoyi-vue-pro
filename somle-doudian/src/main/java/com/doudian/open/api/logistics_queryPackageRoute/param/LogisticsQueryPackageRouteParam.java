package com.doudian.open.api.logistics_queryPackageRoute.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class LogisticsQueryPackageRouteParam {


	@SerializedName("track_no")
	@OpField(required = true , desc = "运单号", example= "SF1345778775768")
	private String trackNo;

	@SerializedName("express")
	@OpField(required = true , desc = "物流公司", example= "shunfeng")
	private String express;

	@SerializedName("receiver")
	@OpField(required = true , desc = "收件人", example= "")
	private Receiver receiver;

	@SerializedName("sender")
	@OpField(required = false , desc = "寄件人", example= "")
	private Sender sender;


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

	
	public void setExpress(String express){
		this.express = express;
	}

	
	public String getExpress(){
		return this.express;
	}

	
	public void setReceiver(Receiver receiver){
		this.receiver = receiver;
	}

	
	public Receiver getReceiver(){
		return this.receiver;
	}

	
	public void setSender(Sender sender){
		this.sender = sender;
	}

	
	public Sender getSender(){
		return this.sender;
	}

}