package com.doudian.open.api.logistics_deliveryNotice.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class LogisticsDeliveryNoticeParam {


	@SerializedName("waybill_no")
	@OpField(required = true , desc = "运单号", example= "SF1345778775768")
	private String waybillNo;

	@SerializedName("notice_type")
	@OpField(required = true , desc = "放行/回退", example= "71")
	private String noticeType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setWaybillNo(String waybillNo){
		this.waybillNo = waybillNo;
	}

	
	public String getWaybillNo(){
		return this.waybillNo;
	}

	
	public void setNoticeType(String noticeType){
		this.noticeType = noticeType;
	}

	
	public String getNoticeType(){
		return this.noticeType;
	}

}