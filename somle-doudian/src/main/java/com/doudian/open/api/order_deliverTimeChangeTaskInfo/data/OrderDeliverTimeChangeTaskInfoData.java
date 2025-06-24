package com.doudian.open.api.order_deliverTimeChangeTaskInfo.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderDeliverTimeChangeTaskInfoData {


	@SerializedName("task_id")
	@OpField(desc = "任务单ID", example = "14234543654")
	private String taskId;

	@SerializedName("old_time")
	@OpField(desc = "修改前发货时间", example = "1731911462")
	private Long oldTime;

	@SerializedName("new_time")
	@OpField(desc = "修改后发货时间", example = "1731914462")
	private Long newTime;

	@SerializedName("status")
	@OpField(desc = "任务状态，OPEN-未处理 PASS-已处理 REJECT-已拒绝", example = "OPEN")
	private String status;

	@SerializedName("reject_code")
	@OpField(desc = "审核意见，0同意，>0 拒绝code", example = "0")
	private Long rejectCode;

	@SerializedName("reject_reason")
	@OpField(desc = "审核拒绝原因", example = "")
	private String rejectReason;

	@SerializedName("create_time")
	@OpField(desc = "任务创建时间", example = "1731825062")
	private Long createTime;

	@SerializedName("update_time")
	@OpField(desc = "任务更新时间", example = "1731825062")
	private Long updateTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTaskId(String taskId){
		this.taskId = taskId;
	}

	
	public String getTaskId(){
		return this.taskId;
	}

	
	public void setOldTime(Long oldTime){
		this.oldTime = oldTime;
	}

	
	public Long getOldTime(){
		return this.oldTime;
	}

	
	public void setNewTime(Long newTime){
		this.newTime = newTime;
	}

	
	public Long getNewTime(){
		return this.newTime;
	}

	
	public void setStatus(String status){
		this.status = status;
	}

	
	public String getStatus(){
		return this.status;
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

	
	public void setCreateTime(Long createTime){
		this.createTime = createTime;
	}

	
	public Long getCreateTime(){
		return this.createTime;
	}

	
	public void setUpdateTime(Long updateTime){
		this.updateTime = updateTime;
	}

	
	public Long getUpdateTime(){
		return this.updateTime;
	}

}