package com.doudian.open.msg.refund_ArbitrateAudited.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class RefundArbitrateAuditedParam {


	@SerializedName("aftersale_id")
	@OpField(required = false , desc = "售后单ID", example= "7001268675961536803")
	private Long aftersaleId;

	@SerializedName("aftersale_type")
	@OpField(required = false , desc = "售后类型： 0: 退货 1: 售后仅退款 2: 发货前整单退款 3：换货", example= "1")
	private Long aftersaleType;

	@SerializedName("arbitrate_status")
	@OpField(required = false , desc = "仲裁状态，枚举值如下", example= "255")
	private Long arbitrateStatus;

	@SerializedName("s_id")
	@OpField(required = false , desc = "子订单ID", example= "4835999782215360286")
	private Long sId;

	@SerializedName("p_id")
	@OpField(required = false , desc = "父订单ID", example= "4835999782215360286")
	private Long pId;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID", example= "597277")
	private Long shopId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "8794053")
	private Long storeId;

	@SerializedName("aftersale_status")
	@OpField(required = false , desc = "售后状态，枚举值如下", example= "27")
	private Long aftersaleStatus;

	@SerializedName("arbitrate_id")
	@OpField(required = false , desc = "仲裁单ID", example= "7001268675961536803_002")
	private String arbitrateId;

	@SerializedName("arbitrate_conclusion")
	@OpField(required = false , desc = "仲裁结果： 1. 支持买家 2. 支持商家 3. 支持买家并立即退款", example= "1")
	private Long arbitrateConclusion;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAftersaleId(Long aftersaleId){
		this.aftersaleId = aftersaleId;
	}

	
	public Long getAftersaleId(){
		return this.aftersaleId;
	}

	
	public void setAftersaleType(Long aftersaleType){
		this.aftersaleType = aftersaleType;
	}

	
	public Long getAftersaleType(){
		return this.aftersaleType;
	}

	
	public void setArbitrateStatus(Long arbitrateStatus){
		this.arbitrateStatus = arbitrateStatus;
	}

	
	public Long getArbitrateStatus(){
		return this.arbitrateStatus;
	}

	
	public void setSId(Long sId){
		this.sId = sId;
	}

	
	public Long getSId(){
		return this.sId;
	}

	
	public void setPId(Long pId){
		this.pId = pId;
	}

	
	public Long getPId(){
		return this.pId;
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

	
	public void setAftersaleStatus(Long aftersaleStatus){
		this.aftersaleStatus = aftersaleStatus;
	}

	
	public Long getAftersaleStatus(){
		return this.aftersaleStatus;
	}

	
	public void setArbitrateId(String arbitrateId){
		this.arbitrateId = arbitrateId;
	}

	
	public String getArbitrateId(){
		return this.arbitrateId;
	}

	
	public void setArbitrateConclusion(Long arbitrateConclusion){
		this.arbitrateConclusion = arbitrateConclusion;
	}

	
	public Long getArbitrateConclusion(){
		return this.arbitrateConclusion;
	}

}