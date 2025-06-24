package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class KolDiscountDetail {


	@SerializedName("full_discount_info")
	@OpField(desc = "优惠活动信息", example = "")
	private List<FullDiscountInfoItem> fullDiscountInfo;

	@SerializedName("redpack_info")
	@OpField(desc = "红包信息", example = "")
	private List<RedpackInfoItem> redpackInfo;

	@SerializedName("coupon_info")
	@OpField(desc = "优惠券信息", example = "")
	private List<CouponInfoItem> couponInfo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setFullDiscountInfo(List<FullDiscountInfoItem> fullDiscountInfo){
		this.fullDiscountInfo = fullDiscountInfo;
	}

	
	public List<FullDiscountInfoItem> getFullDiscountInfo(){
		return this.fullDiscountInfo;
	}

	
	public void setRedpackInfo(List<RedpackInfoItem> redpackInfo){
		this.redpackInfo = redpackInfo;
	}

	
	public List<RedpackInfoItem> getRedpackInfo(){
		return this.redpackInfo;
	}

	
	public void setCouponInfo(List<CouponInfoItem> couponInfo){
		this.couponInfo = couponInfo;
	}

	
	public List<CouponInfoItem> getCouponInfo(){
		return this.couponInfo;
	}

}