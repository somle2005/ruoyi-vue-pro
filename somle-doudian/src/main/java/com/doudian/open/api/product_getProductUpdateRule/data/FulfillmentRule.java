package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class FulfillmentRule {


	@SerializedName("delay_rule")
	@OpField(desc = "特殊时间延迟发货规则", example = "")
	private DelayRule delayRule;

	@SerializedName("normal_rule")
	@OpField(desc = "现货发货模式规则", example = "")
	private NormalRule normalRule;

	@SerializedName("step_rule")
	@OpField(desc = "阶梯发货模式规则", example = "")
	private StepRule stepRule;

	@SerializedName("product_presell_rule")
	@OpField(desc = "全款预售发货模式规则", example = "")
	private ProductPresellRule productPresellRule;

	@SerializedName("sku_presell_rule")
	@OpField(desc = "SKU预售发货模式规则", example = "")
	private SkuPresellRule skuPresellRule;

	@SerializedName("time_sku_presell_with_normal_rule")
	@OpField(desc = "现货+预售发货规则", example = "")
	private TimeSkuPresellWithNormalRule timeSkuPresellWithNormalRule;

	@SerializedName("time_sku_pure_presell_rule")
	@OpField(desc = "新预售发货模式规则", example = "")
	private TimeSkuPurePresellRule timeSkuPurePresellRule;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDelayRule(DelayRule delayRule){
		this.delayRule = delayRule;
	}

	
	public DelayRule getDelayRule(){
		return this.delayRule;
	}

	
	public void setNormalRule(NormalRule normalRule){
		this.normalRule = normalRule;
	}

	
	public NormalRule getNormalRule(){
		return this.normalRule;
	}

	
	public void setStepRule(StepRule stepRule){
		this.stepRule = stepRule;
	}

	
	public StepRule getStepRule(){
		return this.stepRule;
	}

	
	public void setProductPresellRule(ProductPresellRule productPresellRule){
		this.productPresellRule = productPresellRule;
	}

	
	public ProductPresellRule getProductPresellRule(){
		return this.productPresellRule;
	}

	
	public void setSkuPresellRule(SkuPresellRule skuPresellRule){
		this.skuPresellRule = skuPresellRule;
	}

	
	public SkuPresellRule getSkuPresellRule(){
		return this.skuPresellRule;
	}

	
	public void setTimeSkuPresellWithNormalRule(TimeSkuPresellWithNormalRule timeSkuPresellWithNormalRule){
		this.timeSkuPresellWithNormalRule = timeSkuPresellWithNormalRule;
	}

	
	public TimeSkuPresellWithNormalRule getTimeSkuPresellWithNormalRule(){
		return this.timeSkuPresellWithNormalRule;
	}

	
	public void setTimeSkuPurePresellRule(TimeSkuPurePresellRule timeSkuPurePresellRule){
		this.timeSkuPurePresellRule = timeSkuPurePresellRule;
	}

	
	public TimeSkuPurePresellRule getTimeSkuPurePresellRule(){
		return this.timeSkuPurePresellRule;
	}

}