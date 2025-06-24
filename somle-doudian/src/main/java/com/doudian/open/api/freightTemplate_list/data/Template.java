package com.doudian.open.api.freightTemplate_list.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Template {


	@SerializedName("id")
	@OpField(desc = "运费模板id，可用于商品发布接口使用", example = "1")
	private Long id;

	@SerializedName("template_name")
	@OpField(desc = "运费模板名称", example = "模版示例")
	private String templateName;

	@SerializedName("product_province")
	@OpField(desc = "发货省份id", example = "32")
	private String productProvince;

	@SerializedName("product_city")
	@OpField(desc = "发货城市id", example = "320000")
	private String productCity;

	@SerializedName("calculate_type")
	@OpField(desc = "计价方式-1.按重量计价 2.按数量计价", example = "1")
	private Long calculateType;

	@SerializedName("transfer_type")
	@OpField(desc = "快递方式-1.快递 目前仅支持1", example = "1")
	private Long transferType;

	@SerializedName("rule_type")
	@OpField(desc = "模板类型-0:阶梯计价 1:固定运费 2:卖家包邮 3:货到付款", example = "1")
	private Long ruleType;

	@SerializedName("fixed_amount")
	@OpField(desc = "固定运费金额(单位:分) 固定运费模板必填 1-9900之间的整数", example = "1")
	private Long fixedAmount;


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

	
	public void setProductProvince(String productProvince){
		this.productProvince = productProvince;
	}

	
	public String getProductProvince(){
		return this.productProvince;
	}

	
	public void setProductCity(String productCity){
		this.productCity = productCity;
	}

	
	public String getProductCity(){
		return this.productCity;
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

	
	public void setFixedAmount(Long fixedAmount){
		this.fixedAmount = fixedAmount;
	}

	
	public Long getFixedAmount(){
		return this.fixedAmount;
	}

}