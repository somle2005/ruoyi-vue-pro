package com.doudian.open.api.coupons_list.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CouponsListParam {


	@SerializedName("order_id")
	@OpField(required = false , desc = "子订单id", example= "123")
	private String orderId;

	@SerializedName("cert_no")
	@OpField(required = false , desc = "卡号券码", example= "卡券id")
	private String certNo;

	@SerializedName("cert_type")
	@OpField(required = false , desc = "卡券类型（0-三方卡券；1-平台卡券）", example= "0")
	private Long certType;


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

	
	public void setCertNo(String certNo){
		this.certNo = certNo;
	}

	
	public String getCertNo(){
		return this.certNo;
	}

	
	public void setCertType(Long certType){
		this.certType = certType;
	}

	
	public Long getCertType(){
		return this.certType;
	}

}