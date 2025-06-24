package com.doudian.open.api.product_editV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class UnitPriceInfo {


	@SerializedName("process_charge")
	@OpField(required = true , desc = "废弃字段，请写死传0", example= "0")
	private Long processCharge;

	@SerializedName("price_rule_type")
	@OpField(required = true , desc = "价格规则类型：1表示投资金2表示首饰金", example= "1")
	private Integer priceRuleType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProcessCharge(Long processCharge){
		this.processCharge = processCharge;
	}

	
	public Long getProcessCharge(){
		return this.processCharge;
	}

	
	public void setPriceRuleType(Integer priceRuleType){
		this.priceRuleType = priceRuleType;
	}

	
	public Integer getPriceRuleType(){
		return this.priceRuleType;
	}

}