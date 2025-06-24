package com.doudian.open.msg.refund_ExchangeComfirmed.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class RefundExchangeComfirmedParam {


	@SerializedName("aftersale_type")
	@OpField(required = false , desc = "售后类型： 0: 退货 1: 售后仅退款 2: 发货前整单退款 3：换货", example= "3")
	private Long aftersaleType;

	@SerializedName("reason_code")
	@OpField(required = false , desc = "申请售后原因码，枚举值如下", example= "15")
	private Long reasonCode;

	@SerializedName("refund_voucher_num")
	@OpField(required = false , desc = "申请退款的卡券的数量", example= "0")
	private Long refundVoucherNum;

	@SerializedName("s_id")
	@OpField(required = false , desc = "子订单ID", example= "4837000698570409793")
	private Long sId;

	@SerializedName("aftersale_status")
	@OpField(required = false , desc = "售后状态码，枚举值如下", example= "13")
	private Long aftersaleStatus;

	@SerializedName("aftersale_id")
	@OpField(required = false , desc = "售后单ID", example= "7002072355312992556")
	private Long aftersaleId;

	@SerializedName("refund_amount")
	@OpField(required = false , desc = "申请退款的金额（含运费）", example= "0")
	private Long refundAmount;

	@SerializedName("refund_post_amount")
	@OpField(required = false , desc = "申请退的运费金额", example= "0")
	private Long refundPostAmount;

	@SerializedName("apply_time")
	@OpField(required = false , desc = "申请时间", example= "1630297113")
	private Long applyTime;

	@SerializedName("p_id")
	@OpField(required = false , desc = "父订单ID", example= "4837000698570409793")
	private Long pId;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID", example= "1111113779")
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

	
	public void setAftersaleType(Long aftersaleType){
		this.aftersaleType = aftersaleType;
	}

	
	public Long getAftersaleType(){
		return this.aftersaleType;
	}

	
	public void setReasonCode(Long reasonCode){
		this.reasonCode = reasonCode;
	}

	
	public Long getReasonCode(){
		return this.reasonCode;
	}

	
	public void setRefundVoucherNum(Long refundVoucherNum){
		this.refundVoucherNum = refundVoucherNum;
	}

	
	public Long getRefundVoucherNum(){
		return this.refundVoucherNum;
	}

	
	public void setSId(Long sId){
		this.sId = sId;
	}

	
	public Long getSId(){
		return this.sId;
	}

	
	public void setAftersaleStatus(Long aftersaleStatus){
		this.aftersaleStatus = aftersaleStatus;
	}

	
	public Long getAftersaleStatus(){
		return this.aftersaleStatus;
	}

	
	public void setAftersaleId(Long aftersaleId){
		this.aftersaleId = aftersaleId;
	}

	
	public Long getAftersaleId(){
		return this.aftersaleId;
	}

	
	public void setRefundAmount(Long refundAmount){
		this.refundAmount = refundAmount;
	}

	
	public Long getRefundAmount(){
		return this.refundAmount;
	}

	
	public void setRefundPostAmount(Long refundPostAmount){
		this.refundPostAmount = refundPostAmount;
	}

	
	public Long getRefundPostAmount(){
		return this.refundPostAmount;
	}

	
	public void setApplyTime(Long applyTime){
		this.applyTime = applyTime;
	}

	
	public Long getApplyTime(){
		return this.applyTime;
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

	
	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}

	
	public String getUpdateTime(){
		return this.updateTime;
	}

}