package com.doudian.open.api.order_getSettleBillDetailV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderGetSettleBillDetailV2Param {


	@SerializedName("size")
	@OpField(required = false , desc = "查询页大小(默认100,最大为200)", example= "100")
	private Long size;

	@SerializedName("start_time")
	@OpField(required = false , desc = "查询开始时间。注:订单号未传的情况下，时间必须传", example= "2021-05-18 00:00:00")
	private String startTime;

	@SerializedName("end_time")
	@OpField(required = false , desc = "查询结束时间。和end_time的时间间隔建议不超过7天。注:订单号未传的情况下，时间必须传", example= "2021-05-18 23:59:59")
	private String endTime;

	@SerializedName("order_id")
	@OpField(required = false , desc = "SKU单，子订单号", example= "4778345176320227200")
	private String orderId;

	@SerializedName("product_id")
	@OpField(required = false , desc = "商品id", example= "123456")
	private String productId;

	@SerializedName("pay_type")
	@OpField(required = false , desc = "结算账户 0:全部 1:微信（升级前） 2:微信 3:支付宝 4:合众支付 5:聚合账户", example= "0")
	private String payType;

	@SerializedName("flow_type")
	@OpField(required = false , desc = "业务类型，不传则默认为0 0:全部 1:鲁班广告, 2:精选联盟 ,3:值点商城,  4:小店自卖", example= "0")
	private String flowType;

	@SerializedName("time_type")
	@OpField(required = false , desc = "时间类型 0:结算时间 1：下单时间", example= "0")
	private String timeType;

	@SerializedName("start_index")
	@OpField(required = false , desc = "查询开始索引,值为上一次请求的结果next_start_index,第一次查询可以不填", example= "123456")
	private String startIndex;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

	
	public void setStartIndex(String startIndex){
		this.startIndex = startIndex;
	}

	
	public String getStartIndex(){
		return this.startIndex;
	}

}