package com.doudian.open.api.order_queryOrderLogistics.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderPackageInfo {


	@SerializedName("shop_order_id")
	@OpField(desc = "店铺单号", example = "12334455666")
	private String shopOrderId;

	@SerializedName("order_status")
	@OpField(desc = "订单状态", example = "2")
	private Long orderStatus;

	@SerializedName("package_info")
	@OpField(desc = "包裹数据", example = "")
	private List<PackageInfoItem> packageInfo;

	@SerializedName("shop_id")
	@OpField(desc = "店铺Id", example = "1")
	private Long shopId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setShopOrderId(String shopOrderId){
		this.shopOrderId = shopOrderId;
	}

	
	public String getShopOrderId(){
		return this.shopOrderId;
	}

	
	public void setOrderStatus(Long orderStatus){
		this.orderStatus = orderStatus;
	}

	
	public Long getOrderStatus(){
		return this.orderStatus;
	}

	
	public void setPackageInfo(List<PackageInfoItem> packageInfo){
		this.packageInfo = packageInfo;
	}

	
	public List<PackageInfoItem> getPackageInfo(){
		return this.packageInfo;
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

}