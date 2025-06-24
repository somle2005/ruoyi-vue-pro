package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AfterSaleInfo {


	@SerializedName("after_sale_status")
	@OpField(desc = "售后状态，0-售后初始化， 6-售后申请， 7-售后退货中， 27-拒绝售后申请， 12-售后成功， 28-售后失败， 11-售后已发货， 29-退货后拒绝退款， 13-售后换货商家发货， 14-售后换货用户收货， 51-取消成功， 53-逆向交易完成", example = "6")
	private Long afterSaleStatus;

	@SerializedName("after_sale_type")
	@OpField(desc = "售后类型:0 售后退货退款:1-售后退款 2-售前退款 3-换货 4-系统取消 5-用户取消", example = "1")
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