package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class PressForPaymentAfterwards {


	@SerializedName("amount_detail_list")
	@OpField(desc = "追缴明细", example = "")
	private List<AmountDetailListItem> amountDetailList;

	@SerializedName("pay_status_desc")
	@OpField(desc = "追缴状态描述，目前包含追缴中和追缴完成两个状态。", example = "追缴中")
	private String payStatusDesc;

	@SerializedName("amount")
	@OpField(desc = "总的追缴金额，单位是“分”", example = "100")
	private Long amount;

	@SerializedName("pay_status")
	@OpField(desc = "追缴状态，只有追缴中和追缴完成会下发该信息。1-追缴中，2-追缴完成。", example = "1")
	private Long payStatus;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAmountDetailList(List<AmountDetailListItem> amountDetailList){
		this.amountDetailList = amountDetailList;
	}

	
	public List<AmountDetailListItem> getAmountDetailList(){
		return this.amountDetailList;
	}

	
	public void setPayStatusDesc(String payStatusDesc){
		this.payStatusDesc = payStatusDesc;
	}

	
	public String getPayStatusDesc(){
		return this.payStatusDesc;
	}

	
	public void setAmount(Long amount){
		this.amount = amount;
	}

	
	public Long getAmount(){
		return this.amount;
	}

	
	public void setPayStatus(Long payStatus){
		this.payStatus = payStatus;
	}

	
	public Long getPayStatus(){
		return this.payStatus;
	}

}