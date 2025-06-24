package com.doudian.open.api.order_ordeReportList.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderOrdeReportListParam {


	@SerializedName("add_real_mobile_whites")
	@OpField(required = true , desc = "报备请求", example= "")
	private List<AddRealMobileWhitesItem> addRealMobileWhites;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAddRealMobileWhites(List<AddRealMobileWhitesItem> addRealMobileWhites){
		this.addRealMobileWhites = addRealMobileWhites;
	}

	
	public List<AddRealMobileWhitesItem> getAddRealMobileWhites(){
		return this.addRealMobileWhites;
	}

}