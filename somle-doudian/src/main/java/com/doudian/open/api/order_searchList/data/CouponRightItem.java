package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CouponRightItem {


	@SerializedName("right_type")
	@OpField(desc = "权益类型", example = "1")
	private Long rightType;

	@SerializedName("right_name")
	@OpField(desc = "权益名称", example = "现金抵扣")
	private String rightName;

	@SerializedName("quota")
	@OpField(desc = "权益面值", example = "1")
	private Long quota;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRightType(Long rightType){
		this.rightType = rightType;
	}

	
	public Long getRightType(){
		return this.rightType;
	}

	
	public void setRightName(String rightName){
		this.rightName = rightName;
	}

	
	public String getRightName(){
		return this.rightName;
	}

	
	public void setQuota(Long quota){
		this.quota = quota;
	}

	
	public Long getQuota(){
		return this.quota;
	}

}