package com.doudian.open.api.shop_reputation.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ShopReputationData {


	@SerializedName("shop_id")
	@OpField(desc = "店铺 id", example = "52143")
	private Long shopId;

	@SerializedName("shop_name")
	@OpField(desc = "店铺名称", example = "测试店铺")
	private String shopName;

	@SerializedName("shop_score")
	@OpField(desc = "商家体验分", example = "4.90")
	private String shopScore;

	@SerializedName("product_score")
	@OpField(desc = "商品体验分", example = "4.90")
	private String productScore;

	@SerializedName("logistics_score")
	@OpField(desc = "物流体验分", example = "4.90")
	private String logisticsScore;

	@SerializedName("service_score")
	@OpField(desc = "商家服务分", example = "4.90")
	private String serviceScore;


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

	
	public void setShopName(String shopName){
		this.shopName = shopName;
	}

	
	public String getShopName(){
		return this.shopName;
	}

	
	public void setShopScore(String shopScore){
		this.shopScore = shopScore;
	}

	
	public String getShopScore(){
		return this.shopScore;
	}

	
	public void setProductScore(String productScore){
		this.productScore = productScore;
	}

	
	public String getProductScore(){
		return this.productScore;
	}

	
	public void setLogisticsScore(String logisticsScore){
		this.logisticsScore = logisticsScore;
	}

	
	public String getLogisticsScore(){
		return this.logisticsScore;
	}

	
	public void setServiceScore(String serviceScore){
		this.serviceScore = serviceScore;
	}

	
	public String getServiceScore(){
		return this.serviceScore;
	}

}