package com.doudian.open.api.address_list.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddressListParam {


	@SerializedName("shop_id")
	@OpField(required = false , desc = "【已废弃】店铺id", example= "123")
	private Long shopId;

	@SerializedName("page_size")
	@OpField(required = true , desc = "翻页每页数量，默认10", example= "10")
	private Long pageSize;

	@SerializedName("page_no")
	@OpField(required = true , desc = "翻页页数，从1开始", example= "1")
	private Long pageNo;

	@SerializedName("order_by")
	@OpField(required = true , desc = "排序方式支持asc/desc", example= "asc/desc")
	private String orderBy;

	@SerializedName("order_field")
	@OpField(required = true , desc = "排序字段；create_time-创建时间排序，update_time-更新时间排序；", example= "create_time/update_time")
	private String orderField;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID，抖超小时达业务使用传入后只获取该门店下地址列表；", example= "123")
	private Long storeId;

	@SerializedName("is_send_home_open_req")
	@OpField(required = false , desc = "大盘传false，即时零售商家必传true", example= "false")
	private Boolean isSendHomeOpenReq;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

	
	public void setPageSize(Long pageSize){
		this.pageSize = pageSize;
	}

	
	public Long getPageSize(){
		return this.pageSize;
	}

	
	public void setPageNo(Long pageNo){
		this.pageNo = pageNo;
	}

	
	public Long getPageNo(){
		return this.pageNo;
	}

	
	public void setOrderBy(String orderBy){
		this.orderBy = orderBy;
	}

	
	public String getOrderBy(){
		return this.orderBy;
	}

	
	public void setOrderField(String orderField){
		this.orderField = orderField;
	}

	
	public String getOrderField(){
		return this.orderField;
	}

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

	
	public void setIsSendHomeOpenReq(Boolean isSendHomeOpenReq){
		this.isSendHomeOpenReq = isSendHomeOpenReq;
	}

	
	public Boolean getIsSendHomeOpenReq(){
		return this.isSendHomeOpenReq;
	}

}