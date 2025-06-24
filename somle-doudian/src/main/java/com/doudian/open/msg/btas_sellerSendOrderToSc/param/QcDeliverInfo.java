package com.doudian.open.msg.btas_sellerSendOrderToSc.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class QcDeliverInfo {


	@SerializedName("deliver")
	@OpField(required = false , desc = "送检方式：1，邮寄。2：商家线下送检", example= "1")
	private Long deliver;

	@SerializedName("logistics_name")
	@OpField(required = false , desc = "邮寄的快递公司", example= "shunfeng")
	private String logisticsName;

	@SerializedName("logistics_num")
	@OpField(required = false , desc = "邮寄的快递编码", example= "SF1234352321123")
	private String logisticsNum;

	@SerializedName("seller_return_type")
	@OpField(required = false , desc = "退货发货方式,1:邮寄 2:自提", example= "1")
	private Long sellerReturnType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDeliver(Long deliver){
		this.deliver = deliver;
	}

	
	public Long getDeliver(){
		return this.deliver;
	}

	
	public void setLogisticsName(String logisticsName){
		this.logisticsName = logisticsName;
	}

	
	public String getLogisticsName(){
		return this.logisticsName;
	}

	
	public void setLogisticsNum(String logisticsNum){
		this.logisticsNum = logisticsNum;
	}

	
	public String getLogisticsNum(){
		return this.logisticsNum;
	}

	
	public void setSellerReturnType(Long sellerReturnType){
		this.sellerReturnType = sellerReturnType;
	}

	
	public Long getSellerReturnType(){
		return this.sellerReturnType;
	}

}