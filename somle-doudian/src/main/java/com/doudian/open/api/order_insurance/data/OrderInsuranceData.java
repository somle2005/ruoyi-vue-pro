package com.doudian.open.api.order_insurance.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderInsuranceData {


	@SerializedName("policy_info_list")
	@OpField(desc = "保单详情列表", example = "")
	private List<PolicyInfoListItem> policyInfoList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPolicyInfoList(List<PolicyInfoListItem> policyInfoList){
		this.policyInfoList = policyInfoList;
	}

	
	public List<PolicyInfoListItem> getPolicyInfoList(){
		return this.policyInfoList;
	}

}