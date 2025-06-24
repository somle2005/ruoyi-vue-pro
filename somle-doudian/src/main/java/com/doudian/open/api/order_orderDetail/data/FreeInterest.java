package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class FreeInterest {


	@SerializedName("trade_amount")
	@OpField(desc = "总交易金额", example = "200")
	private Long tradeAmount;

	@SerializedName("total_free_interest_platform_clearing_amount")
	@OpField(desc = "抖音月付平台承担息费总金额，单位: 分", example = "200")
	private Long totalFreeInterestPlatformClearingAmount;

	@SerializedName("total_free_interest_shop_clearing_amount")
	@OpField(desc = "抖音月付商家承担息费总金额，单位: 分", example = "100")
	private Long totalFreeInterestShopClearingAmount;

	@SerializedName("period")
	@OpField(desc = "分期期数", example = "12")
	private Long period;

	@SerializedName("refund_total_free_interest_platform_clearing_amount")
	@OpField(desc = "抖音月付退款部分，平台承担免息费用，单位: 分", example = "0")
	private Long refundTotalFreeInterestPlatformClearingAmount;

	@SerializedName("refund_total_free_interest_shop_clearing_amount")
	@OpField(desc = "抖音月付退款部分，商家承担免息费用，单位: 分", example = "0")
	private Long refundTotalFreeInterestShopClearingAmount;

	@SerializedName("free_interest_detail")
	@OpField(desc = "抖音月付免息信息明细", example = "")
	private List<FreeInterestDetailItem> freeInterestDetail;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTradeAmount(Long tradeAmount){
		this.tradeAmount = tradeAmount;
	}

	
	public Long getTradeAmount(){
		return this.tradeAmount;
	}

	
	public void setTotalFreeInterestPlatformClearingAmount(Long totalFreeInterestPlatformClearingAmount){
		this.totalFreeInterestPlatformClearingAmount = totalFreeInterestPlatformClearingAmount;
	}

	
	public Long getTotalFreeInterestPlatformClearingAmount(){
		return this.totalFreeInterestPlatformClearingAmount;
	}

	
	public void setTotalFreeInterestShopClearingAmount(Long totalFreeInterestShopClearingAmount){
		this.totalFreeInterestShopClearingAmount = totalFreeInterestShopClearingAmount;
	}

	
	public Long getTotalFreeInterestShopClearingAmount(){
		return this.totalFreeInterestShopClearingAmount;
	}

	
	public void setPeriod(Long period){
		this.period = period;
	}

	
	public Long getPeriod(){
		return this.period;
	}

	
	public void setRefundTotalFreeInterestPlatformClearingAmount(Long refundTotalFreeInterestPlatformClearingAmount){
		this.refundTotalFreeInterestPlatformClearingAmount = refundTotalFreeInterestPlatformClearingAmount;
	}

	
	public Long getRefundTotalFreeInterestPlatformClearingAmount(){
		return this.refundTotalFreeInterestPlatformClearingAmount;
	}

	
	public void setRefundTotalFreeInterestShopClearingAmount(Long refundTotalFreeInterestShopClearingAmount){
		this.refundTotalFreeInterestShopClearingAmount = refundTotalFreeInterestShopClearingAmount;
	}

	
	public Long getRefundTotalFreeInterestShopClearingAmount(){
		return this.refundTotalFreeInterestShopClearingAmount;
	}

	
	public void setFreeInterestDetail(List<FreeInterestDetailItem> freeInterestDetail){
		this.freeInterestDetail = freeInterestDetail;
	}

	
	public List<FreeInterestDetailItem> getFreeInterestDetail(){
		return this.freeInterestDetail;
	}

}