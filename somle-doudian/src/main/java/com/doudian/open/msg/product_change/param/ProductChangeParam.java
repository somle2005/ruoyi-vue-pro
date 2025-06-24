package com.doudian.open.msg.product_change.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductChangeParam {


	@SerializedName("check_reject_reason")
	@OpField(required = false , desc = "包含触审字段以及驳回原因", example= "{audit_formatted_reason:{biz_type:1,op_id:-1,audit_status:2,human_audit_status:1,pass_through_extra:{audit_record_id:0}}}")
	private String checkRejectReason;

	@SerializedName("event")
	@OpField(required = true , desc = "商品变更事件： 1: 商品创建； 2: 商品保存； 3:商品提交审核； 4：商品审核通过； 5：商品审核不通过； 6：商品被删除； 7：商品从回收站恢复； 8：商品封禁； 9：解除商品封禁； 10：下架商品； 11：上架商品； 12：商品售空； 13：终止审核商品； 14：审核通过待上架", example= "5")
	private Long event;

	@SerializedName("out_product_id")
	@OpField(required = false , desc = "外部商品编码", example= "0")
	private Long outProductId;

	@SerializedName("product_id")
	@OpField(required = true , desc = "商品id，商品id，即时零售店铺该商品id为门店商品id（子商品id）", example= "3488625851803765000")
	private Long productId;

	@SerializedName("shop_id")
	@OpField(required = true , desc = "店铺ID，即时零售店铺该字段为即时零售总部id", example= "95250")
	private Long shopId;

	@SerializedName("update_time")
	@OpField(required = false , desc = "事件发生时间", example= "16473829442")
	private Long updateTime;

	@SerializedName("reason")
	@OpField(required = false , desc = "商品在状态发生变更时的原因（不一定每个状态变化都有）  比如：商品审核驳回表示驳回原因  商品被封禁时表示封禁原因", example= "该商品主图不合规")
	private String reason;

	@SerializedName("store_id")
	@OpField(required = false , desc = "商品门店ID", example= "1111420330")
	private Long storeId;

	@SerializedName("channel_main_product")
	@OpField(required = false , desc = "主品信息，如果当前商品是子品", example= "")
	private ChannelMainProduct channelMainProduct;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCheckRejectReason(String checkRejectReason){
		this.checkRejectReason = checkRejectReason;
	}

	
	public String getCheckRejectReason(){
		return this.checkRejectReason;
	}

	
	public void setEvent(Long event){
		this.event = event;
	}

	
	public Long getEvent(){
		return this.event;
	}

	
	public void setOutProductId(Long outProductId){
		this.outProductId = outProductId;
	}

	
	public Long getOutProductId(){
		return this.outProductId;
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

	
	public void setUpdateTime(Long updateTime){
		this.updateTime = updateTime;
	}

	
	public Long getUpdateTime(){
		return this.updateTime;
	}

	
	public void setReason(String reason){
		this.reason = reason;
	}

	
	public String getReason(){
		return this.reason;
	}

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

	
	public void setChannelMainProduct(ChannelMainProduct channelMainProduct){
		this.channelMainProduct = channelMainProduct;
	}

	
	public ChannelMainProduct getChannelMainProduct(){
		return this.channelMainProduct;
	}

}