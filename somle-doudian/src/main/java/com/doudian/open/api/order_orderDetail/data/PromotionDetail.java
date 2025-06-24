package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PromotionDetail {


	@SerializedName("shop_discount_detail")
	@OpField(desc = "店铺优惠信息", example = "")
	private ShopDiscountDetail shopDiscountDetail;

	@SerializedName("platform_discount_detail")
	@OpField(desc = "平台优惠信息", example = "")
	private PlatformDiscountDetail platformDiscountDetail;

	@SerializedName("kol_discount_detail")
	@OpField(desc = "达人优惠信息", example = "")
	private KolDiscountDetail kolDiscountDetail;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setShopDiscountDetail(ShopDiscountDetail shopDiscountDetail){
		this.shopDiscountDetail = shopDiscountDetail;
	}

	
	public ShopDiscountDetail getShopDiscountDetail(){
		return this.shopDiscountDetail;
	}

	
	public void setPlatformDiscountDetail(PlatformDiscountDetail platformDiscountDetail){
		this.platformDiscountDetail = platformDiscountDetail;
	}

	
	public PlatformDiscountDetail getPlatformDiscountDetail(){
		return this.platformDiscountDetail;
	}

	
	public void setKolDiscountDetail(KolDiscountDetail kolDiscountDetail){
		this.kolDiscountDetail = kolDiscountDetail;
	}

	
	public KolDiscountDetail getKolDiscountDetail(){
		return this.kolDiscountDetail;
	}

}