package com.doudian.open.api.product_updateChannelProduct.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductUpdateChannelProductData {


	@SerializedName("shop_id")
	@OpField(desc = "店铺ID", example = "12332")
	private Long shopId;

	@SerializedName("product_id")
	@OpField(desc = "主商品ID", example = "3631654780608339610")
	private Long productId;

	@SerializedName("channel")
	@OpField(desc = "渠道信息", example = "")
	private Channel channel;

	@SerializedName("is_kol_exclusive")
	@OpField(desc = "是否『达人专属』渠道品", example = "false")
	private Boolean isKolExclusive;


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

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setChannel(Channel channel){
		this.channel = channel;
	}

	
	public Channel getChannel(){
		return this.channel;
	}

	
	public void setIsKolExclusive(Boolean isKolExclusive){
		this.isKolExclusive = isKolExclusive;
	}

	
	public Boolean getIsKolExclusive(){
		return this.isKolExclusive;
	}

}