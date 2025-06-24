package com.doudian.open.api.product_getProductShopRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductGetProductShopRuleData {


	@SerializedName("audit_auto_rectify_rule")
	@OpField(desc = "自动整改规则", example = "")
	private AuditAutoRectifyRule auditAutoRectifyRule;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAuditAutoRectifyRule(AuditAutoRectifyRule auditAutoRectifyRule){
		this.auditAutoRectifyRule = auditAutoRectifyRule;
	}

	
	public AuditAutoRectifyRule getAuditAutoRectifyRule(){
		return this.auditAutoRectifyRule;
	}

}