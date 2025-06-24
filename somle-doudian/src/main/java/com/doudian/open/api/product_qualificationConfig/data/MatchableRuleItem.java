package com.doudian.open.api.product_qualificationConfig.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.Map;

//auto generated, do not edit

public class MatchableRuleItem {


	@SerializedName("rule_clause")
	@OpField(desc = "key为类目属性id，当该属性填了如下属性值时，命中规则", example = "")
	private Map<Long,RuleClauseItem> ruleClause;

	@SerializedName("is_qualification_required")
	@OpField(desc = "命中该规则后 该资质是否必填", example = "true")
	private Boolean isQualificationRequired;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRuleClause(Map<Long,RuleClauseItem> ruleClause){
		this.ruleClause = ruleClause;
	}

	
	public Map<Long,RuleClauseItem> getRuleClause(){
		return this.ruleClause;
	}

	
	public void setIsQualificationRequired(Boolean isQualificationRequired){
		this.isQualificationRequired = isQualificationRequired;
	}

	
	public Boolean getIsQualificationRequired(){
		return this.isQualificationRequired;
	}

}