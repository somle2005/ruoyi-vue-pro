package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderRecycleInfo {


	@SerializedName("press_for_payment_afterwards")
	@OpField(desc = "追缴信息，目前包含立减+先享抵扣信息;", example = "")
	private PressForPaymentAfterwards pressForPaymentAfterwards;

	@SerializedName("recycle_actual_amount_info")
	@OpField(desc = "旧机回收信息", example = "")
	private RecycleActualAmountInfo recycleActualAmountInfo;

	@SerializedName("shop_subsidy_amount_info")
	@OpField(desc = "换新额外补贴（已下线，使用新机单上的shop_recycle_subsidy_amount_info 替代）", example = "")
	private ShopSubsidyAmountInfo shopSubsidyAmountInfo;

	@SerializedName("recycle_mode")
	@OpField(desc = "回收方式; 1-上门回收  2-邮寄回收", example = "1")
	private Long recycleMode;

	@SerializedName("appoint_recycle_start_time")
	@OpField(desc = "预约拆机开始时间戳，单位：秒", example = "1685440259")
	private Long appointRecycleStartTime;

	@SerializedName("appoint_recycle_end_time")
	@OpField(desc = "预约拆机结束时间戳，单位：秒", example = "1685440259")
	private Long appointRecycleEndTime;

	@SerializedName("pronduct_desc")
	@OpField(desc = "回收商品描述", example = "大家电-空调")
	private String pronductDesc;

	@SerializedName("quoted_price")
	@OpField(desc = "旧机预估价-单位：分", example = "3")
	private Long quotedPrice;

	@SerializedName("recycle_order_id")
	@OpField(desc = "回收旧机单单号", example = "6898432433432")
	private String recycleOrderId;

	@SerializedName("recycle_status")
	@OpField(desc = "回收状态；1,101,201-已接单；2,102-分配师傅；202-分配快递；3,103-师傅上门签到；203-待质检；204-质检中；104,205-质检完成；105,206-用户确认；4,106-服务商审核；5,107,207-回收完成；99,199,299,399-取消;", example = "2")
	private Long recycleStatus;

	@SerializedName("recycle_status_desc")
	@OpField(desc = "回收状态", example = "分配师傅")
	private String recycleStatusDesc;

	@SerializedName("subsidy_receive_status")
	@OpField(desc = "旧机回收价发放状态(使用send_status代替)", example = "待发放")
	private String subsidyReceiveStatus;

	@SerializedName("supplier_code")
	@OpField(desc = "回收服务商code", example = "73849324")
	private String supplierCode;

	@SerializedName("supplier_name")
	@OpField(desc = "服务商名称", example = "嗨回收")
	private String supplierName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPressForPaymentAfterwards(PressForPaymentAfterwards pressForPaymentAfterwards){
		this.pressForPaymentAfterwards = pressForPaymentAfterwards;
	}

	
	public PressForPaymentAfterwards getPressForPaymentAfterwards(){
		return this.pressForPaymentAfterwards;
	}

	
	public void setRecycleActualAmountInfo(RecycleActualAmountInfo recycleActualAmountInfo){
		this.recycleActualAmountInfo = recycleActualAmountInfo;
	}

	
	public RecycleActualAmountInfo getRecycleActualAmountInfo(){
		return this.recycleActualAmountInfo;
	}

	
	public void setShopSubsidyAmountInfo(ShopSubsidyAmountInfo shopSubsidyAmountInfo){
		this.shopSubsidyAmountInfo = shopSubsidyAmountInfo;
	}

	
	public ShopSubsidyAmountInfo getShopSubsidyAmountInfo(){
		return this.shopSubsidyAmountInfo;
	}

	
	public void setRecycleMode(Long recycleMode){
		this.recycleMode = recycleMode;
	}

	
	public Long getRecycleMode(){
		return this.recycleMode;
	}

	
	public void setAppointRecycleStartTime(Long appointRecycleStartTime){
		this.appointRecycleStartTime = appointRecycleStartTime;
	}

	
	public Long getAppointRecycleStartTime(){
		return this.appointRecycleStartTime;
	}

	
	public void setAppointRecycleEndTime(Long appointRecycleEndTime){
		this.appointRecycleEndTime = appointRecycleEndTime;
	}

	
	public Long getAppointRecycleEndTime(){
		return this.appointRecycleEndTime;
	}

	
	public void setPronductDesc(String pronductDesc){
		this.pronductDesc = pronductDesc;
	}

	
	public String getPronductDesc(){
		return this.pronductDesc;
	}

	
	public void setQuotedPrice(Long quotedPrice){
		this.quotedPrice = quotedPrice;
	}

	
	public Long getQuotedPrice(){
		return this.quotedPrice;
	}

	
	public void setRecycleOrderId(String recycleOrderId){
		this.recycleOrderId = recycleOrderId;
	}

	
	public String getRecycleOrderId(){
		return this.recycleOrderId;
	}

	
	public void setRecycleStatus(Long recycleStatus){
		this.recycleStatus = recycleStatus;
	}

	
	public Long getRecycleStatus(){
		return this.recycleStatus;
	}

	
	public void setRecycleStatusDesc(String recycleStatusDesc){
		this.recycleStatusDesc = recycleStatusDesc;
	}

	
	public String getRecycleStatusDesc(){
		return this.recycleStatusDesc;
	}

	
	public void setSubsidyReceiveStatus(String subsidyReceiveStatus){
		this.subsidyReceiveStatus = subsidyReceiveStatus;
	}

	
	public String getSubsidyReceiveStatus(){
		return this.subsidyReceiveStatus;
	}

	
	public void setSupplierCode(String supplierCode){
		this.supplierCode = supplierCode;
	}

	
	public String getSupplierCode(){
		return this.supplierCode;
	}

	
	public void setSupplierName(String supplierName){
		this.supplierName = supplierName;
	}

	
	public String getSupplierName(){
		return this.supplierName;
	}

}