package com.doudian.open.spi.topup_cancel.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TopupCancelData {


	@SerializedName("trade_order_no")
	@OpField(desc = "电商平台交易单号 按照入参数返回", example = "4754409207604380918")
	private String tradeOrderNo;

	@SerializedName("topup_biz")
	@OpField(desc = "业务类型 按照入参数返回", example = "MOBILE_TOPUP")
	private String topupBiz;

	@SerializedName("seller_order_no")
	@OpField(desc = "商家自有充值系统单号，与trade_order_no保持一一对应", example = "87123879123731")
	private String sellerOrderNo;

	@SerializedName("seller_order_status")
	@OpField(desc = "可选范围： CANCEL", example = "CANCEL")
	private String sellerOrderStatus;

	@SerializedName("err_code")
	@OpField(desc = "错误码", example = "10001")
	private String errCode;

	@SerializedName("err_desc")
	@OpField(desc = "错误信息", example = "充值失败")
	private String errDesc;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTradeOrderNo(String tradeOrderNo){
		this.tradeOrderNo = tradeOrderNo;
	}

	
	public String getTradeOrderNo(){
		return this.tradeOrderNo;
	}

	
	public void setTopupBiz(String topupBiz){
		this.topupBiz = topupBiz;
	}

	
	public String getTopupBiz(){
		return this.topupBiz;
	}

	
	public void setSellerOrderNo(String sellerOrderNo){
		this.sellerOrderNo = sellerOrderNo;
	}

	
	public String getSellerOrderNo(){
		return this.sellerOrderNo;
	}

	
	public void setSellerOrderStatus(String sellerOrderStatus){
		this.sellerOrderStatus = sellerOrderStatus;
	}

	
	public String getSellerOrderStatus(){
		return this.sellerOrderStatus;
	}

	
	public void setErrCode(String errCode){
		this.errCode = errCode;
	}

	
	public String getErrCode(){
		return this.errCode;
	}

	
	public void setErrDesc(String errDesc){
		this.errDesc = errDesc;
	}

	
	public String getErrDesc(){
		return this.errDesc;
	}

}