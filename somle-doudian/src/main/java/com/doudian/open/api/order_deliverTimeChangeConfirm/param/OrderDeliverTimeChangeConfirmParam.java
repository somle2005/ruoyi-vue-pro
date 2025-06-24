package com.doudian.open.api.order_deliverTimeChangeConfirm.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderDeliverTimeChangeConfirmParam {


	@SerializedName("shop_order_id")
	@OpField(required = true , desc = "主订单ID", example= "3539925204033339668")
	private String shopOrderId;

	@SerializedName("task_id")
	@OpField(required = true , desc = "任务单ID", example= "123424546543654")
	private String taskId;

	@SerializedName("reject_code")
	@OpField(required = true , desc = "0:同意，400001审核拒绝", example= "0")
	private Long rejectCode;

	@SerializedName("reject_reason")
	@OpField(required = false , desc = "审核拒绝原因，非必传", example= "")
	private String rejectReason;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setShopOrderId(String shopOrderId){
		this.shopOrderId = shopOrderId;
	}

	
	public String getShopOrderId(){
		return this.shopOrderId;
	}

	
	public void setTaskId(String taskId){
		this.taskId = taskId;
	}

	
	public String getTaskId(){
		return this.taskId;
	}

	
	public void setRejectCode(Long rejectCode){
		this.rejectCode = rejectCode;
	}

	
	public Long getRejectCode(){
		return this.rejectCode;
	}

	
	public void setRejectReason(String rejectReason){
		this.rejectReason = rejectReason;
	}

	
	public String getRejectReason(){
		return this.rejectReason;
	}

}