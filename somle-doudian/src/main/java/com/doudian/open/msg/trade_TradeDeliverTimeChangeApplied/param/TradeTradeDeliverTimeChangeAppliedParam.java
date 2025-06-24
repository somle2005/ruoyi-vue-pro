package com.doudian.open.msg.trade_TradeDeliverTimeChangeApplied.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TradeTradeDeliverTimeChangeAppliedParam {


	@SerializedName("old_time")
	@OpField(required = false , desc = "修改前发货时间", example= "1732015819")
	private Long oldTime;

	@SerializedName("new_time")
	@OpField(required = false , desc = "修改后发货时间", example= "1732879819")
	private Long newTime;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID", example= "90419")
	private Long shopId;

	@SerializedName("shop_order_id")
	@OpField(required = false , desc = "店铺单ID", example= "6936474831906805651")
	private String shopOrderId;

	@SerializedName("task_id")
	@OpField(required = false , desc = "任务单ID", example= "7438912795451769115")
	private String taskId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOldTime(Long oldTime){
		this.oldTime = oldTime;
	}

	
	public Long getOldTime(){
		return this.oldTime;
	}

	
	public void setNewTime(Long newTime){
		this.newTime = newTime;
	}

	
	public Long getNewTime(){
		return this.newTime;
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

	
	public void setShopOrderId(String shopOrderId){
		this.shopOrderId = shopOrderId;
	}

	
	public String getShopOrderId(){
		return this.shopOrderId;
	}

	
	public void setTaskId(String taskId){
		this.taskId = taskId;
	}

	
	public String getTaskId(){
		return this.taskId;
	}

}