package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class AfterSaleInfo {


	@SerializedName("government_channel_subsidy_amount")
	@OpField(desc = "政府渠道补贴金额", example = "100")
	private Long governmentChannelSubsidyAmount;

	@SerializedName("kol_post_discount_return_amount")
	@OpField(desc = "达人回收运费补贴", example = "100")
	private String kolPostDiscountReturnAmount;

	@SerializedName("shop_post_discount_return_amount")
	@OpField(desc = "商家回收运费补贴", example = "100")
	private Long shopPostDiscountReturnAmount;

	@SerializedName("after_sale_id")
	@OpField(desc = "售后单ID", example = "6965315853751632172")
	private Long afterSaleId;

	@SerializedName("after_sale_status")
	@OpField(desc = "售后状态：6-售后申请；7-售后退货中；8-【补寄维修返回：售后待商家发货】；11-售后已发货；12-售后成功；13-【换货补寄维修返回：售后商家已发货，待用户收货】； 14-【换货补寄维修返回：售后用户已收货】 ；27-拒绝售后申请；28-售后失败；29-售后退货拒绝；51-订单取消成功；53-逆向交易已完成；", example = "6")
	private Long afterSaleStatus;

	@SerializedName("after_sale_status_desc")
	@OpField(desc = "售后状态文案", example = "售后成功")
	private String afterSaleStatusDesc;

	@SerializedName("refund_type")
	@OpField(desc = "退款方式", example = "无需退款")
	private Long refundType;

	@SerializedName("refund_type_text")
	@OpField(desc = "退款方式文案", example = "无需退款")
	private String refundTypeText;

	@SerializedName("refund_status")
	@OpField(desc = "退款状态;1-待退款;2-退款中;3-退款成功;4退款失败;5追缴成功;", example = "1")
	private Long refundStatus;

	@SerializedName("refund_total_amount")
	@OpField(desc = "售后总金额（含运费）", example = "1000")
	private Long refundTotalAmount;

	@SerializedName("refund_post_amount")
	@OpField(desc = "售后运费", example = "10")
	private Long refundPostAmount;

	@SerializedName("refund_promotion_amount")
	@OpField(desc = "退款补贴总金额（此字段只有退款成功后才会记录实际支付补贴回收的金额）", example = "10")
	private Long refundPromotionAmount;

	@SerializedName("apply_time")
	@OpField(desc = "售后单申请时间", example = "1735660800")
	private Long applyTime;

	@SerializedName("update_time")
	@OpField(desc = "售后单更新时间", example = "1735660800")
	private Long updateTime;

	@SerializedName("reason")
	@OpField(desc = "申请原因", example = "无理由退款")
	private String reason;

	@SerializedName("reason_code")
	@OpField(desc = "原因码；通过【afterSale/rejectReasonCodeList】接口获取", example = "2")
	private Long reasonCode;

	@SerializedName("after_sale_type")
	@OpField(desc = "售后类型： 0-售后退货退款；1-售后仅退款；2-发货前退款；3-换货；4-系统取消；5-用户取消；6-价保；7-补寄；8-维修", example = "0")
	private Long afterSaleType;

	@SerializedName("after_sale_type_text")
	@OpField(desc = "售后单类型文案", example = "补寄")
	private String afterSaleTypeText;

	@SerializedName("reason_remark")
	@OpField(desc = "申请描述", example = "不喜欢这件商品")
	private String reasonRemark;

	@SerializedName("evidence")
	@OpField(desc = "买家申请退款图片凭证；仅支持图片，最大返回8张图片。", example = "[ http://p6-aftersale-sign.ecombdimg.com/douyin-user-image-file/869bed93812154773403174c5feae63c~tplv-51d71q3p2z-q75-jpeg.jpeg?x-expires=1676015949u0026x-signature=R%2Fbr7Gcl3s2Opfboss66qdY2CWc%3D]")
	private List<String> evidence;

	@SerializedName("after_sale_apply_count")
	@OpField(desc = "用户申请售后件数", example = "1")
	private Long afterSaleApplyCount;

	@SerializedName("need_return_count")
	@OpField(desc = "用户需退回件数, 数值为用户申请售后件数 - 商家未发货件数", example = "1")
	private Long needReturnCount;

	@SerializedName("deduction_amount")
	@OpField(desc = "平台需要回收的金额（分）", example = "10000")
	private Long deductionAmount;

	@SerializedName("disable_coupon_id")
	@OpField(desc = "作废的券ID", example = "12345")
	private String disableCouponId;

	@SerializedName("platform_discount_return_amount")
	@OpField(desc = "平台优惠退回金额", example = "100")
	private Long platformDiscountReturnAmount;

	@SerializedName("platform_discount_return_status")
	@OpField(desc = "[字段无效]平台优惠退回状态，枚举：0:待退补贴；1:退补贴成功；2:退补贴失败", example = "1")
	private Long platformDiscountReturnStatus;

	@SerializedName("kol_discount_return_amount")
	@OpField(desc = "达人优惠退回金额", example = "100")
	private Long kolDiscountReturnAmount;

	@SerializedName("kol_discount_return_status")
	@OpField(desc = "达人优惠退回状态，枚举：0:待退补贴；1:退补贴成功；2:退补贴失败", example = "1")
	private Long kolDiscountReturnStatus;

	@SerializedName("post_receiver")
	@OpField(desc = "换货、补寄时的收货人名字（只有换货、补寄时，这个字段才会有值），此字段已加密，使用前需要解密", example = "张三")
	private String postReceiver;

	@SerializedName("encrypt_post_receiver")
	@OpField(desc = "换货、补寄时的收货人名字（只有换货、补寄时，这个字段才会有值），此字段已加密，使用前需要解密", example = "张三")
	private String encryptPostReceiver;

	@SerializedName("post_tel_sec")
	@OpField(desc = "换货、补寄时的收货人的联系电话（只有换货、补寄时，这个字段才会有值），此字段已加密，使用前需要解密", example = "18740098531")
	private String postTelSec;

	@SerializedName("encrypt_post_tel_sec")
	@OpField(desc = "换货、补寄时的收货人的联系电话（只有换货、补寄时，这个字段才会有值），此字段已加密，使用前需要解密", example = "18740098531")
	private String encryptPostTelSec;

	@SerializedName("post_address")
	@OpField(desc = "换货、补寄时的收货四级地址（只有换货、补寄时，这个字段才会有值）", example = "")
	private PostAddress postAddress;

	@SerializedName("risk_decsison_code")
	@OpField(desc = "物流异常风控编码", example = "1")
	private Long riskDecsisonCode;

	@SerializedName("risk_decsison_reason")
	@OpField(desc = "物流异常风控理由", example = "多个售后单同一单号")
	private String riskDecsisonReason;

	@SerializedName("risk_decsison_description")
	@OpField(desc = "物流异常风控描述", example = "退货物流可能存在异常，多个售后单物流单号一致，请仔细核对或与买家核实后尽快处理。")
	private String riskDecsisonDescription;

	@SerializedName("return_address")
	@OpField(desc = "退货地址", example = "")
	private ReturnAddress returnAddress;

	@SerializedName("real_refund_amount")
	@OpField(desc = "实际退款金额;单位：分（此字段只有退款成功后才会记录实际减去支付补贴回收的金额）", example = "300")
	private Long realRefundAmount;

	@SerializedName("got_pkg")
	@OpField(desc = "买家是否收到货，0-表示未收到货；1-表示收到货", example = "1")
	private Long gotPkg;

	@SerializedName("status_deadline")
	@OpField(desc = "逾期时间", example = "1735660800")
	private Long statusDeadline;

	@SerializedName("return_address_id")
	@OpField(desc = "退货地址ID", example = "123123")
	private Long returnAddressId;

	@SerializedName("exchange_sku_info")
	@OpField(desc = "换货SKU信息", example = "")
	private ExchangeSkuInfo exchangeSkuInfo;

	@SerializedName("post_discount_return_amount")
	@OpField(desc = "平台回收运费补贴", example = "100")
	private Long postDiscountReturnAmount;

	@SerializedName("post_discount_return_status")
	@OpField(desc = "运费优惠退回状态，枚举：0:待退补贴；1:退补贴成功；2:退补贴失败", example = "1")
	private Long postDiscountReturnStatus;

	@SerializedName("part_type")
	@OpField(desc = "部分退状态，0为全额退款，1为部分退", example = "1")
	private Long partType;

	@SerializedName("reason_second_labels")
	@OpField(desc = "用户申请售后选择的二级原因标签", example = "")
	private List<ReasonSecondLabelsItem> reasonSecondLabels;

	@SerializedName("refund_voucher_num")
	@OpField(desc = "卡券商品申请退款的张数", example = "1")
	private Long refundVoucherNum;

	@SerializedName("refund_voucher_times")
	@OpField(desc = "多次券商品申请退款的次数，对于单次券，此字段值与refund_voucher_num相同", example = "3")
	private Long refundVoucherTimes;

	@SerializedName("gold_coin_return_amount")
	@OpField(desc = "退金币金额", example = "10")
	private Long goldCoinReturnAmount;

	@SerializedName("refund_fail_reason")
	@OpField(desc = "退款失败文案", example = "用户账户异常，平台处理中")
	private String refundFailReason;

	@SerializedName("aftersale_tags")
	@OpField(desc = "售后标签", example = "")
	private List<AftersaleTagsItem> aftersaleTags;

	@SerializedName("store_id")
	@OpField(desc = "门店ID", example = "121323")
	private String storeId;

	@SerializedName("store_name")
	@OpField(desc = "门店名称", example = "海底捞昌阳店")
	private String storeName;

	@SerializedName("after_sale_order_type")
	@OpField(desc = "售后订单类型，枚举为-1(历史订单),1(商品单),2(店铺单)", example = "1")
	private Long afterSaleOrderType;

	@SerializedName("refund_packing_charge_amount")
	@OpField(desc = "售后打包费退款金额，单位：分，商家退给用户打包费后，该字段则有值；仅小时达店铺使用；", example = "100")
	private Long refundPackingChargeAmount;

	@SerializedName("shop_discount_return_amount")
	@OpField(desc = "商家优惠退回金额（包含供应商优惠退回金额）", example = "10")
	private Long shopDiscountReturnAmount;

	@SerializedName("after_sale_sub_type")
	@OpField(desc = "售后子类型：8001-以换代修", example = "8001")
	private Long afterSaleSubType;

	@SerializedName("agree_refuse_sign")
	@OpField(desc = "商家是否同意拒签后退款（0-默认值；1-同意拒签后退款；2-不同意拒签后退款；257-拒签上标；258-拒签下标）", example = "1")
	private Long agreeRefuseSign;

	@SerializedName("apply_role")
	@OpField(desc = "售后申请角色：1-买家；2-商家；3-客服；4-系统", example = "1")
	private Long applyRole;

	@SerializedName("refund_time")
	@OpField(desc = "退款成功时间，即平台最后原路退回金额到用户账户的成功时间，Unix时间戳：秒", example = "1735660800")
	private Long refundTime;

	@SerializedName("aftersale_status_to_final_time")
	@OpField(desc = "售后完结时间，完结时间是平台根据商品的类型，售后状态等综合判断生成，当售后单有完结时间返回时售后单不可再做做任何操作；未完结售后单的该字段值为0；Unix时间戳：秒", example = "1735660800")
	private Long aftersaleStatusToFinalTime;

	@SerializedName("return_method")
	@OpField(desc = "用户申请时的退货方式：0-未选择，1-用户上传物流，2-上门取件，4-用户到店退货，5-商家自有运力上门取货，6-平台运力上门取货，7-商家线下取货，10-到家场景下商家同意退货后默认为10，确定具体取货方式后流转到4、5、6。（具体以实际用户选择为准）", example = "1")
	private Long returnMethod;

	@SerializedName("auto_audit_bits")
	@OpField(desc = "自动审核方式：1-发货前极速退；2-小助手自动同意退款；3-发货后极速退；4-闪电退货；5-跨境零秒退；6-云仓拦截自动退；7-小助手自动同意退货；8-小助手自动同意拒签后退款；9-商家代客填写卡片发起售后；10-治理未发货自动同意退款；11-治理已发货自动同意退款；12-商家快递拦截成功自动退款；13-质检商品免审核；14-协商方案自动同意退款；15-平台卡券自动同意退款；16-三方卡券自动同意退款；17-治理一审自动同意退货退款", example = "[1, 2]")
	private List<Long> autoAuditBits;

	@SerializedName("return_book_info")
	@OpField(desc = "用户退货物流偏好", example = "")
	private ReturnBookInfo returnBookInfo;

	@SerializedName("open_address_id")
	private String openAddressId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setGovernmentChannelSubsidyAmount(Long governmentChannelSubsidyAmount){
		this.governmentChannelSubsidyAmount = governmentChannelSubsidyAmount;
	}

	
	public Long getGovernmentChannelSubsidyAmount(){
		return this.governmentChannelSubsidyAmount;
	}

	
	public void setKolPostDiscountReturnAmount(String kolPostDiscountReturnAmount){
		this.kolPostDiscountReturnAmount = kolPostDiscountReturnAmount;
	}

	
	public String getKolPostDiscountReturnAmount(){
		return this.kolPostDiscountReturnAmount;
	}

	
	public void setShopPostDiscountReturnAmount(Long shopPostDiscountReturnAmount){
		this.shopPostDiscountReturnAmount = shopPostDiscountReturnAmount;
	}

	
	public Long getShopPostDiscountReturnAmount(){
		return this.shopPostDiscountReturnAmount;
	}

	
	public void setAfterSaleId(Long afterSaleId){
		this.afterSaleId = afterSaleId;
	}

	
	public Long getAfterSaleId(){
		return this.afterSaleId;
	}

	
	public void setAfterSaleStatus(Long afterSaleStatus){
		this.afterSaleStatus = afterSaleStatus;
	}

	
	public Long getAfterSaleStatus(){
		return this.afterSaleStatus;
	}

	
	public void setAfterSaleStatusDesc(String afterSaleStatusDesc){
		this.afterSaleStatusDesc = afterSaleStatusDesc;
	}

	
	public String getAfterSaleStatusDesc(){
		return this.afterSaleStatusDesc;
	}

	
	public void setRefundType(Long refundType){
		this.refundType = refundType;
	}

	
	public Long getRefundType(){
		return this.refundType;
	}

	
	public void setRefundTypeText(String refundTypeText){
		this.refundTypeText = refundTypeText;
	}

	
	public String getRefundTypeText(){
		return this.refundTypeText;
	}

	
	public void setRefundStatus(Long refundStatus){
		this.refundStatus = refundStatus;
	}

	
	public Long getRefundStatus(){
		return this.refundStatus;
	}

	
	public void setRefundTotalAmount(Long refundTotalAmount){
		this.refundTotalAmount = refundTotalAmount;
	}

	
	public Long getRefundTotalAmount(){
		return this.refundTotalAmount;
	}

	
	public void setRefundPostAmount(Long refundPostAmount){
		this.refundPostAmount = refundPostAmount;
	}

	
	public Long getRefundPostAmount(){
		return this.refundPostAmount;
	}

	
	public void setRefundPromotionAmount(Long refundPromotionAmount){
		this.refundPromotionAmount = refundPromotionAmount;
	}

	
	public Long getRefundPromotionAmount(){
		return this.refundPromotionAmount;
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

	
	public void setReason(String reason){
		this.reason = reason;
	}

	
	public String getReason(){
		return this.reason;
	}

	
	public void setReasonCode(Long reasonCode){
		this.reasonCode = reasonCode;
	}

	
	public Long getReasonCode(){
		return this.reasonCode;
	}

	
	public void setAfterSaleType(Long afterSaleType){
		this.afterSaleType = afterSaleType;
	}

	
	public Long getAfterSaleType(){
		return this.afterSaleType;
	}

	
	public void setAfterSaleTypeText(String afterSaleTypeText){
		this.afterSaleTypeText = afterSaleTypeText;
	}

	
	public String getAfterSaleTypeText(){
		return this.afterSaleTypeText;
	}

	
	public void setReasonRemark(String reasonRemark){
		this.reasonRemark = reasonRemark;
	}

	
	public String getReasonRemark(){
		return this.reasonRemark;
	}

	
	public void setEvidence(List<String> evidence){
		this.evidence = evidence;
	}

	
	public List<String> getEvidence(){
		return this.evidence;
	}

	
	public void setAfterSaleApplyCount(Long afterSaleApplyCount){
		this.afterSaleApplyCount = afterSaleApplyCount;
	}

	
	public Long getAfterSaleApplyCount(){
		return this.afterSaleApplyCount;
	}

	
	public void setNeedReturnCount(Long needReturnCount){
		this.needReturnCount = needReturnCount;
	}

	
	public Long getNeedReturnCount(){
		return this.needReturnCount;
	}

	
	public void setDeductionAmount(Long deductionAmount){
		this.deductionAmount = deductionAmount;
	}

	
	public Long getDeductionAmount(){
		return this.deductionAmount;
	}

	
	public void setDisableCouponId(String disableCouponId){
		this.disableCouponId = disableCouponId;
	}

	
	public String getDisableCouponId(){
		return this.disableCouponId;
	}

	
	public void setPlatformDiscountReturnAmount(Long platformDiscountReturnAmount){
		this.platformDiscountReturnAmount = platformDiscountReturnAmount;
	}

	
	public Long getPlatformDiscountReturnAmount(){
		return this.platformDiscountReturnAmount;
	}

	
	public void setPlatformDiscountReturnStatus(Long platformDiscountReturnStatus){
		this.platformDiscountReturnStatus = platformDiscountReturnStatus;
	}

	
	public Long getPlatformDiscountReturnStatus(){
		return this.platformDiscountReturnStatus;
	}

	
	public void setKolDiscountReturnAmount(Long kolDiscountReturnAmount){
		this.kolDiscountReturnAmount = kolDiscountReturnAmount;
	}

	
	public Long getKolDiscountReturnAmount(){
		return this.kolDiscountReturnAmount;
	}

	
	public void setKolDiscountReturnStatus(Long kolDiscountReturnStatus){
		this.kolDiscountReturnStatus = kolDiscountReturnStatus;
	}

	
	public Long getKolDiscountReturnStatus(){
		return this.kolDiscountReturnStatus;
	}

	
	public void setPostReceiver(String postReceiver){
		this.postReceiver = postReceiver;
	}

	
	public String getPostReceiver(){
		return this.postReceiver;
	}

	
	public void setEncryptPostReceiver(String encryptPostReceiver){
		this.encryptPostReceiver = encryptPostReceiver;
	}

	
	public String getEncryptPostReceiver(){
		return this.encryptPostReceiver;
	}

	
	public void setPostTelSec(String postTelSec){
		this.postTelSec = postTelSec;
	}

	
	public String getPostTelSec(){
		return this.postTelSec;
	}

	
	public void setEncryptPostTelSec(String encryptPostTelSec){
		this.encryptPostTelSec = encryptPostTelSec;
	}

	
	public String getEncryptPostTelSec(){
		return this.encryptPostTelSec;
	}

	
	public void setPostAddress(PostAddress postAddress){
		this.postAddress = postAddress;
	}

	
	public PostAddress getPostAddress(){
		return this.postAddress;
	}

	
	public void setRiskDecsisonCode(Long riskDecsisonCode){
		this.riskDecsisonCode = riskDecsisonCode;
	}

	
	public Long getRiskDecsisonCode(){
		return this.riskDecsisonCode;
	}

	
	public void setRiskDecsisonReason(String riskDecsisonReason){
		this.riskDecsisonReason = riskDecsisonReason;
	}

	
	public String getRiskDecsisonReason(){
		return this.riskDecsisonReason;
	}

	
	public void setRiskDecsisonDescription(String riskDecsisonDescription){
		this.riskDecsisonDescription = riskDecsisonDescription;
	}

	
	public String getRiskDecsisonDescription(){
		return this.riskDecsisonDescription;
	}

	
	public void setReturnAddress(ReturnAddress returnAddress){
		this.returnAddress = returnAddress;
	}

	
	public ReturnAddress getReturnAddress(){
		return this.returnAddress;
	}

	
	public void setRealRefundAmount(Long realRefundAmount){
		this.realRefundAmount = realRefundAmount;
	}

	
	public Long getRealRefundAmount(){
		return this.realRefundAmount;
	}

	
	public void setGotPkg(Long gotPkg){
		this.gotPkg = gotPkg;
	}

	
	public Long getGotPkg(){
		return this.gotPkg;
	}

	
	public void setStatusDeadline(Long statusDeadline){
		this.statusDeadline = statusDeadline;
	}

	
	public Long getStatusDeadline(){
		return this.statusDeadline;
	}

	
	public void setReturnAddressId(Long returnAddressId){
		this.returnAddressId = returnAddressId;
	}

	
	public Long getReturnAddressId(){
		return this.returnAddressId;
	}

	
	public void setExchangeSkuInfo(ExchangeSkuInfo exchangeSkuInfo){
		this.exchangeSkuInfo = exchangeSkuInfo;
	}

	
	public ExchangeSkuInfo getExchangeSkuInfo(){
		return this.exchangeSkuInfo;
	}

	
	public void setPostDiscountReturnAmount(Long postDiscountReturnAmount){
		this.postDiscountReturnAmount = postDiscountReturnAmount;
	}

	
	public Long getPostDiscountReturnAmount(){
		return this.postDiscountReturnAmount;
	}

	
	public void setPostDiscountReturnStatus(Long postDiscountReturnStatus){
		this.postDiscountReturnStatus = postDiscountReturnStatus;
	}

	
	public Long getPostDiscountReturnStatus(){
		return this.postDiscountReturnStatus;
	}

	
	public void setPartType(Long partType){
		this.partType = partType;
	}

	
	public Long getPartType(){
		return this.partType;
	}

	
	public void setReasonSecondLabels(List<ReasonSecondLabelsItem> reasonSecondLabels){
		this.reasonSecondLabels = reasonSecondLabels;
	}

	
	public List<ReasonSecondLabelsItem> getReasonSecondLabels(){
		return this.reasonSecondLabels;
	}

	
	public void setRefundVoucherNum(Long refundVoucherNum){
		this.refundVoucherNum = refundVoucherNum;
	}

	
	public Long getRefundVoucherNum(){
		return this.refundVoucherNum;
	}

	
	public void setRefundVoucherTimes(Long refundVoucherTimes){
		this.refundVoucherTimes = refundVoucherTimes;
	}

	
	public Long getRefundVoucherTimes(){
		return this.refundVoucherTimes;
	}

	
	public void setGoldCoinReturnAmount(Long goldCoinReturnAmount){
		this.goldCoinReturnAmount = goldCoinReturnAmount;
	}

	
	public Long getGoldCoinReturnAmount(){
		return this.goldCoinReturnAmount;
	}

	
	public void setRefundFailReason(String refundFailReason){
		this.refundFailReason = refundFailReason;
	}

	
	public String getRefundFailReason(){
		return this.refundFailReason;
	}

	
	public void setAftersaleTags(List<AftersaleTagsItem> aftersaleTags){
		this.aftersaleTags = aftersaleTags;
	}

	
	public List<AftersaleTagsItem> getAftersaleTags(){
		return this.aftersaleTags;
	}

	
	public void setStoreId(String storeId){
		this.storeId = storeId;
	}

	
	public String getStoreId(){
		return this.storeId;
	}

	
	public void setStoreName(String storeName){
		this.storeName = storeName;
	}

	
	public String getStoreName(){
		return this.storeName;
	}

	
	public void setAfterSaleOrderType(Long afterSaleOrderType){
		this.afterSaleOrderType = afterSaleOrderType;
	}

	
	public Long getAfterSaleOrderType(){
		return this.afterSaleOrderType;
	}

	
	public void setRefundPackingChargeAmount(Long refundPackingChargeAmount){
		this.refundPackingChargeAmount = refundPackingChargeAmount;
	}

	
	public Long getRefundPackingChargeAmount(){
		return this.refundPackingChargeAmount;
	}

	
	public void setShopDiscountReturnAmount(Long shopDiscountReturnAmount){
		this.shopDiscountReturnAmount = shopDiscountReturnAmount;
	}

	
	public Long getShopDiscountReturnAmount(){
		return this.shopDiscountReturnAmount;
	}

	
	public void setAfterSaleSubType(Long afterSaleSubType){
		this.afterSaleSubType = afterSaleSubType;
	}

	
	public Long getAfterSaleSubType(){
		return this.afterSaleSubType;
	}

	
	public void setAgreeRefuseSign(Long agreeRefuseSign){
		this.agreeRefuseSign = agreeRefuseSign;
	}

	
	public Long getAgreeRefuseSign(){
		return this.agreeRefuseSign;
	}

	
	public void setApplyRole(Long applyRole){
		this.applyRole = applyRole;
	}

	
	public Long getApplyRole(){
		return this.applyRole;
	}

	
	public void setRefundTime(Long refundTime){
		this.refundTime = refundTime;
	}

	
	public Long getRefundTime(){
		return this.refundTime;
	}

	
	public void setAftersaleStatusToFinalTime(Long aftersaleStatusToFinalTime){
		this.aftersaleStatusToFinalTime = aftersaleStatusToFinalTime;
	}

	
	public Long getAftersaleStatusToFinalTime(){
		return this.aftersaleStatusToFinalTime;
	}

	
	public void setReturnMethod(Long returnMethod){
		this.returnMethod = returnMethod;
	}

	
	public Long getReturnMethod(){
		return this.returnMethod;
	}

	
	public void setAutoAuditBits(List<Long> autoAuditBits){
		this.autoAuditBits = autoAuditBits;
	}

	
	public List<Long> getAutoAuditBits(){
		return this.autoAuditBits;
	}

	
	public void setReturnBookInfo(ReturnBookInfo returnBookInfo){
		this.returnBookInfo = returnBookInfo;
	}

	
	public ReturnBookInfo getReturnBookInfo(){
		return this.returnBookInfo;
	}

	
	public void setOpenAddressId(String openAddressId){
		this.openAddressId = openAddressId;
	}

	
	public String getOpenAddressId(){
		return this.openAddressId;
	}

}