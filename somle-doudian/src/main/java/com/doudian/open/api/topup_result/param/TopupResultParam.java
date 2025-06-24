package com.doudian.open.api.topup_result.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TopupResultParam {


	@SerializedName("trade_order_no")
	@OpField(required = true , desc = "订单号", example= "47544092076043809181")
	private String tradeOrderNo;

	@SerializedName("topup_biz")
	@OpField(required = true , desc = "充值业务", example= "MOBILE_TOPUP")
	private String topupBiz;

	@SerializedName("seller_order_no")
	@OpField(required = true , desc = "商家充值单号", example= "DY8123123")
	private String sellerOrderNo;

	@SerializedName("seller_order_status")
	@OpField(required = true , desc = "充值结果", example= "SUCCESS")
	private String sellerOrderStatus;

	@SerializedName("err_code")
	@OpField(required = false , desc = "错误码", example= "1003")
	private String errCode;

	@SerializedName("err_desc")
	@OpField(required = false , desc = "错误信息", example= "参数校验失败")
	private String errDesc;

	@SerializedName("url")
	@OpField(required = false , desc = "去使用链接", example= "https://xxxx.com")
	private String url;

	@SerializedName("url_type")
	@OpField(required = false , desc = "去使用链接类型小程序：microapp普通链接：normal", example= "normal")
	private String urlType;

	@SerializedName("topup_failure_reason_code")
	@OpField(required = false , desc = "充值失败错误码10001：手机号码无效10002：商家缺货10003 ： 命中运营商风控策略", example= "10001")
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

	
	public void setUrl(String url){
		this.url = url;
	}

	
	public String getUrl(){
		return this.url;
	}

	
	public void setUrlType(String urlType){
		this.urlType = urlType;
	}

	
	public String getUrlType(){
		return this.urlType;
	}

	
	public void setTopupFailureReasonCode(String topupFailureReasonCode){
		this.topupFailureReasonCode = topupFailureReasonCode;
	}

	
	public String getTopupFailureReasonCode(){
		return this.topupFailureReasonCode;
	}

}