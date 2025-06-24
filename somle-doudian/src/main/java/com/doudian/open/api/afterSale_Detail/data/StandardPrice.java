package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class StandardPrice {


	@SerializedName("actual_amount")
	@OpField(desc = "总价", example = "")
	private ActualAmount actualAmount;

	@SerializedName("origin_amount")
	@OpField(desc = "原价", example = "")
	private OriginAmount originAmount;

	@SerializedName("deduction_price_detail")
	@OpField(desc = "减数明细", example = "")
	private List<DeductionPriceDetailItem> deductionPriceDetail;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setActualAmount(ActualAmount actualAmount){
		this.actualAmount = actualAmount;
	}

	
	public ActualAmount getActualAmount(){
		return this.actualAmount;
	}

	
	public void setOriginAmount(OriginAmount originAmount){
		this.originAmount = originAmount;
	}

	
	public OriginAmount getOriginAmount(){
		return this.originAmount;
	}

	
	public void setDeductionPriceDetail(List<DeductionPriceDetailItem> deductionPriceDetail){
		this.deductionPriceDetail = deductionPriceDetail;
	}

	
	public List<DeductionPriceDetailItem> getDeductionPriceDetail(){
		return this.deductionPriceDetail;
	}

}