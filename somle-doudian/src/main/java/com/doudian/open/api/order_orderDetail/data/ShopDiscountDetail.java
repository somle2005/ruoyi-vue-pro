package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ShopDiscountDetail {


	@SerializedName("redpack_info")
	@OpField(desc = "红包明细", example = "")
	private List<RedpackInfoItem> redpackInfo;

	@SerializedName("redpack_amount")
	@OpField(desc = "红包金额，单位：分", example = "0")
	private Long redpackAmount;

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
	private List<CouponInfoItem> couponInfo;

	@SerializedName("full_discount_info")
	@OpField(desc = "优惠活动信息", example = "")
	private List<FullDiscountInfoItem> fullDiscountInfo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRedpackInfo(List<RedpackInfoItem> redpackInfo){
		this.redpackInfo = redpackInfo;
	}

	
	public List<RedpackInfoItem> getRedpackInfo(){
		return this.redpackInfo;
	}

	
	public void setRedpackAmount(Long redpackAmount){
		this.redpackAmount = redpackAmount;
	}

	
	public Long getRedpackAmount(){
		return this.redpackAmount;
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

	
	public void setCouponInfo(List<CouponInfoItem> couponInfo){
		this.couponInfo = couponInfo;
	}

	
	public List<CouponInfoItem> getCouponInfo(){
		return this.couponInfo;
	}

	
	public void setFullDiscountInfo(List<FullDiscountInfoItem> fullDiscountInfo){
		this.fullDiscountInfo = fullDiscountInfo;
	}

	
	public List<FullDiscountInfoItem> getFullDiscountInfo(){
		return this.fullDiscountInfo;
	}

}