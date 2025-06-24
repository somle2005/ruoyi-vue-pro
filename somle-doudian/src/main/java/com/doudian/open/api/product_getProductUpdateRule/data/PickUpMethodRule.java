package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PickUpMethodRule {


	@SerializedName("virtual_goods_rule")
	@OpField(desc = "虚拟商品提货方式规则", example = "")
	private VirtualGoodsRule virtualGoodsRule;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setVirtualGoodsRule(VirtualGoodsRule virtualGoodsRule){
		this.virtualGoodsRule = virtualGoodsRule;
	}

	
	public VirtualGoodsRule getVirtualGoodsRule(){
		return this.virtualGoodsRule;
	}

}