package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.Map;

//auto generated, do not edit

public class MatchableRuleItem {


	@SerializedName("rule_clause")
	@OpField(desc = "资质规则生效的触发条件结构：属性id -> 属性值clause作用：当命中ruleClause中给出的全部属性对时，刷新相关资质的「必填/非必填」配置", example = "")
	private Map<Long,RuleClauseItem> ruleClause;

	@SerializedName("property_effect")
	@OpField(desc = "资质规则触发时，受影响的类目属性结构：属性id -> 属性effect（包含属性是否必填，属性名是否需要被覆写）作用：当命中ruleClause中给出的全部属性对时，刷新相关资质的「必填/非必填」配置", example = "")
	private Map<Long,PropertyEffectItem> propertyEffect;


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

	
	public void setPropertyEffect(Map<Long,PropertyEffectItem> propertyEffect){
		this.propertyEffect = propertyEffect;
	}

	
	public Map<Long,PropertyEffectItem> getPropertyEffect(){
		return this.propertyEffect;
	}

}