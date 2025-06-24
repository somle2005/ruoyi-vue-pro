package com.doudian.open.msg.Refund_SpecialRefund.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class RefundSpecialRefundParam {


	@SerializedName("aftersale_status")
	@OpField(required = false , desc = "售后状态码", example= "51")
	private Long aftersaleStatus;

	@SerializedName("aftersale_type")
	@OpField(required = false , desc = "售后类型", example= "6")
	private Long aftersaleType;

	@SerializedName("refund_amount")
	@OpField(required = false , desc = "申请退款的金额", example= "0")
	private Long refundAmount;

	@SerializedName("apply_time")
	@OpField(required = false , desc = "售后申请时间", example= "123")
	private Long applyTime;

	@SerializedName("s_id")
	@OpField(required = false , desc = "子订单ID", example= "123")
	private Long sId;

	@SerializedName("p_id")
	@OpField(required = false , desc = "父订单ID", example= "123")
	private Long pId;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID", example= "123")
	private Long shopId;

	@SerializedName("aftersale_id")
	@OpField(required = false , desc = "售后单ID", example= "123")
	private Long aftersaleId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAftersaleStatus(Long aftersaleStatus){
		this.aftersaleStatus = aftersaleStatus;
	}

	
	public Long getAftersaleStatus(){
		return this.aftersaleStatus;
	}

	
	public void setAftersaleType(Long aftersaleType){
		this.aftersaleType = aftersaleType;
	}

	
	public Long getAftersaleType(){
		return this.aftersaleType;
	}

	
	public void setRefundAmount(Long refundAmount){
		this.refundAmount = refundAmount;
	}

	
	public Long getRefundAmount(){
		return this.refundAmount;
	}

	
	public void setApplyTime(Long applyTime){
		this.applyTime = applyTime;
	}

	
	public Long getApplyTime(){
		return this.applyTime;
	}

	
	public void setSId(Long sId){
		this.sId = sId;
	}

	
	public Long getSId(){
		return this.sId;
	}

	
	public void setPId(Long pId){
		this.pId = pId;
	}

	
	public Long getPId(){
		return this.pId;
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

	
	public void setAftersaleId(Long aftersaleId){
		this.aftersaleId = aftersaleId;
	}

	
	public Long getAftersaleId(){
		return this.aftersaleId;
	}

}