package com.doudian.open.api.order_ordeReportList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderOrdeReportListData {


	@SerializedName("add_real_mobile_whites")
	@OpField(desc = "报备响应", example = "")
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