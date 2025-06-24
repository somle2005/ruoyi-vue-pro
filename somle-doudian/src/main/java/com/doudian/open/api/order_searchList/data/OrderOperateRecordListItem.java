package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderOperateRecordListItem {


	@SerializedName("operate_time")
	@OpField(desc = "操作时间", example = "2025-03-10 19:09:01")
	private String operateTime;

	@SerializedName("operator")
	@OpField(desc = "操作人，买家、商家", example = "买家")
	private String operator;

	@SerializedName("op_code")
	@OpField(desc = "操作记录类型，100008-改地址；", example = "100008")
	private Long opCode;

	@SerializedName("op_id")
	@OpField(desc = "订单操作记录唯一ID", example = "6940199726097503849_1741604941_100008")
	private String opId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOperateTime(String operateTime){
		this.operateTime = operateTime;
	}

	
	public String getOperateTime(){
		return this.operateTime;
	}

	
	public void setOperator(String operator){
		this.operator = operator;
	}

	
	public String getOperator(){
		return this.operator;
	}

	
	public void setOpCode(Long opCode){
		this.opCode = opCode;
	}

	
	public Long getOpCode(){
		return this.opCode;
	}

	
	public void setOpId(String opId){
		this.opId = opId;
	}

	
	public String getOpId(){
		return this.opId;
	}

}