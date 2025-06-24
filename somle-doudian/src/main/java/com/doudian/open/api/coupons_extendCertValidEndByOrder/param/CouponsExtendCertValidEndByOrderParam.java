package com.doudian.open.api.coupons_extendCertValidEndByOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CouponsExtendCertValidEndByOrderParam {


	@SerializedName("order_id")
	@OpField(required = true , desc = "商品单id", example= "4910456132661405505")
	private String orderId;

	@SerializedName("batch_no")
	@OpField(required = true , desc = "请求唯一编号", example= "batch000001")
	private String batchNo;

	@SerializedName("extend_time")
	@OpField(required = true , desc = "延期时间", example= "1647399907")
	private Long extendTime;

	@SerializedName("reason")
	@OpField(required = true , desc = "延期原因。1-疫情原因，2-商家缺货，100-其他原因", example= "1")
	private Integer reason;

	@SerializedName("op")
	@OpField(required = false , desc = "操作人信息", example= "")
	private Op op;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

	
	public void setBatchNo(String batchNo){
		this.batchNo = batchNo;
	}

	
	public String getBatchNo(){
		return this.batchNo;
	}

	
	public void setExtendTime(Long extendTime){
		this.extendTime = extendTime;
	}

	
	public Long getExtendTime(){
		return this.extendTime;
	}

	
	public void setReason(Integer reason){
		this.reason = reason;
	}

	
	public Integer getReason(){
		return this.reason;
	}

	
	public void setOp(Op op){
		this.op = op;
	}

	
	public Op getOp(){
		return this.op;
	}

}