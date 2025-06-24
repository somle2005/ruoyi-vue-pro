package com.doudian.open.api.order_serviceDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class Detail {


	@SerializedName("id")
	@OpField(desc = "服务请求ID", example = "1")
	private Long id;

	@SerializedName("order_id")
	@OpField(desc = "订单号", example = "121232233232323232")
	private Long orderId;

	@SerializedName("operate_status")
	@OpField(desc = "操作状态，增加审核中状态码；枚举：0-待处理,5-用户确认中,10-平台介入中,100-已完结", example = "10")
	private Integer operateStatus;

	@SerializedName("detail")
	@OpField(desc = "服务单详情", example = "阿迪锅还是个打瞌睡肯德基萨德好久撒1")
	private String detail;

	@SerializedName("reply")
	@OpField(desc = "商家答复内容", example = "283883")
	private String reply;

	@SerializedName("create_time")
	@OpField(desc = "服务单创建时间", example = "2020-11-24 17:57:51")
	private String createTime;

	@SerializedName("service_type")
	@OpField(desc = "服务单类型，枚举", example = "3")
	private Long serviceType;

	@SerializedName("reply_time")
	@OpField(desc = "最新回复时间", example = "2020-11-26 14:10:53")
	private String replyTime;

	@SerializedName("operate_status_desc")
	@OpField(desc = "操作状态含义，增加审核中状态", example = "审核中")
	private String operateStatusDesc;

	@SerializedName("shop_id")
	@OpField(desc = "店铺id", example = "1122")
	private Long shopId;

	@SerializedName("is_reject")
	@OpField(desc = "是否为被审核驳回的服务单", example = "0")
	private Long isReject;

	@SerializedName("reject_detail")
	@OpField(desc = "驳回内容", example = "驳回内容")
	private String rejectDetail;

	@SerializedName("reject_time")
	@OpField(desc = "驳回时间", example = "2020-11-26 14:10:53")
	private String rejectTime;

	@SerializedName("proof_demo")
	@OpField(desc = "凭证demo url", example = "凭证demo url")
	private String proofDemo;

	@SerializedName("evidence_required")
	@OpField(desc = "是否必须上传凭证", example = "0")
	private Long evidenceRequired;

	@SerializedName("img_list")
	@OpField(desc = "图片url 数组json", example = "[]")
	private List<String> imgList;

	@SerializedName("expiration_time")
	@OpField(desc = "超时时间", example = "2020-11-25 17:57:51")
	private String expirationTime;

	@SerializedName("close_time")
	@OpField(desc = "关闭时间", example = "2020-11-25 17:57:51")
	private String closeTime;

	@SerializedName("close_detail")
	@OpField(desc = "关闭原因", example = "关闭原因")
	private String closeDetail;

	@SerializedName("first_reply_time")
	@OpField(desc = "首次回复时间", example = "2020-11-26 14:10:53")
	private String firstReplyTime;

	@SerializedName("update_time")
	@OpField(desc = "服务单更新时间时间", example = "2020-11-26 14:10:53")
	private String updateTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setId(Long id){
		this.id = id;
	}

	
	public Long getId(){
		return this.id;
	}

	
	public void setOrderId(Long orderId){
		this.orderId = orderId;
	}

	
	public Long getOrderId(){
		return this.orderId;
	}

	
	public void setOperateStatus(Integer operateStatus){
		this.operateStatus = operateStatus;
	}

	
	public Integer getOperateStatus(){
		return this.operateStatus;
	}

	
	public void setDetail(String detail){
		this.detail = detail;
	}

	
	public String getDetail(){
		return this.detail;
	}

	
	public void setReply(String reply){
		this.reply = reply;
	}

	
	public String getReply(){
		return this.reply;
	}

	
	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}

	
	public String getCreateTime(){
		return this.createTime;
	}

	
	public void setServiceType(Long serviceType){
		this.serviceType = serviceType;
	}

	
	public Long getServiceType(){
		return this.serviceType;
	}

	
	public void setReplyTime(String replyTime){
		this.replyTime = replyTime;
	}

	
	public String getReplyTime(){
		return this.replyTime;
	}

	
	public void setOperateStatusDesc(String operateStatusDesc){
		this.operateStatusDesc = operateStatusDesc;
	}

	
	public String getOperateStatusDesc(){
		return this.operateStatusDesc;
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

	
	public void setIsReject(Long isReject){
		this.isReject = isReject;
	}

	
	public Long getIsReject(){
		return this.isReject;
	}

	
	public void setRejectDetail(String rejectDetail){
		this.rejectDetail = rejectDetail;
	}

	
	public String getRejectDetail(){
		return this.rejectDetail;
	}

	
	public void setRejectTime(String rejectTime){
		this.rejectTime = rejectTime;
	}

	
	public String getRejectTime(){
		return this.rejectTime;
	}

	
	public void setProofDemo(String proofDemo){
		this.proofDemo = proofDemo;
	}

	
	public String getProofDemo(){
		return this.proofDemo;
	}

	
	public void setEvidenceRequired(Long evidenceRequired){
		this.evidenceRequired = evidenceRequired;
	}

	
	public Long getEvidenceRequired(){
		return this.evidenceRequired;
	}

	
	public void setImgList(List<String> imgList){
		this.imgList = imgList;
	}

	
	public List<String> getImgList(){
		return this.imgList;
	}

	
	public void setExpirationTime(String expirationTime){
		this.expirationTime = expirationTime;
	}

	
	public String getExpirationTime(){
		return this.expirationTime;
	}

	
	public void setCloseTime(String closeTime){
		this.closeTime = closeTime;
	}

	
	public String getCloseTime(){
		return this.closeTime;
	}

	
	public void setCloseDetail(String closeDetail){
		this.closeDetail = closeDetail;
	}

	
	public String getCloseDetail(){
		return this.closeDetail;
	}

	
	public void setFirstReplyTime(String firstReplyTime){
		this.firstReplyTime = firstReplyTime;
	}

	
	public String getFirstReplyTime(){
		return this.firstReplyTime;
	}

	
	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}

	
	public String getUpdateTime(){
		return this.updateTime;
	}

}