package com.doudian.open.api.order_AddressAppliedSwitch.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderAddressAppliedSwitchParam {


	@SerializedName("is_allowed")
	@OpField(required = true , desc = "0代表关闭，不需要审核 1代表开启审核，买家变更需要审核", example= "1")
	private Long isAllowed;

	@SerializedName("review_type")
	@OpField(required = false , desc = "0代表异步审核，1表示实时审核", example= "1")
	private Long reviewType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setIsAllowed(Long isAllowed){
		this.isAllowed = isAllowed;
	}

	
	public Long getIsAllowed(){
		return this.isAllowed;
	}

	
	public void setReviewType(Long reviewType){
		this.reviewType = reviewType;
	}

	
	public Long getReviewType(){
		return this.reviewType;
	}

}