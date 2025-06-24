package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class NormalRule {


	@SerializedName("delay_rule")
	@OpField(desc = "特殊时间延迟发货规则", example = "")
	private DelayRule_4_4 delayRule;

	@SerializedName("support")
	@OpField(desc = "是否支持", example = "true")
	private Boolean support;

	@SerializedName("delay_options")
	@OpField(desc = "发货时效选项，如当日发、次日发、48小时", example = "[9999,1,2]")
	private List<Long> delayOptions;

	@SerializedName("is_special_delay_option")
	@OpField(desc = "是否是特殊的时间发货，可忽略", example = "false")
	private Boolean isSpecialDelayOption;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDelayRule(DelayRule_4_4 delayRule){
		this.delayRule = delayRule;
	}

	
	public DelayRule_4_4 getDelayRule(){
		return this.delayRule;
	}

	
	public void setSupport(Boolean support){
		this.support = support;
	}

	
	public Boolean getSupport(){
		return this.support;
	}

	
	public void setDelayOptions(List<Long> delayOptions){
		this.delayOptions = delayOptions;
	}

	
	public List<Long> getDelayOptions(){
		return this.delayOptions;
	}

	
	public void setIsSpecialDelayOption(Boolean isSpecialDelayOption){
		this.isSpecialDelayOption = isSpecialDelayOption;
	}

	
	public Boolean getIsSpecialDelayOption(){
		return this.isSpecialDelayOption;
	}

}