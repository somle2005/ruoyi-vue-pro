package com.doudian.open.api.order_policy.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ClaimInfoListItem {


	@SerializedName("status")
	@OpField(desc = "理赔状态", example = "1")
	private Integer status;

	@SerializedName("amount")
	@OpField(desc = "预计理赔金额：分", example = "1200")
	private Long amount;

	@SerializedName("premium")
	@OpField(desc = "实际理赔金额", example = "1200")
	private Long premium;

	@SerializedName("claim_time")
	@OpField(desc = "理赔时间", example = "2020-09-17 14:48:08")
	private String claimTime;

	@SerializedName("ins_claim_no")
	@OpField(desc = "理赔单号", example = "RE123452345234")
	private String insClaimNo;

	@SerializedName("claim_msg")
	@OpField(desc = "申请原因", example = "申请")
	private String claimMsg;

	@SerializedName("refused_msg")
	@OpField(desc = "拒绝原因", example = "失败原因")
	private String refusedMsg;

	@SerializedName("agg_claim_status")
	@OpField(desc = "聚合后的理赔状态：绿植险有用", example = "1")
	private Long aggClaimStatus;

	@SerializedName("claim_applied_times")
	@OpField(desc = "理赔次数", example = "1")
	private Integer claimAppliedTimes;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setStatus(Integer status){
		this.status = status;
	}

	
	public Integer getStatus(){
		return this.status;
	}

	
	public void setAmount(Long amount){
		this.amount = amount;
	}

	
	public Long getAmount(){
		return this.amount;
	}

	
	public void setPremium(Long premium){
		this.premium = premium;
	}

	
	public Long getPremium(){
		return this.premium;
	}

	
	public void setClaimTime(String claimTime){
		this.claimTime = claimTime;
	}

	
	public String getClaimTime(){
		return this.claimTime;
	}

	
	public void setInsClaimNo(String insClaimNo){
		this.insClaimNo = insClaimNo;
	}

	
	public String getInsClaimNo(){
		return this.insClaimNo;
	}

	
	public void setClaimMsg(String claimMsg){
		this.claimMsg = claimMsg;
	}

	
	public String getClaimMsg(){
		return this.claimMsg;
	}

	
	public void setRefusedMsg(String refusedMsg){
		this.refusedMsg = refusedMsg;
	}

	
	public String getRefusedMsg(){
		return this.refusedMsg;
	}

	
	public void setAggClaimStatus(Long aggClaimStatus){
		this.aggClaimStatus = aggClaimStatus;
	}

	
	public Long getAggClaimStatus(){
		return this.aggClaimStatus;
	}

	
	public void setClaimAppliedTimes(Integer claimAppliedTimes){
		this.claimAppliedTimes = claimAppliedTimes;
	}

	
	public Integer getClaimAppliedTimes(){
		return this.claimAppliedTimes;
	}

}