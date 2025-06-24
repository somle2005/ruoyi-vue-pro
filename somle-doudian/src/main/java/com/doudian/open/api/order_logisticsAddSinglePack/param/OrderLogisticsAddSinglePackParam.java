package com.doudian.open.api.order_logisticsAddSinglePack.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderLogisticsAddSinglePackParam {


	@SerializedName("order_id_list")
	@OpField(required = true , desc = "父订单ID列表", example= "[4846347827301748265,4846341672614340433]")
	private List<String> orderIdList;

	@SerializedName("shipped_order_info")
	@OpField(required = true , desc = "需要发货的子订单信息", example= "")
	private List<ShippedOrderInfoItem> shippedOrderInfo;

	@SerializedName("logistics_code")
	@OpField(required = true , desc = "运单号", example= "9595123123")
	private String logisticsCode;

	@SerializedName("company")
	@OpField(required = false , desc = "物流公司名字", example= "顺丰")
	private String company;

	@SerializedName("request_id")
	@OpField(required = true , desc = "请求唯一标识，相同request_id多次请求，第一次请求成功后，后续的请求会触发幂等，会直接返回第一次请求成功的结果，不会实际触发发货。", example= "1267250f-8b9d-4d9e-9fad-0cd9629c83de")
	private String requestId;

	@SerializedName("is_reject_refund")
	@OpField(required = false , desc = "是否拒绝退款申请（true表示拒绝退款，并继续发货；不传或为false表示有退款需要处理，拒绝发货），is_refund_reject和is_reject_refund随机使用一个即可", example= "true")
	private Boolean isRejectRefund;

	@SerializedName("logistics_id")
	@OpField(required = false , desc = "已废弃。物流公司ID。请使用company_code字段。", example= "12")
	private String logisticsId;

	@SerializedName("company_code")
	@OpField(required = false , desc = "物流公司Code，由接口/order/logisticsCompanyLis查询物流公司列表获得，必填", example= "shunfeng")
	private String companyCode;

	@SerializedName("address_id")
	@OpField(required = false , desc = "发货地址id", example= "12")
	private String addressId;

	@SerializedName("order_serial_number")
	@OpField(required = false , desc = "订单序列号", example= "")
	private List<OrderSerialNumberItem> orderSerialNumber;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "1234")
	private Long storeId;

	@SerializedName("after_sale_address_id")
	@OpField(required = false , desc = "退货地址ID,通过地址库列表【/address/list】接口查询。当传入该字段时，可实现自动审核场景买家退货至商家指定退货地址：例如商家配置的售后小助手以及平台闪电退货规则，会获取发货时传入的after_sale_address_id地址id对应的地址给买家展示进行商品退回；", example= "12")
	private Long afterSaleAddressId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderIdList(List<String> orderIdList){
		this.orderIdList = orderIdList;
	}

	
	public List<String> getOrderIdList(){
		return this.orderIdList;
	}

	
	public void setShippedOrderInfo(List<ShippedOrderInfoItem> shippedOrderInfo){
		this.shippedOrderInfo = shippedOrderInfo;
	}

	
	public List<ShippedOrderInfoItem> getShippedOrderInfo(){
		return this.shippedOrderInfo;
	}

	
	public void setLogisticsCode(String logisticsCode){
		this.logisticsCode = logisticsCode;
	}

	
	public String getLogisticsCode(){
		return this.logisticsCode;
	}

	
	public void setCompany(String company){
		this.company = company;
	}

	
	public String getCompany(){
		return this.company;
	}

	
	public void setRequestId(String requestId){
		this.requestId = requestId;
	}

	
	public String getRequestId(){
		return this.requestId;
	}

	
	public void setIsRejectRefund(Boolean isRejectRefund){
		this.isRejectRefund = isRejectRefund;
	}

	
	public Boolean getIsRejectRefund(){
		return this.isRejectRefund;
	}

	
	public void setLogisticsId(String logisticsId){
		this.logisticsId = logisticsId;
	}

	
	public String getLogisticsId(){
		return this.logisticsId;
	}

	
	public void setCompanyCode(String companyCode){
		this.companyCode = companyCode;
	}

	
	public String getCompanyCode(){
		return this.companyCode;
	}

	
	public void setAddressId(String addressId){
		this.addressId = addressId;
	}

	
	public String getAddressId(){
		return this.addressId;
	}

	
	public void setOrderSerialNumber(List<OrderSerialNumberItem> orderSerialNumber){
		this.orderSerialNumber = orderSerialNumber;
	}

	
	public List<OrderSerialNumberItem> getOrderSerialNumber(){
		return this.orderSerialNumber;
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