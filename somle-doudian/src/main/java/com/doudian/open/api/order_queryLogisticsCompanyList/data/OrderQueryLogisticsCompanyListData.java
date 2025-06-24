package com.doudian.open.api.order_queryLogisticsCompanyList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderQueryLogisticsCompanyListData {


	@SerializedName("logistics_company_list_by_shop")
	@OpField(desc = "店铺维度所有订单能够使用的物流公司列表。", example = "")
	private List<LogisticsCompanyListByShopItem> logisticsCompanyListByShop;

	@SerializedName("logistics_company_list_by_order_ids")
	@OpField(desc = "除logistics_company_list_by_shop外，订单维度能够使用的物流公司列表", example = "")
	private List<LogisticsCompanyListByOrderIdsItem> logisticsCompanyListByOrderIds;

	@SerializedName("fail_shop_order_id_and_reason")
	@OpField(desc = "本次请求中失败的失败的订单号以及原因列表", example = "")
	private List<FailShopOrderIdAndReasonItem> failShopOrderIdAndReason;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setLogisticsCompanyListByShop(List<LogisticsCompanyListByShopItem> logisticsCompanyListByShop){
		this.logisticsCompanyListByShop = logisticsCompanyListByShop;
	}

	
	public List<LogisticsCompanyListByShopItem> getLogisticsCompanyListByShop(){
		return this.logisticsCompanyListByShop;
	}

	
	public void setLogisticsCompanyListByOrderIds(List<LogisticsCompanyListByOrderIdsItem> logisticsCompanyListByOrderIds){
		this.logisticsCompanyListByOrderIds = logisticsCompanyListByOrderIds;
	}

	
	public List<LogisticsCompanyListByOrderIdsItem> getLogisticsCompanyListByOrderIds(){
		return this.logisticsCompanyListByOrderIds;
	}

	
	public void setFailShopOrderIdAndReason(List<FailShopOrderIdAndReasonItem> failShopOrderIdAndReason){
		this.failShopOrderIdAndReason = failShopOrderIdAndReason;
	}

	
	public List<FailShopOrderIdAndReasonItem> getFailShopOrderIdAndReason(){
		return this.failShopOrderIdAndReason;
	}

}