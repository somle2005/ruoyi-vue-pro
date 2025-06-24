package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class VirtualGoodsRule {


	@SerializedName("support_show_checkout_entry")
	@OpField(desc = "是否可能设置订单页展示核销入口；当该字段为 true且提取方式为「使用电子凭证」或「充值直连」时，可以设置", example = "true")
	private Boolean supportShowCheckoutEntry;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSupportShowCheckoutEntry(Boolean supportShowCheckoutEntry){
		this.supportShowCheckoutEntry = supportShowCheckoutEntry;
	}

	
	public Boolean getSupportShowCheckoutEntry(){
		return this.supportShowCheckoutEntry;
	}

}