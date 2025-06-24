package com.doudian.open.api.logistics_getUserDeliverServiceInfos.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsGetUserDeliverServiceInfosParam {


	@SerializedName("biz_info")
	@OpField(required = true , desc = "商家信息", example= "")
	private BizInfo bizInfo;

	@SerializedName("service_codes")
	@OpField(required = false , desc = "GetRecommendedAndDeliveryExpressByOrder：By单快递推荐服务", example= "[GetRecommendedAndDeliveryExpressByOrder]")
	private List<String> serviceCodes;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBizInfo(BizInfo bizInfo){
		this.bizInfo = bizInfo;
	}

	
	public BizInfo getBizInfo(){
		return this.bizInfo;
	}

	
	public void setServiceCodes(List<String> serviceCodes){
		this.serviceCodes = serviceCodes;
	}

	
	public List<String> getServiceCodes(){
		return this.serviceCodes;
	}

}