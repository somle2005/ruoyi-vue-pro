package com.doudian.open.api.rights_info.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class RightsInfoParam {


	@SerializedName("biz_type")
	@OpField(required = false , desc = "授权主体类型，不传参默认查询店铺，2-ebill用户；3-供应商", example= "3")
	private Integer bizType;

	@SerializedName("outer_biz_id")
	@OpField(required = false , desc = "外部业务ID(模板市场为模板code)，非必传，不可与service_id同传", example= "6859718390706503687")
	private String outerBizId;

	@SerializedName("service_id")
	@OpField(required = false , desc = "抖店服务市场服务ID，非必传，不可与outer_biz_id同传", example= "111111")
	private Long serviceId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBizType(Integer bizType){
		this.bizType = bizType;
	}

	
	public Integer getBizType(){
		return this.bizType;
	}

	
	public void setOuterBizId(String outerBizId){
		this.outerBizId = outerBizId;
	}

	
	public String getOuterBizId(){
		return this.outerBizId;
	}

	
	public void setServiceId(Long serviceId){
		this.serviceId = serviceId;
	}

	
	public Long getServiceId(){
		return this.serviceId;
	}

}