package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class C2bCustomizeRule {


	@SerializedName("selected_fulfillment_rule")
	@OpField(desc = "支持c2b定制时可用的履约规则", example = "")
	private SelectedFulfillmentRule selectedFulfillmentRule;

	@SerializedName("app_list")
	@OpField(desc = "可选小程序", example = "")
	private List<AppListItem> appList;

	@SerializedName("supply_day_return_selector")
	@OpField(desc = "支持c2b定制时可用的7天无理由", example = "")
	private List<SupplyDayReturnSelectorItem> supplyDayReturnSelector;

	@SerializedName("enable")
	@OpField(desc = "是否支持c2b定制", example = "true")
	private Boolean enable;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSelectedFulfillmentRule(SelectedFulfillmentRule selectedFulfillmentRule){
		this.selectedFulfillmentRule = selectedFulfillmentRule;
	}

	
	public SelectedFulfillmentRule getSelectedFulfillmentRule(){
		return this.selectedFulfillmentRule;
	}

	
	public void setAppList(List<AppListItem> appList){
		this.appList = appList;
	}

	
	public List<AppListItem> getAppList(){
		return this.appList;
	}

	
	public void setSupplyDayReturnSelector(List<SupplyDayReturnSelectorItem> supplyDayReturnSelector){
		this.supplyDayReturnSelector = supplyDayReturnSelector;
	}

	
	public List<SupplyDayReturnSelectorItem> getSupplyDayReturnSelector(){
		return this.supplyDayReturnSelector;
	}

	
	public void setEnable(Boolean enable){
		this.enable = enable;
	}

	
	public Boolean getEnable(){
		return this.enable;
	}

}