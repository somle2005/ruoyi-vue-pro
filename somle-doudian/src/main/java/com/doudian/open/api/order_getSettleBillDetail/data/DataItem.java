package com.doudian.open.api.order_getSettleBillDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DataItem {


	@SerializedName("shop_order_id")
	@OpField(desc = "店铺单号", example = "4778345176320227200")
	private String shopOrderId;

	@SerializedName("order_id")
	@OpField(desc = "订单号", example = "4778345176320227200")
	private String orderId;

	@SerializedName("order_time")
	@OpField(desc = "下单时间", example = "2021-04-07 11:05:56")
	private String orderTime;

	@SerializedName("shop_id")
	@OpField(desc = "店铺id", example = "12345")
	private Long shopId;

	@SerializedName("settle_time")
	@OpField(desc = "结算时间", example = "2021-05-17 11:05:56")
	private String settleTime;

	@SerializedName("product_id")
	@OpField(desc = "商品ID", example = "3461567267249244016")
	private String productId;

	@SerializedName("goods_count")
	@OpField(desc = "商品数量", example = "10")
	private Integer goodsCount;

	@SerializedName("trade_type_desc")
	@OpField(desc = "结算状态描述", example = "已结算")
	private String tradeTypeDesc;

	@SerializedName("pay_type_desc")
	@OpField(desc = "结算账户类型 微信（升级前）,微信，支付宝,聚合账户,合众支付", example = "支付宝")
	private String payTypeDesc;

	@SerializedName("request_no")
	@OpField(desc = "结算单号", example = "6945807072718045454")
	private String requestNo;

	@SerializedName("flow_type_desc")
	@OpField(desc = "业务类型  广告,频道,联盟,免费", example = "广告")
	private String flowTypeDesc;

	@SerializedName("phase_order_no")
	@OpField(desc = "阶段单号", example = "1232")
	private String phaseOrderNo;

	@SerializedName("phase_cnt")
	@OpField(desc = "有多少个阶段，比如：预售业务单有2个阶段，阶段1：支付定金阶段，阶段2：支付尾款", example = "2")
	private Integer phaseCnt;

	@SerializedName("phase_id")
	@OpField(desc = "当前在第几阶段（从1开始），比如：预售定金支付为阶段1，尾款支付为阶段2", example = "1")
	private Integer phaseId;

	@SerializedName("total_income")
	@OpField(desc = "总收入(分)", example = "950")
	private Long totalIncome;

	@SerializedName("total_outcome")
	@OpField(desc = "总支出(分)", example = "0")
	private Long totalOutcome;

	@SerializedName("profit")
	@OpField(desc = "收益(分)", example = "950")
	private Long profit;

	@SerializedName("settle_amount")
	@OpField(desc = "实际结算金额(分)", example = "950")
	private Long settleAmount;

	@SerializedName("actual_subsidy_amount")
	@OpField(desc = "实际补贴金额(分)", example = "0")
	private Long actualSubsidyAmount;

	@SerializedName("total_amount")
	@OpField(desc = "订单总价(分)", example = "0")
	private Long totalAmount;

	@SerializedName("total_goods_amount")
	@OpField(desc = "商品总价(分)", example = "0")
	private Long totalGoodsAmount;

	@SerializedName("post_amount")
	@OpField(desc = "运费(分)", example = "0")
	private Long postAmount;

	@SerializedName("real_pay_amount")
	@OpField(desc = "订单实付(分)", example = "0")
	private Long realPayAmount;

	@SerializedName("settled_pay_amount")
	@OpField(desc = "订单实付应结(分)", example = "0")
	private Long settledPayAmount;

	@SerializedName("platform_coupon")
	@OpField(desc = "平台补贴(分)", example = "0")
	private Long platformCoupon;

	@SerializedName("author_coupon")
	@OpField(desc = "达人券补贴(分)", example = "0")
	private Long authorCoupon;

	@SerializedName("pay_promotion")
	@OpField(desc = "支付补贴(分)", example = "0")
	private Long payPromotion;

	@SerializedName("actual_platform_coupon")
	@OpField(desc = "实际平台补贴(分)", example = "0")
	private Long actualPlatformCoupon;

	@SerializedName("actual_author_coupon")
	@OpField(desc = "实际达人券补贴(分)", example = "0")
	private Long actualAuthorCoupon;

	@SerializedName("actual_pay_promotion")
	@OpField(desc = "实际支付补贴(分)", example = "0")
	private Long actualPayPromotion;

	@SerializedName("shop_coupon")
	@OpField(desc = "店铺优惠(分)", example = "0")
	private Long shopCoupon;

	@SerializedName("platform_service_fee")
	@OpField(desc = "平台服务费(分)", example = "950")
	private Long platformServiceFee;

	@SerializedName("refund")
	@OpField(desc = "订单退款(分)", example = "0")
	private Long refund;

	@SerializedName("commission")
	@OpField(desc = "佣金(分)", example = "0")
	private Long commission;

	@SerializedName("good_learn_channel_fee")
	@OpField(desc = "好好学习分成(分)", example = "0")
	private Long goodLearnChannelFee;

	@SerializedName("colonel_service_fee")
	@OpField(desc = "招商服务费(分)", example = "0")
	private Long colonelServiceFee;

	@SerializedName("shop_refund_loss")
	@OpField(desc = "退佣失败垫付金额(分)", example = "0")
	private Long shopRefundLoss;

	@SerializedName("trade_type")
	@OpField(desc = "结算状态  0:已结算   1:已退款", example = "0")
	private String tradeType;

	@SerializedName("pay_type")
	@OpField(desc = "结算账户类型   1:微信（升级前）, 2:微信，3:支付宝, 4:合众支付 5:聚合账户", example = "1")
	private String payType;

	@SerializedName("flow_type")
	@OpField(desc = "业务类型  1:鲁班广告, 2:值点商城, 3:精选联盟  4:小店自卖", example = "1")
	private String flowType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setShopOrderId(String shopOrderId){
		this.shopOrderId = shopOrderId;
	}

	
	public String getShopOrderId(){
		return this.shopOrderId;
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

	
	public void setOrderTime(String orderTime){
		this.orderTime = orderTime;
	}

	
	public String getOrderTime(){
		return this.orderTime;
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

	
	public void setSettleTime(String settleTime){
		this.settleTime = settleTime;
	}

	
	public String getSettleTime(){
		return this.settleTime;
	}

	
	public void setProductId(String productId){
		this.productId = productId;
	}

	
	public String getProductId(){
		return this.productId;
	}

	
	public void setGoodsCount(Integer goodsCount){
		this.goodsCount = goodsCount;
	}

	
	public Integer getGoodsCount(){
		return this.goodsCount;
	}

	
	public void setTradeTypeDesc(String tradeTypeDesc){
		this.tradeTypeDesc = tradeTypeDesc;
	}

	
	public String getTradeTypeDesc(){
		return this.tradeTypeDesc;
	}

	
	public void setPayTypeDesc(String payTypeDesc){
		this.payTypeDesc = payTypeDesc;
	}

	
	public String getPayTypeDesc(){
		return this.payTypeDesc;
	}

	
	public void setRequestNo(String requestNo){
		this.requestNo = requestNo;
	}

	
	public String getRequestNo(){
		return this.requestNo;
	}

	
	public void setFlowTypeDesc(String flowTypeDesc){
		this.flowTypeDesc = flowTypeDesc;
	}

	
	public String getFlowTypeDesc(){
		return this.flowTypeDesc;
	}

	
	public void setPhaseOrderNo(String phaseOrderNo){
		this.phaseOrderNo = phaseOrderNo;
	}

	
	public String getPhaseOrderNo(){
		return this.phaseOrderNo;
	}

	
	public void setPhaseCnt(Integer phaseCnt){
		this.phaseCnt = phaseCnt;
	}

	
	public Integer getPhaseCnt(){
		return this.phaseCnt;
	}

	
	public void setPhaseId(Integer phaseId){
		this.phaseId = phaseId;
	}

	
	public Integer getPhaseId(){
		return this.phaseId;
	}

	
	public void setTotalIncome(Long totalIncome){
		this.totalIncome = totalIncome;
	}

	
	public Long getTotalIncome(){
		return this.totalIncome;
	}

	
	public void setTotalOutcome(Long totalOutcome){
		this.totalOutcome = totalOutcome;
	}

	
	public Long getTotalOutcome(){
		return this.totalOutcome;
	}

	
	public void setProfit(Long profit){
		this.profit = profit;
	}

	
	public Long getProfit(){
		return this.profit;
	}

	
	public void setSettleAmount(Long settleAmount){
		this.settleAmount = settleAmount;
	}

	
	public Long getSettleAmount(){
		return this.settleAmount;
	}

	
	public void setActualSubsidyAmount(Long actualSubsidyAmount){
		this.actualSubsidyAmount = actualSubsidyAmount;
	}

	
	public Long getActualSubsidyAmount(){
		return this.actualSubsidyAmount;
	}

	
	public void setTotalAmount(Long totalAmount){
		this.totalAmount = totalAmount;
	}

	
	public Long getTotalAmount(){
		return this.totalAmount;
	}

	
	public void setTotalGoodsAmount(Long totalGoodsAmount){
		this.totalGoodsAmount = totalGoodsAmount;
	}

	
	public Long getTotalGoodsAmount(){
		return this.totalGoodsAmount;
	}

	
	public void setPostAmount(Long postAmount){
		this.postAmount = postAmount;
	}

	
	public Long getPostAmount(){
		return this.postAmount;
	}

	
	public void setRealPayAmount(Long realPayAmount){
		this.realPayAmount = realPayAmount;
	}

	
	public Long getRealPayAmount(){
		return this.realPayAmount;
	}

	
	public void setSettledPayAmount(Long settledPayAmount){
		this.settledPayAmount = settledPayAmount;
	}

	
	public Long getSettledPayAmount(){
		return this.settledPayAmount;
	}

	
	public void setPlatformCoupon(Long platformCoupon){
		this.platformCoupon = platformCoupon;
	}

	
	public Long getPlatformCoupon(){
		return this.platformCoupon;
	}

	
	public void setAuthorCoupon(Long authorCoupon){
		this.authorCoupon = authorCoupon;
	}

	
	public Long getAuthorCoupon(){
		return this.authorCoupon;
	}

	
	public void setPayPromotion(Long payPromotion){
		this.payPromotion = payPromotion;
	}

	
	public Long getPayPromotion(){
		return this.payPromotion;
	}

	
	public void setActualPlatformCoupon(Long actualPlatformCoupon){
		this.actualPlatformCoupon = actualPlatformCoupon;
	}

	
	public Long getActualPlatformCoupon(){
		return this.actualPlatformCoupon;
	}

	
	public void setActualAuthorCoupon(Long actualAuthorCoupon){
		this.actualAuthorCoupon = actualAuthorCoupon;
	}

	
	public Long getActualAuthorCoupon(){
		return this.actualAuthorCoupon;
	}

	
	public void setActualPayPromotion(Long actualPayPromotion){
		this.actualPayPromotion = actualPayPromotion;
	}

	
	public Long getActualPayPromotion(){
		return this.actualPayPromotion;
	}

	
	public void setShopCoupon(Long shopCoupon){
		this.shopCoupon = shopCoupon;
	}

	
	public Long getShopCoupon(){
		return this.shopCoupon;
	}

	
	public void setPlatformServiceFee(Long platformServiceFee){
		this.platformServiceFee = platformServiceFee;
	}

	
	public Long getPlatformServiceFee(){
		return this.platformServiceFee;
	}

	
	public void setRefund(Long refund){
		this.refund = refund;
	}

	
	public Long getRefund(){
		return this.refund;
	}

	
	public void setCommission(Long commission){
		this.commission = commission;
	}

	
	public Long getCommission(){
		return this.commission;
	}

	
	public void setGoodLearnChannelFee(Long goodLearnChannelFee){
		this.goodLearnChannelFee = goodLearnChannelFee;
	}

	
	public Long getGoodLearnChannelFee(){
		return this.goodLearnChannelFee;
	}

	
	public void setColonelServiceFee(Long colonelServiceFee){
		this.colonelServiceFee = colonelServiceFee;
	}

	
	public Long getColonelServiceFee(){
		return this.colonelServiceFee;
	}

	
	public void setShopRefundLoss(Long shopRefundLoss){
		this.shopRefundLoss = shopRefundLoss;
	}

	
	public Long getShopRefundLoss(){
		return this.shopRefundLoss;
	}

	
	public void setTradeType(String tradeType){
		this.tradeType = tradeType;
	}

	
	public String getTradeType(){
		return this.tradeType;
	}

	
	public void setPayType(String payType){
		this.payType = payType;
	}

	
	public String getPayType(){
		return this.payType;
	}

	
	public void setFlowType(String flowType){
		this.flowType = flowType;
	}

	
	public String getFlowType(){
		return this.flowType;
	}

}