package com.doudian.open.api.order_downloadShopAccountItem.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderDownloadShopAccountItemParam {


	@SerializedName("start_time")
	@OpField(required = false , desc = "开始时间", example= "2021-10-01 00:00:00")
	private String startTime;

	@SerializedName("end_time")
	@OpField(required = false , desc = "结束时间", example= "2021-10-01 23:59:59")
	private String endTime;

	@SerializedName("order_id")
	@OpField(required = false , desc = "订单号(如果订单号未传，则时间必须传)", example= "4847151209529677080")
	private String orderId;

	@SerializedName("account_type")
	@OpField(required = false , desc = "动账账户 0: 所有 1: 微信 2:支付宝 3:合众支付 4:聚合支付", example= "0")
	private Integer accountType;

	@SerializedName("biz_type")
	@OpField(required = false , desc = "计费类型 0:全部 1:鲁班广告 2:精选联盟 3:值点商城 4:小店自卖 5:橙子建站 6:POI 7:抖+ 8:穿山甲 9:服务市场 10:服务市场外包客服 11:学浪", example= "0")
	private Integer bizType;

	@SerializedName("time_type")
	@OpField(required = false , desc = "时间类型 0 动账时间 1 下单时间", example= "0")
	private Integer timeType;

	@SerializedName("product_id")
	@OpField(required = false , desc = "产品id", example= "33323233")
	private String productId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

	
	public void setAccountType(Integer accountType){
		this.accountType = accountType;
	}

	
	public Integer getAccountType(){
		return this.accountType;
	}

	
	public void setBizType(Integer bizType){
		this.bizType = bizType;
	}

	
	public Integer getBizType(){
		return this.bizType;
	}

	
	public void setTimeType(Integer timeType){
		this.timeType = timeType;
	}

	
	public Integer getTimeType(){
		return this.timeType;
	}

	
	public void setProductId(String productId){
		this.productId = productId;
	}

	
	public String getProductId(){
		return this.productId;
	}

}