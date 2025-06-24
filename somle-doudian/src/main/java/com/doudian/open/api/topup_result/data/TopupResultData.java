package com.doudian.open.api.topup_result.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TopupResultData {


	@SerializedName("trade_order_no")
	@OpField(desc = "平台订单号.", example = "4754409207604380918")
	private String tradeOrderNo;

	@SerializedName("topup_biz")
	@OpField(desc = "充值业务", example = "MOBILE_TOPUP")
	private String topupBiz;

	@SerializedName("result")
	@OpField(desc = "平台接口充值结果失败", example = "FAILED")
	private String result;

	@SerializedName("seller_order_no")
	@OpField(desc = "商家充值单号", example = "DY8123123")
	private String sellerOrderNo;

	@SerializedName("err_code")
	@OpField(desc = "错误码", example = "-1")
	private String errCode;

	@SerializedName("err_desc")
	@OpField(desc = "错误信息", example = "内部错误")
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

	
	public void setResult(String result){
		this.result = result;
	}

	
	public String getResult(){
		return this.result;
	}

	
	public void setSellerOrderNo(String sellerOrderNo){
		this.sellerOrderNo = sellerOrderNo;
	}

	
	public String getSellerOrderNo(){
		return this.sellerOrderNo;
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