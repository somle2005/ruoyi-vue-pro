package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class FreeInterest_4_4 {


	@SerializedName("trade_amount")
	@OpField(desc = "总交易金额", example = "10000")
	private Long tradeAmount;

	@SerializedName("total_free_interest_platform_clearing_amount")
	@OpField(desc = "商品单，抖音月付，平台承担免息金额，单位: 分;", example = "200")
	private Long totalFreeInterestPlatformClearingAmount;

	@SerializedName("total_free_interest_shop_clearing_amount")
	@OpField(desc = "商品单，抖音月付，商家承担免息金额，单位: 分;", example = "100")
	private Long totalFreeInterestShopClearingAmount;

	@SerializedName("period")
	@OpField(desc = "免息期数", example = "12")
	private Long period;

	@SerializedName("refund_total_free_interest_platform_clearing_amount")
	@OpField(desc = "商品单，抖音月付，退款部分平台承担免息金额，单位: 分;", example = "0")
	private Long refundTotalFreeInterestPlatformClearingAmount;

	@SerializedName("refund_total_free_interest_shop_clearing_amount")
	@OpField(desc = "商品单，抖音月付，退款部分商家承担免息金额，单位: 分;", example = "0")
	private Long refundTotalFreeInterestShopClearingAmount;

	@SerializedName("free_interest_detail")
	@OpField(desc = "商品单，抖音月付明细信息", example = "")
	private List<FreeInterestDetailItem_5_5> freeInterestDetail;


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

	
	public void setFreeInterestDetail(List<FreeInterestDetailItem_5_5> freeInterestDetail){
		this.freeInterestDetail = freeInterestDetail;
	}

	
	public List<FreeInterestDetailItem_5_5> getFreeInterestDetail(){
		return this.freeInterestDetail;
	}

}