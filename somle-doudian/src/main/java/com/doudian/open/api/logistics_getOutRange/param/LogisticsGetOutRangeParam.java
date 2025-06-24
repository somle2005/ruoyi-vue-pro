package com.doudian.open.api.logistics_getOutRange.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsGetOutRangeParam {


	@SerializedName("logistics_code")
	@OpField(required = true , desc = "快递公司编码", example= "jtexpress")
	private String logisticsCode;

	@SerializedName("sender_address")
	@OpField(required = false , desc = "发货地址", example= "")
	private SenderAddress senderAddress;

	@SerializedName("receiver_address")
	@OpField(required = false , desc = "收件地址", example= "")
	private ReceiverAddress receiverAddress;

	@SerializedName("type")
	@OpField(required = true , desc = "类型（0-揽派合一；1-揽收区域；2-派送区域） 0：取senderAddress, receiverAddress值 1：取senderAddress值 2：取receiverAddress值", example= "1")
	private Integer type;

	@SerializedName("service_list")
	@OpField(required = false , desc = "增值服务 目前只支持德邦", example= "")
	private List<ServiceListItem> serviceList;

	@SerializedName("product_type")
	@OpField(required = false , desc = "产品类型 目前只支持德邦", example= "ll-sd-m")
	private String productType;

	@SerializedName("delivery_req")
	@OpField(required = false , desc = "投递要求 目前只支持德邦", example= "")
	private DeliveryReq deliveryReq;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setLogisticsCode(String logisticsCode){
		this.logisticsCode = logisticsCode;
	}

	
	public String getLogisticsCode(){
		return this.logisticsCode;
	}

	
	public void setSenderAddress(SenderAddress senderAddress){
		this.senderAddress = senderAddress;
	}

	
	public SenderAddress getSenderAddress(){
		return this.senderAddress;
	}

	
	public void setReceiverAddress(ReceiverAddress receiverAddress){
		this.receiverAddress = receiverAddress;
	}

	
	public ReceiverAddress getReceiverAddress(){
		return this.receiverAddress;
	}

	
	public void setType(Integer type){
		this.type = type;
	}

	
	public Integer getType(){
		return this.type;
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

	
	public void setDeliveryReq(DeliveryReq deliveryReq){
		this.deliveryReq = deliveryReq;
	}

	
	public DeliveryReq getDeliveryReq(){
		return this.deliveryReq;
	}

}