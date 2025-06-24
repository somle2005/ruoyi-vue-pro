package com.doudian.open.msg.trade_TradeAppointmentV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class TradeTradeAppointmentV2Param {


	@SerializedName("p_id")
	@OpField(required = false , desc = "父订单id", example= "4845206710334063984")
	private String pId;

	@SerializedName("s_ids")
	@OpField(required = false , desc = "发生失效变更的子订单ID列表", example= "[4845206710334063984]")
	private List<Long> sIds;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID，即时零售店铺该字段为即时零售总部id", example= "1111113779")
	private Long shopId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "8794053")
	private Long storeId;

	@SerializedName("order_type")
	@OpField(required = false , desc = "订单类型： 0: 实物 2: 普通虚拟 4: poi核销 5: 三方核销 6: 服务市场", example= "0")
	private Long orderType;

	@SerializedName("exp_delivery_time")
	@OpField(required = false , desc = "变更后预期发货时间", example= "1627454517")
	private Long expDeliveryTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPId(String pId){
		this.pId = pId;
	}

	
	public String getPId(){
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

	
	public void setOrderType(Long orderType){
		this.orderType = orderType;
	}

	
	public Long getOrderType(){
		return this.orderType;
	}

	
	public void setExpDeliveryTime(Long expDeliveryTime){
		this.expDeliveryTime = expDeliveryTime;
	}

	
	public Long getExpDeliveryTime(){
		return this.expDeliveryTime;
	}

}