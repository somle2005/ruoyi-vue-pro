package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.Map;

//auto generated, do not edit

public class CouponInfoItem {


	@SerializedName("extra_map")
	@OpField(desc = "营销优惠扩展字段instant_activity_id是商家营销活动id", example = "{xxxx:xxxx}")
	private Map<String,String> extraMap;

	@SerializedName("coupon_activity_id")
	@OpField(desc = "优惠券所属商家活动ID", example = "47813206821235")
	private String couponActivityId;

	@SerializedName("coupon_id")
	@OpField(desc = "订单优惠券ID", example = "4781320682406")
	private Long couponId;

	@SerializedName("coupon_type")
	@OpField(desc = "券类型；21-商家折扣券；22-商家直减券；23-商家满减券 ；41-单品折扣券；42-单品直减券；43 单品满减券；", example = "1")
	private Long couponType;

	@SerializedName("coupon_meta_id")
	@OpField(desc = "券批次ID", example = "43543523532")
	private String couponMetaId;

	@SerializedName("coupon_amount")
	@OpField(desc = "券优惠金额（单位：分）", example = "100")
	private Long couponAmount;

	@SerializedName("coupon_name")
	@OpField(desc = "券名称", example = "优惠券")
	private String couponName;

	@SerializedName("share_discount_cost")
	@OpField(desc = "成本分摊", example = "")
	private ShareDiscountCost shareDiscountCost;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setExtraMap(Map<String,String> extraMap){
		this.extraMap = extraMap;
	}

	
	public Map<String,String> getExtraMap(){
		return this.extraMap;
	}

	
	public void setCouponActivityId(String couponActivityId){
		this.couponActivityId = couponActivityId;
	}

	
	public String getCouponActivityId(){
		return this.couponActivityId;
	}

	
	public void setCouponId(Long couponId){
		this.couponId = couponId;
	}

	
	public Long getCouponId(){
		return this.couponId;
	}

	
	public void setCouponType(Long couponType){
		this.couponType = couponType;
	}

	
	public Long getCouponType(){
		return this.couponType;
	}

	
	public void setCouponMetaId(String couponMetaId){
		this.couponMetaId = couponMetaId;
	}

	
	public String getCouponMetaId(){
		return this.couponMetaId;
	}

	
	public void setCouponAmount(Long couponAmount){
		this.couponAmount = couponAmount;
	}

	
	public Long getCouponAmount(){
		return this.couponAmount;
	}

	
	public void setCouponName(String couponName){
		this.couponName = couponName;
	}

	
	public String getCouponName(){
		return this.couponName;
	}

	
	public void setShareDiscountCost(ShareDiscountCost shareDiscountCost){
		this.shareDiscountCost = shareDiscountCost;
	}

	
	public ShareDiscountCost getShareDiscountCost(){
		return this.shareDiscountCost;
	}

}