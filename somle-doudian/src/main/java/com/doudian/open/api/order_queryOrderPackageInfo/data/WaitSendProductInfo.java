package com.doudian.open.api.order_queryOrderPackageInfo.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class WaitSendProductInfo {


	@SerializedName("product_info")
	@OpField(desc = "商品信息", example = "")
	private List<ProductInfoItem> productInfo;

	@SerializedName("delivery_info")
	@OpField(desc = "物流信息", example = "")
	private List<DeliveryInfoItem> deliveryInfo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductInfo(List<ProductInfoItem> productInfo){
		this.productInfo = productInfo;
	}

	
	public List<ProductInfoItem> getProductInfo(){
		return this.productInfo;
	}

	
	public void setDeliveryInfo(List<DeliveryInfoItem> deliveryInfo){
		this.deliveryInfo = deliveryInfo;
	}

	
	public List<DeliveryInfoItem> getDeliveryInfo(){
		return this.deliveryInfo;
	}

}