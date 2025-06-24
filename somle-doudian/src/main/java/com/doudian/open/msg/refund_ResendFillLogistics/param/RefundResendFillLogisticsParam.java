package com.doudian.open.msg.refund_ResendFillLogistics.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class RefundResendFillLogisticsParam {


	@SerializedName("reason_code")
	@OpField(required = false , desc = "申请售后原因码", example= "130")
	private Long reasonCode;

	@SerializedName("aftersale_id")
	@OpField(required = false , desc = "售后单ID", example= "7002072355312992556")
	private Long aftersaleId;

	@SerializedName("aftersale_type")
	@OpField(required = false , desc = "售后类型，7为补寄", example= "7")
	private Long aftersaleType;

	@SerializedName("p_id")
	@OpField(required = false , desc = "父订单ID", example= "4837000698570409793")
	private Long pId;

	@SerializedName("aftersale_status")
	@OpField(required = false , desc = "售后状态", example= "13")
	private Long aftersaleStatus;

	@SerializedName("s_id")
	@OpField(required = false , desc = "子订单ID", example= "4837000698570409793")
	private Long sId;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID", example= "95250")
	private Long shopId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "8794053")
	private Long storeId;

	@SerializedName("update_time")
	@OpField(required = false , desc = "售后单更新时间", example= "2022-09-02T10:27:50+08:00")
	private String updateTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setReasonCode(Long reasonCode){
		this.reasonCode = reasonCode;
	}

	
	public Long getReasonCode(){
		return this.reasonCode;
	}

	
	public void setAftersaleId(Long aftersaleId){
		this.aftersaleId = aftersaleId;
	}

	
	public Long getAftersaleId(){
		return this.aftersaleId;
	}

	
	public void setAftersaleType(Long aftersaleType){
		this.aftersaleType = aftersaleType;
	}

	
	public Long getAftersaleType(){
		return this.aftersaleType;
	}

	
	public void setPId(Long pId){
		this.pId = pId;
	}

	
	public Long getPId(){
		return this.pId;
	}

	
	public void setAftersaleStatus(Long aftersaleStatus){
		this.aftersaleStatus = aftersaleStatus;
	}

	
	public Long getAftersaleStatus(){
		return this.aftersaleStatus;
	}

	
	public void setSId(Long sId){
		this.sId = sId;
	}

	
	public Long getSId(){
		return this.sId;
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

	
	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}

	
	public String getUpdateTime(){
		return this.updateTime;
	}

}