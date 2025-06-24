package com.doudian.open.api.logistics_registerPackageRoute.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class LogisticsRegisterPackageRouteParam {


	@SerializedName("express")
	@OpField(required = true , desc = "物流商", example= "yunda")
	private String express;

	@SerializedName("track_no")
	@OpField(required = true , desc = "运单号", example= "318200045306329")
	private String trackNo;

	@SerializedName("outer_order_id")
	@OpField(required = false , desc = "外部单据id", example= "1")
	private String outerOrderId;

	@SerializedName("outer_sub_order_id")
	@OpField(required = false , desc = "外部子单据id", example= "1")
	private String outerSubOrderId;

	@SerializedName("callback_url")
	@OpField(required = true , desc = "回调url", example= "www.baidu.com")
	private String callbackUrl;

	@SerializedName("receiver")
	@OpField(required = true , desc = "收件人", example= "")
	private Receiver receiver;

	@SerializedName("sender")
	@OpField(required = false , desc = "寄件人", example= "")
	private Sender sender;

	@SerializedName("cargo_list")
	@OpField(required = true , desc = "货品列表", example= "")
	private List<CargoListItem> cargoList;

	@SerializedName("extend")
	@OpField(required = false , desc = "拓展", example= "")
	private Map<String,String> extend;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setExpress(String express){
		this.express = express;
	}

	
	public String getExpress(){
		return this.express;
	}

	
	public void setTrackNo(String trackNo){
		this.trackNo = trackNo;
	}

	
	public String getTrackNo(){
		return this.trackNo;
	}

	
	public void setOuterOrderId(String outerOrderId){
		this.outerOrderId = outerOrderId;
	}

	
	public String getOuterOrderId(){
		return this.outerOrderId;
	}

	
	public void setOuterSubOrderId(String outerSubOrderId){
		this.outerSubOrderId = outerSubOrderId;
	}

	
	public String getOuterSubOrderId(){
		return this.outerSubOrderId;
	}

	
	public void setCallbackUrl(String callbackUrl){
		this.callbackUrl = callbackUrl;
	}

	
	public String getCallbackUrl(){
		return this.callbackUrl;
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

	
	public void setCargoList(List<CargoListItem> cargoList){
		this.cargoList = cargoList;
	}

	
	public List<CargoListItem> getCargoList(){
		return this.cargoList;
	}

	
	public void setExtend(Map<String,String> extend){
		this.extend = extend;
	}

	
	public Map<String,String> getExtend(){
		return this.extend;
	}

}