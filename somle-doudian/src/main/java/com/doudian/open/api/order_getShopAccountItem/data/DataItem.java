package com.doudian.open.api.order_getShopAccountItem.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DataItem {


	@SerializedName("bill_time")
	@OpField(desc = "动账时间", example = "2021-10-01 10:10:11")
	private String billTime;

	@SerializedName("fund_flow")
	@OpField(desc = "动账方向  0:入账 1:出账", example = "1")
	private Integer fundFlow;

	@SerializedName("fund_flow_desc")
	@OpField(desc = "动账方向描述  出账、入账", example = "出账")
	private String fundFlowDesc;

	@SerializedName("account_amount")
	@OpField(desc = "动账金额(分)", example = "96")
	private Long accountAmount;

	@SerializedName("account_bill_desc")
	@OpField(desc = "动账摘要", example = "订单结算")
	private String accountBillDesc;

	@SerializedName("account_bill_desc_tag")
	@OpField(desc = "动账摘要 0：其他 1：达人带货佣金 2：达人佣金退款 3：订单结算 4：部分结算 5：运费单结算 6：服务费返还 7：平台补贴扣回 8：退款失败退票 9：结算重复扣款调账 10：保证金退款 11：提现 12：提现退票 13：极速退款分账 14：小额打款(原因:补差价) 15：小额打款(原因:其他) 16：小额打款(原因:商品补偿) 17：小额打款(原因:运费补偿) 18：小额打款退票 19：已退款 20：保费扣除（x笔保单扣费，明细详见保费扣除明细） 21：支付BIC服务费 22：BIC服务费退票  23: 原路退", example = "3")
	private Integer accountBillDescTag;

	@SerializedName("biz_type")
	@OpField(desc = "计费类型  0:全部 1:鲁班广告 2:精选联盟 3:值点商城 4:小店自卖 5:橙子建站 6:POI 7:抖+ 8:穿山甲 9:服务市场 10:服务市场外包客服 11:学浪", example = "1")
	private Integer bizType;

	@SerializedName("biz_type_desc")
	@OpField(desc = "计费类型描述", example = "鲁班广告")
	private String bizTypeDesc;

	@SerializedName("order_id")
	@OpField(desc = "订单号", example = "4847151209529677080")
	private String orderId;

	@SerializedName("shop_order_id")
	@OpField(desc = "店铺单号", example = "4847151209529677080")
	private String shopOrderId;

	@SerializedName("after_sale_service_no")
	@OpField(desc = "【商家无需使用】售后编号非售后接口的售后单id；该字段为账单售后编号id；", example = "SS7015036721667375372")
	private String afterSaleServiceNo;

	@SerializedName("business_order_create_time")
	@OpField(desc = "下单时间", example = "2021-09-26 20:46:16")
	private String businessOrderCreateTime;

	@SerializedName("product_id")
	@OpField(desc = "商品ID", example = "3494738440426276563")
	private String productId;

	@SerializedName("pay_amount")
	@OpField(desc = "订单实付应结，单位：分；只包含用户实际支付的金额，不含各类补贴（如：平台补贴、达人补贴、支付补贴等）", example = "100")
	private Long payAmount;

	@SerializedName("promotion_amount")
	@OpField(desc = "实际平台补贴(分)", example = "0")
	private Long promotionAmount;

	@SerializedName("refund_amount")
	@OpField(desc = "订单退款(分)", example = "0")
	private Long refundAmount;

	@SerializedName("platform_service_fee")
	@OpField(desc = "平台服务费(分)", example = "-3")
	private Long platformServiceFee;

	@SerializedName("commission")
	@OpField(desc = "佣金(分)", example = "-1")
	private Long commission;

	@SerializedName("channel_fee")
	@OpField(desc = "渠道分成(分)", example = "0")
	private Long channelFee;

	@SerializedName("colonel_service_fee")
	@OpField(desc = "招商服务费(分)", example = "0")
	private Long colonelServiceFee;

	@SerializedName("account_type")
	@OpField(desc = "动账账户  1: 微信 2:支付宝 3:合众支付 4:聚合支付", example = "1")
	private Integer accountType;

	@SerializedName("account_type_desc")
	@OpField(desc = "动账账户", example = "微信")
	private String accountTypeDesc;

	@SerializedName("author_coupon_subsidy")
	@OpField(desc = "实际达人补贴(分)", example = "0")
	private Long authorCouponSubsidy;

	@SerializedName("post_amount")
	@OpField(desc = "运费(分)", example = "0")
	private Long postAmount;

	@SerializedName("account_trade_no")
	@OpField(desc = "动账流水号(唯一)", example = "AS202110050707321602785799467_IN")
	private String accountTradeNo;

	@SerializedName("order_type")
	@OpField(desc = "订单类型  0：普通订单  1：定金(已退款) 2：定金(尾款已支付) 3：定金(尾款未支付) 4：尾款(尾款已支付) 5：尾款(已退款)", example = "0")
	private Integer orderType;

	@SerializedName("order_type_desc")
	@OpField(desc = "订单类型描述", example = "普通订单")
	private String orderTypeDesc;

	@SerializedName("actual_zt_pay_promotion")
	@OpField(desc = "实际抖音支付补贴(分)", example = "0")
	private Long actualZtPayPromotion;

	@SerializedName("actual_zr_pay_promotion")
	@OpField(desc = "实际DOU分期营销补贴(分)", example = "0")
	private Long actualZrPayPromotion;

	@SerializedName("channel_promotion_fee")
	@OpField(desc = "直播间站外推广(分)", example = "0")
	private Long channelPromotionFee;

	@SerializedName("other_sharing_amount")
	@OpField(desc = "其他分成金额(分)", example = "0")
	private Long otherSharingAmount;

	@SerializedName("remark")
	@OpField(desc = "备注", example = "无")
	private String remark;

	@SerializedName("shop_id")
	@OpField(desc = "店铺id", example = "12344")
	private String shopId;

	@SerializedName("trans_scene")
	@OpField(desc = "动账场景", example = "消费者赔付")
	private String transScene;

	@SerializedName("trans_scene_tag")
	@OpField(desc = "动账场景 0:其他 1:消费者赔付 2:小额打款 3:判罚扣款 4:物流赔付 5:充值保证金 6:权益保险 7:欠票扣款-商家开票 8:公益捐款 9:上门取件运费 10:供应链QIC费用 11:抖音支付与商家联合补贴营销活动 12:抖音月付与商家联合补贴营销活动 13:抖音月付与商家联合贴息活动 14:放心借·贷款还款 15:人工调账 16:提前收款 17:充值千川广告费 18:营销费用-评价有礼 19:年框返点 20:抖店货款充值云仓服务账户 21:供应链平台代发费用 22:退款-结算后退款-退用户 23:退款-订单退款触发-退补贴 24:退款-价保补差退回 25:退款-退转付扣减商家货款 26:退款-极速退二阶段商家资金回补 27:退款-商家赔付扣减商家货款 28:退款-极速退二次售后-退用户 29:上门取件平台分佣 30:货款结算入账 31:货款完结分账-执照注销场景 32:保证金垫付退款结算分账 33:福袋业务结算入账 34:退款-订单退款触发-分账 35:退款-订单退款触发-退分账 36:退款-价保补差 37:退款-退款失败资金退回 38:退款-赔付失败资金退回 39:上门取件结算入账 40:上门取件保司理赔金 41:上门取件平台激励金 42:上门取件平台改派补贴 43:佣金入账 44:提现 45:提现退票 46:买贵赔-平台转账 47:买贵赔-退回平台 48:以旧换新补贴追缴用户退回平台 49:以旧换新商户红包补贴发放 50:以旧换新商户红包补贴退回 51:超期自动结算 52:超期自动结算其他方分账 53:平台返现/返券活动追缴用户退回平台 54:维修服务费用 55:平台赔付 56:抖音电商生鲜官方保障-服务费扣款 57:抖音电商生鲜官方保障-售后退赔费用平台补偿 58:消费者售后退赔-商家垫付后平台补偿 59:国补SN拍照服务", example = "1")
	private Integer transSceneTag;

	@SerializedName("free_commission_flag")
	@OpField(desc = "是否免佣, 枚举值为是/否或为空", example = "是")
	private String freeCommissionFlag;

	@SerializedName("real_free_commission_amount")
	@OpField(desc = "免佣金额(分)", example = "0")
	private Long realFreeCommissionAmount;

	@SerializedName("bank_pay_promotion_amount")
	@OpField(desc = "银行补贴(分)", example = "0")
	private Long bankPayPromotionAmount;

	@SerializedName("recycler_amount")
	@OpField(desc = "以旧换新抵扣(分)", example = "0")
	private Long recyclerAmount;

	@SerializedName("post_promotion_amount")
	@OpField(desc = "平台补贴运费(分)", example = "0")
	private Long postPromotionAmount;

	@SerializedName("partner_commission")
	@OpField(desc = "服务商佣金(分)", example = "0")
	private Long partnerCommission;

	@SerializedName("gov_promotion_amount")
	@OpField(desc = "政府补贴平台垫资(分)", example = "0")
	private Long govPromotionAmount;

	@SerializedName("product_name")
	@OpField(desc = "商品名称", example = "商品名称示例")
	private String productName;

	@SerializedName("author_id")
	@OpField(desc = "达人id", example = "123123123")
	private String authorId;

	@SerializedName("author_name")
	@OpField(desc = "达人名称", example = "达人名称示例")
	private String authorName;

	@SerializedName("other_platform_promotion_amount")
	@OpField(desc = "其他平台补贴(分)", example = "0")
	private Long otherPlatformPromotionAmount;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBillTime(String billTime){
		this.billTime = billTime;
	}

	
	public String getBillTime(){
		return this.billTime;
	}

	
	public void setFundFlow(Integer fundFlow){
		this.fundFlow = fundFlow;
	}

	
	public Integer getFundFlow(){
		return this.fundFlow;
	}

	
	public void setFundFlowDesc(String fundFlowDesc){
		this.fundFlowDesc = fundFlowDesc;
	}

	
	public String getFundFlowDesc(){
		return this.fundFlowDesc;
	}

	
	public void setAccountAmount(Long accountAmount){
		this.accountAmount = accountAmount;
	}

	
	public Long getAccountAmount(){
		return this.accountAmount;
	}

	
	public void setAccountBillDesc(String accountBillDesc){
		this.accountBillDesc = accountBillDesc;
	}

	
	public String getAccountBillDesc(){
		return this.accountBillDesc;
	}

	
	public void setAccountBillDescTag(Integer accountBillDescTag){
		this.accountBillDescTag = accountBillDescTag;
	}

	
	public Integer getAccountBillDescTag(){
		return this.accountBillDescTag;
	}

	
	public void setBizType(Integer bizType){
		this.bizType = bizType;
	}

	
	public Integer getBizType(){
		return this.bizType;
	}

	
	public void setBizTypeDesc(String bizTypeDesc){
		this.bizTypeDesc = bizTypeDesc;
	}

	
	public String getBizTypeDesc(){
		return this.bizTypeDesc;
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

	
	public void setShopOrderId(String shopOrderId){
		this.shopOrderId = shopOrderId;
	}

	
	public String getShopOrderId(){
		return this.shopOrderId;
	}

	
	public void setAfterSaleServiceNo(String afterSaleServiceNo){
		this.afterSaleServiceNo = afterSaleServiceNo;
	}

	
	public String getAfterSaleServiceNo(){
		return this.afterSaleServiceNo;
	}

	
	public void setBusinessOrderCreateTime(String businessOrderCreateTime){
		this.businessOrderCreateTime = businessOrderCreateTime;
	}

	
	public String getBusinessOrderCreateTime(){
		return this.businessOrderCreateTime;
	}

	
	public void setProductId(String productId){
		this.productId = productId;
	}

	
	public String getProductId(){
		return this.productId;
	}

	
	public void setPayAmount(Long payAmount){
		this.payAmount = payAmount;
	}

	
	public Long getPayAmount(){
		return this.payAmount;
	}

	
	public void setPromotionAmount(Long promotionAmount){
		this.promotionAmount = promotionAmount;
	}

	
	public Long getPromotionAmount(){
		return this.promotionAmount;
	}

	
	public void setRefundAmount(Long refundAmount){
		this.refundAmount = refundAmount;
	}

	
	public Long getRefundAmount(){
		return this.refundAmount;
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

	
	public void setChannelFee(Long channelFee){
		this.channelFee = channelFee;
	}

	
	public Long getChannelFee(){
		return this.channelFee;
	}

	
	public void setColonelServiceFee(Long colonelServiceFee){
		this.colonelServiceFee = colonelServiceFee;
	}

	
	public Long getColonelServiceFee(){
		return this.colonelServiceFee;
	}

	
	public void setAccountType(Integer accountType){
		this.accountType = accountType;
	}

	
	public Integer getAccountType(){
		return this.accountType;
	}

	
	public void setAccountTypeDesc(String accountTypeDesc){
		this.accountTypeDesc = accountTypeDesc;
	}

	
	public String getAccountTypeDesc(){
		return this.accountTypeDesc;
	}

	
	public void setAuthorCouponSubsidy(Long authorCouponSubsidy){
		this.authorCouponSubsidy = authorCouponSubsidy;
	}

	
	public Long getAuthorCouponSubsidy(){
		return this.authorCouponSubsidy;
	}

	
	public void setPostAmount(Long postAmount){
		this.postAmount = postAmount;
	}

	
	public Long getPostAmount(){
		return this.postAmount;
	}

	
	public void setAccountTradeNo(String accountTradeNo){
		this.accountTradeNo = accountTradeNo;
	}

	
	public String getAccountTradeNo(){
		return this.accountTradeNo;
	}

	
	public void setOrderType(Integer orderType){
		this.orderType = orderType;
	}

	
	public Integer getOrderType(){
		return this.orderType;
	}

	
	public void setOrderTypeDesc(String orderTypeDesc){
		this.orderTypeDesc = orderTypeDesc;
	}

	
	public String getOrderTypeDesc(){
		return this.orderTypeDesc;
	}

	
	public void setActualZtPayPromotion(Long actualZtPayPromotion){
		this.actualZtPayPromotion = actualZtPayPromotion;
	}

	
	public Long getActualZtPayPromotion(){
		return this.actualZtPayPromotion;
	}

	
	public void setActualZrPayPromotion(Long actualZrPayPromotion){
		this.actualZrPayPromotion = actualZrPayPromotion;
	}

	
	public Long getActualZrPayPromotion(){
		return this.actualZrPayPromotion;
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

	
	public void setRemark(String remark){
		this.remark = remark;
	}

	
	public String getRemark(){
		return this.remark;
	}

	
	public void setShopId(String shopId){
		this.shopId = shopId;
	}

	
	public String getShopId(){
		return this.shopId;
	}

	
	public void setTransScene(String transScene){
		this.transScene = transScene;
	}

	
	public String getTransScene(){
		return this.transScene;
	}

	
	public void setTransSceneTag(Integer transSceneTag){
		this.transSceneTag = transSceneTag;
	}

	
	public Integer getTransSceneTag(){
		return this.transSceneTag;
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

	
	public void setBankPayPromotionAmount(Long bankPayPromotionAmount){
		this.bankPayPromotionAmount = bankPayPromotionAmount;
	}

	
	public Long getBankPayPromotionAmount(){
		return this.bankPayPromotionAmount;
	}

	
	public void setRecyclerAmount(Long recyclerAmount){
		this.recyclerAmount = recyclerAmount;
	}

	
	public Long getRecyclerAmount(){
		return this.recyclerAmount;
	}

	
	public void setPostPromotionAmount(Long postPromotionAmount){
		this.postPromotionAmount = postPromotionAmount;
	}

	
	public Long getPostPromotionAmount(){
		return this.postPromotionAmount;
	}

	
	public void setPartnerCommission(Long partnerCommission){
		this.partnerCommission = partnerCommission;
	}

	
	public Long getPartnerCommission(){
		return this.partnerCommission;
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

	
	public void setOtherPlatformPromotionAmount(Long otherPlatformPromotionAmount){
		this.otherPlatformPromotionAmount = otherPlatformPromotionAmount;
	}

	
	public Long getOtherPlatformPromotionAmount(){
		return this.otherPlatformPromotionAmount;
	}

}