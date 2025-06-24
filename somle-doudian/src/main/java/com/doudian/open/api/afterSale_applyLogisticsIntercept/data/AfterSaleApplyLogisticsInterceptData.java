package com.doudian.open.api.afterSale_applyLogisticsIntercept.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class AfterSaleApplyLogisticsInterceptData {


	@SerializedName("intercept_results")
	@OpField(desc = "物流拦截结果", example = "")
	private List<InterceptResultsItem> interceptResults;

	@SerializedName("success_count")
	@OpField(desc = "拦截成功次数", example = "0")
	private Long successCount;

	@SerializedName("failed_count")
	@OpField(desc = "拦截失败次数", example = "1")
	private Long failedCount;

	@SerializedName("unavailable_reason_code")
	@OpField(desc = "不可拦截编码(failed_count=1时有意义)", example = "-10006")
	private Long unavailableReasonCode;

	@SerializedName("unavailable_reason")
	@OpField(desc = "不可拦截原因(failed_count=1时有意义)", example = "服务器开了小差，请稍后重试")
	private String unavailableReason;

	@SerializedName("refund_amount")
	@OpField(desc = "售后单退款总金额", example = "1")
	private Long refundAmount;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setInterceptResults(List<InterceptResultsItem> interceptResults){
		this.interceptResults = interceptResults;
	}

	
	public List<InterceptResultsItem> getInterceptResults(){
		return this.interceptResults;
	}

	
	public void setSuccessCount(Long successCount){
		this.successCount = successCount;
	}

	
	public Long getSuccessCount(){
		return this.successCount;
	}

	
	public void setFailedCount(Long failedCount){
		this.failedCount = failedCount;
	}

	
	public Long getFailedCount(){
		return this.failedCount;
	}

	
	public void setUnavailableReasonCode(Long unavailableReasonCode){
		this.unavailableReasonCode = unavailableReasonCode;
	}

	
	public Long getUnavailableReasonCode(){
		return this.unavailableReasonCode;
	}

	
	public void setUnavailableReason(String unavailableReason){
		this.unavailableReason = unavailableReason;
	}

	
	public String getUnavailableReason(){
		return this.unavailableReason;
	}

	
	public void setRefundAmount(Long refundAmount){
		this.refundAmount = refundAmount;
	}

	
	public Long getRefundAmount(){
		return this.refundAmount;
	}

}