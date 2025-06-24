package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AfterSaleInfo {


	@SerializedName("after_sale_status")
	@OpField(desc = "售后状态；6-售后申请；27-拒绝售后申请；12-售后成功；7-售后退货中；11-售后已发货；29-售后退货拒绝；13-【换货返回：换货售后换货商家发货】，【补寄返回：补寄待用户收货】； 14-【换货返回：（换货）售后换货用户收货】，【补寄返回：（补寄）用户已收货】 ；28-售后失败；51-订单取消成功；53-逆向交易已完成；", example = "6")
	private Long afterSaleStatus;

	@SerializedName("after_sale_type")
	@OpField(desc = "售后类型 ；0-退货退款;1-已发货仅退款;2-未发货仅退款;3-换货;4-系统取消;5-用户取消;6-价保;7-补寄;", example = "1")
	private Long afterSaleType;

	@SerializedName("refund_status")
	@OpField(desc = "退款状态:1-待退款；3-退款成功； 4-退款失败；当买家发起售后后又主动取消售后，此时after_sale_status=28并且refund_status=1的状态不变，不会流转至4状态；", example = "1")
	private Long refundStatus;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAfterSaleStatus(Long afterSaleStatus){
		this.afterSaleStatus = afterSaleStatus;
	}

	
	public Long getAfterSaleStatus(){
		return this.afterSaleStatus;
	}

	
	public void setAfterSaleType(Long afterSaleType){
		this.afterSaleType = afterSaleType;
	}

	
	public Long getAfterSaleType(){
		return this.afterSaleType;
	}

	
	public void setRefundStatus(Long refundStatus){
		this.refundStatus = refundStatus;
	}

	
	public Long getRefundStatus(){
		return this.refundStatus;
	}

}