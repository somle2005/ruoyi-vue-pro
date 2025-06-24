package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ArbitrateInfo {


	@SerializedName("arbitrate_id")
	@OpField(desc = "仲裁单id", example = "12345")
	private String arbitrateId;

	@SerializedName("arbitrate_status")
	@OpField(desc = "仲裁状态", example = "0 : 无需仲裁")
	private Long arbitrateStatus;

	@SerializedName("is_required_evidence")
	@OpField(desc = "是否需要上传凭证", example = "1 : 需要上传凭证")
	private Boolean isRequiredEvidence;

	@SerializedName("arbitrate_status_deadline")
	@OpField(desc = "仲裁截止时间", example = "1735660800")
	private String arbitrateStatusDeadline;

	@SerializedName("arbitrate_opinion")
	@OpField(desc = "仲裁原因", example = "仲裁原因描述")
	private String arbitrateOpinion;

	@SerializedName("arbitrate_conclusion")
	@OpField(desc = "仲裁结果", example = "0")
	private Long arbitrateConclusion;

	@SerializedName("arbitrate_create_time")
	@OpField(desc = "仲裁单创建时间", example = "1735660800")
	private Long arbitrateCreateTime;

	@SerializedName("arbitrate_update_time")
	@OpField(desc = "仲裁单更新时间", example = "1735660800")
	private Long arbitrateUpdateTime;

	@SerializedName("arbitrate_evidence_tmpl")
	@OpField(desc = "凭证示例", example = "")
	private ArbitrateEvidenceTmpl arbitrateEvidenceTmpl;

	@SerializedName("arbitrate_evidence")
	@OpField(desc = "仲裁证据", example = "")
	private ArbitrateEvidence arbitrateEvidence;

	@SerializedName("arbitrate_blame")
	@OpField(desc = "仲裁责任方", example = "1:商家责任,2:买家责任,3:双方有责,4:平台责任,5:达人责任")
	private Long arbitrateBlame;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setArbitrateId(String arbitrateId){
		this.arbitrateId = arbitrateId;
	}

	
	public String getArbitrateId(){
		return this.arbitrateId;
	}

	
	public void setArbitrateStatus(Long arbitrateStatus){
		this.arbitrateStatus = arbitrateStatus;
	}

	
	public Long getArbitrateStatus(){
		return this.arbitrateStatus;
	}

	
	public void setIsRequiredEvidence(Boolean isRequiredEvidence){
		this.isRequiredEvidence = isRequiredEvidence;
	}

	
	public Boolean getIsRequiredEvidence(){
		return this.isRequiredEvidence;
	}

	
	public void setArbitrateStatusDeadline(String arbitrateStatusDeadline){
		this.arbitrateStatusDeadline = arbitrateStatusDeadline;
	}

	
	public String getArbitrateStatusDeadline(){
		return this.arbitrateStatusDeadline;
	}

	
	public void setArbitrateOpinion(String arbitrateOpinion){
		this.arbitrateOpinion = arbitrateOpinion;
	}

	
	public String getArbitrateOpinion(){
		return this.arbitrateOpinion;
	}

	
	public void setArbitrateConclusion(Long arbitrateConclusion){
		this.arbitrateConclusion = arbitrateConclusion;
	}

	
	public Long getArbitrateConclusion(){
		return this.arbitrateConclusion;
	}

	
	public void setArbitrateCreateTime(Long arbitrateCreateTime){
		this.arbitrateCreateTime = arbitrateCreateTime;
	}

	
	public Long getArbitrateCreateTime(){
		return this.arbitrateCreateTime;
	}

	
	public void setArbitrateUpdateTime(Long arbitrateUpdateTime){
		this.arbitrateUpdateTime = arbitrateUpdateTime;
	}

	
	public Long getArbitrateUpdateTime(){
		return this.arbitrateUpdateTime;
	}

	
	public void setArbitrateEvidenceTmpl(ArbitrateEvidenceTmpl arbitrateEvidenceTmpl){
		this.arbitrateEvidenceTmpl = arbitrateEvidenceTmpl;
	}

	
	public ArbitrateEvidenceTmpl getArbitrateEvidenceTmpl(){
		return this.arbitrateEvidenceTmpl;
	}

	
	public void setArbitrateEvidence(ArbitrateEvidence arbitrateEvidence){
		this.arbitrateEvidence = arbitrateEvidence;
	}

	
	public ArbitrateEvidence getArbitrateEvidence(){
		return this.arbitrateEvidence;
	}

	
	public void setArbitrateBlame(Long arbitrateBlame){
		this.arbitrateBlame = arbitrateBlame;
	}

	
	public Long getArbitrateBlame(){
		return this.arbitrateBlame;
	}

}