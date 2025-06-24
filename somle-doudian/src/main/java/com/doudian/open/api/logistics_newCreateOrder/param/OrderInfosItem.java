package com.doudian.open.api.logistics_newCreateOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderInfosItem {


	@SerializedName("order_id")
	@OpField(required = true , desc = "订单号（合单情况下，isv只需传其中一个订单号，传入的订单号需去掉末尾后缀字母A)；非抖音订单需要传order_channel字段，长度仅支持32个字符，格式：数字、大小写字母及“-”、“/”2种分隔符的组合字符串，例如：Doudian-123456", example= "202011809")
	private String orderId;

	@SerializedName("pack_id")
	@OpField(required = false , desc = "包裹id。拆包（一个订单获取多个独立的运单，非子母件）场景使用，只能传入15位以内的数字、字母和下划线，大小写敏感（即123A,123a为不同包裹id），仅第2个及以后的运单取号时传不同id。", example= "1")
	private String packId;

	@SerializedName("service_list")
	@OpField(required = false , desc = "增值服务列表，更多增值服务参考[抖音电商电子面单对接文档](https://bytedance.feishu.cn/wiki/wikcnNVdm3TlJutNCUlKmiVuwnf)", example= "")
	private List<ServiceListItem> serviceList;

	@SerializedName("product_type")
	@OpField(required = false , desc = "快递产品类型，更多产品类型参考[抖音电商电子面单对接文档](https://bytedance.feishu.cn/wiki/wikcnNVdm3TlJutNCUlKmiVuwnf)", example= "1")
	private String productType;

	@SerializedName("pay_method")
	@OpField(required = false , desc = "支付方式：1-寄付月结，2-寄付现结）若不传，默认为商家与物流商网点约定的支付方式", example= "1")
	private Integer payMethod;

	@SerializedName("pay_amount")
	@OpField(required = false , desc = "运费金额，单位为分", example= "5000")
	private Long payAmount;

	@SerializedName("pod_model_address")
	@OpField(required = false , desc = "回单寄回地址", example= "")
	private PodModelAddress podModelAddress;

	@SerializedName("receiver_info")
	@OpField(required = true , desc = "收件人信息", example= "")
	private ReceiverInfo receiverInfo;

	@SerializedName("items")
	@OpField(required = true , desc = "商品明细列表", example= "")
	private List<ItemsItem> items;

	@SerializedName("sender_fetch_time")
	@OpField(required = false , desc = "要求上门取件时间段", example= "2020-11-11 22:00:00|2020-11-11 23:00:00")
	private String senderFetchTime;

	@SerializedName("is_sign_back")
	@OpField(required = false , desc = "是否返回签回单（签单返还）的运单号，支持以下值：1：要求 0：不要求", example= "0")
	private Integer isSignBack;

	@SerializedName("remark")
	@OpField(required = false , desc = "订单备注", example= "我的包裹易碎，包严实点")
	private String remark;

	@SerializedName("extra")
	@OpField(required = false , desc = "备用扩展字段（非必传字段，如果传值不可为null,按照示例来传。）", example= "extra:{sfOtherInfo:{e1:GUER,e2:DOUYIN}},")
	private String extra;

	@SerializedName("total_pack_count")
	@OpField(required = false , desc = "子母件的总包裹数量，仅子母件场景使用，使用时包裹数量必须≥2，不传则默认为普通的一单一包裹运单。", example= "子母件数")
	private Integer totalPackCount;

	@SerializedName("total_weight")
	@OpField(required = false , desc = "商品总重量，单位：克（仅支持顺丰物流使用）", example= "1")
	private String totalWeight;

	@SerializedName("total_length")
	@OpField(required = false , desc = "商品总长，单位：cm（仅支持顺丰物流使用）", example= "1")
	private String totalLength;

	@SerializedName("total_width")
	@OpField(required = false , desc = "商品总宽，单位：cm（仅支持顺丰物流使用）", example= "1")
	private String totalWidth;

	@SerializedName("total_height")
	@OpField(required = false , desc = "商品总高，单位：cm（仅支持顺丰物流使用）", example= "1")
	private String totalHeight;

	@SerializedName("volume")
	@OpField(required = false , desc = "商品总体积，单位：cm3（仅支持顺丰物流使用）", example= "1")
	private String volume;

	@SerializedName("warehouse")
	@OpField(required = false , desc = "仓、门店、总对总发货", example= "")
	private Warehouse warehouse;

	@SerializedName("net_info")
	@OpField(required = false , desc = "总对总信息门店信息", example= "")
	private NetInfo netInfo;

	@SerializedName("shipping_code")
	@OpField(required = false , desc = "物料码", example= "SF24234234234234")
	private String shippingCode;

	@SerializedName("special_delivery_type_code")
	@OpField(required = false , desc = "顺丰极效前置场景（必填）使用  2:极效前置单", example= "2")
	private String specialDeliveryTypeCode;

	@SerializedName("special_delivery_type_value")
	@OpField(required = false , desc = "顺丰极效前置场景（必填）使用   Y:若不支持则返回普通运单 N:若不支持则返回错误码", example= "Y")
	private String specialDeliveryTypeValue;

	@SerializedName("package_weight")
	@OpField(required = false , desc = "包裹总重量（g）（丹鸟专用，其余物流商取号不要传该字段）", example= "100")
	private Integer packageWeight;

	@SerializedName("combine_orders")
	@OpField(required = false , desc = "合单订单号列表", example= "[49111111,49111112]")
	private List<String> combineOrders;


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

	
	public void setPackId(String packId){
		this.packId = packId;
	}

	
	public String getPackId(){
		return this.packId;
	}

	
	public void setServiceList(List<ServiceListItem> serviceList){
		this.serviceList = serviceList;
	}

	
	public List<ServiceListItem> getServiceList(){
		return this.serviceList;
	}

	
	public void setProductType(String productType){
		this.productType = productType;
	}

	
	public String getProductType(){
		return this.productType;
	}

	
	public void setPayMethod(Integer payMethod){
		this.payMethod = payMethod;
	}

	
	public Integer getPayMethod(){
		return this.payMethod;
	}

	
	public void setPayAmount(Long payAmount){
		this.payAmount = payAmount;
	}

	
	public Long getPayAmount(){
		return this.payAmount;
	}

	
	public void setPodModelAddress(PodModelAddress podModelAddress){
		this.podModelAddress = podModelAddress;
	}

	
	public PodModelAddress getPodModelAddress(){
		return this.podModelAddress;
	}

	
	public void setReceiverInfo(ReceiverInfo receiverInfo){
		this.receiverInfo = receiverInfo;
	}

	
	public ReceiverInfo getReceiverInfo(){
		return this.receiverInfo;
	}

	
	public void setItems(List<ItemsItem> items){
		this.items = items;
	}

	
	public List<ItemsItem> getItems(){
		return this.items;
	}

	
	public void setSenderFetchTime(String senderFetchTime){
		this.senderFetchTime = senderFetchTime;
	}

	
	public String getSenderFetchTime(){
		return this.senderFetchTime;
	}

	
	public void setIsSignBack(Integer isSignBack){
		this.isSignBack = isSignBack;
	}

	
	public Integer getIsSignBack(){
		return this.isSignBack;
	}

	
	public void setRemark(String remark){
		this.remark = remark;
	}

	
	public String getRemark(){
		return this.remark;
	}

	
	public void setExtra(String extra){
		this.extra = extra;
	}

	
	public String getExtra(){
		return this.extra;
	}

	
	public void setTotalPackCount(Integer totalPackCount){
		this.totalPackCount = totalPackCount;
	}

	
	public Integer getTotalPackCount(){
		return this.totalPackCount;
	}

	
	public void setTotalWeight(String totalWeight){
		this.totalWeight = totalWeight;
	}

	
	public String getTotalWeight(){
		return this.totalWeight;
	}

	
	public void setTotalLength(String totalLength){
		this.totalLength = totalLength;
	}

	
	public String getTotalLength(){
		return this.totalLength;
	}

	
	public void setTotalWidth(String totalWidth){
		this.totalWidth = totalWidth;
	}

	
	public String getTotalWidth(){
		return this.totalWidth;
	}

	
	public void setTotalHeight(String totalHeight){
		this.totalHeight = totalHeight;
	}

	
	public String getTotalHeight(){
		return this.totalHeight;
	}

	
	public void setVolume(String volume){
		this.volume = volume;
	}

	
	public String getVolume(){
		return this.volume;
	}

	
	public void setWarehouse(Warehouse warehouse){
		this.warehouse = warehouse;
	}

	
	public Warehouse getWarehouse(){
		return this.warehouse;
	}

	
	public void setNetInfo(NetInfo netInfo){
		this.netInfo = netInfo;
	}

	
	public NetInfo getNetInfo(){
		return this.netInfo;
	}

	
	public void setShippingCode(String shippingCode){
		this.shippingCode = shippingCode;
	}

	
	public String getShippingCode(){
		return this.shippingCode;
	}

	
	public void setSpecialDeliveryTypeCode(String specialDeliveryTypeCode){
		this.specialDeliveryTypeCode = specialDeliveryTypeCode;
	}

	
	public String getSpecialDeliveryTypeCode(){
		return this.specialDeliveryTypeCode;
	}

	
	public void setSpecialDeliveryTypeValue(String specialDeliveryTypeValue){
		this.specialDeliveryTypeValue = specialDeliveryTypeValue;
	}

	
	public String getSpecialDeliveryTypeValue(){
		return this.specialDeliveryTypeValue;
	}

	
	public void setPackageWeight(Integer packageWeight){
		this.packageWeight = packageWeight;
	}

	
	public Integer getPackageWeight(){
		return this.packageWeight;
	}

	
	public void setCombineOrders(List<String> combineOrders){
		this.combineOrders = combineOrders;
	}

	
	public List<String> getCombineOrders(){
		return this.combineOrders;
	}

}