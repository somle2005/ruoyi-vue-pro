package com.doudian.open.api.buyin_channelBindAuthors.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class BuyinChannelBindAuthorsParam {


	@SerializedName("channel_id")
	@OpField(required = true , desc = "渠道id", example= "123456789")
	private Long channelId;

	@SerializedName("channel_type")
	@OpField(required = true , desc = "渠道绑定类型 1: 店铺自卖，2：达人带货", example= "1")
	private Integer channelType;

	@SerializedName("product_id")
	@OpField(required = true , desc = "商品id", example= "123456789")
	private Long productId;

	@SerializedName("page")
	@OpField(required = false , desc = "分页 从1开始", example= "1")
	private Long page;

	@SerializedName("page_size")
	@OpField(required = false , desc = "分页大小 最大值50", example= "10")
	private Long pageSize;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setChannelId(Long channelId){
		this.channelId = channelId;
	}

	
	public Long getChannelId(){
		return this.channelId;
	}

	
	public void setChannelType(Integer channelType){
		this.channelType = channelType;
	}

	
	public Integer getChannelType(){
		return this.channelType;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setPage(Long page){
		this.page = page;
	}

	
	public Long getPage(){
		return this.page;
	}

	
	public void setPageSize(Long pageSize){
		this.pageSize = pageSize;
	}

	
	public Long getPageSize(){
		return this.pageSize;
	}

}