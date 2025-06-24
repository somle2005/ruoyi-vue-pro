package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AfterSaleRule {


	@SerializedName("three_guarantees")
	@OpField(desc = "三包服务承诺配置规则", example = "")
	private ThreeGuarantees threeGuarantees;

	@SerializedName("allergy_return_v2_rule")
	@OpField(desc = "过敏包退规则", example = "")
	private AllergyReturnV2Rule allergyReturnV2Rule;

	@SerializedName("large_product_rule")
	@OpField(desc = "大件商品规则", example = "")
	private LargeProductRule largeProductRule;

	@SerializedName("supply_day_return_rule")
	@OpField(desc = "无理由退货规则", example = "")
	private SupplyDayReturnRule supplyDayReturnRule;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setThreeGuarantees(ThreeGuarantees threeGuarantees){
		this.threeGuarantees = threeGuarantees;
	}

	
	public ThreeGuarantees getThreeGuarantees(){
		return this.threeGuarantees;
	}

	
	public void setAllergyReturnV2Rule(AllergyReturnV2Rule allergyReturnV2Rule){
		this.allergyReturnV2Rule = allergyReturnV2Rule;
	}

	
	public AllergyReturnV2Rule getAllergyReturnV2Rule(){
		return this.allergyReturnV2Rule;
	}

	
	public void setLargeProductRule(LargeProductRule largeProductRule){
		this.largeProductRule = largeProductRule;
	}

	
	public LargeProductRule getLargeProductRule(){
		return this.largeProductRule;
	}

	
	public void setSupplyDayReturnRule(SupplyDayReturnRule supplyDayReturnRule){
		this.supplyDayReturnRule = supplyDayReturnRule;
	}

	
	public SupplyDayReturnRule getSupplyDayReturnRule(){
		return this.supplyDayReturnRule;
	}

}