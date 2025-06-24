package com.doudian.open.api.address_listAftersaleStrategy.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class StrategyListItem {


	@SerializedName("strategy_id")
	@OpField(desc = "策略id;", example = "AFS7418493389946110223")
	private String strategyId;

	@SerializedName("address_list")
	@OpField(desc = "售后策略绑定的地址列表;", example = "")
	private List<AddressListItem> addressList;

	@SerializedName("related_product_count")
	@OpField(desc = "已关联商品数量", example = "1")
	private Long relatedProductCount;

	@SerializedName("strategy_name")
	@OpField(desc = "策略名称", example = "静态策略-1")
	private String strategyName;

	@SerializedName("createtime")
	@OpField(desc = "策略创建时间;", example = "1727252654")
	private Long createtime;

	@SerializedName("update_time")
	@OpField(desc = "策略更新时间;", example = "1727253300")
	private Long updateTime;

	@SerializedName("shop_id")
	@OpField(desc = "店铺ID;", example = "77977")
	private Long shopId;

	@SerializedName("strategy_type")
	@OpField(desc = "策略类型;1-固定退货地址，2-动态退货地址", example = "1")
	private Integer strategyType;

	@SerializedName("strategy_type_name")
	@OpField(desc = "策略类型描述;", example = "固定退货地址")
	private String strategyTypeName;

	@SerializedName("strategy_description")
	@OpField(desc = "策略描述;", example = "所有收货地区使用同一个退货地址")
	private String strategyDescription;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setStrategyId(String strategyId){
		this.strategyId = strategyId;
	}

	
	public String getStrategyId(){
		return this.strategyId;
	}

	
	public void setAddressList(List<AddressListItem> addressList){
		this.addressList = addressList;
	}

	
	public List<AddressListItem> getAddressList(){
		return this.addressList;
	}

	
	public void setRelatedProductCount(Long relatedProductCount){
		this.relatedProductCount = relatedProductCount;
	}

	
	public Long getRelatedProductCount(){
		return this.relatedProductCount;
	}

	
	public void setStrategyName(String strategyName){
		this.strategyName = strategyName;
	}

	
	public String getStrategyName(){
		return this.strategyName;
	}

	
	public void setCreatetime(Long createtime){
		this.createtime = createtime;
	}

	
	public Long getCreatetime(){
		return this.createtime;
	}

	
	public void setUpdateTime(Long updateTime){
		this.updateTime = updateTime;
	}

	
	public Long getUpdateTime(){
		return this.updateTime;
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

	
	public void setStrategyType(Integer strategyType){
		this.strategyType = strategyType;
	}

	
	public Integer getStrategyType(){
		return this.strategyType;
	}

	
	public void setStrategyTypeName(String strategyTypeName){
		this.strategyTypeName = strategyTypeName;
	}

	
	public String getStrategyTypeName(){
		return this.strategyTypeName;
	}

	
	public void setStrategyDescription(String strategyDescription){
		this.strategyDescription = strategyDescription;
	}

	
	public String getStrategyDescription(){
		return this.strategyDescription;
	}

}