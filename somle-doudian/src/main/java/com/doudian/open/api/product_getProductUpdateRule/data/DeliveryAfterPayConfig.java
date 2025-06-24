package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DeliveryAfterPayConfig {


	@SerializedName("min_delivery_days")
	@OpField(desc = "延迟发货时间最小值", example = "2")
	private Long minDeliveryDays;

	@SerializedName("max_delivery_days")
	@OpField(desc = "延迟发货时间最大值", example = "15")
	private Long maxDeliveryDays;

	@SerializedName("max_presell_end_days")
	@OpField(desc = "最长预售结束时间", example = "30")
	private Long maxPresellEndDays;

	@SerializedName("need_audit")
	@OpField(desc = "是否需要人审，可忽略", example = "true")
	private Boolean needAudit;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMinDeliveryDays(Long minDeliveryDays){
		this.minDeliveryDays = minDeliveryDays;
	}

	
	public Long getMinDeliveryDays(){
		return this.minDeliveryDays;
	}

	
	public void setMaxDeliveryDays(Long maxDeliveryDays){
		this.maxDeliveryDays = maxDeliveryDays;
	}

	
	public Long getMaxDeliveryDays(){
		return this.maxDeliveryDays;
	}

	
	public void setMaxPresellEndDays(Long maxPresellEndDays){
		this.maxPresellEndDays = maxPresellEndDays;
	}

	
	public Long getMaxPresellEndDays(){
		return this.maxPresellEndDays;
	}

	
	public void setNeedAudit(Boolean needAudit){
		this.needAudit = needAudit;
	}

	
	public Boolean getNeedAudit(){
		return this.needAudit;
	}

}