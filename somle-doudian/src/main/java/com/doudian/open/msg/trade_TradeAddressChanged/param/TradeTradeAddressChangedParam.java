package com.doudian.open.msg.trade_TradeAddressChanged.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class TradeTradeAddressChangedParam {


	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID，即时零售店铺该字段为即时零售总部id", example= "11976969")
	private Long shopId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "8794053")
	private Long storeId;

	@SerializedName("order_status")
	@OpField(required = false , desc = "父订单状态，买家收货信息变更消息的status值为2", example= "2")
	private Long orderStatus;

	@SerializedName("order_type")
	@OpField(required = false , desc = "订单类型： 0: 实物 2: 普通虚拟 4: poi核销 5: 三方核销 6: 服务市场", example= "0")
	private Long orderType;

	@SerializedName("receiver_msg")
	@OpField(required = false , desc = "收货人详细信息", example= "")
	private ReceiverMsg receiverMsg;

	@SerializedName("update_time")
	@OpField(required = false , desc = "收货信息变更时间", example= "1630373503")
	private Long updateTime;

	@SerializedName("p_id")
	@OpField(required = false , desc = "父订单ID", example= "4837325080261221450")
	private Long pId;

	@SerializedName("s_ids")
	@OpField(required = false , desc = "子订单ID列表", example= "[4837325080261221450]")
	private List<Long> sIds;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

	
	public void setOrderStatus(Long orderStatus){
		this.orderStatus = orderStatus;
	}

	
	public Long getOrderStatus(){
		return this.orderStatus;
	}

	
	public void setOrderType(Long orderType){
		this.orderType = orderType;
	}

	
	public Long getOrderType(){
		return this.orderType;
	}

	
	public void setReceiverMsg(ReceiverMsg receiverMsg){
		this.receiverMsg = receiverMsg;
	}

	
	public ReceiverMsg getReceiverMsg(){
		return this.receiverMsg;
	}

	
	public void setUpdateTime(Long updateTime){
		this.updateTime = updateTime;
	}

	
	public Long getUpdateTime(){
		return this.updateTime;
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

}