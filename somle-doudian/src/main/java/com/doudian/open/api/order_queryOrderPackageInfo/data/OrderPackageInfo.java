package com.doudian.open.api.order_queryOrderPackageInfo.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderPackageInfo {


	@SerializedName("shop_id")
	@OpField(desc = "店铺id，抖店平台生成，平台下唯一", example = "94956")
	private Long shopId;

	@SerializedName("shop_order_id")
	@OpField(desc = "订单id，抖店平台生成，平台下唯一", example = "6917533224570258991")
	private String shopOrderId;

	@SerializedName("order_status")
	@OpField(desc = "订单状态1 待确认/待支付（订单创建完毕）105 已支付 2 备货中 101 部分发货 3 已发货（全部发货）4 已取消5 已完成（已收货）", example = "3")
	private Long orderStatus;

	@SerializedName("is_multi_package")
	@OpField(desc = "是否是一单多包裹", example = "true")
	private Boolean isMultiPackage;

	@SerializedName("package_info")
	@OpField(desc = "已发货订单包裹信息", example = "")
	private List<PackageInfoItem> packageInfo;

	@SerializedName("wait_send_product_info")
	@OpField(desc = "待发货商品信息", example = "")
	private WaitSendProductInfo waitSendProductInfo;


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

	
	public void setIsMultiPackage(Boolean isMultiPackage){
		this.isMultiPackage = isMultiPackage;
	}

	
	public Boolean getIsMultiPackage(){
		return this.isMultiPackage;
	}

	
	public void setPackageInfo(List<PackageInfoItem> packageInfo){
		this.packageInfo = packageInfo;
	}

	
	public List<PackageInfoItem> getPackageInfo(){
		return this.packageInfo;
	}

	
	public void setWaitSendProductInfo(WaitSendProductInfo waitSendProductInfo){
		this.waitSendProductInfo = waitSendProductInfo;
	}

	
	public WaitSendProductInfo getWaitSendProductInfo(){
		return this.waitSendProductInfo;
	}

}