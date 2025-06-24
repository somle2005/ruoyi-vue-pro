package com.doudian.open.api.afterSale_addOrderRemark.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AfterSaleAddOrderRemarkParam {


	@SerializedName("order_id")
	@OpField(required = false , desc = "订单ID，与售后单ID二选一传入", example= "12345")
	private String orderId;

	@SerializedName("after_sale_id")
	@OpField(required = false , desc = "售后单ID，与订单ID二选一传入，二者均传入时售后单ID的优先级更高", example= "12345")
	private String afterSaleId;

	@SerializedName("remark")
	@OpField(required = true , desc = "商家添加的备注信息", example= "客户情绪较激动，需要立即处理")
	private String remark;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

	
	public void setAfterSaleId(String afterSaleId){
		this.afterSaleId = afterSaleId;
	}

	
	public String getAfterSaleId(){
		return this.afterSaleId;
	}

	
	public void setRemark(String remark){
		this.remark = remark;
	}

	
	public String getRemark(){
		return this.remark;
	}

}