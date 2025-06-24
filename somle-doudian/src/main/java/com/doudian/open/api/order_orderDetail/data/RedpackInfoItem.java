package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.Map;

//auto generated, do not edit

public class RedpackInfoItem {


	@SerializedName("extra_map")
	@OpField(desc = "营销优惠扩展字段instant_activity_id是商家营销活动id", example = "{xxxx:xxxx}")
	private Map<String,String> extraMap;

	@SerializedName("share_discount_cost")
	@OpField(desc = "分摊成本", example = "")
	private ShareDiscountCost shareDiscountCost;

	@SerializedName("redpack_trans_id")
	@OpField(desc = "红包汇总id", example = "634783264")
	private String redpackTransId;

	@SerializedName("redpack_amount")
	@OpField(desc = "红包金额，单位：分", example = "0")
	private Long redpackAmount;


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

	
	public void setShareDiscountCost(ShareDiscountCost shareDiscountCost){
		this.shareDiscountCost = shareDiscountCost;
	}

	
	public ShareDiscountCost getShareDiscountCost(){
		return this.shareDiscountCost;
	}

	
	public void setRedpackTransId(String redpackTransId){
		this.redpackTransId = redpackTransId;
	}

	
	public String getRedpackTransId(){
		return this.redpackTransId;
	}

	
	public void setRedpackAmount(Long redpackAmount){
		this.redpackAmount = redpackAmount;
	}

	
	public Long getRedpackAmount(){
		return this.redpackAmount;
	}

}