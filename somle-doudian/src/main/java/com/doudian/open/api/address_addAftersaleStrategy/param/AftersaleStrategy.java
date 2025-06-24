package com.doudian.open.api.address_addAftersaleStrategy.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class AftersaleStrategy {


	@SerializedName("to_add_product_id")
	@OpField(required = false , desc = "非必传。添加策略时需绑定的商品ID列表，单次请求中不允超过100个商品ID。", example= "[123344]")
	private List<Long> toAddProductId;

	@SerializedName("strategy_type")
	@OpField(required = false , desc = "必传。策略类型。静态策略类型和用户收货地址无关，只是将商品和退货地址绑定，无论消费者收货地址在哪里，该策略绑定的商品全部退往同一地址。动态策略类型绑定的商品可以指定不同的消费者收货区域退往不同的退货地址，比如指定消费者收货地址在北京、天津、河北的订单退往华北仓，指定消费者收货地址在山东、江苏的订单退往华东仓。静态类型策略和动态类型策略都可以绑定多个商品。", example= "1-静态策略类型，2-动态策略类型。")
	private Integer strategyType;

	@SerializedName("strategy_name")
	@OpField(required = false , desc = "必传。策略名称，不允许超过10个字。", example= "华东仓退货策略")
	private String strategyName;

	@SerializedName("address")
	@OpField(required = false , desc = "必传。售后策略绑定的地址列表，", example= "")
	private List<AddressItem> address;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setToAddProductId(List<Long> toAddProductId){
		this.toAddProductId = toAddProductId;
	}

	
	public List<Long> getToAddProductId(){
		return this.toAddProductId;
	}

	
	public void setStrategyType(Integer strategyType){
		this.strategyType = strategyType;
	}

	
	public Integer getStrategyType(){
		return this.strategyType;
	}

	
	public void setStrategyName(String strategyName){
		this.strategyName = strategyName;
	}

	
	public String getStrategyName(){
		return this.strategyName;
	}

	
	public void setAddress(List<AddressItem> address){
		this.address = address;
	}

	
	public List<AddressItem> getAddress(){
		return this.address;
	}

}