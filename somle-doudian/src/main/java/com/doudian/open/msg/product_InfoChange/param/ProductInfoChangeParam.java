package com.doudian.open.msg.product_InfoChange.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductInfoChangeParam {


	@SerializedName("product_id")
	@OpField(required = false , desc = "商品ID", example= "3570275551476319644")
	private Long productId;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID，即时零售店铺该字段为即时零售总部id", example= "90419")
	private Long shopId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "8794053")
	private Long storeId;

	@SerializedName("channel_info")
	@OpField(required = false , desc = "商品渠道信息，目前仅在超市业务下返回，普通商品没有这个信息", example= "")
	private ChannelInfo channelInfo;

	@SerializedName("status")
	@OpField(required = false , desc = "商品状态，枚举详见https://op.jinritemai.com/docs/question-docs/92/2070", example= "")
	private Status status;

	@SerializedName("msg_type")
	@OpField(required = false , desc = "4-商品编辑后审核通过信息变更 15-商品新建审核通过后信息变更", example= "4")
	private Long msgType;

	@SerializedName("product_biz")
	@OpField(required = false , desc = "二进制位标识的业务 判断主品 productBiz&(1<<13) > 0", example= "0")
	private Long productBiz;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
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

	
	public void setChannelInfo(ChannelInfo channelInfo){
		this.channelInfo = channelInfo;
	}

	
	public ChannelInfo getChannelInfo(){
		return this.channelInfo;
	}

	
	public void setStatus(Status status){
		this.status = status;
	}

	
	public Status getStatus(){
		return this.status;
	}

	
	public void setMsgType(Long msgType){
		this.msgType = msgType;
	}

	
	public Long getMsgType(){
		return this.msgType;
	}

	
	public void setProductBiz(Long productBiz){
		this.productBiz = productBiz;
	}

	
	public Long getProductBiz(){
		return this.productBiz;
	}

}