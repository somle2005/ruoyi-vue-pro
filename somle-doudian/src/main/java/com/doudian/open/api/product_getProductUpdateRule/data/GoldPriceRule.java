package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class GoldPriceRule {


	@SerializedName("price_rules")
	@OpField(desc = "价格规则信息，内有黄金的不同的单位价格以及枚举", example = "")
	private List<PriceRulesItem> priceRules;

	@SerializedName("sell_property_id")
	@OpField(desc = "销售属性（规格）id，价格基于这个规格填写的数值按照公式进行计算", example = "4530")
	private String sellPropertyId;

	@SerializedName("is_required")
	@OpField(desc = "是否必填，true表示必填，false表示非必填", example = "true")
	private Boolean isRequired;

	@SerializedName("is_show")
	@OpField(desc = "是否需要展示（可填），true表示需要展示（可填），false表示无需展示（不可填）", example = "true")
	private Boolean isShow;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPriceRules(List<PriceRulesItem> priceRules){
		this.priceRules = priceRules;
	}

	
	public List<PriceRulesItem> getPriceRules(){
		return this.priceRules;
	}

	
	public void setSellPropertyId(String sellPropertyId){
		this.sellPropertyId = sellPropertyId;
	}

	
	public String getSellPropertyId(){
		return this.sellPropertyId;
	}

	
	public void setIsRequired(Boolean isRequired){
		this.isRequired = isRequired;
	}

	
	public Boolean getIsRequired(){
		return this.isRequired;
	}

	
	public void setIsShow(Boolean isShow){
		this.isShow = isShow;
	}

	
	public Boolean getIsShow(){
		return this.isShow;
	}

}