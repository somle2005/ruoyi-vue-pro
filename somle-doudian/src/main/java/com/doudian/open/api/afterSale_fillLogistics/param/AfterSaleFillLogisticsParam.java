package com.doudian.open.api.afterSale_fillLogistics.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AfterSaleFillLogisticsParam {


	@SerializedName("aftersale_id")
	@OpField(required = true , desc = "售后单ID", example= "7085126861562380588")
	private Long aftersaleId;

	@SerializedName("send_type")
	@OpField(required = true , desc = "发货类型；适用场景： send_type=1：用于补寄商家发货 send_type=3：超市预约上门取货；退货退款和换货场景下商家帮买家填写退货物流信息； send_type=4：维修场景下商家帮买家填写退货物流信息；", example= "1")
	private Integer sendType;

	@SerializedName("company_code")
	@OpField(required = true , desc = "物流公司编号pick_up_type 2:线下取货;3:用户退回，无需物流公司，可传 -", example= "yuantong")
	private String companyCode;

	@SerializedName("tracking_no")
	@OpField(required = true , desc = "物流单号pick_up_type 2:线下取货;3:用户退回，无需快递单号，可传 -", example= "YT1231231231")
	private String trackingNo;

	@SerializedName("book_time_begin")
	@OpField(required = false , desc = "预约上门取货时间戳，单位：秒（目前抖超小时达店铺使用）", example= "1655955000")
	private Long bookTimeBegin;

	@SerializedName("book_time_end")
	@OpField(required = false , desc = "预约上门取货时间戳，单位：秒（目前抖超小时达店铺使用）", example= "1655955600")
	private Long bookTimeEnd;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "门店ID")
	private Long storeId;

	@SerializedName("pick_up_type")
	@OpField(required = false , desc = "1:自行配送;2:线下取货;3:用户退回 ，不传默认自行配送；适用于send_type=3超市预约上门取货场景", example= "1")
	private Integer pickUpType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAftersaleId(Long aftersaleId){
		this.aftersaleId = aftersaleId;
	}

	
	public Long getAftersaleId(){
		return this.aftersaleId;
	}

	
	public void setSendType(Integer sendType){
		this.sendType = sendType;
	}

	
	public Integer getSendType(){
		return this.sendType;
	}

	
	public void setCompanyCode(String companyCode){
		this.companyCode = companyCode;
	}

	
	public String getCompanyCode(){
		return this.companyCode;
	}

	
	public void setTrackingNo(String trackingNo){
		this.trackingNo = trackingNo;
	}

	
	public String getTrackingNo(){
		return this.trackingNo;
	}

	
	public void setBookTimeBegin(Long bookTimeBegin){
		this.bookTimeBegin = bookTimeBegin;
	}

	
	public Long getBookTimeBegin(){
		return this.bookTimeBegin;
	}

	
	public void setBookTimeEnd(Long bookTimeEnd){
		this.bookTimeEnd = bookTimeEnd;
	}

	
	public Long getBookTimeEnd(){
		return this.bookTimeEnd;
	}

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

	
	public void setPickUpType(Integer pickUpType){
		this.pickUpType = pickUpType;
	}

	
	public Integer getPickUpType(){
		return this.pickUpType;
	}

}