package com.doudian.open.api.instantShopping_trade_freightDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Template {


	@SerializedName("product_province")
	@OpField(desc = "发货省份id", example = "11")
	private Long productProvince;

	@SerializedName("transfer_type")
	@OpField(desc = "固定值1", example = "1")
	private Long transferType;

	@SerializedName("calculate_type")
	@OpField(desc = "解析column中calculate_type", example = "2")
	private Long calculateType;

	@SerializedName("fixed_amount")
	@OpField(desc = "解析column中对应的字段，固定运费金额（单位：分）", example = "0")
	private Long fixedAmount;

	@SerializedName("template_name")
	@OpField(desc = "模板名称", example = "包邮")
	private String templateName;

	@SerializedName("product_city")
	@OpField(desc = "发货城市id", example = "110000")
	private Long productCity;

	@SerializedName("rule_type")
	@OpField(desc = "计价方式:固定为6，解析col", example = "6")
	private Long ruleType;

	@SerializedName("id")
	@OpField(desc = "模板id", example = "1")
	private Long id;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductProvince(Long productProvince){
		this.productProvince = productProvince;
	}

	
	public Long getProductProvince(){
		return this.productProvince;
	}

	
	public void setTransferType(Long transferType){
		this.transferType = transferType;
	}

	
	public Long getTransferType(){
		return this.transferType;
	}

	
	public void setCalculateType(Long calculateType){
		this.calculateType = calculateType;
	}

	
	public Long getCalculateType(){
		return this.calculateType;
	}

	
	public void setFixedAmount(Long fixedAmount){
		this.fixedAmount = fixedAmount;
	}

	
	public Long getFixedAmount(){
		return this.fixedAmount;
	}

	
	public void setTemplateName(String templateName){
		this.templateName = templateName;
	}

	
	public String getTemplateName(){
		return this.templateName;
	}

	
	public void setProductCity(Long productCity){
		this.productCity = productCity;
	}

	
	public Long getProductCity(){
		return this.productCity;
	}

	
	public void setRuleType(Long ruleType){
		this.ruleType = ruleType;
	}

	
	public Long getRuleType(){
		return this.ruleType;
	}

	
	public void setId(Long id){
		this.id = id;
	}

	
	public Long getId(){
		return this.id;
	}

}