package com.doudian.open.spi.topup_notify.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class TopupNotifyParam {


	@SerializedName("trade_order_no")
	@OpField(required = false , desc = "充值平台交易单号", example= "4754409207604380918")
	private String tradeOrderNo;

	@SerializedName("topup_biz")
	@OpField(required = false , desc = "业务类型，充值请求参数原样返回即可 （全部业务类型参见充值对接文档）", example= "MOBILE_TOPUP")
	private String topupBiz;

	@SerializedName("time_start")
	@OpField(required = false , desc = "整个充值流程的计时起点 格式（yyyyMMddHHmmss）", example= "20211013160340")
	private String timeStart;

	@SerializedName("time_limit")
	@OpField(required = false , desc = "充值请求截止时延，单位为秒，以time_start为起点", example= "10800")
	private String timeLimit;

	@SerializedName("buy_num")
	@OpField(required = false , desc = "购买数量", example= "1")
	private String buyNum;

	@SerializedName("amount_unit")
	@OpField(required = false , desc = "单个商品充值面额。注：总充值金额=buyNum*amountUnit，单位分 流量充值为商品价格", example= "10000")
	private String amountUnit;

	@SerializedName("sku_id")
	@OpField(required = false , desc = "在电商平台商品的skuId", example= "998766779")
	private String skuId;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "商家店铺id", example= "12345")
	private String shopId;

	@SerializedName("account_list")
	@OpField(required = false , desc = "充值账号列表", example= "")
	private List<AccountListItem> accountList;

	@SerializedName("code")
	@OpField(required = false , desc = "商品编码（抖店后台）", example= "DY8123123")
	private String code;

	@SerializedName("pay_amount")
	@OpField(required = false , desc = "支付金额", example= "10000")
	private String payAmount;

	@SerializedName("doudian_open_id")
	@OpField(required = false , desc = "用户唯一id，同一买家由相同应用（AppKey）获取时唯一", example= "1@#SGf7u/L4T728WdIaNcm6c+7SOqTObqbPh6wJBSm6lRGO+VEipIFB4EZDoWtkW1ThcrgNhg==")
	private String doudianOpenId;

	@SerializedName("outer_order_id")
	@OpField(required = false , desc = "外部商家订单号，普通充值不需要该字段，特殊充值场景才有，譬如腾讯", example= "123211")
	private String outerOrderId;


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

	
	public void setTimeStart(String timeStart){
		this.timeStart = timeStart;
	}

	
	public String getTimeStart(){
		return this.timeStart;
	}

	
	public void setTimeLimit(String timeLimit){
		this.timeLimit = timeLimit;
	}

	
	public String getTimeLimit(){
		return this.timeLimit;
	}

	
	public void setBuyNum(String buyNum){
		this.buyNum = buyNum;
	}

	
	public String getBuyNum(){
		return this.buyNum;
	}

	
	public void setAmountUnit(String amountUnit){
		this.amountUnit = amountUnit;
	}

	
	public String getAmountUnit(){
		return this.amountUnit;
	}

	
	public void setSkuId(String skuId){
		this.skuId = skuId;
	}

	
	public String getSkuId(){
		return this.skuId;
	}

	
	public void setShopId(String shopId){
		this.shopId = shopId;
	}

	
	public String getShopId(){
		return this.shopId;
	}

	
	public void setAccountList(List<AccountListItem> accountList){
		this.accountList = accountList;
	}

	
	public List<AccountListItem> getAccountList(){
		return this.accountList;
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

	
	public void setPayAmount(String payAmount){
		this.payAmount = payAmount;
	}

	
	public String getPayAmount(){
		return this.payAmount;
	}

	
	public void setDoudianOpenId(String doudianOpenId){
		this.doudianOpenId = doudianOpenId;
	}

	
	public String getDoudianOpenId(){
		return this.doudianOpenId;
	}

	
	public void setOuterOrderId(String outerOrderId){
		this.outerOrderId = outerOrderId;
	}

	
	public String getOuterOrderId(){
		return this.outerOrderId;
	}

}