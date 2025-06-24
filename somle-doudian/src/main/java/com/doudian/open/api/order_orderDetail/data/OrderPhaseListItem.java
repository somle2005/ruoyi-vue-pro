package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderPhaseListItem {


	@SerializedName("phase_order_id")
	@OpField(desc = "阶段单id", example = "4781320682406083640")
	private String phaseOrderId;

	@SerializedName("total_phase")
	@OpField(desc = "总共有几阶段", example = "2")
	private Long totalPhase;

	@SerializedName("current_phase")
	@OpField(desc = "第几阶段", example = "1")
	private Long currentPhase;

	@SerializedName("sku_price")
	@OpField(desc = "sku单价，单位：分", example = "100")
	private Long skuPrice;

	@SerializedName("pay_success")
	@OpField(desc = "是否支付成功", example = "true")
	private Boolean paySuccess;

	@SerializedName("sku_order_id")
	@OpField(desc = "店铺子订单号，抖店平台生成，平台下唯一；注意：一笔订单下有一个子订单和父订单单号相同。", example = "4781320682406083640")
	private String skuOrderId;

	@SerializedName("campaign_id")
	@OpField(desc = "活动id", example = "3214324342342")
	private String campaignId;

	@SerializedName("phase_payable_price")
	@OpField(desc = "阶段价格：定金单价、尾款单价，单位：分", example = "100")
	private Long phasePayablePrice;

	@SerializedName("phase_pay_type")
	@OpField(desc = "支付类型:0-货到付款, 1-微信, 2-支付宝, 3-小程序, 4-银行卡, 5-余额, 7-无需支付, 8-放心花(信用支付), 9-新卡支付", example = "1")
	private Long phasePayType;

	@SerializedName("phase_open_time")
	@OpField(desc = "阶段单开始开启支付时间，时间戳", example = "1617355413")
	private Long phaseOpenTime;

	@SerializedName("phase_pay_time")
	@OpField(desc = "阶段单支付成功时间，时间戳", example = "1617355413")
	private Long phasePayTime;

	@SerializedName("phase_close_time")
	@OpField(desc = "阶段单关闭时间，时间戳", example = "1617355413")
	private Long phaseCloseTime;

	@SerializedName("channel_payment_no")
	@OpField(desc = "渠道支付订单号", example = "PAY34243247134325")
	private String channelPaymentNo;

	@SerializedName("phase_order_amount")
	@OpField(desc = "阶段单总金额，单位分，为订单金额phase_sum_amount+运费phase_post_amount,为支付金额phase_pay_amount+优惠金额phase_promotion_amoun", example = "100")
	private Long phaseOrderAmount;

	@SerializedName("phase_sum_amount")
	@OpField(desc = "阶段单订单金额，单位分", example = "100")
	private Long phaseSumAmount;

	@SerializedName("phase_post_amount")
	@OpField(desc = "阶段单运费金额，单位分", example = "100")
	private Long phasePostAmount;

	@SerializedName("phase_pay_amount")
	@OpField(desc = "阶段单用户实际支付金额，单位分", example = "100")
	private Long phasePayAmount;

	@SerializedName("phase_promotion_amount")
	@OpField(desc = "阶段单总优惠金额，单位分", example = "100")
	private Long phasePromotionAmount;

	@SerializedName("current_phase_status_desc")
	@OpField(desc = "阶段状态描述", example = "已开始但未支付")
	private String currentPhaseStatusDesc;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPhaseOrderId(String phaseOrderId){
		this.phaseOrderId = phaseOrderId;
	}

	
	public String getPhaseOrderId(){
		return this.phaseOrderId;
	}

	
	public void setTotalPhase(Long totalPhase){
		this.totalPhase = totalPhase;
	}

	
	public Long getTotalPhase(){
		return this.totalPhase;
	}

	
	public void setCurrentPhase(Long currentPhase){
		this.currentPhase = currentPhase;
	}

	
	public Long getCurrentPhase(){
		return this.currentPhase;
	}

	
	public void setSkuPrice(Long skuPrice){
		this.skuPrice = skuPrice;
	}

	
	public Long getSkuPrice(){
		return this.skuPrice;
	}

	
	public void setPaySuccess(Boolean paySuccess){
		this.paySuccess = paySuccess;
	}

	
	public Boolean getPaySuccess(){
		return this.paySuccess;
	}

	
	public void setSkuOrderId(String skuOrderId){
		this.skuOrderId = skuOrderId;
	}

	
	public String getSkuOrderId(){
		return this.skuOrderId;
	}

	
	public void setCampaignId(String campaignId){
		this.campaignId = campaignId;
	}

	
	public String getCampaignId(){
		return this.campaignId;
	}

	
	public void setPhasePayablePrice(Long phasePayablePrice){
		this.phasePayablePrice = phasePayablePrice;
	}

	
	public Long getPhasePayablePrice(){
		return this.phasePayablePrice;
	}

	
	public void setPhasePayType(Long phasePayType){
		this.phasePayType = phasePayType;
	}

	
	public Long getPhasePayType(){
		return this.phasePayType;
	}

	
	public void setPhaseOpenTime(Long phaseOpenTime){
		this.phaseOpenTime = phaseOpenTime;
	}

	
	public Long getPhaseOpenTime(){
		return this.phaseOpenTime;
	}

	
	public void setPhasePayTime(Long phasePayTime){
		this.phasePayTime = phasePayTime;
	}

	
	public Long getPhasePayTime(){
		return this.phasePayTime;
	}

	
	public void setPhaseCloseTime(Long phaseCloseTime){
		this.phaseCloseTime = phaseCloseTime;
	}

	
	public Long getPhaseCloseTime(){
		return this.phaseCloseTime;
	}

	
	public void setChannelPaymentNo(String channelPaymentNo){
		this.channelPaymentNo = channelPaymentNo;
	}

	
	public String getChannelPaymentNo(){
		return this.channelPaymentNo;
	}

	
	public void setPhaseOrderAmount(Long phaseOrderAmount){
		this.phaseOrderAmount = phaseOrderAmount;
	}

	
	public Long getPhaseOrderAmount(){
		return this.phaseOrderAmount;
	}

	
	public void setPhaseSumAmount(Long phaseSumAmount){
		this.phaseSumAmount = phaseSumAmount;
	}

	
	public Long getPhaseSumAmount(){
		return this.phaseSumAmount;
	}

	
	public void setPhasePostAmount(Long phasePostAmount){
		this.phasePostAmount = phasePostAmount;
	}

	
	public Long getPhasePostAmount(){
		return this.phasePostAmount;
	}

	
	public void setPhasePayAmount(Long phasePayAmount){
		this.phasePayAmount = phasePayAmount;
	}

	
	public Long getPhasePayAmount(){
		return this.phasePayAmount;
	}

	
	public void setPhasePromotionAmount(Long phasePromotionAmount){
		this.phasePromotionAmount = phasePromotionAmount;
	}

	
	public Long getPhasePromotionAmount(){
		return this.phasePromotionAmount;
	}

	
	public void setCurrentPhaseStatusDesc(String currentPhaseStatusDesc){
		this.currentPhaseStatusDesc = currentPhaseStatusDesc;
	}

	
	public String getCurrentPhaseStatusDesc(){
		return this.currentPhaseStatusDesc;
	}

}