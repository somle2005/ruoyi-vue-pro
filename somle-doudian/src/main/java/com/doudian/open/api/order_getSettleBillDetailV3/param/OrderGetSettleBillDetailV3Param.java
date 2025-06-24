package com.doudian.open.api.order_getSettleBillDetailV3.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderGetSettleBillDetailV3Param {


	@SerializedName("size")
	@OpField(required = false , desc = "页数，支持范围1~100", example= "5011")
	private Long size;

	@SerializedName("start_time")
	@OpField(required = false , desc = "查询开始时间，格式为：yyyy-MM-dd HH:mm:ss，订单号未传的情况下，开始时间必须传，注意：分页查询时，除首次查询外，应填入上一次返回的next_start_time", example= "2021-05-18 00:00:00")
	private String startTime;

	@SerializedName("end_time")
	@OpField(required = false , desc = "查询结束时间，和end_time的时间间隔建议不超过7天，格式为：yyyy-MM-dd HH:mm:ss，订单号未传的情况下，结束时间必须传", example= "2021-05-18 00:00:00")
	private String endTime;

	@SerializedName("order_id")
	@OpField(required = false , desc = "SKU单，子订单号，支持通过英文逗号分隔传入多个参数", example= "4778345176320227200")
	private String orderId;

	@SerializedName("product_id")
	@OpField(required = false , desc = "商品id", example= "123456")
	private String productId;

	@SerializedName("pay_type")
	@OpField(required = false , desc = "结算账户，不传则默认为全部，枚举： 1（微信：升级前）、 2（微信）、 3（支付宝）、 4（合众支付）、 5（聚合账户），支持通过英文逗号分隔传入多个参数", example= "1")
	private String payType;

	@SerializedName("flow_type")
	@OpField(required = false , desc = "业务类型，不传则默认为全部，枚举： 1（鲁班广告）、2（值点商城）, 3（精选联盟）、 4（小店自卖）", example= "1")
	private String flowType;

	@SerializedName("time_type")
	@OpField(required = false , desc = "时间类型 ，不传则默认为结算时间，枚举： 0（结算时间） 1（下单时间）", example= "0")
	private String timeType;

	@SerializedName("start_index")
	@OpField(required = false , desc = "查询开始索引，注意：分页查询时，除首次查询可不填外，应填入上一次返回的next_start_index", example= "123445")
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