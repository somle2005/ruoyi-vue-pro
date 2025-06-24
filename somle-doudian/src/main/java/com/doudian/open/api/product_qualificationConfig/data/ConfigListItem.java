package com.doudian.open.api.product_qualificationConfig.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ConfigListItem {


	@SerializedName("key")
	@OpField(desc = "资质ID", example = "3457058945162709852")
	private String key;

	@SerializedName("name")
	@OpField(desc = "资质名", example = "质检报告")
	private String name;

	@SerializedName("text_list")
	@OpField(desc = "填写提示", example = "[           需为近一年由第三方权威质检机构出具的一份含有CMA或CNAS认证的质检报告。,           -检测报告里的商品名称、品牌、生产商名称等信息与商详发布的商品信息需一致,           -如报告无品牌名称，需提供含品牌名称、商品名称及生产单位的产品实拍图,           -涉及特殊材质的商品，需提供材质（面料）或成品质检报告，质检报告须包含材质成分（纺织品还需包含面料含量)、对应的商品货号或款号或商品名称。特殊材质包含但不限于蚕丝、真丝、羽绒、鸭绒、鹅绒、羊绒、羊毛、牛皮、羊皮、真皮、移膜革、猪皮等（包括皮草类）。         ]")
	private List<String> textList;

	@SerializedName("is_required")
	@OpField(desc = "是否必填", example = "true")
	private Boolean isRequired;

	@SerializedName("matchable_rule")
	@OpField(desc = "商品类目属性可能触发的规则（会导致资质是否必填发生变化）", example = "")
	private List<MatchableRuleItem> matchableRule;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setKey(String key){
		this.key = key;
	}

	
	public String getKey(){
		return this.key;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setTextList(List<String> textList){
		this.textList = textList;
	}

	
	public List<String> getTextList(){
		return this.textList;
	}

	
	public void setIsRequired(Boolean isRequired){
		this.isRequired = isRequired;
	}

	
	public Boolean getIsRequired(){
		return this.isRequired;
	}

	
	public void setMatchableRule(List<MatchableRuleItem> matchableRule){
		this.matchableRule = matchableRule;
	}

	
	public List<MatchableRuleItem> getMatchableRule(){
		return this.matchableRule;
	}

}