package com.doudian.open.msg.product_skuStockZero.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductSkuStockZeroParam {


	@SerializedName("channel_id")
	@OpField(required = false , desc = "渠道ID，如达人专属价库存，此项为达人ID", example= "1705751231257640")
	private String channelId;

	@SerializedName("channel_type")
	@OpField(required = false , desc = "渠道类型，1-抖音达人专属", example= "1")
	private Long channelType;

	@SerializedName("activity_id")
	@OpField(required = false , desc = "活动ID，如限时限量购库存，此项为活动ID", example= "0")
	private String activityId;

	@SerializedName("process_time")
	@OpField(required = false , desc = "发生时间", example= "1626966496")
	private Long processTime;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID，即时零售店铺该字段为即时零售总部id", example= "77977")
	private String shopId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "8794053")
	private String storeId;

	@SerializedName("product_id")
	@OpField(required = false , desc = "商品id", example= "3493378522641234274")
	private String productId;

	@SerializedName("sku_id")
	@OpField(required = false , desc = "sku_id", example= "432341123")
	private String skuId;

	@SerializedName("before")
	@OpField(required = false , desc = "之前的状态false表示未售罄 true表示为已经售罄", example= "false")
	private String before;

	@SerializedName("after")
	@OpField(required = false , desc = "之后的状态false表示未售罄 true表示为已经售罄", example= "true")
	private String after;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setChannelId(String channelId){
		this.channelId = channelId;
	}

	
	public String getChannelId(){
		return this.channelId;
	}

	
	public void setChannelType(Long channelType){
		this.channelType = channelType;
	}

	
	public Long getChannelType(){
		return this.channelType;
	}

	
	public void setActivityId(String activityId){
		this.activityId = activityId;
	}

	
	public String getActivityId(){
		return this.activityId;
	}

	
	public void setProcessTime(Long processTime){
		this.processTime = processTime;
	}

	
	public Long getProcessTime(){
		return this.processTime;
	}

	
	public void setShopId(String shopId){
		this.shopId = shopId;
	}

	
	public String getShopId(){
		return this.shopId;
	}

	
	public void setStoreId(String storeId){
		this.storeId = storeId;
	}

	
	public String getStoreId(){
		return this.storeId;
	}

	
	public void setProductId(String productId){
		this.productId = productId;
	}

	
	public String getProductId(){
		return this.productId;
	}

	
	public void setSkuId(String skuId){
		this.skuId = skuId;
	}

	
	public String getSkuId(){
		return this.skuId;
	}

	
	public void setBefore(String before){
		this.before = before;
	}

	
	public String getBefore(){
		return this.before;
	}

	
	public void setAfter(String after){
		this.after = after;
	}

	
	public String getAfter(){
		return this.after;
	}

}