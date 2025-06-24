package com.doudian.open.api.order_getSettleBillDetailV3.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DataItem {


	@SerializedName("settle_time")
	@OpField(desc = "结算时间", example = "2021-05-17 11:05:56")
	private String settleTime;

	@SerializedName("request_no")
	@OpField(desc = "结算单号", example = "6945807072718045454")
	private String requestNo;

	@SerializedName("shop_order_id")
	@OpField(desc = "订单号", example = "4778345176320227200")
	private String shopOrderId;

	@SerializedName("order_id")
	@OpField(desc = "子订单号", example = "4778345176320227200")
	private String orderId;

	@SerializedName("settle_amount")
	@OpField(desc = "商家实收（分）", example = "950")
	private Long settleAmount;

	@SerializedName("pay_type_desc")
	@OpField(desc = "货款结算对应的账户类型： “聚合账户”“微信”“支付宝”“微信升级前”“合众支付”等", example = "支付宝")
	private String payTypeDesc;

	@SerializedName("trade_type")
	@OpField(desc = "结算单类型 0 ：已结算 1 ：结算后退款-原路退回 2： 保证金退款-支出退回 3： 结算后退款-非原路退回", example = "0")
	private Integer tradeType;

	@SerializedName("is_contains_refund_before_settle")
	@OpField(desc = "是否包含结算前退款 0：不包含 1：包含", example = "0")
	private Integer isContainsRefundBeforeSettle;

	@SerializedName("order_time")
	@OpField(desc = "下单时间", example = "2021-04-07 11:05:56")
	private String orderTime;

	@SerializedName("product_id")
	@OpField(desc = "商品id", example = "3461567267249244016")
	private String productId;

	@SerializedName("goods_count")
	@OpField(desc = "商品数量", example = "10")
	private Integer goodsCount;

	@SerializedName("flow_type_desc")
	@OpField(desc = "业务类型: 鲁班广告、商城、精选联盟、小店自卖等", example = "小店自卖")
	private String flowTypeDesc;

	@SerializedName("order_type")
	@OpField(desc = "订单类型：普通订单、尾款(尾款已支付)、尾款(已退款)、定金(已退款)、定金(尾款已支付)、定金(尾款未支付)", example = "普通订单")
	private String orderType;

	@SerializedName("total_amount")
	@OpField(desc = "订单总价（分）", example = "950")
	private Long totalAmount;

	@SerializedName("total_goods_amount")
	@OpField(desc = "商品总价（分）", example = "5")
	private Long totalGoodsAmount;

	@SerializedName("post_amount")
	@OpField(desc = "运费（分）", example = "0")
	private Long postAmount;

	@SerializedName("shop_coupon")
	@OpField(desc = "店铺券（分）", example = "0")
	private Long shopCoupon;

	@SerializedName("refund_before_settle")
	@OpField(desc = "结算前退款金额（分） （结算前退货+运费-店铺券）", example = "0")
	private Long refundBeforeSettle;

	@SerializedName("platform_coupon")
	@OpField(desc = "平台补贴（分）", example = "0")
	private Long platformCoupon;

	@SerializedName("author_coupon")
	@OpField(desc = "达人补贴（分）", example = "0")
	private Long authorCoupon;

	@SerializedName("zt_pay_promotion")
	@OpField(desc = "抖音支付补贴（分）", example = "0")
	private Long ztPayPromotion;

	@SerializedName("zr_pay_promotion")
	@OpField(desc = "DOU分期营销补贴（分）", example = "0")
	private Long zrPayPromotion;

	@SerializedName("real_pay_amount")
	@OpField(desc = "用户实付（分）", example = "0")
	private Long realPayAmount;

	@SerializedName("total_income")
	@OpField(desc = "收入合计（分）", example = "10")
	private Long totalIncome;

	@SerializedName("platform_service_fee")
	@OpField(desc = "平台服务费（分）", example = "0")
	private Long platformServiceFee;

	@SerializedName("commission")
	@OpField(desc = "达人佣金（分）", example = "0")
	private Long commission;

	@SerializedName("good_learn_channel_fee")
	@OpField(desc = "渠道分成（分）", example = "0")
	private Long goodLearnChannelFee;

	@SerializedName("colonel_service_fee")
	@OpField(desc = "团长服务费（分）", example = "0")
	private Long colonelServiceFee;

	@SerializedName("channel_promotion_fee")
	@OpField(desc = "直播间站外推广（分）", example = "0")
	private Long channelPromotionFee;

	@SerializedName("other_sharing_amount")
	@OpField(desc = "其他分成（分）", example = "0")
	private Long otherSharingAmount;

	@SerializedName("total_outcome")
	@OpField(desc = "合计支出", example = "0")
	private Long totalOutcome;

	@SerializedName("remark")
	@OpField(desc = "备注", example = "")
	private String remark;

	@SerializedName("packing_amount")
	@OpField(desc = "打包费，单位：分", example = "0")
	private Long packingAmount;

	@SerializedName("free_commission_flag")
	@OpField(desc = "是否免佣，枚举值为“是/否”或为空", example = "是")
	private String freeCommissionFlag;

	@SerializedName("real_free_commission_amount")
	@OpField(desc = "免佣金额，单位：分", example = "0")
	private Long realFreeCommissionAmount;

	@SerializedName("partner_commission")
	@OpField(desc = "服务商佣金（分）", example = "0")
	private Long partnerCommission;

	@SerializedName("old_for_new_promotion")
	@OpField(desc = "以旧换新抵扣（分）", example = "0")
	private Long oldForNewPromotion;

	@SerializedName("bank_promotion")
	@OpField(desc = "银行补贴（分）", example = "0")
	private Long bankPromotion;

	@SerializedName("post_promotion_amount")
	@OpField(desc = "平台补贴运费（分）", example = "0")
	private Long postPromotionAmount;

	@SerializedName("gov_promotion_amount")
	@OpField(desc = "政府补贴平台垫资（分）", example = "0")
	private Long govPromotionAmount;

	@SerializedName("product_name")
	@OpField(desc = "商品名称", example = "商品名称示例")
	private String productName;

	@SerializedName("author_id")
	@OpField(desc = "达人id", example = "1231231231")
	private String authorId;

	@SerializedName("author_name")
	@OpField(desc = "达人名称", example = "达人名称示例")
	private String authorName;

	@SerializedName("gov_promotion_shop_reduce_amount")
	@OpField(desc = "政府补贴商家垫资（分）", example = "0")
	private Long govPromotionShopReduceAmount;

	@SerializedName("other_platform_promotion_amount")
	@OpField(desc = "其他平台补贴（分）", example = "0")
	private Long otherPlatformPromotionAmount;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSettleTime(String settleTime){
		this.settleTime = settleTime;
	}

	
	public String getSettleTime(){
		return this.settleTime;
	}

	
	public void setRequestNo(String requestNo){
		this.requestNo = requestNo;
	}

	
	public String getRequestNo(){
		return this.requestNo;
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

	
	public void setSettleAmount(Long settleAmount){
		this.settleAmount = settleAmount;
	}

	
	public Long getSettleAmount(){
		return this.settleAmount;
	}

	
	public void setPayTypeDesc(String payTypeDesc){
		this.payTypeDesc = payTypeDesc;
	}

	
	public String getPayTypeDesc(){
		return this.payTypeDesc;
	}

	
	public void setTradeType(Integer tradeType){
		this.tradeType = tradeType;
	}

	
	public Integer getTradeType(){
		return this.tradeType;
	}

	
	public void setIsContainsRefundBeforeSettle(Integer isContainsRefundBeforeSettle){
		this.isContainsRefundBeforeSettle = isContainsRefundBeforeSettle;
	}

	
	public Integer getIsContainsRefundBeforeSettle(){
		return this.isContainsRefundBeforeSettle;
	}

	
	public void setOrderTime(String orderTime){
		this.orderTime = orderTime;
	}

	
	public String getOrderTime(){
		return this.orderTime;
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

	
	public void setFlowTypeDesc(String flowTypeDesc){
		this.flowTypeDesc = flowTypeDesc;
	}

	
	public String getFlowTypeDesc(){
		return this.flowTypeDesc;
	}

	
	public void setOrderType(String orderType){
		this.orderType = orderType;
	}

	
	public String getOrderType(){
		return this.orderType;
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

	
	public void setShopCoupon(Long shopCoupon){
		this.shopCoupon = shopCoupon;
	}

	
	public Long getShopCoupon(){
		return this.shopCoupon;
	}

	
	public void setRefundBeforeSettle(Long refundBeforeSettle){
		this.refundBeforeSettle = refundBeforeSettle;
	}

	
	public Long getRefundBeforeSettle(){
		return this.refundBeforeSettle;
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

	
	public void setZtPayPromotion(Long ztPayPromotion){
		this.ztPayPromotion = ztPayPromotion;
	}

	
	public Long getZtPayPromotion(){
		return this.ztPayPromotion;
	}

	
	public void setZrPayPromotion(Long zrPayPromotion){
		this.zrPayPromotion = zrPayPromotion;
	}

	
	public Long getZrPayPromotion(){
		return this.zrPayPromotion;
	}

	
	public void setRealPayAmount(Long realPayAmount){
		this.realPayAmount = realPayAmount;
	}

	
	public Long getRealPayAmount(){
		return this.realPayAmount;
	}

	
	public void setTotalIncome(Long totalIncome){
		this.totalIncome = totalIncome;
	}

	
	public Long getTotalIncome(){
		return this.totalIncome;
	}

	
	public void setPlatformServiceFee(Long platformServiceFee){
		this.platformServiceFee = platformServiceFee;
	}

	
	public Long getPlatformServiceFee(){
		return this.platformServiceFee;
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

	
	public void setChannelPromotionFee(Long channelPromotionFee){
		this.channelPromotionFee = channelPromotionFee;
	}

	
	public Long getChannelPromotionFee(){
		return this.channelPromotionFee;
	}

	
	public void setOtherSharingAmount(Long otherSharingAmount){
		this.otherSharingAmount = otherSharingAmount;
	}

	
	public Long getOtherSharingAmount(){
		return this.otherSharingAmount;
	}

	
	public void setTotalOutcome(Long totalOutcome){
		this.totalOutcome = totalOutcome;
	}

	
	public Long getTotalOutcome(){
		return this.totalOutcome;
	}

	
	public void setRemark(String remark){
		this.remark = remark;
	}

	
	public String getRemark(){
		return this.remark;
	}

	
	public void setPackingAmount(Long packingAmount){
		this.packingAmount = packingAmount;
	}

	
	public Long getPackingAmount(){
		return this.packingAmount;
	}

	
	public void setFreeCommissionFlag(String freeCommissionFlag){
		this.freeCommissionFlag = freeCommissionFlag;
	}

	
	public String getFreeCommissionFlag(){
		return this.freeCommissionFlag;
	}

	
	public void setRealFreeCommissionAmount(Long realFreeCommissionAmount){
		this.realFreeCommissionAmount = realFreeCommissionAmount;
	}

	
	public Long getRealFreeCommissionAmount(){
		return this.realFreeCommissionAmount;
	}

	
	public void setPartnerCommission(Long partnerCommission){
		this.partnerCommission = partnerCommission;
	}

	
	public Long getPartnerCommission(){
		return this.partnerCommission;
	}

	
	public void setOldForNewPromotion(Long oldForNewPromotion){
		this.oldForNewPromotion = oldForNewPromotion;
	}

	
	public Long getOldForNewPromotion(){
		return this.oldForNewPromotion;
	}

	
	public void setBankPromotion(Long bankPromotion){
		this.bankPromotion = bankPromotion;
	}

	
	public Long getBankPromotion(){
		return this.bankPromotion;
	}

	
	public void setPostPromotionAmount(Long postPromotionAmount){
		this.postPromotionAmount = postPromotionAmount;
	}

	
	public Long getPostPromotionAmount(){
		return this.postPromotionAmount;
	}

	
	public void setGovPromotionAmount(Long govPromotionAmount){
		this.govPromotionAmount = govPromotionAmount;
	}

	
	public Long getGovPromotionAmount(){
		return this.govPromotionAmount;
	}

	
	public void setProductName(String productName){
		this.productName = productName;
	}

	
	public String getProductName(){
		return this.productName;
	}

	
	public void setAuthorId(String authorId){
		this.authorId = authorId;
	}

	
	public String getAuthorId(){
		return this.authorId;
	}

	
	public void setAuthorName(String authorName){
		this.authorName = authorName;
	}

	
	public String getAuthorName(){
		return this.authorName;
	}

	
	public void setGovPromotionShopReduceAmount(Long govPromotionShopReduceAmount){
		this.govPromotionShopReduceAmount = govPromotionShopReduceAmount;
	}

	
	public Long getGovPromotionShopReduceAmount(){
		return this.govPromotionShopReduceAmount;
	}

	
	public void setOtherPlatformPromotionAmount(Long otherPlatformPromotionAmount){
		this.otherPlatformPromotionAmount = otherPlatformPromotionAmount;
	}

	
	public Long getOtherPlatformPromotionAmount(){
		return this.otherPlatformPromotionAmount;
	}

}