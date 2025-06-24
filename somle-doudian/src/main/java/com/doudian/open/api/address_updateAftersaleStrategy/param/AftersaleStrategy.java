package com.doudian.open.api.address_updateAftersaleStrategy.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class AftersaleStrategy {


	@SerializedName("strategy_type")
	@OpField(required = false , desc = "必传。策略类型。静态策略类型和用户收货地址无关，只是将商品和退货地址绑定，无论消费者收货地址在哪里，该策略绑定的商品全部退往同一地址。动态策略类型绑定的商品可以指定不同的消费者收货区域退往不同的退货地址，比如指定消费者收货地址在北京、天津、河北的订单退往华北仓，指定消费者收货地址在山东、江苏的订单退往华东仓。静态类型策略和动态类型策略都可以绑定多个商品。", example= "1")
	private Integer strategyType;

	@SerializedName("strategy_id")
	@OpField(required = false , desc = "必传，策略id，需要更改的策略ID。", example= "AFS7418493389946110223")
	private String strategyId;

	@SerializedName("address")
	@OpField(required = false , desc = "售后策略绑定的地址列表;", example= "")
	private List<AddressItem> address;

	@SerializedName("strategy_name")
	@OpField(required = false , desc = "策略名称，不能超过10个字。", example= "新的策略名称")
	private String strategyName;

	@SerializedName("to_add_product_id")
	@OpField(required = false , desc = "需绑定的商品列表", example= "[3709205448604385763]")
	private List<Long> toAddProductId;

	@SerializedName("to_del_product_id")
	@OpField(required = false , desc = "需解绑的商品列表", example= "[3709080842971250761]")
	private List<Long> toDelProductId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setStrategyType(Integer strategyType){
		this.strategyType = strategyType;
	}

	
	public Integer getStrategyType(){
		return this.strategyType;
	}

	
	public void setStrategyId(String strategyId){
		this.strategyId = strategyId;
	}

	
	public String getStrategyId(){
		return this.strategyId;
	}

	
	public void setAddress(List<AddressItem> address){
		this.address = address;
	}

	
	public List<AddressItem> getAddress(){
		return this.address;
	}

	
	public void setStrategyName(String strategyName){
		this.strategyName = strategyName;
	}

	
	public String getStrategyName(){
		return this.strategyName;
	}

	
	public void setToAddProductId(List<Long> toAddProductId){
		this.toAddProductId = toAddProductId;
	}

	
	public List<Long> getToAddProductId(){
		return this.toAddProductId;
	}

	
	public void setToDelProductId(List<Long> toDelProductId){
		this.toDelProductId = toDelProductId;
	}

	
	public List<Long> getToDelProductId(){
		return this.toDelProductId;
	}

}