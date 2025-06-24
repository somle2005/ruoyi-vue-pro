package com.doudian.open.msg.refund_RefundAgreed.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class RefundRefundAgreedParam {


	@SerializedName("aftersale_id")
	@OpField(required = false , desc = "售后单ID", example= "6999514477070778668")
	private Long aftersaleId;

	@SerializedName("aftersale_status")
	@OpField(required = false , desc = "售后状态码，枚举值如下", example= "12")
	private Long aftersaleStatus;

	@SerializedName("refund_post_amount")
	@OpField(required = false , desc = "申请退的运费金额", example= "0")
	private Long refundPostAmount;

	@SerializedName("agree_time")
	@OpField(required = false , desc = "同意退款时间", example= "1630306403")
	private Long agreeTime;

	@SerializedName("refund_voucher_num")
	@OpField(required = false , desc = "申请退款的卡券的数量", example= "0")
	private Long refundVoucherNum;

	@SerializedName("p_id")
	@OpField(required = false , desc = "父订单ID", example= "4834442890931275585")
	private Long pId;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID", example= "1111113779")
	private Long shopId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "8794053")
	private Long storeId;

	@SerializedName("aftersale_type")
	@OpField(required = false , desc = "售后类型： 0: 退货 1: 售后仅退款 2: 发货前退款 3：换货", example= "0")
	private Long aftersaleType;

	@SerializedName("refund_amount")
	@OpField(required = false , desc = "申请退款的金额（含运费）", example= "1")
	private Long refundAmount;

	@SerializedName("reason_code")
	@OpField(required = false , desc = "申请售后原因码，枚举值如下", example= "15")
	private Long reasonCode;

	@SerializedName("s_id")
	@OpField(required = false , desc = "子订单ID", example= "4834442890931275585")
	private Long sId;

	@SerializedName("update_time")
	@OpField(required = false , desc = "售后单更新时间", example= "2022-09-02T10:27:50+08:00")
	private String updateTime;

	@SerializedName("op_role")
	@OpField(required = false , desc = "1 - 用户 2 - 商家 3 - 客户/运营 4 - 系统", example= "1")
	private Long opRole;


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

	
	public void setAftersaleStatus(Long aftersaleStatus){
		this.aftersaleStatus = aftersaleStatus;
	}

	
	public Long getAftersaleStatus(){
		return this.aftersaleStatus;
	}

	
	public void setRefundPostAmount(Long refundPostAmount){
		this.refundPostAmount = refundPostAmount;
	}

	
	public Long getRefundPostAmount(){
		return this.refundPostAmount;
	}

	
	public void setAgreeTime(Long agreeTime){
		this.agreeTime = agreeTime;
	}

	
	public Long getAgreeTime(){
		return this.agreeTime;
	}

	
	public void setRefundVoucherNum(Long refundVoucherNum){
		this.refundVoucherNum = refundVoucherNum;
	}

	
	public Long getRefundVoucherNum(){
		return this.refundVoucherNum;
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

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
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

	
	public void setReasonCode(Long reasonCode){
		this.reasonCode = reasonCode;
	}

	
	public Long getReasonCode(){
		return this.reasonCode;
	}

	
	public void setSId(Long sId){
		this.sId = sId;
	}

	
	public Long getSId(){
		return this.sId;
	}

	
	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}

	
	public String getUpdateTime(){
		return this.updateTime;
	}

	
	public void setOpRole(Long opRole){
		this.opRole = opRole;
	}

	
	public Long getOpRole(){
		return this.opRole;
	}

}