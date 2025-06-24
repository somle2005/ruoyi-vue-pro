package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class RecommendNameRule {


	@SerializedName("title_illegal_keyword_rule")
	@OpField(desc = "商品标题非法关键词规则", example = "")
	private List<TitleIllegalKeywordRuleItem> titleIllegalKeywordRule;

	@SerializedName("prefix_brand_unauth_can_sel")
	@OpField(desc = "品牌没有权限是否可以勾选", example = "false")
	private Boolean prefixBrandUnauthCanSel;

	@SerializedName("prefix_prop_has_brand")
	@OpField(desc = "前缀规则是否包含品牌", example = "false")
	private Boolean prefixPropHasBrand;

	@SerializedName("title_limit_rule")
	@OpField(desc = "标题长度规则", example = "")
	private TitleLimitRule titleLimitRule;

	@SerializedName("satisfy_prefix")
	@OpField(desc = "当前类目id是否命中前缀推荐规则", example = "true")
	private Boolean satisfyPrefix;

	@SerializedName("property_ids")
	@OpField(desc = "命中规则的属性id详情", example = "[365, 3987]")
	private List<Long> propertyIds;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTitleIllegalKeywordRule(List<TitleIllegalKeywordRuleItem> titleIllegalKeywordRule){
		this.titleIllegalKeywordRule = titleIllegalKeywordRule;
	}

	
	public List<TitleIllegalKeywordRuleItem> getTitleIllegalKeywordRule(){
		return this.titleIllegalKeywordRule;
	}

	
	public void setPrefixBrandUnauthCanSel(Boolean prefixBrandUnauthCanSel){
		this.prefixBrandUnauthCanSel = prefixBrandUnauthCanSel;
	}

	
	public Boolean getPrefixBrandUnauthCanSel(){
		return this.prefixBrandUnauthCanSel;
	}

	
	public void setPrefixPropHasBrand(Boolean prefixPropHasBrand){
		this.prefixPropHasBrand = prefixPropHasBrand;
	}

	
	public Boolean getPrefixPropHasBrand(){
		return this.prefixPropHasBrand;
	}

	
	public void setTitleLimitRule(TitleLimitRule titleLimitRule){
		this.titleLimitRule = titleLimitRule;
	}

	
	public TitleLimitRule getTitleLimitRule(){
		return this.titleLimitRule;
	}

	
	public void setSatisfyPrefix(Boolean satisfyPrefix){
		this.satisfyPrefix = satisfyPrefix;
	}

	
	public Boolean getSatisfyPrefix(){
		return this.satisfyPrefix;
	}

	
	public void setPropertyIds(List<Long> propertyIds){
		this.propertyIds = propertyIds;
	}

	
	public List<Long> getPropertyIds(){
		return this.propertyIds;
	}

}