package com.doudian.open.api.buyin_allKolStrategyCreate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class BuyinAllKolStrategyCreateParam {


	@SerializedName("product_id")
	@OpField(required = true , desc = "商品id", example= "123456789")
	private Long productId;

	@SerializedName("cos_ratio")
	@OpField(required = true , desc = "佣金率", example= "50")
	private Long cosRatio;


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

	
	public void setCosRatio(Long cosRatio){
		this.cosRatio = cosRatio;
	}

	
	public Long getCosRatio(){
		return this.cosRatio;
	}

}