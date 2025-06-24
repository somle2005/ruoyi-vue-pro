package com.doudian.open.msg.order_orderTagChange.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderOrderTagChangeParam {


	@SerializedName("p_id")
	@OpField(required = false , desc = "父订单 id", example= "6922093750654538949")
	private String pId;

	@SerializedName("create_time")
	@OpField(required = false , desc = "订单创建时间，秒级时间戳", example= "1697018397")
	private Long createTime;

	@SerializedName("event_time")
	@OpField(required = false , desc = "事件变更时间，秒级时间戳", example= "1697018397")
	private Long eventTime;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID，即时零售店铺该字段为即时零售总部id", example= "77977")
	private Long shopId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "8794053")
	private Long storeId;

	@SerializedName("tag_key")
	@OpField(required = false , desc = "标签 key 值", example= "logistics_transit")
	private String tagKey;

	@SerializedName("tag_info")
	@OpField(required = false , desc = "标签信息", example= "{is_transit:true,consolidate_type:1}")
	private String tagInfo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPId(String pId){
		this.pId = pId;
	}

	
	public String getPId(){
		return this.pId;
	}

	
	public void setCreateTime(Long createTime){
		this.createTime = createTime;
	}

	
	public Long getCreateTime(){
		return this.createTime;
	}

	
	public void setEventTime(Long eventTime){
		this.eventTime = eventTime;
	}

	
	public Long getEventTime(){
		return this.eventTime;
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

	
	public void setTagKey(String tagKey){
		this.tagKey = tagKey;
	}

	
	public String getTagKey(){
		return this.tagKey;
	}

	
	public void setTagInfo(String tagInfo){
		this.tagInfo = tagInfo;
	}

	
	public String getTagInfo(){
		return this.tagInfo;
	}

}