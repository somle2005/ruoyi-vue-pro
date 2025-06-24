package com.doudian.open.msg.trade_TradeAmountChanged.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class TradeTradeAmountChangedParam {


	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID", example= "1111114783")
	private Long shopId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "8794053")
	private Long storeId;

	@SerializedName("biz")
	@OpField(required = false , desc = "订单业务类型，表示买家从哪里看到的这个商品、产生了订单: 1: 鲁班广告 2: 联盟 4: 商城 8:自主经营 10: 线索通支付表单 12: 抖音门店 14: 抖+ 15: 穿山甲", example= "2")
	private Long biz;

	@SerializedName("modify_time")
	@OpField(required = false , desc = "订单修改时间", example= "1628597071")
	private Long modifyTime;

	@SerializedName("total_amount")
	@OpField(required = false , desc = "主订单金额，单位为分，不含运费", example= "9750")
	private Long totalAmount;

	@SerializedName("post_amount")
	@OpField(required = false , desc = "邮费，单位为分", example= "0")
	private Long postAmount;

	@SerializedName("p_id")
	@OpField(required = false , desc = "父订单ID", example= "4829566578327619346")
	private Long pId;

	@SerializedName("s_ids")
	@OpField(required = false , desc = "子订单ID列表", example= "[4829566578327619346]")
	private List<Long> sIds;

	@SerializedName("order_status")
	@OpField(required = false , desc = "父订单状态，订单创建消息的order_status值为1", example= "1")
	private Long orderStatus;

	@SerializedName("order_type")
	@OpField(required = false , desc = "订单类型： 0: 实物 2: 普通虚拟 4: poi核销 5: 三方核销 6: 服务市场", example= "0")
	private Long orderType;


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

	
	public void setBiz(Long biz){
		this.biz = biz;
	}

	
	public Long getBiz(){
		return this.biz;
	}

	
	public void setModifyTime(Long modifyTime){
		this.modifyTime = modifyTime;
	}

	
	public Long getModifyTime(){
		return this.modifyTime;
	}

	
	public void setTotalAmount(Long totalAmount){
		this.totalAmount = totalAmount;
	}

	
	public Long getTotalAmount(){
		return this.totalAmount;
	}

	
	public void setPostAmount(Long postAmount){
		this.postAmount = postAmount;
	}

	
	public Long getPostAmount(){
		return this.postAmount;
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

}