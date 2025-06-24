package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class PromiseDetail {


	@SerializedName("promise_type")
	@OpField(desc = "时效类型，1-普通时效；2-承诺送达；5-预约送达，6-预约发货", example = "1")
	private Long promiseType;

	@SerializedName("promise_time_detail")
	@OpField(desc = "订单时效信息", example = "")
	private PromiseTimeDetail promiseTimeDetail;

	@SerializedName("recommend_logistics_list")
	@OpField(desc = "推荐使用物流公司列表", example = "")
	private List<RecommendLogisticsListItem> recommendLogisticsList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPromiseType(Long promiseType){
		this.promiseType = promiseType;
	}

	
	public Long getPromiseType(){
		return this.promiseType;
	}

	
	public void setPromiseTimeDetail(PromiseTimeDetail promiseTimeDetail){
		this.promiseTimeDetail = promiseTimeDetail;
	}

	
	public PromiseTimeDetail getPromiseTimeDetail(){
		return this.promiseTimeDetail;
	}

	
	public void setRecommendLogisticsList(List<RecommendLogisticsListItem> recommendLogisticsList){
		this.recommendLogisticsList = recommendLogisticsList;
	}

	
	public List<RecommendLogisticsListItem> getRecommendLogisticsList(){
		return this.recommendLogisticsList;
	}

}