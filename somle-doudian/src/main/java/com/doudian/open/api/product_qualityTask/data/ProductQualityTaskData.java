package com.doudian.open.api.product_qualityTask.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductQualityTaskData {


	@SerializedName("product_num_total")
	@OpField(desc = "总共需要诊断的商品数", example = "10")
	private Long productNumTotal;

	@SerializedName("product_num_finished")
	@OpField(desc = "已经诊断过的商品数", example = "10")
	private Long productNumFinished;

	@SerializedName("task_status")
	@OpField(desc = "任务状态，0-初始化，1-进行中，2-已完成", example = "2")
	private Long taskStatus;

	@SerializedName("product_num_to_improve_total")
	@OpField(desc = "待优化商品数，仅brief_only为false返回", example = "10")
	private Long productNumToImproveTotal;

	@SerializedName("problem_num_total")
	@OpField(desc = "可优化项总数，仅brief_only为false返回", example = "10")
	private Long problemNumTotal;

	@SerializedName("problem_num_to_improve")
	@OpField(desc = "待优化项数量，仅brief_only为false返回", example = "10")
	private Long problemNumToImprove;

	@SerializedName("task_finish_time")
	@OpField(desc = "任务完成时间，仅brief_only为false返回", example = "2021-09-07 01:21:46")
	private String taskFinishTime;

	@SerializedName("problem_type_distribution")
	@OpField(desc = "问题类型分布，仅brief_only为false返回", example = "")
	private List<ProblemTypeDistributionItem> problemTypeDistribution;

	@SerializedName("task_id")
	@OpField(desc = "任务ID", example = "15293")
	private Long taskId;

	@SerializedName("standard_rate")
	@OpField(desc = "达标率，百分比", example = "10")
	private Double standardRate;

	@SerializedName("is_standard")
	@OpField(desc = "是否达标", example = "true")
	private Boolean isStandard;

	@SerializedName("meet_standard_num")
	@OpField(desc = "达标商品数", example = "1")
	private Long meetStandardNum;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductNumTotal(Long productNumTotal){
		this.productNumTotal = productNumTotal;
	}

	
	public Long getProductNumTotal(){
		return this.productNumTotal;
	}

	
	public void setProductNumFinished(Long productNumFinished){
		this.productNumFinished = productNumFinished;
	}

	
	public Long getProductNumFinished(){
		return this.productNumFinished;
	}

	
	public void setTaskStatus(Long taskStatus){
		this.taskStatus = taskStatus;
	}

	
	public Long getTaskStatus(){
		return this.taskStatus;
	}

	
	public void setProductNumToImproveTotal(Long productNumToImproveTotal){
		this.productNumToImproveTotal = productNumToImproveTotal;
	}

	
	public Long getProductNumToImproveTotal(){
		return this.productNumToImproveTotal;
	}

	
	public void setProblemNumTotal(Long problemNumTotal){
		this.problemNumTotal = problemNumTotal;
	}

	
	public Long getProblemNumTotal(){
		return this.problemNumTotal;
	}

	
	public void setProblemNumToImprove(Long problemNumToImprove){
		this.problemNumToImprove = problemNumToImprove;
	}

	
	public Long getProblemNumToImprove(){
		return this.problemNumToImprove;
	}

	
	public void setTaskFinishTime(String taskFinishTime){
		this.taskFinishTime = taskFinishTime;
	}

	
	public String getTaskFinishTime(){
		return this.taskFinishTime;
	}

	
	public void setProblemTypeDistribution(List<ProblemTypeDistributionItem> problemTypeDistribution){
		this.problemTypeDistribution = problemTypeDistribution;
	}

	
	public List<ProblemTypeDistributionItem> getProblemTypeDistribution(){
		return this.problemTypeDistribution;
	}

	
	public void setTaskId(Long taskId){
		this.taskId = taskId;
	}

	
	public Long getTaskId(){
		return this.taskId;
	}

	
	public void setStandardRate(Double standardRate){
		this.standardRate = standardRate;
	}

	
	public Double getStandardRate(){
		return this.standardRate;
	}

	
	public void setIsStandard(Boolean isStandard){
		this.isStandard = isStandard;
	}

	
	public Boolean getIsStandard(){
		return this.isStandard;
	}

	
	public void setMeetStandardNum(Long meetStandardNum){
		this.meetStandardNum = meetStandardNum;
	}

	
	public Long getMeetStandardNum(){
		return this.meetStandardNum;
	}

}