package com.doudian.open.msg.trade_TradeCreate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class TradeTradeCreateParam {


	@SerializedName("p_id")
	@OpField(required = false , desc = "父订单 ID", example= "4881995531871913482")
	private Long pId;

	@SerializedName("s_ids")
	@OpField(required = false , desc = "子订单ID列表", example= "[4881995531871913482]")
	private List<Long> sIds;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID，即时零售店铺该字段为即时零售总部id", example= "94956")
	private Long shopId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "8794053")
	private Long storeId;

	@SerializedName("order_status")
	@OpField(required = false , desc = "父订单状态，订单创建消息的order_status值为1", example= "1")
	private Long orderStatus;

	@SerializedName("order_type")
	@OpField(required = false , desc = "订单类型： 0: 实物 2: 普通虚拟 4: poi核销 5: 三方核销 6: 服务市场", example= "0")
	private Long orderType;

	@SerializedName("create_time")
	@OpField(required = false , desc = "订单创建时间", example= "1640774086")
	private Long createTime;

	@SerializedName("biz")
	@OpField(required = false , desc = "Int64 【业务来源】 1、鲁班 2、小店 3、好好学习", example= "2")
	private Long biz;


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

	
	public void setCreateTime(Long createTime){
		this.createTime = createTime;
	}

	
	public Long getCreateTime(){
		return this.createTime;
	}

	
	public void setBiz(Long biz){
		this.biz = biz;
	}

	
	public Long getBiz(){
		return this.biz;
	}

}