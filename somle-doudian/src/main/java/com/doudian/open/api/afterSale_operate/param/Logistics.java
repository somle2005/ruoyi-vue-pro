package com.doudian.open.api.afterSale_operate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Logistics {


	@SerializedName("company_code")
	@OpField(required = false , desc = "物流公司code，使用【/order/logisticsCompanyList】接口获取；type=311仅换货时需要填入", example= "yuantong")
	private String companyCode;

	@SerializedName("logistics_code")
	@OpField(required = false , desc = "物流单号（快递单号），仅type=311仅换货时需要填入", example= "YT31368712931")
	private String logisticsCode;

	@SerializedName("receiver_address_id")
	@OpField(required = false , desc = "商家收件地址id（推荐使用），须通过【/address/list】获取【address_id】填入。商家在同意换货/退货时，可以传入该地址id，对应的地址会买家展示进行商品退回；", example= "95251")
	private Long receiverAddressId;

	@SerializedName("sender_address_id")
	@OpField(required = false , desc = "已废弃字段（废弃时间2022-06-10）发件地址id", example= "95252")
	private Long senderAddressId;

	@SerializedName("after_sale_address_detail")
	@OpField(required = false , desc = "【该字段将在2023年8月31日下线】，请尽快切换使用receiver_address_id字段，商家收货地址详情；", example= "")
	private AfterSaleAddressDetail afterSaleAddressDetail;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

	
	public void setReceiverAddressId(Long receiverAddressId){
		this.receiverAddressId = receiverAddressId;
	}

	
	public Long getReceiverAddressId(){
		return this.receiverAddressId;
	}

	
	public void setSenderAddressId(Long senderAddressId){
		this.senderAddressId = senderAddressId;
	}

	
	public Long getSenderAddressId(){
		return this.senderAddressId;
	}

	
	public void setAfterSaleAddressDetail(AfterSaleAddressDetail afterSaleAddressDetail){
		this.afterSaleAddressDetail = afterSaleAddressDetail;
	}

	
	public AfterSaleAddressDetail getAfterSaleAddressDetail(){
		return this.afterSaleAddressDetail;
	}

}