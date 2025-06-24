package com.doudian.open.api.afterSale_List.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class AftersaleInfo {


	@SerializedName("aftersale_status_to_final_time")
	@OpField(desc = "售后完结时间，完结时间是平台根据商品的类型，售后状态等综合判断生成，当售后单有完结时间返回时售后单不可再做任何操作；未完结售后单的该字段值为0；Unix时间戳：秒", example = "1626753592")
	private Long aftersaleStatusToFinalTime;

	@SerializedName("aftersale_id")
	@OpField(desc = "售后单号", example = "6986853269519810849")
	private String aftersaleId;

	@SerializedName("aftersale_order_type")
	@OpField(desc = "售后订单类型，枚举为-1(历史订单),1(商品单),2(店铺单)", example = "1")
	private Long aftersaleOrderType;

	@SerializedName("aftersale_type")
	@OpField(desc = "售后类型，枚举为0(退货退款),1(已发货仅退款),2(未发货仅退款),3(换货),6(价保),7(补寄)", example = "0")
	private Long aftersaleType;

	@SerializedName("aftersale_status")
	@OpField(desc = "售后状态和请求参数standard_aftersale_status字段对应；3-换货待买家收货；6-待商家同意；7-待买家退货；8-待商家发货；11-待商家二次同意；12-售后成功；14-换货成功；27-商家一次拒绝；28-售后失败；29-商家二次拒绝；", example = "11")
	private Long aftersaleStatus;

	@SerializedName("related_id")
	@OpField(desc = "关联的订单ID", example = "4821780700279174718")
	private String relatedId;

	@SerializedName("apply_time")
	@OpField(desc = "申请时间", example = "1626753592")
	private Long applyTime;

	@SerializedName("update_time")
	@OpField(desc = "最近更新时间", example = "1626860666")
	private Long updateTime;

	@SerializedName("status_deadline")
	@OpField(desc = "当前节点逾期时间", example = "1626926420")
	private Long statusDeadline;

	@SerializedName("refund_amount")
	@OpField(desc = "售后退款金额，单位为分", example = "20")
	private Long refundAmount;

	@SerializedName("refund_post_amount")
	@OpField(desc = "售后退运费金额，单位为分", example = "0")
	private Long refundPostAmount;

	@SerializedName("aftersale_num")
	@OpField(desc = "售后数量", example = "1")
	private Long aftersaleNum;

	@SerializedName("part_type")
	@OpField(desc = "部分退类型", example = "0")
	private Long partType;

	@SerializedName("aftersale_refund_type")
	@OpField(desc = "售后退款类型，枚举为-1(历史数据默认值),0(订单货款/原路退款),1(货到付款线下退款),2(备用金),3(保证金),4(无需退款),5(平台垫付)", example = "0")
	private Long aftersaleRefundType;

	@SerializedName("refund_type")
	@OpField(desc = "退款方式，枚举为1(极速退款助手)、2(售后小助手)、3(售后急速退)、4(闪电退货)", example = "0")
	private Long refundType;

	@SerializedName("arbitrate_status")
	@OpField(desc = "仲裁状态，枚举为0(无仲裁记录),1(仲裁中),2(客服同意),3(客服拒绝),4(待商家举证),5(协商期),255(仲裁结束)", example = "0")
	private Long arbitrateStatus;

	@SerializedName("create_time")
	@OpField(desc = "售后单创建时间", example = "1626753592")
	private Long createTime;

	@SerializedName("refund_tax_amount")
	@OpField(desc = "退税费", example = "0")
	private Long refundTaxAmount;

	@SerializedName("left_urge_sms_count")
	@OpField(desc = "商家剩余发送短信（催用户寄回）次数", example = "0")
	private Long leftUrgeSmsCount;

	@SerializedName("return_logistics_code")
	@OpField(desc = "退货物流单号", example = "XY123123123")
	private String returnLogisticsCode;

	@SerializedName("risk_decision_code")
	@OpField(desc = "风控码", example = "0")
	private Long riskDecisionCode;

	@SerializedName("risk_decision_reason")
	@OpField(desc = "风控理由", example = "")
	private String riskDecisionReason;

	@SerializedName("risk_decision_description")
	@OpField(desc = "风控描述", example = "")
	private String riskDecisionDescription;

	@SerializedName("return_promotion_amount")
	@OpField(desc = "退优惠金额", example = "0")
	private Long returnPromotionAmount;

	@SerializedName("refund_status")
	@OpField(desc = "退款状态；1-待退款;2-退款中;3-退款成功;4-退款失败;5-追缴成功;", example = "1")
	private Long refundStatus;

	@SerializedName("arbitrate_blame")
	@OpField(desc = "仲裁责任方", example = "1:商家责任,2:买家责任,3:双方有责,4:平台责任,5:达人责任")
	private Long arbitrateBlame;

	@SerializedName("exchange_sku_info")
	@OpField(desc = "换货SKU信息", example = "")
	private ExchangeSkuInfo exchangeSkuInfo;

	@SerializedName("return_logistics_company_name")
	@OpField(desc = "退货物流公司名称", example = "顺丰速运")
	private String returnLogisticsCompanyName;

	@SerializedName("exchange_logistics_company_name")
	@OpField(desc = "换货物流公司名称", example = "韵达快递")
	private String exchangeLogisticsCompanyName;

	@SerializedName("remark")
	@OpField(desc = "售后商家备注", example = "买家不想要了")
	private String remark;

	@SerializedName("got_pkg")
	@OpField(desc = "买家是否收到货物，0表示未收到，1表示收到", example = "1")
	private Long gotPkg;

	@SerializedName("order_logistics")
	@OpField(desc = "商家首次发货的正向物流信息", example = "")
	private List<OrderLogisticsItem> orderLogistics;

	@SerializedName("is_agree_refuse_sign")
	@OpField(desc = "是否拒签后退款（1：已同意拒签, 2：未同意拒签）", example = "1")
	private Long isAgreeRefuseSign;

	@SerializedName("reason_second_labels")
	@OpField(desc = "用户申请售后时选择的二级原因标签", example = "")
	private List<ReasonSecondLabelsItem> reasonSecondLabels;

	@SerializedName("aftersale_tags")
	@OpField(desc = "售后标签（含时效延长、风险预警、豁免体验分等标签）标签在平台侧会有更新，标签仅做展示使用，请勿作为系统判断依赖。", example = "")
	private List<AftersaleTagsItem> aftersaleTags;

	@SerializedName("store_id")
	@OpField(desc = "门店ID", example = "3592")
	private Long storeId;

	@SerializedName("store_name")
	@OpField(desc = "门店名称", example = "xxx朝阳分店")
	private String storeName;

	@SerializedName("aftersale_sub_type")
	@OpField(desc = "售后子类型；8001-以换代修。", example = "8001")
	private Long aftersaleSubType;

	@SerializedName("auto_audit_bits")
	@OpField(desc = "自动审核方式：1-发货前极速退；2-小助手自动同意退款；3-发货后极速退；4-闪电退货；5-跨境零秒退；6-云仓拦截自动退；7-小助手自动同意退货；8-小助手自动同意拒签后退款；9-商家代客填写卡片发起售后；10-治理未发货自动同意退款；11-治理已发货自动同意退款；12-商家快递拦截成功自动退款；13-质检商品免审核；14-协商方案自动同意退款；15-平台卡券自动同意退款；16-三方卡券自动同意退款；17-治理一审自动同意退货退款；21-物流异常极速退；27-发货后签收前垫资极速退", example = "[1, 2]")
	private List<Long> autoAuditBits;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAftersaleStatusToFinalTime(Long aftersaleStatusToFinalTime){
		this.aftersaleStatusToFinalTime = aftersaleStatusToFinalTime;
	}

	
	public Long getAftersaleStatusToFinalTime(){
		return this.aftersaleStatusToFinalTime;
	}

	
	public void setAftersaleId(String aftersaleId){
		this.aftersaleId = aftersaleId;
	}

	
	public String getAftersaleId(){
		return this.aftersaleId;
	}

	
	public void setAftersaleOrderType(Long aftersaleOrderType){
		this.aftersaleOrderType = aftersaleOrderType;
	}

	
	public Long getAftersaleOrderType(){
		return this.aftersaleOrderType;
	}

	
	public void setAftersaleType(Long aftersaleType){
		this.aftersaleType = aftersaleType;
	}

	
	public Long getAftersaleType(){
		return this.aftersaleType;
	}

	
	public void setAftersaleStatus(Long aftersaleStatus){
		this.aftersaleStatus = aftersaleStatus;
	}

	
	public Long getAftersaleStatus(){
		return this.aftersaleStatus;
	}

	
	public void setRelatedId(String relatedId){
		this.relatedId = relatedId;
	}

	
	public String getRelatedId(){
		return this.relatedId;
	}

	
	public void setApplyTime(Long applyTime){
		this.applyTime = applyTime;
	}

	
	public Long getApplyTime(){
		return this.applyTime;
	}

	
	public void setUpdateTime(Long updateTime){
		this.updateTime = updateTime;
	}

	
	public Long getUpdateTime(){
		return this.updateTime;
	}

	
	public void setStatusDeadline(Long statusDeadline){
		this.statusDeadline = statusDeadline;
	}

	
	public Long getStatusDeadline(){
		return this.statusDeadline;
	}

	
	public void setRefundAmount(Long refundAmount){
		this.refundAmount = refundAmount;
	}

	
	public Long getRefundAmount(){
		return this.refundAmount;
	}

	
	public void setRefundPostAmount(Long refundPostAmount){
		this.refundPostAmount = refundPostAmount;
	}

	
	public Long getRefundPostAmount(){
		return this.refundPostAmount;
	}

	
	public void setAftersaleNum(Long aftersaleNum){
		this.aftersaleNum = aftersaleNum;
	}

	
	public Long getAftersaleNum(){
		return this.aftersaleNum;
	}

	
	public void setPartType(Long partType){
		this.partType = partType;
	}

	
	public Long getPartType(){
		return this.partType;
	}

	
	public void setAftersaleRefundType(Long aftersaleRefundType){
		this.aftersaleRefundType = aftersaleRefundType;
	}

	
	public Long getAftersaleRefundType(){
		return this.aftersaleRefundType;
	}

	
	public void setRefundType(Long refundType){
		this.refundType = refundType;
	}

	
	public Long getRefundType(){
		return this.refundType;
	}

	
	public void setArbitrateStatus(Long arbitrateStatus){
		this.arbitrateStatus = arbitrateStatus;
	}

	
	public Long getArbitrateStatus(){
		return this.arbitrateStatus;
	}

	
	public void setCreateTime(Long createTime){
		this.createTime = createTime;
	}

	
	public Long getCreateTime(){
		return this.createTime;
	}

	
	public void setRefundTaxAmount(Long refundTaxAmount){
		this.refundTaxAmount = refundTaxAmount;
	}

	
	public Long getRefundTaxAmount(){
		return this.refundTaxAmount;
	}

	
	public void setLeftUrgeSmsCount(Long leftUrgeSmsCount){
		this.leftUrgeSmsCount = leftUrgeSmsCount;
	}

	
	public Long getLeftUrgeSmsCount(){
		return this.leftUrgeSmsCount;
	}

	
	public void setReturnLogisticsCode(String returnLogisticsCode){
		this.returnLogisticsCode = returnLogisticsCode;
	}

	
	public String getReturnLogisticsCode(){
		return this.returnLogisticsCode;
	}

	
	public void setRiskDecisionCode(Long riskDecisionCode){
		this.riskDecisionCode = riskDecisionCode;
	}

	
	public Long getRiskDecisionCode(){
		return this.riskDecisionCode;
	}

	
	public void setRiskDecisionReason(String riskDecisionReason){
		this.riskDecisionReason = riskDecisionReason;
	}

	
	public String getRiskDecisionReason(){
		return this.riskDecisionReason;
	}

	
	public void setRiskDecisionDescription(String riskDecisionDescription){
		this.riskDecisionDescription = riskDecisionDescription;
	}

	
	public String getRiskDecisionDescription(){
		return this.riskDecisionDescription;
	}

	
	public void setReturnPromotionAmount(Long returnPromotionAmount){
		this.returnPromotionAmount = returnPromotionAmount;
	}

	
	public Long getReturnPromotionAmount(){
		return this.returnPromotionAmount;
	}

	
	public void setRefundStatus(Long refundStatus){
		this.refundStatus = refundStatus;
	}

	
	public Long getRefundStatus(){
		return this.refundStatus;
	}

	
	public void setArbitrateBlame(Long arbitrateBlame){
		this.arbitrateBlame = arbitrateBlame;
	}

	
	public Long getArbitrateBlame(){
		return this.arbitrateBlame;
	}

	
	public void setExchangeSkuInfo(ExchangeSkuInfo exchangeSkuInfo){
		this.exchangeSkuInfo = exchangeSkuInfo;
	}

	
	public ExchangeSkuInfo getExchangeSkuInfo(){
		return this.exchangeSkuInfo;
	}

	
	public void setReturnLogisticsCompanyName(String returnLogisticsCompanyName){
		this.returnLogisticsCompanyName = returnLogisticsCompanyName;
	}

	
	public String getReturnLogisticsCompanyName(){
		return this.returnLogisticsCompanyName;
	}

	
	public void setExchangeLogisticsCompanyName(String exchangeLogisticsCompanyName){
		this.exchangeLogisticsCompanyName = exchangeLogisticsCompanyName;
	}

	
	public String getExchangeLogisticsCompanyName(){
		return this.exchangeLogisticsCompanyName;
	}

	
	public void setRemark(String remark){
		this.remark = remark;
	}

	
	public String getRemark(){
		return this.remark;
	}

	
	public void setGotPkg(Long gotPkg){
		this.gotPkg = gotPkg;
	}

	
	public Long getGotPkg(){
		return this.gotPkg;
	}

	
	public void setOrderLogistics(List<OrderLogisticsItem> orderLogistics){
		this.orderLogistics = orderLogistics;
	}

	
	public List<OrderLogisticsItem> getOrderLogistics(){
		return this.orderLogistics;
	}

	
	public void setIsAgreeRefuseSign(Long isAgreeRefuseSign){
		this.isAgreeRefuseSign = isAgreeRefuseSign;
	}

	
	public Long getIsAgreeRefuseSign(){
		return this.isAgreeRefuseSign;
	}

	
	public void setReasonSecondLabels(List<ReasonSecondLabelsItem> reasonSecondLabels){
		this.reasonSecondLabels = reasonSecondLabels;
	}

	
	public List<ReasonSecondLabelsItem> getReasonSecondLabels(){
		return this.reasonSecondLabels;
	}

	
	public void setAftersaleTags(List<AftersaleTagsItem> aftersaleTags){
		this.aftersaleTags = aftersaleTags;
	}

	
	public List<AftersaleTagsItem> getAftersaleTags(){
		return this.aftersaleTags;
	}

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

	
	public void setStoreName(String storeName){
		this.storeName = storeName;
	}

	
	public String getStoreName(){
		return this.storeName;
	}

	
	public void setAftersaleSubType(Long aftersaleSubType){
		this.aftersaleSubType = aftersaleSubType;
	}

	
	public Long getAftersaleSubType(){
		return this.aftersaleSubType;
	}

	
	public void setAutoAuditBits(List<Long> autoAuditBits){
		this.autoAuditBits = autoAuditBits;
	}

	
	public List<Long> getAutoAuditBits(){
		return this.autoAuditBits;
	}

}