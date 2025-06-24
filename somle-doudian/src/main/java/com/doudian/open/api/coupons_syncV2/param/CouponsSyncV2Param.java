package com.doudian.open.api.coupons_syncV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class CouponsSyncV2Param {


	@SerializedName("order_id")
	@OpField(required = true , desc = "子订单id", example= "123421345")
	private String orderId;

	@SerializedName("sku_id")
	@OpField(required = false , desc = "skuid", example= "1")
	private Long skuId;

	@SerializedName("cert_list")
	@OpField(required = true , desc = "卡券信息列表", example= "")
	private List<CertListItem> certList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

	
	public void setSkuId(Long skuId){
		this.skuId = skuId;
	}

	
	public Long getSkuId(){
		return this.skuId;
	}

	
	public void setCertList(List<CertListItem> certList){
		this.certList = certList;
	}

	
	public List<CertListItem> getCertList(){
		return this.certList;
	}

}