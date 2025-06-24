package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class StepRule {


	@SerializedName("multi_times")
	@OpField(desc = "支持的时效列表", example = "")
	private List<MultiTimesItem> multiTimes;

	@SerializedName("support")
	@OpField(desc = "是否支持", example = "false")
	private Boolean support;

	@SerializedName("delay_options")
	@OpField(desc = "阶梯现货部分延迟返货时间范围", example = "[9999,1,2]")
	private List<Long> delayOptions;

	@SerializedName("is_special_delay_option")
	@OpField(desc = "是特殊时间延迟发货，可忽略", example = "false")
	private Boolean isSpecialDelayOption;

	@SerializedName("step_min_delay")
	@OpField(desc = "阶梯发货阶梯部分发货时间最小值", example = "7")
	private Long stepMinDelay;

	@SerializedName("step_max_delay")
	@OpField(desc = "阶梯发货阶梯部分发货时间最大值", example = "15")
	private Long stepMaxDelay;

	@SerializedName("delay_rule")
	@OpField(desc = "延迟发货规则", example = "")
	private DelayRule_4_4 delayRule;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMultiTimes(List<MultiTimesItem> multiTimes){
		this.multiTimes = multiTimes;
	}

	
	public List<MultiTimesItem> getMultiTimes(){
		return this.multiTimes;
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

	
	public void setStepMinDelay(Long stepMinDelay){
		this.stepMinDelay = stepMinDelay;
	}

	
	public Long getStepMinDelay(){
		return this.stepMinDelay;
	}

	
	public void setStepMaxDelay(Long stepMaxDelay){
		this.stepMaxDelay = stepMaxDelay;
	}

	
	public Long getStepMaxDelay(){
		return this.stepMaxDelay;
	}

	
	public void setDelayRule(DelayRule_4_4 delayRule){
		this.delayRule = delayRule;
	}

	
	public DelayRule_4_4 getDelayRule(){
		return this.delayRule;
	}

}