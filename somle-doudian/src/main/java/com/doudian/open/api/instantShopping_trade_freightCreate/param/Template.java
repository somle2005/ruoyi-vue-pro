package com.doudian.open.api.instantShopping_trade_freightCreate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Template {


	@SerializedName("calculate_type")
	@OpField(required = false , desc = "解析column中calculate_type字段：计价方式-1.按重量计价 2.按数量计价", example= "2")
	private Long calculateType;

	@SerializedName("transfer_type")
	@OpField(required = false , desc = "固定值1", example= "1")
	private Long transferType;

	@SerializedName("rule_type")
	@OpField(required = false , desc = "计价方式 0:阶梯计价 1:固定运费 2:卖家包邮;6混合履约模式固定值6", example= "6")
	private Long ruleType;

	@SerializedName("template_name")
	@OpField(required = false , desc = "模板名称", example= "模板名称")
	private String templateName;

	@SerializedName("product_province")
	@OpField(required = false , desc = "发货省份id", example= "11")
	private Long productProvince;

	@SerializedName("product_city")
	@OpField(required = false , desc = "发货城市id", example= "110000")
	private Long productCity;

	@SerializedName("fixed_amount")
	@OpField(required = false , desc = "固定运费金额（单位：分）", example= "0")
	private Long fixedAmount;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCalculateType(Long calculateType){
		this.calculateType = calculateType;
	}

	
	public Long getCalculateType(){
		return this.calculateType;
	}

	
	public void setTransferType(Long transferType){
		this.transferType = transferType;
	}

	
	public Long getTransferType(){
		return this.transferType;
	}

	
	public void setRuleType(Long ruleType){
		this.ruleType = ruleType;
	}

	
	public Long getRuleType(){
		return this.ruleType;
	}

	
	public void setTemplateName(String templateName){
		this.templateName = templateName;
	}

	
	public String getTemplateName(){
		return this.templateName;
	}

	
	public void setProductProvince(Long productProvince){
		this.productProvince = productProvince;
	}

	
	public Long getProductProvince(){
		return this.productProvince;
	}

	
	public void setProductCity(Long productCity){
		this.productCity = productCity;
	}

	
	public Long getProductCity(){
		return this.productCity;
	}

	
	public void setFixedAmount(Long fixedAmount){
		this.fixedAmount = fixedAmount;
	}

	
	public Long getFixedAmount(){
		return this.fixedAmount;
	}

}