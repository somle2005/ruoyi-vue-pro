package com.doudian.open.msg.trade_TradeAddressChangeApplied.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TradeTradeAddressChangeAppliedParam {


	@SerializedName("apply_time")
	@OpField(required = false , desc = "申请时间", example= "1630269374")
	private Long applyTime;

	@SerializedName("post_receiver_msg")
	@OpField(required = false , desc = "变更前收货人详细信息", example= "")
	private PostReceiverMsg postReceiverMsg;

	@SerializedName("receiver_msg")
	@OpField(required = false , desc = "申请变更的收货人详细信息", example= "")
	private ReceiverMsg receiverMsg;

	@SerializedName("p_id")
	@OpField(required = false , desc = "父订单ID", example= "4836875908288530057")
	private Long pId;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID", example= "8461077")
	private Long shopId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "8794053")
	private Long storeId;

	@SerializedName("task_type")
	@OpField(required = false , desc = "申请类型，1001-发货前改地址 1002-发货后改地址", example= "1001")
	private Long taskType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setApplyTime(Long applyTime){
		this.applyTime = applyTime;
	}

	
	public Long getApplyTime(){
		return this.applyTime;
	}

	
	public void setPostReceiverMsg(PostReceiverMsg postReceiverMsg){
		this.postReceiverMsg = postReceiverMsg;
	}

	
	public PostReceiverMsg getPostReceiverMsg(){
		return this.postReceiverMsg;
	}

	
	public void setReceiverMsg(ReceiverMsg receiverMsg){
		this.receiverMsg = receiverMsg;
	}

	
	public ReceiverMsg getReceiverMsg(){
		return this.receiverMsg;
	}

	
	public void setPId(Long pId){
		this.pId = pId;
	}

	
	public Long getPId(){
		return this.pId;
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

	
	public void setTaskType(Long taskType){
		this.taskType = taskType;
	}

	
	public Long getTaskType(){
		return this.taskType;
	}

}