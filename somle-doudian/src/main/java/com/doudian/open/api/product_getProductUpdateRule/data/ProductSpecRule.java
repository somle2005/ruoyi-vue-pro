package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductSpecRule {


	@SerializedName("all_spec_pic_required")
	@OpField(desc = "为true时，规格图要么全不填，要么全填", example = "true")
	private Boolean allSpecPicRequired;

	@SerializedName("support_property_sequence_variable")
	@OpField(desc = "是否支持规格项顺序调整，true表示支持", example = "false")
	private Boolean supportPropertySequenceVariable;

	@SerializedName("spec_rule_code")
	@OpField(desc = "【废弃字段,请勿依赖】totally_use_given_spec：完全使用系统下发规格；partly_use_given_spec部分使用系统下发规格；not_use_given_spec：不管控规格;:为空时表示不管控规格", example = "")
	private String specRuleCode;

	@SerializedName("required_spec_details")
	@OpField(desc = "商品规格列表", example = "")
	private List<RequiredSpecDetailsItem> requiredSpecDetails;

	@SerializedName("max_spec_num_limit")
	@OpField(desc = "最大可支持的规格层级数量", example = "3")
	private Long maxSpecNumLimit;

	@SerializedName("spec_combination_limit")
	@OpField(desc = "sku组合数量上限", example = "450")
	private Long specCombinationLimit;

	@SerializedName("spec_single_limit")
	@OpField(desc = "单个规格的规格值数量上限", example = "200")
	private Long specSingleLimit;

	@SerializedName("support_property_diy")
	@OpField(desc = "是否支持规格项自定义", example = "false")
	private Boolean supportPropertyDiy;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAllSpecPicRequired(Boolean allSpecPicRequired){
		this.allSpecPicRequired = allSpecPicRequired;
	}

	
	public Boolean getAllSpecPicRequired(){
		return this.allSpecPicRequired;
	}

	
	public void setSupportPropertySequenceVariable(Boolean supportPropertySequenceVariable){
		this.supportPropertySequenceVariable = supportPropertySequenceVariable;
	}

	
	public Boolean getSupportPropertySequenceVariable(){
		return this.supportPropertySequenceVariable;
	}

	
	public void setSpecRuleCode(String specRuleCode){
		this.specRuleCode = specRuleCode;
	}

	
	public String getSpecRuleCode(){
		return this.specRuleCode;
	}

	
	public void setRequiredSpecDetails(List<RequiredSpecDetailsItem> requiredSpecDetails){
		this.requiredSpecDetails = requiredSpecDetails;
	}

	
	public List<RequiredSpecDetailsItem> getRequiredSpecDetails(){
		return this.requiredSpecDetails;
	}

	
	public void setMaxSpecNumLimit(Long maxSpecNumLimit){
		this.maxSpecNumLimit = maxSpecNumLimit;
	}

	
	public Long getMaxSpecNumLimit(){
		return this.maxSpecNumLimit;
	}

	
	public void setSpecCombinationLimit(Long specCombinationLimit){
		this.specCombinationLimit = specCombinationLimit;
	}

	
	public Long getSpecCombinationLimit(){
		return this.specCombinationLimit;
	}

	
	public void setSpecSingleLimit(Long specSingleLimit){
		this.specSingleLimit = specSingleLimit;
	}

	
	public Long getSpecSingleLimit(){
		return this.specSingleLimit;
	}

	
	public void setSupportPropertyDiy(Boolean supportPropertyDiy){
		this.supportPropertyDiy = supportPropertyDiy;
	}

	
	public Boolean getSupportPropertyDiy(){
		return this.supportPropertyDiy;
	}

}