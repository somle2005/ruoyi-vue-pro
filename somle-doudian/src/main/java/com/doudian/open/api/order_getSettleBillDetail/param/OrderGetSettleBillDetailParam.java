package com.doudian.open.api.order_getSettleBillDetail.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderGetSettleBillDetailParam {


	@SerializedName("page")
	@OpField(required = true , desc = "页数（默认为0，第一页从0开始）", example= "0")
	private Long page;

	@SerializedName("size")
	@OpField(required = true , desc = "每页结果数,默认为20", example= "10")
	private Long size;

	@SerializedName("start_time")
	@OpField(required = true , desc = "查询开始时间", example= "2021-05-18 23:59:59")
	private String startTime;

	@SerializedName("end_time")
	@OpField(required = true , desc = "查询结束时间，建议开始时间和结束时间间隔不超过7天", example= "2021-06-18 23:59:59")
	private String endTime;

	@SerializedName("order_id")
	@OpField(required = false , desc = "子订单id", example= "4778345176320227200")
	private String orderId;

	@SerializedName("product_id")
	@OpField(required = false , desc = "商品id", example= "12343")
	private String productId;

	@SerializedName("pay_type")
	@OpField(required = false , desc = "结算账户 0:全部 1:微信（升级前） 2:微信 3:支付宝 4:合众支付 5:聚合账户", example= "0")
	private String payType;

	@SerializedName("flow_type")
	@OpField(required = false , desc = "业务类型，不传则默认为0 0:全部 1:鲁班广告, 2:值点商城, 3:精选联盟  4:小店自卖", example= "0")
	private String flowType;

	@SerializedName("time_type")
	@OpField(required = true , desc = "时间类型 0:结算时间 1：下单时间", example= "0")
	private String timeType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPage(Long page){
		this.page = page;
	}

	
	public Long getPage(){
		return this.page;
	}

	
	public void setSize(Long size){
		this.size = size;
	}

	
	public Long getSize(){
		return this.size;
	}

	
	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	
	public String getStartTime(){
		return this.startTime;
	}

	
	public void setEndTime(String endTime){
		this.endTime = endTime;
	}

	
	public String getEndTime(){
		return this.endTime;
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

	
	public void setProductId(String productId){
		this.productId = productId;
	}

	
	public String getProductId(){
		return this.productId;
	}

	
	public void setPayType(String payType){
		this.payType = payType;
	}

	
	public String getPayType(){
		return this.payType;
	}

	
	public void setFlowType(String flowType){
		this.flowType = flowType;
	}

	
	public String getFlowType(){
		return this.flowType;
	}

	
	public void setTimeType(String timeType){
		this.timeType = timeType;
	}

	
	public String getTimeType(){
		return this.timeType;
	}

}