package com.doudian.open.api.order_review.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderReviewParam {


	@SerializedName("task_type")
	@OpField(required = true , desc = "表示订单审核的类型 3001 通信卡审核", example= "3002")
	private Long taskType;

	@SerializedName("reject_code")
	@OpField(required = true , desc = "0 审核通过 200001 下单身份信息180天内在该卡品运营商处重复下单，未通过审核 200002 下单身份信息已在该卡品运营商处办理了5张电话卡，未通过审核 200003 下单身份信息年龄不在16-60岁（部分卡品16-30岁），未通过审核 200004 下单地址为该卡品运营商禁售地区，未通过审核 200005 因其他原因，未能通过运营商审核，具体可联系商家", example= "0")
	private Long rejectCode;

	@SerializedName("object_id")
	@OpField(required = true , desc = "审核的单id取决于什么审核 通信卡审核 店铺单id", example= "4921300864966120582")
	private String objectId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTaskType(Long taskType){
		this.taskType = taskType;
	}

	
	public Long getTaskType(){
		return this.taskType;
	}

	
	public void setRejectCode(Long rejectCode){
		this.rejectCode = rejectCode;
	}

	
	public Long getRejectCode(){
		return this.rejectCode;
	}

	
	public void setObjectId(String objectId){
		this.objectId = objectId;
	}

	
	public String getObjectId(){
		return this.objectId;
	}

}