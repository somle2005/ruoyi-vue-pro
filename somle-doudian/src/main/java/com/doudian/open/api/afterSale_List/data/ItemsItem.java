package com.doudian.open.api.afterSale_List.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ItemsItem {


	@SerializedName("aftersale_info")
	@OpField(desc = "售后信息", example = "")
	private AftersaleInfo aftersaleInfo;

	@SerializedName("order_info")
	@OpField(desc = "订单信息", example = "")
	private OrderInfo orderInfo;

	@SerializedName("text_part")
	@OpField(desc = "文案部分", example = "")
	private TextPart textPart;

	@SerializedName("seller_logs")
	@OpField(desc = "卖家插旗日志", example = "")
	private List<SellerLogsItem> sellerLogs;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAftersaleInfo(AftersaleInfo aftersaleInfo){
		this.aftersaleInfo = aftersaleInfo;
	}

	
	public AftersaleInfo getAftersaleInfo(){
		return this.aftersaleInfo;
	}

	
	public void setOrderInfo(OrderInfo orderInfo){
		this.orderInfo = orderInfo;
	}

	
	public OrderInfo getOrderInfo(){
		return this.orderInfo;
	}

	
	public void setTextPart(TextPart textPart){
		this.textPart = textPart;
	}

	
	public TextPart getTextPart(){
		return this.textPart;
	}

	
	public void setSellerLogs(List<SellerLogsItem> sellerLogs){
		this.sellerLogs = sellerLogs;
	}

	
	public List<SellerLogsItem> getSellerLogs(){
		return this.sellerLogs;
	}

}