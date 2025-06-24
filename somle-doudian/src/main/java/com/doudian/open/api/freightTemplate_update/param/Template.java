package com.doudian.open.api.freightTemplate_update.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Template {


	@SerializedName("id")
	@OpField(required = true , desc = "要更新的运费模板id", example= "281489")
	private Long id;

	@SerializedName("template_name")
	@OpField(required = true , desc = "模板名称", example= "open测试模板名称")
	private String templateName;

	@SerializedName("product_province")
	@OpField(required = false , desc = "发货省份", example= "32")
	private Long productProvince;

	@SerializedName("product_city")
	@OpField(required = false , desc = "发货城市", example= "320100")
	private Long productCity;

	@SerializedName("calculate_type")
	@OpField(required = false , desc = "计价方式-1.按重量 2.按数量；模板类型为1、2、3时，计价类型传2", example= "1")
	private Long calculateType;

	@SerializedName("transfer_type")
	@OpField(required = false , desc = "快递方式-1.快递", example= "1")
	private Long transferType;

	@SerializedName("rule_type")
	@OpField(required = false , desc = "模板类型-0:阶梯计价 1:固定运费 2:卖家包邮 3:货到付款", example= "0")
	private Long ruleType;

	@SerializedName("fixed_amount")
	@OpField(required = false , desc = "固定运费金额(单位:分) 固定运费模板必填 1-9900之间的整数", example= "1")
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