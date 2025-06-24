package com.doudian.open.api.logistics_cancelOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class LogisticsCancelOrderParam {


	@SerializedName("logistics_code")
	@OpField(required = true , desc = "物流公司", example= "jd")
	private String logisticsCode;

	@SerializedName("track_no")
	@OpField(required = true , desc = "运单号", example= "1234")
	private String trackNo;

	@SerializedName("user_id")
	@OpField(required = false , desc = "实际使用取号服务店铺user_id", example= "1")
	private Long userId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setLogisticsCode(String logisticsCode){
		this.logisticsCode = logisticsCode;
	}

	
	public String getLogisticsCode(){
		return this.logisticsCode;
	}

	
	public void setTrackNo(String trackNo){
		this.trackNo = trackNo;
	}

	
	public String getTrackNo(){
		return this.trackNo;
	}

	
	public void setUserId(Long userId){
		this.userId = userId;
	}

	
	public Long getUserId(){
		return this.userId;
	}

}