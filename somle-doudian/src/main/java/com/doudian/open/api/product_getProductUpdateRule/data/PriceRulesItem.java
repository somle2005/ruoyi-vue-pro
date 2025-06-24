package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PriceRulesItem {


	@SerializedName("can_select")
	@OpField(desc = "是否可选，true表示可选，false表示不可选，如果不可选则表示商家没有设置过基础金价，需要前往抖店后台设置", example = "true")
	private Boolean canSelect;

	@SerializedName("desc")
	@OpField(desc = "金价描述", example = "投资金基础金价：100元/克")
	private String desc;

	@SerializedName("value")
	@OpField(desc = "每克重黄金对应的价格，单位：分", example = "12300")
	private Long value;

	@SerializedName("type")
	@OpField(desc = "价格规则枚举：1是投资金2是首饰金", example = "1")
	private Long type;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCanSelect(Boolean canSelect){
		this.canSelect = canSelect;
	}

	
	public Boolean getCanSelect(){
		return this.canSelect;
	}

	
	public void setDesc(String desc){
		this.desc = desc;
	}

	
	public String getDesc(){
		return this.desc;
	}

	
	public void setValue(Long value){
		this.value = value;
	}

	
	public Long getValue(){
		return this.value;
	}

	
	public void setType(Long type){
		this.type = type;
	}

	
	public Long getType(){
		return this.type;
	}

}