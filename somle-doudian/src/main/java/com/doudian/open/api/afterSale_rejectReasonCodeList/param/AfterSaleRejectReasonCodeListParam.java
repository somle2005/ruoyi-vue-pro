package com.doudian.open.api.afterSale_rejectReasonCodeList.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AfterSaleRejectReasonCodeListParam {


	@SerializedName("aftersale_id")
	@OpField(required = false , desc = "传入售后单id时，返回该笔售后单可选择的拒绝原因列表；仅支持已发货的售后查询，备货中未发货订单返回为空。", example= "7140522277954699533")
	private Long aftersaleId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAftersaleId(Long aftersaleId){
		this.aftersaleId = aftersaleId;
	}

	
	public Long getAftersaleId(){
		return this.aftersaleId;
	}

}