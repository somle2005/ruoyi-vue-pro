package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsInfo {


	@SerializedName("return")
	@OpField(desc = "买家退货物流信息", example = "")
	private Return _return;

	@SerializedName("exchange")
	@OpField(desc = "卖家换货物流信息", example = "")
	private Exchange exchange;

	@SerializedName("order")
	@OpField(desc = "卖家发货正向物流信息", example = "")
	private List<OrderItem> order;

	@SerializedName("resend")
	@OpField(desc = "补寄物流", example = "")
	private Resend resend;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void set_return(Return _return){
		this._return = _return;
	}

	
	public Return get_return(){
		return this._return;
	}

	
	public void setExchange(Exchange exchange){
		this.exchange = exchange;
	}

	
	public Exchange getExchange(){
		return this.exchange;
	}

	
	public void setOrder(List<OrderItem> order){
		this.order = order;
	}

	
	public List<OrderItem> getOrder(){
		return this.order;
	}

	
	public void setResend(Resend resend){
		this.resend = resend;
	}

	
	public Resend getResend(){
		return this.resend;
	}

}