package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ExtraRule {


	@SerializedName("c2b_customize_rule")
	@OpField(desc = "c2b定制相关规则", example = "")
	private C2bCustomizeRule c2bCustomizeRule;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setC2bCustomizeRule(C2bCustomizeRule c2bCustomizeRule){
		this.c2bCustomizeRule = c2bCustomizeRule;
	}

	
	public C2bCustomizeRule getC2bCustomizeRule(){
		return this.c2bCustomizeRule;
	}

}