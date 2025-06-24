package com.doudian.open.spi.topup_notify.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TopupNotifyData {


	@SerializedName("trade_order_no")
	@OpField(desc = "充值平台交易单号  按照入参数返回", example = "4754409207604380918")
	private String tradeOrderNo;

	@SerializedName("topup_biz")
	@OpField(desc = "业务类型  按照入参数返回", example = "MOBILE_TOPUP")
	private String topupBiz;

	@SerializedName("seller_order_no")
	@OpField(desc = "商家自有充值系统单号，与trade_order_no保持一一对应", example = "87123879123731")
	private String sellerOrderNo;

	@SerializedName("seller_order_status")
	@OpField(desc = "订单状态，如果返回状态非以下状态则将进行接口重试，可选范围： SUCCESS 订单充值成功 FAILED 订单充值失败 IN_PROCESS 订单充值中", example = "SUCCESS")
	private String sellerOrderStatus;

	@SerializedName("err_code")
	@OpField(desc = "错误码，当 seller_order_status 为FAILED时，需要填写充值失败的原因", example = "2001")
	private String errCode;

	@SerializedName("err_desc")
	@OpField(desc = "错误描述", example = "携号转网失败")
	private String errDesc;

	@SerializedName("topup_failure_reason_code")
	@OpField(desc = "展示给用户查看的充值失败原因错误码，目前仅支持以下枚举值，若不传则默认使用1009810001：手机号码无效 10002：商家缺货 10003：命中运营商风控策略10098：其他商家处理时的异常", example = "10001")
	private String topupFailureReasonCode;


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

	
	public void setTopupFailureReasonCode(String topupFailureReasonCode){
		this.topupFailureReasonCode = topupFailureReasonCode;
	}

	
	public String getTopupFailureReasonCode(){
		return this.topupFailureReasonCode;
	}

}