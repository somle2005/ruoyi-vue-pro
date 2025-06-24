package com.doudian.open.api.order_serviceDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogsItem {


	@SerializedName("create_time")
	@OpField(desc = "创建时间", example = "1677824068")
	private Long createTime;

	@SerializedName("content")
	@OpField(desc = "内容", example = "关联订单号：4733127198026678040n服务单类型:售后服务n服务说明:阿迪锅还是个打瞌睡肯德基萨德好久撒1n商家处理时长:24小时")
	private String content;

	@SerializedName("img_list")
	@OpField(desc = "图片列表", example = "[]")
	private List<String> imgList;

	@SerializedName("service_log_type")
	@OpField(desc = "日志类型", example = "1")
	private Integer serviceLogType;

	@SerializedName("operate_name")
	@OpField(desc = "平台客服", example = "平台客服")
	private String operateName;

	@SerializedName("service_detail")
	@OpField(desc = "服务详情", example = "服务详情")
	private String serviceDetail;

	@SerializedName("reply_detail")
	@OpField(desc = "回复内容", example = "283883")
	private String replyDetail;

	@SerializedName("close_detail")
	@OpField(desc = "关闭原因", example = "关闭原因")
	private String closeDetail;

	@SerializedName("reject_detail")
	@OpField(desc = "驳回内容", example = "驳回内容")
	private String rejectDetail;

	@SerializedName("deal_time")
	@OpField(desc = "24小时", example = "24小时")
	private String dealTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCreateTime(Long createTime){
		this.createTime = createTime;
	}

	
	public Long getCreateTime(){
		return this.createTime;
	}

	
	public void setContent(String content){
		this.content = content;
	}

	
	public String getContent(){
		return this.content;
	}

	
	public void setImgList(List<String> imgList){
		this.imgList = imgList;
	}

	
	public List<String> getImgList(){
		return this.imgList;
	}

	
	public void setServiceLogType(Integer serviceLogType){
		this.serviceLogType = serviceLogType;
	}

	
	public Integer getServiceLogType(){
		return this.serviceLogType;
	}

	
	public void setOperateName(String operateName){
		this.operateName = operateName;
	}

	
	public String getOperateName(){
		return this.operateName;
	}

	
	public void setServiceDetail(String serviceDetail){
		this.serviceDetail = serviceDetail;
	}

	
	public String getServiceDetail(){
		return this.serviceDetail;
	}

	
	public void setReplyDetail(String replyDetail){
		this.replyDetail = replyDetail;
	}

	
	public String getReplyDetail(){
		return this.replyDetail;
	}

	
	public void setCloseDetail(String closeDetail){
		this.closeDetail = closeDetail;
	}

	
	public String getCloseDetail(){
		return this.closeDetail;
	}

	
	public void setRejectDetail(String rejectDetail){
		this.rejectDetail = rejectDetail;
	}

	
	public String getRejectDetail(){
		return this.rejectDetail;
	}

	
	public void setDealTime(String dealTime){
		this.dealTime = dealTime;
	}

	
	public String getDealTime(){
		return this.dealTime;
	}

}