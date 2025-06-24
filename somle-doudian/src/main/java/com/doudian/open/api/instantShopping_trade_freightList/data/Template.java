package com.doudian.open.api.instantShopping_trade_freightList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Template {


	@SerializedName("id")
	@OpField(desc = "模板id", example = "1")
	private Long id;

	@SerializedName("template_name")
	@OpField(desc = "模板名称", example = "包邮")
	private String templateName;

	@SerializedName("fixed_amount")
	@OpField(desc = "解析模板详情对应字段：固定运费金额（单位：分）", example = "0")
	private Long fixedAmount;

	@SerializedName("product_province")
	@OpField(desc = "发货省id", example = "11")
	private Long productProvince;

	@SerializedName("rule_type")
	@OpField(desc = "计价方式 6 混合履约模式", example = "6")
	private Long ruleType;

	@SerializedName("product_city")
	@OpField(desc = "发货地市id", example = "110000")
	private Long productCity;

	@SerializedName("calculate_type")
	@OpField(desc = "解析模板详情对应字段", example = "2")
	private Long calculateType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setId(Long id){
		this.id = id;
	}

	
	public Long getId(){
		return this.id;
	}

	
	public void setTemplateName(String templateName){
		this.templateName = templateName;
	}

	
	public String getTemplateName(){
		return this.templateName;
	}

	
	public void setFixedAmount(Long fixedAmount){
		this.fixedAmount = fixedAmount;
	}

	
	public Long getFixedAmount(){
		return this.fixedAmount;
	}

	
	public void setProductProvince(Long productProvince){
		this.productProvince = productProvince;
	}

	
	public Long getProductProvince(){
		return this.productProvince;
	}

	
	public void setRuleType(Long ruleType){
		this.ruleType = ruleType;
	}

	
	public Long getRuleType(){
		return this.ruleType;
	}

	
	public void setProductCity(Long productCity){
		this.productCity = productCity;
	}

	
	public Long getProductCity(){
		return this.productCity;
	}

	
	public void setCalculateType(Long calculateType){
		this.calculateType = calculateType;
	}

	
	public Long getCalculateType(){
		return this.calculateType;
	}

}