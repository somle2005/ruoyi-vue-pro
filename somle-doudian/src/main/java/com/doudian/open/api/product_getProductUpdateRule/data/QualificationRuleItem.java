package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class QualificationRuleItem {


	@SerializedName("is_qianchuan_need")
	@OpField(desc = "是否千川收取资质", example = "true")
	private Boolean isQianchuanNeed;

	@SerializedName("is_required")
	@OpField(desc = "是否必填", example = "true")
	private Boolean isRequired;

	@SerializedName("text_list")
	@OpField(desc = "资质要求描述文字", example = "经营进口商品，需提供近一年内的中华人民共和国海关进口货物报关单。报关单上应展现对应品牌名称，及商品名称。")
	private List<String> textList;

	@SerializedName("name")
	@OpField(desc = "资质名称", example = "3C证书编号")
	private String name;

	@SerializedName("key")
	@OpField(desc = "资质ID", example = "1234567")
	private String key;

	@SerializedName("matchable_rule")
	@OpField(desc = "资质规则和规则的效果", example = "")
	private List<MatchableRuleItem> matchableRule;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setIsQianchuanNeed(Boolean isQianchuanNeed){
		this.isQianchuanNeed = isQianchuanNeed;
	}

	
	public Boolean getIsQianchuanNeed(){
		return this.isQianchuanNeed;
	}

	
	public void setIsRequired(Boolean isRequired){
		this.isRequired = isRequired;
	}

	
	public Boolean getIsRequired(){
		return this.isRequired;
	}

	
	public void setTextList(List<String> textList){
		this.textList = textList;
	}

	
	public List<String> getTextList(){
		return this.textList;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setKey(String key){
		this.key = key;
	}

	
	public String getKey(){
		return this.key;
	}

	
	public void setMatchableRule(List<MatchableRuleItem> matchableRule){
		this.matchableRule = matchableRule;
	}

	
	public List<MatchableRuleItem> getMatchableRule(){
		return this.matchableRule;
	}

}