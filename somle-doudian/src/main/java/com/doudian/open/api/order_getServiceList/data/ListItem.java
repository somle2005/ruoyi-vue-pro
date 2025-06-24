package com.doudian.open.api.order_getServiceList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ListItem {


	@SerializedName("id")
	@OpField(desc = "服务请求ID", example = "11111")
	private Long id;

	@SerializedName("order_id")
	@OpField(desc = "订单号", example = "11222332")
	private Long orderId;

	@SerializedName("operate_status")
	@OpField(desc = "操作状态", example = "100")
	private Integer operateStatus;

	@SerializedName("detail")
	@OpField(desc = "服务单详情", example = "服务单详情")
	private String detail;

	@SerializedName("reply")
	@OpField(desc = "回复内容", example = "我再来狡辩一次")
	private String reply;

	@SerializedName("create_time")
	@OpField(desc = "服务创建时间", example = "2020-12-09 13:34:55")
	private String createTime;

	@SerializedName("service_type")
	@OpField(desc = "服务类型", example = "3")
	private Long serviceType;

	@SerializedName("reply_time")
	@OpField(desc = "回复时间", example = "2020-12-09 13:34:55")
	private String replyTime;

	@SerializedName("operate_status_desc")
	@OpField(desc = "操作状态含义", example = "已关闭")
	private String operateStatusDesc;

	@SerializedName("shop_id")
	@OpField(desc = "店铺id", example = "1122")
	private Long shopId;

	@SerializedName("update_time")
	@OpField(desc = "服务更新时间时间", example = "2020-12-09 13:34:55")
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

	
	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}

	
	public String getUpdateTime(){
		return this.updateTime;
	}

}