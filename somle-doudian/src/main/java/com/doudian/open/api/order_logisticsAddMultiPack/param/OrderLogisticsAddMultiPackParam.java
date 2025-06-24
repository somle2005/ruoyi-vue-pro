package com.doudian.open.api.order_logisticsAddMultiPack.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderLogisticsAddMultiPackParam {


	@SerializedName("order_id")
	@OpField(required = true , desc = "父订单ID", example= "4782813149182887526")
	private String orderId;

	@SerializedName("pack_list")
	@OpField(required = true , desc = "包裹list", example= "")
	private List<PackListItem> packList;

	@SerializedName("is_reject_refund")
	@OpField(required = false , desc = "是否拒绝退款申请（true表示拒绝退款，并继续发货；不传或为false表示有退款需要处理，拒绝发货），is_refund_reject和is_reject_refund随机使用一个即可", example= "true")
	private Boolean isRejectRefund;

	@SerializedName("request_id")
	@OpField(required = true , desc = "请求唯一标识，相同request_id多次请求，第一次请求成功后，后续的请求会触发幂等，会直接返回第一次请求成功的结果，不会实际触发发货。", example= "1267250f-8b9d-4d9e-9fad-0cd9629c83de")
	private String requestId;

	@SerializedName("address_id")
	@OpField(required = false , desc = "发货地址id，使用/address/list接口获取", example= "12")
	private String addressId;

	@SerializedName("serial_number_list")
	@OpField(required = false , desc = "商品序列号，单个序列号长度不能超过30位字符，其中手机序列号仅支持填写15～17位数字", example= "[546443524543534,646443524543534]")
	private List<String> serialNumberList;

	@SerializedName("is_refund_reject")
	@OpField(required = false , desc = "是否拒绝退款申请（true表示拒绝退款，并继续发货；不传或为false表示有退款需要处理，拒绝发货），is_refund_reject和is_reject_refund随机使用一个即可", example= "true")
	private Boolean isRefundReject;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店id", example= "3123121")
	private Long storeId;

	@SerializedName("after_sale_address_id")
	@OpField(required = false , desc = "退货地址ID,通过地址库列表【/address/list】接口查询", example= "12")
	private Long afterSaleAddressId;


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

	
	public void setPackList(List<PackListItem> packList){
		this.packList = packList;
	}

	
	public List<PackListItem> getPackList(){
		return this.packList;
	}

	
	public void setIsRejectRefund(Boolean isRejectRefund){
		this.isRejectRefund = isRejectRefund;
	}

	
	public Boolean getIsRejectRefund(){
		return this.isRejectRefund;
	}

	
	public void setRequestId(String requestId){
		this.requestId = requestId;
	}

	
	public String getRequestId(){
		return this.requestId;
	}

	
	public void setAddressId(String addressId){
		this.addressId = addressId;
	}

	
	public String getAddressId(){
		return this.addressId;
	}

	
	public void setSerialNumberList(List<String> serialNumberList){
		this.serialNumberList = serialNumberList;
	}

	
	public List<String> getSerialNumberList(){
		return this.serialNumberList;
	}

	
	public void setIsRefundReject(Boolean isRefundReject){
		this.isRefundReject = isRefundReject;
	}

	
	public Boolean getIsRefundReject(){
		return this.isRefundReject;
	}

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

	
	public void setAfterSaleAddressId(Long afterSaleAddressId){
		this.afterSaleAddressId = afterSaleAddressId;
	}

	
	public Long getAfterSaleAddressId(){
		return this.afterSaleAddressId;
	}

}