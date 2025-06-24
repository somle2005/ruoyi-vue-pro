package com.doudian.open.api.order_addressModify.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderAddressModifyData {


	@SerializedName("need_user_review")
	@OpField(desc = "true 表示当前改地址需要消费者确认，消费者确认之后才修改地址false 表示当前改地址不需要消费者确认，直接修改成功", example = "true")
	private Boolean needUserReview;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setNeedUserReview(Boolean needUserReview){
		this.needUserReview = needUserReview;
	}

	
	public Boolean getNeedUserReview(){
		return this.needUserReview;
	}

}