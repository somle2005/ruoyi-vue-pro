package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class PlatformDiscountDetail {


	@SerializedName("official_deduction_amount")
	@OpField(desc = "官方立减金额（单位：分）", example = "0")
	private Long officialDeductionAmount;

	@SerializedName("allowance_amount")
	@OpField(desc = "购物补贴抵扣金额（单位：分）", example = "0")
	private Long allowanceAmount;

	@SerializedName("user_balance_amount")
	@OpField(desc = "余额抵扣金额（单位：分）", example = "0")
	private Long userBalanceAmount;

	@SerializedName("total_amount")
	@OpField(desc = "优惠总金额（单位：分）", example = "0")
	private Long totalAmount;

	@SerializedName("coupon_amount")
	@OpField(desc = "券优惠金额（单位：分）", example = "0")
	private Long couponAmount;

	@SerializedName("full_discount_amount")
	@OpField(desc = "活动优惠金额（单位：分）", example = "0")
	private Long fullDiscountAmount;

	@SerializedName("coupon_info")
	@OpField(desc = "优惠券信息", example = "")
	private List<CouponInfoItem_5_5> couponInfo;

	@SerializedName("full_discount_info")
	@OpField(desc = "优惠活动信息", example = "")
	private List<FullDiscountInfoItem_5_5> fullDiscountInfo;

	@SerializedName("redpack_amount")
	@OpField(desc = "红包金额（单位：分）", example = "0")
	private Long redpackAmount;

	@SerializedName("redpack_info")
	@OpField(desc = "红包信息", example = "")
	private List<RedpackInfoItem> redpackInfo;

	@SerializedName("gold_coin_amount")
	@OpField(desc = "金币抵扣金额（单位：分）", example = "0")
	private Long goldCoinAmount;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOfficialDeductionAmount(Long officialDeductionAmount){
		this.officialDeductionAmount = officialDeductionAmount;
	}

	
	public Long getOfficialDeductionAmount(){
		return this.officialDeductionAmount;
	}

	
	public void setAllowanceAmount(Long allowanceAmount){
		this.allowanceAmount = allowanceAmount;
	}

	
	public Long getAllowanceAmount(){
		return this.allowanceAmount;
	}

	
	public void setUserBalanceAmount(Long userBalanceAmount){
		this.userBalanceAmount = userBalanceAmount;
	}

	
	public Long getUserBalanceAmount(){
		return this.userBalanceAmount;
	}

	
	public void setTotalAmount(Long totalAmount){
		this.totalAmount = totalAmount;
	}

	
	public Long getTotalAmount(){
		return this.totalAmount;
	}

	
	public void setCouponAmount(Long couponAmount){
		this.couponAmount = couponAmount;
	}

	
	public Long getCouponAmount(){
		return this.couponAmount;
	}

	
	public void setFullDiscountAmount(Long fullDiscountAmount){
		this.fullDiscountAmount = fullDiscountAmount;
	}

	
	public Long getFullDiscountAmount(){
		return this.fullDiscountAmount;
	}

	
	public void setCouponInfo(List<CouponInfoItem_5_5> couponInfo){
		this.couponInfo = couponInfo;
	}

	
	public List<CouponInfoItem_5_5> getCouponInfo(){
		return this.couponInfo;
	}

	
	public void setFullDiscountInfo(List<FullDiscountInfoItem_5_5> fullDiscountInfo){
		this.fullDiscountInfo = fullDiscountInfo;
	}

	
	public List<FullDiscountInfoItem_5_5> getFullDiscountInfo(){
		return this.fullDiscountInfo;
	}

	
	public void setRedpackAmount(Long redpackAmount){
		this.redpackAmount = redpackAmount;
	}

	
	public Long getRedpackAmount(){
		return this.redpackAmount;
	}

	
	public void setRedpackInfo(List<RedpackInfoItem> redpackInfo){
		this.redpackInfo = redpackInfo;
	}

	
	public List<RedpackInfoItem> getRedpackInfo(){
		return this.redpackInfo;
	}

	
	public void setGoldCoinAmount(Long goldCoinAmount){
		this.goldCoinAmount = goldCoinAmount;
	}

	
	public Long getGoldCoinAmount(){
		return this.goldCoinAmount;
	}

}