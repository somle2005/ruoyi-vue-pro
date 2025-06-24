package com.doudian.open.api.order_getServiceList.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderGetServiceListParam {


	@SerializedName("start_time")
	@OpField(required = true , desc = "开始时间时间戳", example= "121312313")
	private Long startTime;

	@SerializedName("end_time")
	@OpField(required = true , desc = "结束时间时间戳，必须大于开始时间", example= "123131221123")
	private Long endTime;

	@SerializedName("status")
	@OpField(required = false , desc = "1、不传代表获取全部服务请求     2、操作状态：0 #待处理 10 #审核中 100 #已关闭 ", example= "0")
	private Integer status;

	@SerializedName("order_id")
	@OpField(required = false , desc = "订单id", example= "212332343564454545")
	private Long orderId;

	@SerializedName("service_id")
	@OpField(required = false , desc = "服务单id", example= "12212121121212")
	private Long serviceId;

	@SerializedName("order_by")
	@OpField(required = false , desc = "1、默认按服务单创建时间搜索     2、值为“create_time”：按服务单创建时间；值为“update_time”：按服务单更新时间", example= "create_time")
	private String orderBy;

	@SerializedName("page")
	@OpField(required = false , desc = "页数（默认值为1，第一页从1开始）", example= "1")
	private Integer page;

	@SerializedName("size")
	@OpField(required = false , desc = "每页订单数（默认为10，最大100），超过100则会按照最大值100处理", example= "100")
	private Integer size;

	@SerializedName("order")
	@OpField(required = false , desc = "排序方式：ASC按时间升序，  DESC按时间降序     默认DESC    ", example= "ASC")
	private String order;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setStartTime(Long startTime){
		this.startTime = startTime;
	}

	
	public Long getStartTime(){
		return this.startTime;
	}

	
	public void setEndTime(Long endTime){
		this.endTime = endTime;
	}

	
	public Long getEndTime(){
		return this.endTime;
	}

	
	public void setStatus(Integer status){
		this.status = status;
	}

	
	public Integer getStatus(){
		return this.status;
	}

	
	public void setOrderId(Long orderId){
		this.orderId = orderId;
	}

	
	public Long getOrderId(){
		return this.orderId;
	}

	
	public void setServiceId(Long serviceId){
		this.serviceId = serviceId;
	}

	
	public Long getServiceId(){
		return this.serviceId;
	}

	
	public void setOrderBy(String orderBy){
		this.orderBy = orderBy;
	}

	
	public String getOrderBy(){
		return this.orderBy;
	}

	
	public void setPage(Integer page){
		this.page = page;
	}

	
	public Integer getPage(){
		return this.page;
	}

	
	public void setSize(Integer size){
		this.size = size;
	}

	
	public Integer getSize(){
		return this.size;
	}

	
	public void setOrder(String order){
		this.order = order;
	}

	
	public String getOrder(){
		return this.order;
	}

}