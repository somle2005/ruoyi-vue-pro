package com.doudian.open.api.product_getProductShopRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AuditAutoRectifyRule {


	@SerializedName("is_grant")
	@OpField(desc = "true：已授权，false：未授权/拒绝授权", example = "false")
	private Boolean isGrant;

	@SerializedName("ungranted_reason")
	@OpField(desc = "未授权原因，1：商家不支持该功能，2:未确定：用户不知道此功能，3:待定:用户知道此功能，但未作出是否授权的决定，4:拒绝授权", example = "1")
	private Integer ungrantedReason;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setIsGrant(Boolean isGrant){
		this.isGrant = isGrant;
	}

	
	public Boolean getIsGrant(){
		return this.isGrant;
	}

	
	public void setUngrantedReason(Integer ungrantedReason){
		this.ungrantedReason = ungrantedReason;
	}

	
	public Integer getUngrantedReason(){
		return this.ungrantedReason;
	}

}