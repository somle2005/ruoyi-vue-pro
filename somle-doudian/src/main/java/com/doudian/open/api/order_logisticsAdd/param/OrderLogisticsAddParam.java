package com.doudian.open.api.order_logisticsAdd.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderLogisticsAddParam {


	@SerializedName("order_id")
	@OpField(required = true , desc = "订单ID", example= "4782813149182887526")
	private String orderId;

	@SerializedName("logistics_id")
	@OpField(required = false , desc = "【已废弃】物流公司ID。请使用company_code字段。", example= "1")
	private Long logisticsId;

	@SerializedName("company")
	@OpField(required = false , desc = "物流公司名称", example= "顺丰公司")
	private String company;

	@SerializedName("company_code")
	@OpField(required = false , desc = "(必填)物流公司code,可从/order/logisticsCompanyList接口获取。", example= "shunfeng、qita")
	private String companyCode;

	@SerializedName("logistics_code")
	@OpField(required = false , desc = "(必填)快递单号", example= "sf1231231231234")
	private String logisticsCode;

	@SerializedName("is_refund_reject")
	@OpField(required = false , desc = "是否拒绝退款申请（true表示拒绝退款，并继续发货；不传或为false表示有退款需要处理，拒绝发货），is_refund_reject和is_reject_refund随机使用一个即可", example= "false")
	private Boolean isRefundReject;

	@SerializedName("is_reject_refund")
	@OpField(required = false , desc = "是否拒绝退款申请（true表示拒绝退款，并继续发货；不传或为false表示有退款需要处理，拒绝发货），is_refund_reject和is_reject_refund随机使用一个即可", example= "false")
	private Boolean isRejectRefund;

	@SerializedName("serial_number_list")
	@OpField(required = false , desc = "商品序列号，15-17位数字", example= "[qwe3r]")
	private List<String> serialNumberList;

	@SerializedName("address_id")
	@OpField(required = false , desc = "发货地址ID,通过地址库列表【/address/list】接口查询", example= "6")
	private Long addressId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID；抖超小时达店铺需要填写；", example= "111523")
	private Long storeId;

	@SerializedName("after_sale_address_id")
	@OpField(required = false , desc = "退货地址ID,通过地址库列表【/address/list】接口查询。当传入该字段时，可实现自动审核场景买家退货至商家指定退货地址：例如商家配置的售后小助手以及平台闪电退货规则，会获取发货时传入的after_sale_address_id地址id对应的地址给买家展示进行商品退回；", example= "1")
	private Long afterSaleAddressId;

	@SerializedName("product_orders")
	@OpField(required = false , desc = "挂在商品单上的信息，只是用于传递和商品单关联的信息，比如SN/69/IMEI码。目前接口还是按照店铺单维度推进发货状态，不会按照传递过来的product_order_id推进订单状态。比如，店铺单下有A、B、C三个商品单，其中A单需要SN/69/IMEI码，这时候只需要把A单关联的SN/69/IMEI传递过来即可。接口会把A、B、C三个商品单都推进到已发货状态。", example= "")
	private List<ProductOrdersItem> productOrders;


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

	
	public void setLogisticsId(Long logisticsId){
		this.logisticsId = logisticsId;
	}

	
	public Long getLogisticsId(){
		return this.logisticsId;
	}

	
	public void setCompany(String company){
		this.company = company;
	}

	
	public String getCompany(){
		return this.company;
	}

	
	public void setCompanyCode(String companyCode){
		this.companyCode = companyCode;
	}

	
	public String getCompanyCode(){
		return this.companyCode;
	}

	
	public void setLogisticsCode(String logisticsCode){
		this.logisticsCode = logisticsCode;
	}

	
	public String getLogisticsCode(){
		return this.logisticsCode;
	}

	
	public void setIsRefundReject(Boolean isRefundReject){
		this.isRefundReject = isRefundReject;
	}

	
	public Boolean getIsRefundReject(){
		return this.isRefundReject;
	}

	
	public void setIsRejectRefund(Boolean isRejectRefund){
		this.isRejectRefund = isRejectRefund;
	}

	
	public Boolean getIsRejectRefund(){
		return this.isRejectRefund;
	}

	
	public void setSerialNumberList(List<String> serialNumberList){
		this.serialNumberList = serialNumberList;
	}

	
	public List<String> getSerialNumberList(){
		return this.serialNumberList;
	}

	
	public void setAddressId(Long addressId){
		this.addressId = addressId;
	}

	
	public Long getAddressId(){
		return this.addressId;
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

	
	public void setProductOrders(List<ProductOrdersItem> productOrders){
		this.productOrders = productOrders;
	}

	
	public List<ProductOrdersItem> getProductOrders(){
		return this.productOrders;
	}

}