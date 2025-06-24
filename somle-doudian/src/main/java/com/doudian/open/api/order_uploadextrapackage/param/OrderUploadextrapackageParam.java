package com.doudian.open.api.order_uploadextrapackage.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderUploadextrapackageParam {


	@SerializedName("shop_order_id")
	@OpField(required = true , desc = "店铺单号", example= "6919571420622558781")
	private String shopOrderId;

	@SerializedName("product_orders")
	@OpField(required = true , desc = "运单号关联的商品信息列表", example= "")
	private List<ProductOrdersItem> productOrders;

	@SerializedName("tracking_no")
	@OpField(required = true , desc = "物流单号", example= "SF1635275876054")
	private String trackingNo;

	@SerializedName("company_code")
	@OpField(required = true , desc = "物流公司code", example= "shunfeng")
	private String companyCode;

	@SerializedName("send_address_id")
	@OpField(required = false , desc = "商家在地址库设置的地址对应的ID，用于发货时指定发货的地址", example= "456")
	private Long sendAddressId;

	@SerializedName("parent_tracking_no")
	@OpField(required = false , desc = "子母单情况下指定当前传递的单号对应的母单号，如果没有，该字段不需要传递，直接为空即可。", example= "323")
	private String parentTrackingNo;

	@SerializedName("store_id")
	@OpField(required = false , desc = "店铺对应的门店ID，如果没有门店，该字段不用传递。", example= "1233")
	private Long storeId;


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

	
	public void setProductOrders(List<ProductOrdersItem> productOrders){
		this.productOrders = productOrders;
	}

	
	public List<ProductOrdersItem> getProductOrders(){
		return this.productOrders;
	}

	
	public void setTrackingNo(String trackingNo){
		this.trackingNo = trackingNo;
	}

	
	public String getTrackingNo(){
		return this.trackingNo;
	}

	
	public void setCompanyCode(String companyCode){
		this.companyCode = companyCode;
	}

	
	public String getCompanyCode(){
		return this.companyCode;
	}

	
	public void setSendAddressId(Long sendAddressId){
		this.sendAddressId = sendAddressId;
	}

	
	public Long getSendAddressId(){
		return this.sendAddressId;
	}

	
	public void setParentTrackingNo(String parentTrackingNo){
		this.parentTrackingNo = parentTrackingNo;
	}

	
	public String getParentTrackingNo(){
		return this.parentTrackingNo;
	}

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

}