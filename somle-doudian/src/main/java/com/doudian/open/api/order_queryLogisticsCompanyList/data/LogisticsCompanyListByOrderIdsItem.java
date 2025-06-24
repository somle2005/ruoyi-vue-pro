package com.doudian.open.api.order_queryLogisticsCompanyList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsCompanyListByOrderIdsItem {


	@SerializedName("order_id")
	@OpField(desc = "订单号", example = "6918560766861317976")
	private String orderId;

	@SerializedName("logistcis_company_list_by_ids")
	@OpField(desc = "除logistics_company_list_by_shop外，该订单号能够使用的物流公司列表", example = "")
	private List<LogistcisCompanyListByIdsItem> logistcisCompanyListByIds;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

	
	public void setLogistcisCompanyListByIds(List<LogistcisCompanyListByIdsItem> logistcisCompanyListByIds){
		this.logistcisCompanyListByIds = logistcisCompanyListByIds;
	}

	
	public List<LogistcisCompanyListByIdsItem> getLogistcisCompanyListByIds(){
		return this.logistcisCompanyListByIds;
	}

}