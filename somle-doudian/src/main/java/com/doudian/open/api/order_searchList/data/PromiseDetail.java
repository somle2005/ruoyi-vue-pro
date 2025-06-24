package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class PromiseDetail {


	@SerializedName("promise_type")
	@OpField(desc = "1-普通时效订单，2-承诺送达订单，5-预约送达订单，6-预约发货订单;", example = "2")
	private Long promiseType;

	@SerializedName("promise_time_detail")
	@OpField(desc = "时效类型的时间信息", example = "")
	private PromiseTimeDetail promiseTimeDetail;

	@SerializedName("recommend_logistics_list")
	@OpField(desc = "推荐的物流公司信息", example = "")
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