package com.doudian.open.api.afterSale_operate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ItemsItem {


	@SerializedName("repair_type")
	@OpField(required = false , desc = "维修类型（1-原商品维修；2-商品换新）", example= "1")
	private Long repairType;

	@SerializedName("aftersale_id")
	@OpField(required = true , desc = "售后单号", example= "6959800000297566494")
	private String aftersaleId;

	@SerializedName("reason")
	@OpField(required = false , desc = "操作原因，拒绝操作必填", example= "商品有破损")
	private String reason;

	@SerializedName("remark")
	@OpField(required = false , desc = "操作评论，拒绝操作必填", example= "商品有污渍，影响二次销售")
	private String remark;

	@SerializedName("evidence")
	@OpField(required = false , desc = "操作凭证编码，当【afterSale/rejectReasonCodeList】接口响应参数evidence_need=Y时，该参数必填；使用【afterSale/rejectReasonCodeList】接口获取响应参数中的reject_reason_code字段。", example= "")
	private List<EvidenceItem> evidence;

	@SerializedName("logistics")
	@OpField(required = false , desc = "同意退货/同意换货物流信息，当前type=101，301，311是该集合需要传值。", example= "")
	private Logistics logistics;

	@SerializedName("reject_reason_code")
	@OpField(required = false , desc = "售后拒绝原因码，拒绝时必填填。通过/afterSale/rejectReasonCodeList获取", example= "1")
	private Long rejectReasonCode;

	@SerializedName("update_time")
	@OpField(required = false , desc = "用于校验售后单版本是不是最新的版本，防止售后单变更且open侧审核通过导致资损。不传就不校验，传入后就会校验isv传入的售后单版本是不是最新的版本。 需要使用【/afterSale/Detail】接口返回的update_time字段或使用售后消息推送中的update_time字段", example= "0")
	private Long updateTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRepairType(Long repairType){
		this.repairType = repairType;
	}

	
	public Long getRepairType(){
		return this.repairType;
	}

	
	public void setAftersaleId(String aftersaleId){
		this.aftersaleId = aftersaleId;
	}

	
	public String getAftersaleId(){
		return this.aftersaleId;
	}

	
	public void setReason(String reason){
		this.reason = reason;
	}

	
	public String getReason(){
		return this.reason;
	}

	
	public void setRemark(String remark){
		this.remark = remark;
	}

	
	public String getRemark(){
		return this.remark;
	}

	
	public void setEvidence(List<EvidenceItem> evidence){
		this.evidence = evidence;
	}

	
	public List<EvidenceItem> getEvidence(){
		return this.evidence;
	}

	
	public void setLogistics(Logistics logistics){
		this.logistics = logistics;
	}

	
	public Logistics getLogistics(){
		return this.logistics;
	}

	
	public void setRejectReasonCode(Long rejectReasonCode){
		this.rejectReasonCode = rejectReasonCode;
	}

	
	public Long getRejectReasonCode(){
		return this.rejectReasonCode;
	}

	
	public void setUpdateTime(Long updateTime){
		this.updateTime = updateTime;
	}

	
	public Long getUpdateTime(){
		return this.updateTime;
	}

}