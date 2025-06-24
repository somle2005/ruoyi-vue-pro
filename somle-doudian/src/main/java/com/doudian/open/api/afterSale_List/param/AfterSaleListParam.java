package com.doudian.open.api.afterSale_List.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class AfterSaleListParam {


	@SerializedName("order_id")
	@OpField(required = false , desc = "父订单号", example= "4821845786203981633")
	private String orderId;

	@SerializedName("aftersale_type")
	@OpField(required = false , desc = "售后类型；0-退货退款；1-已发货仅退款；2-未发货仅退款；3-换货；6-价保；7-补寄；8-维修", example= "1")
	private Long aftersaleType;

	@SerializedName("aftersale_status")
	@OpField(required = false , desc = "已废弃，推荐使用standard_aftersale_status字段。售后状态，枚举为6(待商家同意),7(待买家退货),8(待商家发货),11(待商家二次同意),12(售后成功),13(换货待买家收货),14(换货成功),27(商家一次拒绝),28(售后失败),29(商家二次拒绝)", example= "2")
	private Long aftersaleStatus;

	@SerializedName("reason")
	@OpField(required = false , desc = "售后理由；1-七天无理由退货；2-非七天无理由退货；", example= "1")
	private Long reason;

	@SerializedName("logistics_status")
	@OpField(required = false , desc = "退货物流状态，枚举为1(全部),2(已发货),3(未发货)", example= "2")
	private Long logisticsStatus;

	@SerializedName("pay_type")
	@OpField(required = false , desc = "付款方式，枚举为1(全部), 2(货到付款),3(线上付款)", example= "2")
	private Long payType;

	@SerializedName("refund_type")
	@OpField(required = false , desc = "退款类型，枚举为0(原路退款),1(线下退款),2(备用金),3(保证金),4(无需退款)", example= "1")
	private Long refundType;

	@SerializedName("arbitrate_status")
	@OpField(required = false , desc = "仲裁状态，枚举为0(未介入),1(客服处理中),2(仲裁结束-支持买家),3(仲裁结束-支持卖家),4(待商家举证),5(待与买家协商),6(仲裁结束),255(取消)", example= "0")
	private List<Long> arbitrateStatus;

	@SerializedName("order_flag")
	@OpField(required = false , desc = "插旗信息：0：灰 1：紫 2: 青 3：绿 4： 橙 5： 红", example= "[1,2,3]")
	private List<Long> orderFlag;

	@SerializedName("start_time")
	@OpField(required = false , desc = "申请时间开始，单位为秒（查询范围包含开始值）", example= "1626770133")
	private Long startTime;

	@SerializedName("end_time")
	@OpField(required = false , desc = "申请时间结束，单位为秒（查询范围不包含结束值）", example= "1626856525")
	private Long endTime;

	@SerializedName("amount_start")
	@OpField(required = false , desc = "金额下限，单位为分（查询范围包含开始值）", example= "300")
	private Long amountStart;

	@SerializedName("amount_end")
	@OpField(required = false , desc = "金额上限，单位为分（查询范围不包含结束值）", example= "1000")
	private Long amountEnd;

	@SerializedName("risk_flag")
	@OpField(required = false , desc = "风控标签，枚举为-1(退货正常),1(退货异常)", example= "-1")
	private Long riskFlag;

	@SerializedName("order_by")
	@OpField(required = false , desc = "排序方式，优先级按照列表顺序从前往后依次减小，写法为<字段名称> <排序方式>，字段名称目前支持status_deadline（逾期时间）、apply_time（申请时间）和 update_time（更新时间），排序方式目前支持asc（升序）和desc（降序）。按照逾期时间升序排列，会优先返回临近逾期时间的数据。", example= "[status_deadline desc]")
	private List<String> orderBy;

	@SerializedName("page")
	@OpField(required = true , desc = "页数，从0开始", example= "0")
	private Long page;

	@SerializedName("size")
	@OpField(required = true , desc = "每页数量，最多100个", example= "50")
	private Long size;

	@SerializedName("aftersale_id")
	@OpField(required = false , desc = "售后单号", example= "6987272148133888300")
	private String aftersaleId;

	@SerializedName("standard_aftersale_status")
	@OpField(required = false , desc = "售后状态；6-待商家同意；7-待买家退货；8-待商家发货；11-待商家二次同意；12-售后成功；13-换货补寄维修待买家收货；14-换货补寄维修成功；27-商家一次拒绝；28-售后失败；29-商家二次拒绝；支持传多种状态，使用英文“,”分隔；注意：如传入非枚举值信息会被系统忽略，如传入都不合法则默认查询所有；", example= "[6,7,11]")
	private List<Long> standardAftersaleStatus;

	@SerializedName("need_special_type")
	@OpField(required = false , desc = "是否展示特殊售后", example= "true/false")
	private Boolean needSpecialType;

	@SerializedName("update_start_time")
	@OpField(required = false , desc = "更新时间开始，单位为秒（查询范围包含开始值）；当使用update_start_time和update_end_time时，请配合传入order_by= update_time否则会导致基于更新时间查询售后列表轮询数据遗漏；", example= "1626856525")
	private Long updateStartTime;

	@SerializedName("update_end_time")
	@OpField(required = false , desc = "更新时间结束，单位为秒（查询范围包含开始值）；当使用update_start_time和update_end_time时，请配合传入order_by= update_time否则会导致基于更新时间查询售后列表轮询数据遗漏；", example= "1626856525")
	private Long updateEndTime;

	@SerializedName("order_logistics_tracking_no")
	@OpField(required = false , desc = "正向物流单号", example= "[SF12345678910]")
	private List<String> orderLogisticsTrackingNo;

	@SerializedName("order_logistics_state")
	@OpField(required = false , desc = "正向物流状态（仅支持拒签场景下的状态筛选，状态更新有一定时延。1：买家已拒签；2：买家已签收；3：快递退回中，运往商家，包含快递拦截成功；4：商家已签收）", example= "[1,2,3,4]")
	private List<Long> orderLogisticsState;

	@SerializedName("agree_refuse_sign")
	@OpField(required = false , desc = "是否拒签后退款（1：已同意拒签, 2：未同意拒签）", example= "[1,2]")
	private List<Long> agreeRefuseSign;

	@SerializedName("aftersale_sub_type")
	@OpField(required = false , desc = "售后子类型；8001-以换代修。", example= "8001")
	private Long aftersaleSubType;

	@SerializedName("aftersale_status_to_final_start_time")
	@OpField(required = false , desc = "售后完结时间开始，单位为秒（查询范围包含开始值），仅支持售后完结时间在近6个月内的售后单，按完结时间筛选；售后完结时间生成规则是平台根据商品的类型，售后状态等综合判断生成，当售后单有完结时间返回时售后单不可再做任何操作；", example= "1626856525")
	private Long aftersaleStatusToFinalStartTime;

	@SerializedName("aftersale_status_to_final_end_time")
	@OpField(required = false , desc = "售后完结时间结束，单位为秒（查询范围包含开始值），仅支持售后完结时间在近6个月内的售后单，按完结时间筛选；售后完结时间生成规则是平台根据商品的类型，售后状态等综合判断生成，当售后单有完结时间返回时售后单不可再做任何操作；", example= "1626856525")
	private Long aftersaleStatusToFinalEndTime;

	@SerializedName("store_id_list")
	@OpField(required = false , desc = "即时零售专用, 查询门店id list入参 其中最多传入50个门店id", example= "[1626856525,1123416]")
	private List<Long> storeIdList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
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

	
	public void setReason(Long reason){
		this.reason = reason;
	}

	
	public Long getReason(){
		return this.reason;
	}

	
	public void setLogisticsStatus(Long logisticsStatus){
		this.logisticsStatus = logisticsStatus;
	}

	
	public Long getLogisticsStatus(){
		return this.logisticsStatus;
	}

	
	public void setPayType(Long payType){
		this.payType = payType;
	}

	
	public Long getPayType(){
		return this.payType;
	}

	
	public void setRefundType(Long refundType){
		this.refundType = refundType;
	}

	
	public Long getRefundType(){
		return this.refundType;
	}

	
	public void setArbitrateStatus(List<Long> arbitrateStatus){
		this.arbitrateStatus = arbitrateStatus;
	}

	
	public List<Long> getArbitrateStatus(){
		return this.arbitrateStatus;
	}

	
	public void setOrderFlag(List<Long> orderFlag){
		this.orderFlag = orderFlag;
	}

	
	public List<Long> getOrderFlag(){
		return this.orderFlag;
	}

	
	public void setStartTime(Long startTime){
		this.startTime = startTime;
	}

	
	public Long getStartTime(){
		return this.startTime;
	}

	
	public void setEndTime(Long endTime){
		this.endTime = endTime;
	}

	
	public Long getEndTime(){
		return this.endTime;
	}

	
	public void setAmountStart(Long amountStart){
		this.amountStart = amountStart;
	}

	
	public Long getAmountStart(){
		return this.amountStart;
	}

	
	public void setAmountEnd(Long amountEnd){
		this.amountEnd = amountEnd;
	}

	
	public Long getAmountEnd(){
		return this.amountEnd;
	}

	
	public void setRiskFlag(Long riskFlag){
		this.riskFlag = riskFlag;
	}

	
	public Long getRiskFlag(){
		return this.riskFlag;
	}

	
	public void setOrderBy(List<String> orderBy){
		this.orderBy = orderBy;
	}

	
	public List<String> getOrderBy(){
		return this.orderBy;
	}

	
	public void setPage(Long page){
		this.page = page;
	}

	
	public Long getPage(){
		return this.page;
	}

	
	public void setSize(Long size){
		this.size = size;
	}

	
	public Long getSize(){
		return this.size;
	}

	
	public void setAftersaleId(String aftersaleId){
		this.aftersaleId = aftersaleId;
	}

	
	public String getAftersaleId(){
		return this.aftersaleId;
	}

	
	public void setStandardAftersaleStatus(List<Long> standardAftersaleStatus){
		this.standardAftersaleStatus = standardAftersaleStatus;
	}

	
	public List<Long> getStandardAftersaleStatus(){
		return this.standardAftersaleStatus;
	}

	
	public void setNeedSpecialType(Boolean needSpecialType){
		this.needSpecialType = needSpecialType;
	}

	
	public Boolean getNeedSpecialType(){
		return this.needSpecialType;
	}

	
	public void setUpdateStartTime(Long updateStartTime){
		this.updateStartTime = updateStartTime;
	}

	
	public Long getUpdateStartTime(){
		return this.updateStartTime;
	}

	
	public void setUpdateEndTime(Long updateEndTime){
		this.updateEndTime = updateEndTime;
	}

	
	public Long getUpdateEndTime(){
		return this.updateEndTime;
	}

	
	public void setOrderLogisticsTrackingNo(List<String> orderLogisticsTrackingNo){
		this.orderLogisticsTrackingNo = orderLogisticsTrackingNo;
	}

	
	public List<String> getOrderLogisticsTrackingNo(){
		return this.orderLogisticsTrackingNo;
	}

	
	public void setOrderLogisticsState(List<Long> orderLogisticsState){
		this.orderLogisticsState = orderLogisticsState;
	}

	
	public List<Long> getOrderLogisticsState(){
		return this.orderLogisticsState;
	}

	
	public void setAgreeRefuseSign(List<Long> agreeRefuseSign){
		this.agreeRefuseSign = agreeRefuseSign;
	}

	
	public List<Long> getAgreeRefuseSign(){
		return this.agreeRefuseSign;
	}

	
	public void setAftersaleSubType(Long aftersaleSubType){
		this.aftersaleSubType = aftersaleSubType;
	}

	
	public Long getAftersaleSubType(){
		return this.aftersaleSubType;
	}

	
	public void setAftersaleStatusToFinalStartTime(Long aftersaleStatusToFinalStartTime){
		this.aftersaleStatusToFinalStartTime = aftersaleStatusToFinalStartTime;
	}

	
	public Long getAftersaleStatusToFinalStartTime(){
		return this.aftersaleStatusToFinalStartTime;
	}

	
	public void setAftersaleStatusToFinalEndTime(Long aftersaleStatusToFinalEndTime){
		this.aftersaleStatusToFinalEndTime = aftersaleStatusToFinalEndTime;
	}

	
	public Long getAftersaleStatusToFinalEndTime(){
		return this.aftersaleStatusToFinalEndTime;
	}

	
	public void setStoreIdList(List<Long> storeIdList){
		this.storeIdList = storeIdList;
	}

	
	public List<Long> getStoreIdList(){
		return this.storeIdList;
	}

}