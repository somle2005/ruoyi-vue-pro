package com.doudian.open.api.afterSale_List.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderInfo {


	@SerializedName("shop_order_id")
	@OpField(desc = "店铺单订单ID", example = "4821780700279174718")
	private String shopOrderId;

	@SerializedName("related_order_info")
	@OpField(desc = "售后关联的订单信息", example = "")
	private List<RelatedOrderInfoItem> relatedOrderInfo;

	@SerializedName("order_flag")
	@OpField(desc = "订单插旗", example = "0")
	private Long orderFlag;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setShopOrderId(String shopOrderId){
		this.shopOrderId = shopOrderId;
	}

	
	public String getShopOrderId(){
		return this.shopOrderId;
	}

	
	public void setRelatedOrderInfo(List<RelatedOrderInfoItem> relatedOrderInfo){
		this.relatedOrderInfo = relatedOrderInfo;
	}

	
	public List<RelatedOrderInfoItem> getRelatedOrderInfo(){
		return this.relatedOrderInfo;
	}

	
	public void setOrderFlag(Long orderFlag){
		this.orderFlag = orderFlag;
	}

	
	public Long getOrderFlag(){
		return this.orderFlag;
	}

}