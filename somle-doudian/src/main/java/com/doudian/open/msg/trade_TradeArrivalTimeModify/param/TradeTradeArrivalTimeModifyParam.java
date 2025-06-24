package com.doudian.open.msg.trade_TradeArrivalTimeModify.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class TradeTradeArrivalTimeModifyParam {


	@SerializedName("p_id")
	@OpField(required = false , desc = "店铺单id", example= "4835999782215622430")
	private Long pId;

	@SerializedName("s_ids")
	@OpField(required = false , desc = "sku单id", example= "[4835999782215622430,4835999782215622431]")
	private List<Long> sIds;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "门店id,即时零售场景下是总店id", example= "12333")
	private Long shopId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "8794053")
	private Long storeId;

	@SerializedName("receiver_msg")
	@OpField(required = false , desc = "当前变更的订单信息", example= "")
	private ReceiverMsg receiverMsg;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPId(Long pId){
		this.pId = pId;
	}

	
	public Long getPId(){
		return this.pId;
	}

	
	public void setSIds(List<Long> sIds){
		this.sIds = sIds;
	}

	
	public List<Long> getSIds(){
		return this.sIds;
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

	
	public void setReceiverMsg(ReceiverMsg receiverMsg){
		this.receiverMsg = receiverMsg;
	}

	
	public ReceiverMsg getReceiverMsg(){
		return this.receiverMsg;
	}

}